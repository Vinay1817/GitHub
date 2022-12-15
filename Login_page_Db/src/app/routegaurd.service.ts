import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot } from '@angular/router';
import { Observable } from 'rxjs';

import { LoginService } from './login.service';
import { LoginComponent } from './login/login.component';
import { User } from './user';


@Injectable({
  providedIn: 'root'
})
export class RoutegaurdService implements CanActivate{

  

  constructor(private service:LoginService) { }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot){
    //if(this.service.userLogin())
       return true;
     return false;
    

  }
}
