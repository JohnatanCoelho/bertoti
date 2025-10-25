import { TestBed } from '@angular/core/testing';

import { CreatineService } from './creatine.service';

describe('CreatineService', () => {
  let service: CreatineService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CreatineService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
