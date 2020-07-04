package br.com.georgearaujo.sales_report.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.georgearaujo.sales_report.product.Feedstock;
import br.com.georgearaujo.sales_report.product.Merchandise;
import br.com.georgearaujo.sales_report.product.Product;

public class MerchandiseRegistrationController {

    private static List<Merchandise> merchandises;

    public MerchandiseRegistrationController(){
        if(merchandises == null) merchandises = new ArrayList<>();
    }

    public void productRegistration(Product product){
        merchandises.add(product);
    }

    public void feedstockRegistration(Feedstock feedstock){
        merchandises.add(feedstock);
    }
}
