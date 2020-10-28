package com.spring.graphql.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface BankDetailsRepository extends PagingAndSortingRepository<com.spring.graphql.example.persistence.Bank, Long> {

    Optional<com.spring.graphql.example.persistence.Bank> findById(Long id);
}
