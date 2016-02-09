package uk.co.threebugs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForexAlertsApplication {

	//http://rates.fxcm.com/RatesXML

	public static void main(String[] args) {
		SpringApplication.run(ForexAlertsApplication.class, args);
	}
}
