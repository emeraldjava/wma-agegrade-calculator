import { Injectable } from '@angular/core';
import { createClient, SupabaseClient } from '@supabase/supabase-js'
import { Event } from './../model/event.model'
import { environment } from './../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class AgeGradeServiceService {

  supabase: SupabaseClient;

  constructor() {
    this.supabase = createClient(environment.supabase.url, environment.supabase.apiKey);
  }

  async getEvents() {
    let { data: events, error } = await this.supabase
      .from<Event>('event')
      .select('*')
      .limit(10)
    return { events, error };
  }
}
