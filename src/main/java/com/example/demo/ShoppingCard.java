package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShoppingCard {

    private List<Product> productList;

    public ShoppingCard(){
        this.productList = new ArrayList<>();
    }

    public void addProductToShoppingCard(Product product){
        productList.add(product);
    }
}
