package com.spring.graphql.example.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.spring.graphql.example.domain.BankDetails;
import com.spring.graphql.example.service.BankDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private BankDetailsService bankDetailsService;

    public BankDetails newBank(final String bankName, String zipCode, String city, String county) {
        return bankDetailsService.newBank(bankName, zipCode, city, county);
    }
}
