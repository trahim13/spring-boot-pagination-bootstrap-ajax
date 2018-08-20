package org.trahim.spring.boot.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.trahim.spring.boot.domain.Country;
import org.trahim.spring.boot.repositories.CountryRepository;

import java.util.Optional;


@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Page<Country> getAllCountrys(Pageable pageable) {
        return countryRepository.findAll(pageable);
    }


    @Override
    public void saveCountry(Country country) {
        countryRepository.save(country);
    }

    @Override
    public void deleteCountry(int countryId) {
        countryRepository.deleteById(countryId);

    }

    @Override
    public Country findOneCountry(int countryId) {
        Optional<Country> byId = countryRepository.findById(countryId);
        return byId.get();
    }
}
