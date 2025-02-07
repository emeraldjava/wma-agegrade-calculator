import { TestBed } from '@angular/core/testing';

import { AgeGradeServiceService } from './age-grade-service.service';

describe('AgeGradeServiceService', () => {
  let service: AgeGradeServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AgeGradeServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
