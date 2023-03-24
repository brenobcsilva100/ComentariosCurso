import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MostrarComentariosComponent } from './mostrar-comentarios.component';

describe('MostrarComentariosComponent', () => {
  let component: MostrarComentariosComponent;
  let fixture: ComponentFixture<MostrarComentariosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MostrarComentariosComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MostrarComentariosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
