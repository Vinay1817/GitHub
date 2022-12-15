import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  
  baseUrl="http://localhost:8083/login";

  constructor(private http:HttpClient) { }

  userLogin(user:User):Observable<Object>{
     console.log(user);
     return this.http.post(this.baseUrl,user);
     
  }
}
