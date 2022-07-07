import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HeaderComponent } from './Componentes/header/header.component';
import { LogoAPComponent } from './Componentes/logo-ap/logo-ap.component';
import { RedesComponent } from './Componentes/redes/redes.component';
import { BannerComponent } from './Componentes/banner/banner.component';
import { DatosPersonalesComponent } from './Componentes/datos-personales/datos-personales.component';
import { ExperienceComponent } from './Componentes/experience/experience.component';
import { EducationComponent } from './Componentes/education/education.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { SkillsComponent } from './Componentes/skills/skills.component';
import { ProyectosComponent } from './Componentes/proyectos/proyectos.component';
import { FooterComponent } from './Componentes/footer/footer.component';
const routes: Routes = [
  {path:'header', component:HeaderComponent},
  {path:'logo', component:LogoAPComponent},
  {path:'redes', component:RedesComponent},
  {path:'banner', component:BannerComponent},
  {path:'mis-datos', component:DatosPersonalesComponent},
  {path:'mi-experiencia', component:ExperienceComponent},
  {path:'mi-educación', component:EducationComponent},
  {path:'graficos-circulares', component:NgCircleProgressModule},
  {path:'H&S-skills', component:SkillsComponent},
  {path:'mis-proyectos', component:ProyectosComponent},
  {path:'footer', component:FooterComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

