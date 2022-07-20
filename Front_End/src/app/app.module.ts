import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module.ts.module';
import { AppComponent } from './app.component';
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
import {HttpClientModule} from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoAPComponent,
    RedesComponent,
    BannerComponent,
    DatosPersonalesComponent,
    ExperienceComponent,
    EducationComponent,
    SkillsComponent,
    ProyectosComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({}),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
