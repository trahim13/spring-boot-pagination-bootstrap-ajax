package org.trahim.spring.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.trahim.spring.boot.domain.Country;
import org.trahim.spring.boot.repositories.CountryRepository;

@SpringBootApplication
public class BootApplication implements CommandLineRunner {

    private final CountryRepository countryRepository;

    public BootApplication(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        countryRepository.save(new Country("Беларусь", "Минск"));
        countryRepository.save(new Country("Австрия", "Вена"));
        countryRepository.save(new Country("Азербайджан", "Баку"));
        countryRepository.save(new Country("Албания", "Тирана"));
        countryRepository.save(new Country("Алжир", "Алжир"));
        countryRepository.save(new Country("Бруней", "Бандар-Сери-Бегаван"));
        countryRepository.save(new Country("Гамбия", "Банжул"));
        countryRepository.save(new Country("Германия", "Берлин"));


    }
}
