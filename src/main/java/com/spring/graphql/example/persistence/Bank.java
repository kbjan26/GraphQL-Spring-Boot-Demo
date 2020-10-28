package com.spring.graphql.example.persistence;

import lombok.*;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="BANK_DETAILS")
public class Bank implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID")
    private Long id;

    @Column(name="ZIP_CODE")
    private String zipCode;

    @Column(name="BANK_NAME")
    private String bankName;

    @Column(name="CITY")
    private String city;

    @Column(name="COUNTY")
    private String county;

}
