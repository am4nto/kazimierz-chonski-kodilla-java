package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    private static final String NUMBER = "01";


    @Test
    public void testInvoiceDaoSave() {

        //Given
        Invoice invoice = new Invoice(NUMBER);

        Product product1 = new Product("zapalki");
        Product product2 = new Product("szczotka");
        Product product3 = new Product("mop");

        Item item1 = new Item(new BigDecimal("0.50"), 5);
        Item item2 = new Item(new BigDecimal("0.40"), 100);
        Item item3 = new Item(new BigDecimal("15"), 10);
        Item item4 = new Item(new BigDecimal("20"), 2);


        product1.getItemList().add(item1);
        item1.setProduct(product1);
        item2.setProduct(product1);
        item3.setProduct(product2);
        item4.setProduct(product3);

        invoice.getInvoiceItems().add(item1);
        item1.setInvoice(invoice);
        invoice.getInvoiceItems().add(item2);
        item2.setInvoice(invoice);
        invoice.getInvoiceItems().add(item3);
        item3.setInvoice(invoice);
        invoice.getInvoiceItems().add(item4);
        item4.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.delete(id);

    }

}
