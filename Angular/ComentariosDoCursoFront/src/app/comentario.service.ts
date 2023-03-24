import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {ComentarioBreno} from "./comentario-breno";

@Injectable({
  providedIn: 'root'
})
export class ComentarioService {

  private baseUrl = "http://localhost:8080/mostrarComentarioBreno";

  constructor(private http: HttpClient) { }

  getComentarios(): Observable<ComentarioBreno[]>{
    return this.http.get<ComentarioBreno[]>(`${this.baseUrl}`)
  }
}
