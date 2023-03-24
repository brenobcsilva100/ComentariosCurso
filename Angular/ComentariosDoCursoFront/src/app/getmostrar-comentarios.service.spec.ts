import { TestBed } from '@angular/core/testing';

import { GetmostrarComentariosService } from './getmostrar-comentarios.service';

describe('GetmostrarComentariosService', () => {
  let service: GetmostrarComentariosService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GetmostrarComentariosService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
