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
    InvoiceDao invoiceDao;
    ItemDao itemDao;
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Chair");
        Product product2 = new Product("Desk");
        Product product3 = new Product("BlackBoard");

        Item item1 = new Item(product1, new BigDecimal(20), 20, new BigDecimal(400));
        Item item2 = new Item(product2, new BigDecimal(40), 10, new BigDecimal(400));
        Item item3 = new Item(product3, new BigDecimal(100), 1, new BigDecimal(100));

        Invoice invoice = new Invoice();

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);

        int invoiceID = invoice.getId();

        //Then
        Assert.assertEquals(3, invoice.getItems().size());

        //CleanUp
        try {
            invoiceDao.deleteById(invoiceID);
        } catch (Exception e) {
            //do nothing
        }
    }
}