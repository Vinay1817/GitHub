import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { RoutegaurdService } from './routegaurd.service';
import { SuccessComponent } from './success/success.component';

const routes: Routes = [
  {path:'register',component:RegisterComponent,canActivate:[RoutegaurdService]},
  {path:'login',component:LoginComponent,canActivate:[RoutegaurdService]},
  {path:'success',component:SuccessComponent,canActivate:[RoutegaurdService]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
