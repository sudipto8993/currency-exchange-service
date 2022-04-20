package com.boot.microservices.controller;

import com.boot.microservices.bean.ExchangeValue;
import com.boot.microservices.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currencyexchange")
public class CurrencyExchangeController {

    @Autowired
    private CurrencyRepository currencyRepository;

    @GetMapping(value = "/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to){
        //return new ExchangeValue(100L,from,to, BigDecimal.valueOf(65));
        return currencyRepository.findByFromAndTo(from,to);
    }


}
