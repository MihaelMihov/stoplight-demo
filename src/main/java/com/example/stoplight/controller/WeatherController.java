package com.example.stoplight.controller;

import com.examples.apifirst.api.WeatherApi;
import com.examples.apifirst.model.WeatherResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController implements WeatherApi {

  @Override
  public ResponseEntity<WeatherResponse> getWeather(String zip, String units) {
    return ResponseEntity.ok(WeatherApi.super.getWeather(zip, units).getBody());
  }
}
