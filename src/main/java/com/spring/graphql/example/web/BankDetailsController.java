package com.spring.graphql.example.web;

import com.spring.graphql.example.domain.BankDetails;
import com.spring.graphql.example.service.BankDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BankDetailsController {

    @Autowired
    BankDetailsService bankDetailsService;

    @GetMapping("/bankdetails")
    public Page<BankDetails> getBankDetails(Pageable pageable) throws Exception {
        return bankDetailsService.getBankDetails(pageable);
    }

    @GetMapping("/{id}")
    public BankDetails getBankDetailsById(@PathVariable Long id) throws Exception {
        return bankDetailsService.getBankDetailsById(id);
    }
}
