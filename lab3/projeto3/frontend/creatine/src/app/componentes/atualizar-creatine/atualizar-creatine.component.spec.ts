import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AtualizarCreatineComponent } from './atualizar-creatine.component';

describe('AtualizarCreatineComponent', () => {
  let component: AtualizarCreatineComponent;
  let fixture: ComponentFixture<AtualizarCreatineComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AtualizarCreatineComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AtualizarCreatineComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
