package br.com.georgearaujo.sales_report.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.georgearaujo.sales_report.product.Feedstock;

public class FeedstockController {

    private List<Feedstock> feedstocks;

    public FeedstockController(){
        feedstocks = new ArrayList<>();
    }

    public void addFeedstock(Feedstock feedstock){
        feedstocks.add(feedstock);
    }

    private void printList(){
        System.out.println(feedstocks);
    }

    public Feedstock buildFeedstock(String name, String description, BigDecimal price){
        return new Feedstock(name, description, price);
    }
}
