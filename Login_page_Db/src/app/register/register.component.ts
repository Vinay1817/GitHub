import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RegisterService } from '../register.service';
import { User } from '../user';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  user:User=new User();
  msg=false;
  message="Email already Exist"

  constructor(private service:RegisterService) { }

  ngOnInit(): void {
  }

  userRegister(){
    console.log(this.user);
    this.service.registeration(this.user).subscribe(data=>{
       alert("successfully user is registered!")
       
    },error=>alert("sorry user not registered!!"));
    this.msg=true;
    
  }
    // next:(res) =>console.log(res),
      // error:(err) =>console.log(err),
      // complete:() =>console.log('completed')
}
