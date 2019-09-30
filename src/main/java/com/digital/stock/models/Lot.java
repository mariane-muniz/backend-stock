package com.digital.stock.models;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table( name = "lots" )
public class Lot extends AbstractAudit {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "question_generator")
    @SequenceGenerator(
            name = "question_generator",
            sequenceName = "question_sequence",
            initialValue = 1000
    )
    private Long id;
    
    @Column( nullable = false )
    private String code;

    @Column( nullable = false )
    private Date availableDate;

    private int safetyMargin;
    
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "provider_id", nullable = false )
    private Provider provider;
    
    @ManyToMany( mappedBy = "lots" )
    private Set<Stock> stocks;
}