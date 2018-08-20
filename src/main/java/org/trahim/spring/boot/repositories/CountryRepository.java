package org.trahim.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.trahim.spring.boot.domain.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
