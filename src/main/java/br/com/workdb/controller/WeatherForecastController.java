package br.com.workdb.controller;

import io.swagger.annotations.ApiModelProperty;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.workdb.model.WeatherForecast;
import br.com.workdb.service.WeatherForecastService;

@RestController
@RequestMapping("/api/weatherforecast")
public class WeatherForecastController {

    @Autowired
    private WeatherForecastService weatherForecastService;

    @GetMapping("/{id}")
    @CrossOrigin(origins = "*")
    public WeatherForecast WeatherForecastConsult(@PathVariable Integer id) {

        return weatherForecastService.WeatherForecastConsult(id);
    }

    @PostMapping
    @CrossOrigin(origins = "*")
    public WeatherForecast WeatherForecastConsultCityName(@RequestBody String body) {
        JSONObject jsonObject = new JSONObject(body);
        return weatherForecastService.WeatherForecastConsultCityName(jsonObject.getString("cityname"));
    }
}
