package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// Конструирование URL с включением данных для аутентификации
		String protocol = "https://";
		String username = "admin";
		String password = "admin";
		String host = "the-internet.herokuapp.com/basic_auth";

		// Формирование URL с аутентификацией
		String authUrl = protocol + username + ":" + password + "@" + host;

		// Переход по URL с аутентификацией
		driver.get(authUrl);

		// Добавьте здесь код для выполнения действий на странице после аутентификации

		// Закрытие браузера
	//	driver.quit();
	}

}
