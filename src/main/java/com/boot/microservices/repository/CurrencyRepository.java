package com.boot.microservices.repository;

import com.boot.microservices.bean.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<ExchangeValue,Long> {

    public ExchangeValue findByFromAndTo(String from,String to);
}
