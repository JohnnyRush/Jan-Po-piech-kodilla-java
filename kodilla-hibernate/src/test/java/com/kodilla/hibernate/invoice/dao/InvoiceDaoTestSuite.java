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
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int item1ID = item1.getId();
        int item2ID = item2.getId();
        int item3ID = item3.getId();

        //Then
        Assert.assertEquals(3, invoice.getItems().size());

        //CleanUp
        //try {
        //    invoiceDao.deleteById(item1ID);
        //    invoiceDao.deleteById(item2ID);
        //   invoiceDao.deleteById(item3ID);
        //} catch (Exception e) {
        //do nothing
        //}

    }
}