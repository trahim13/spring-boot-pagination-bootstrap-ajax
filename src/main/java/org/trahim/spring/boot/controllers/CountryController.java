package org.trahim.spring.boot.controllers;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.trahim.spring.boot.domain.Country;
import org.trahim.spring.boot.service.CountryService;

@Controller
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/")
    public String showPage(Model model, @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("data", countryService.getAllCountrys(PageRequest.of(page, 3)));
        model.addAttribute("currentPage", page);

        return "index";
    }

    @PostMapping("/save")
    public String saveCountry(Country country) {
        countryService.saveCountry(country);

        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteCountry(Integer countryId) {
        countryService.deleteCountry(countryId);

        return "redirect:/";
    }


    @GetMapping("/findOne")
    @ResponseBody
    public Country findOneCountry(Integer id) {

        return countryService.findOneCountry(id);
    }


}
