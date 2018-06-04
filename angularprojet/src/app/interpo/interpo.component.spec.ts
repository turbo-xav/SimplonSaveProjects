import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InterpoComponent } from './interpo.component';

describe('InterpoComponent', () => {
  let component: InterpoComponent;
  let fixture: ComponentFixture<InterpoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InterpoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InterpoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
