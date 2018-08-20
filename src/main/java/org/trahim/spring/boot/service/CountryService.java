package org.trahim.spring.boot.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.trahim.spring.boot.domain.Country;

import java.util.List;

public interface CountryService {

    Page<Country> getAllCountrys(Pageable pageable);

    void saveCountry(Country country);

    void deleteCountry(int countryId);

    Country findOneCountry(int countryId);

}
