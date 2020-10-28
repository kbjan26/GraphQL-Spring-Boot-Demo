package com.spring.graphql.example.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BankDetails extends RepresentationModel<BankDetails> {

    private String zipCode;
    private String bankName;
    private String city;
    private Long id;
    private String county;
}
