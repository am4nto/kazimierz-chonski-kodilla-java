package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICES")
public class Invoice {

    private int id;
    private String number;
    private List<Item>invoiceItems = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String number) {
        this.number = number;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "NUMBER")
    public String getNumber() {
        return number;
    }

    @OneToMany(
            targetEntity = Item.class,
            cascade = CascadeType.ALL,
            mappedBy = "invoice",
            fetch = FetchType.LAZY
    )
    public List<Item> getInvoiceItems() {

        return invoiceItems;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {

        this.number = number;
    }

    public void setInvoiceItems(List<Item> items) {

        this.invoiceItems = items;
    }
}
