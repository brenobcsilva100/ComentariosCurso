import {Component, OnInit} from '@angular/core';
import {ComentarioBreno} from "../comentario-breno";
import {ComentarioService} from "../comentario.service";
import {AlunoBreno} from "../aluno-breno";

@Component({
  selector: 'app-mostrar-comentarios',
  templateUrl: './mostrar-comentarios.component.html',
  styleUrls: ['./mostrar-comentarios.component.css']
})
export class MostrarComentariosComponent implements OnInit{

  comentarios: ComentarioBreno[] | undefined;

  aluno: AlunoBreno[] | undefined;

  constructor(private comentariosService: ComentarioService) {
  }

  ngOnInit(): void {
    this.comentariosService.getComentarios().subscribe((data: ComentarioBreno[])=>{
      console.log(data);
      this.comentarios=data;
    })

  }

}
