package com.spring.graphql.example.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.spring.graphql.example.domain.BankDetails;
import com.spring.graphql.example.persistence.Bank;
import com.spring.graphql.example.repository.BankDetailsRepository;
import com.spring.graphql.example.service.BankDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private BankDetailsService bankDetailsService;

    public BankDetails getBankDetails(Long id) {
        return bankDetailsService.getBankDetailsById(id);
    }

    public BankDetails newBank(final String bankName, String zipCode, String city, String county) {
        return bankDetailsService.newBank(bankName, zipCode, city, county);
    }


}
