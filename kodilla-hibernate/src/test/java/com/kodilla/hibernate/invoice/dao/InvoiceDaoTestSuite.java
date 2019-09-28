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
import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given

        Product product1 = new Product("Chair");
        Product product2 = new Product("Desk");
        Product product3 = new Product("BlackBoard");

        List<Item> itemsForPr1 = new ArrayList<>();
        List<Item> itemsForPr2 = new ArrayList<>();
        List<Item> itemsForPr3 = new ArrayList<>();

        Item item1 = new Item(product1, new BigDecimal(20), 20, new BigDecimal(400));
        Item item2 = new Item(product2, new BigDecimal(40), 10, new BigDecimal(400));
        Item item3 = new Item(product3, new BigDecimal(100), 1, new BigDecimal(100));

        itemsForPr1.add(item1);
        itemsForPr2.add(item2);
        itemsForPr3.add(item3);

        product1.setItems(itemsForPr1);
        product2.setItems(itemsForPr2);
        product3.setItems(itemsForPr3);

        Invoice invoice = new Invoice("XVD/E/2/13/12234");

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