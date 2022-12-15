import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, CanActivate, Router } from '@angular/router';
import { RegisterService } from '../register.service';

import { User } from '../user';

@Component({
  selector: 'app-success',
  templateUrl: './success.component.html',
  styleUrls: ['./success.component.css']
})
export class SuccessComponent implements OnInit {

 user:User[]=[];
 users:any;
 username:any;
 // pname:any;
 

  constructor(private route:Router,private service:RegisterService,private rout:ActivatedRoute) { }

  ngOnInit(): void {
   this.getUsers();
   this.username=this.rout.snapshot.params['userName'];
  }
 
  getUsers(){
    this.service.getList().subscribe(data=>{
      this.users=data
    });
  }

  logOut(){
    this.route.navigate(["login"]);
  }
}
