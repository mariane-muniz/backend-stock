package com.digital.stock.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table( name = "providers" )
public class Provider extends AbstractAudit {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "question_generator")
    @SequenceGenerator(
            name = "question_generator",
            sequenceName = "question_sequence",
            initialValue = 1000
    )
    private Long id;

    @Column( nullable =  false )
    private String code;

    @Column( nullable =  false )
    private String name;

    @Column( nullable =  false )
    private String identification;

    @OneToMany(
        cascade = CascadeType.ALL,
        fetch = FetchType.LAZY,
        mappedBy = "provider"
    )
    private Set<Lot> lots;
}