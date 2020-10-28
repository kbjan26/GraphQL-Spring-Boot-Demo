package com.spring.graphql.example.mapper;

import com.spring.graphql.example.domain.BankDetails;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BanksDetailsMapper {

    BankDetails entity2Model(com.spring.graphql.example.persistence.Bank bankDetailsEntity);
}
