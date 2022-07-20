import { Component, OnInit } from '@angular/core';
import { usuario } from 'src/app/Model/Usuario.model';
import { UsuarioService } from 'src/app/service/usuario.service';

@Component({
  selector: 'app-datos-personales',
  templateUrl: './datos-personales.component.html',
  styleUrls: ['./datos-personales.component.css']
})
export class DatosPersonalesComponent implements OnInit {
usuario: usuario = new usuario("Sofía","Jofré","")
  constructor(public usuarioService:UsuarioService) { }

  ngOnInit(): void {
    this.usuarioService.getUsuario().subscribe(data =>{ this.usuario=data})
  }

}
