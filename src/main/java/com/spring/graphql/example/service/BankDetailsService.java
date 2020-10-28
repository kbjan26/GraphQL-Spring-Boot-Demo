package com.spring.graphql.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.graphql.example.domain.BankDetails;
import com.spring.graphql.example.mapper.BanksDetailsMapper;
import com.spring.graphql.example.persistence.Bank;
import com.spring.graphql.example.repository.BankDetailsRepository;
import com.spring.graphql.example.web.BankDetailsController;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class BankDetailsService {

    @Autowired
    BankDetailsRepository bankDetailsRepository;

    @Autowired
    BanksDetailsMapper banksDetailsMapper;

    public Page<BankDetails> getBankDetails(Pageable pageable) throws Exception {
        Page<BankDetails> bankDetails = new PageImpl<BankDetails>(StreamSupport.stream(
                bankDetailsRepository.findAll(pageable).spliterator(), false)
                .map(bankDetailsEntity -> banksDetailsMapper.entity2Model(bankDetailsEntity))
                .map(bankDetail ->
                        bankDetail.add(linkTo(BankDetailsController.class).slash(bankDetail.getId()).withSelfRel()))
                .collect(Collectors.toList()));

        return bankDetails;
    }

    public BankDetails getBankDetailsById(Long id) {
        return banksDetailsMapper.entity2Model(bankDetailsRepository.findById(id).get());
    }

    public BankDetails newBank(final String bankName, String zipCode, String city, String county) {
        Bank bank = Bank.builder().bankName(bankName).zipCode(zipCode).city(city).county(county)
                .build();
        return banksDetailsMapper.entity2Model(bankDetailsRepository.save(bank));
    }
}
