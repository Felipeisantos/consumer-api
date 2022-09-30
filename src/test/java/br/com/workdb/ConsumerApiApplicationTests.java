package br.com.workdb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.workdb.model.WeatherForecast;

@SpringBootTest
class ConsumerApiApplicationTests {

	@Test
	void loadContext() {

	}

	@Test
	void TestClassConversion() {

		try {
			// Hortolandia City request
			String url = "https://api.openweathermap.org/data/2.5/forecast?lat=-22.858&lon=-47.212&appid=736dcdde77f2ecd180d59261d23a2a57";

			RestTemplate restTemplate = new RestTemplate();
			String json = restTemplate.getForObject(url, String.class);
			ObjectMapper objectMapper = new ObjectMapper();

			WeatherForecast weater = objectMapper.readValue(json, WeatherForecast.class);
			System.out.println(weater.toString());
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
