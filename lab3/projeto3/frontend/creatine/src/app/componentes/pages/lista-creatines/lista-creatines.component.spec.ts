import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaCreatinesComponent } from './lista-creatines.component';

describe('ListaCreatinesComponent', () => {
  let component: ListaCreatinesComponent;
  let fixture: ComponentFixture<ListaCreatinesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListaCreatinesComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ListaCreatinesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
