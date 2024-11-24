package com.codingShuttle.sameer.week1_alice.Bakery.AliceAndBakery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliceAndBakeryApplication implements CommandLineRunner {
	@Autowired
	CakeBaker cake;

	public static void main(String[] args) {
		SpringApplication.run(AliceAndBakeryApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		cake.bakeCake();
	}
}
