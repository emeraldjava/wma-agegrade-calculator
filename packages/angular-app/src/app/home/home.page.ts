import { Component, OnInit } from '@angular/core';
import { AgeGradeServiceService } from './../services/age-grade-service.service';
import { Event } from './../model/event.model';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage implements OnInit {

  events: Event[];

  constructor(private api: AgeGradeServiceService) {}

  async ngOnInit(): Promise<void> {
    this.api.getEvents().then((data) => (this.events = data.events));
  }

}
