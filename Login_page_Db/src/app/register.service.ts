import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

 baseUrl="http://localhost:8083/save";
  constructor(private http:HttpClient) { }

 registeration(user:User):Observable<Object>{
   console.log(user);
   return this.http.post(this.baseUrl,user);
 }

 url="http://localhost:8083/users";

 getList():Observable<User[]>{
  return this.http.get<User[]>(this.url);
 }

}
