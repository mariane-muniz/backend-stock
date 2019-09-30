package com.digital.stock.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table( name = "stocks" )
public class Stock extends AbstractAudit {

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
    private String productCode;

    @Column( nullable = false )
    private int quantity;

    @Column( nullable = false )
    private int reserves;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "warehouse_id", nullable = false )
    private Warehouse warehouse;

    @ManyToMany
    @JoinTable(
        name = "stock_lot_rel",
        joinColumns = @JoinColumn(name = "stock_id"),
        inverseJoinColumns = @JoinColumn(name = "lot_id")
    )
    private Set<Lot> lots;
}