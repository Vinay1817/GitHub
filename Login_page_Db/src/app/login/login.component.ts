import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';
import { User } from '../user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user:User=new User();
  username:any;
  

  constructor(private service:LoginService,private route:Router) { }

  ngOnInit(): void {
  }
  
  userLogin(){
    
    console.log(this.user);
    this.service.userLogin(this.user).subscribe(data=>{
      
      alert("Login Successfull")
      this.route.navigate(['success'],this.username);
    },error=>alert("please enter correct email and password"))
    
  }
  

}
