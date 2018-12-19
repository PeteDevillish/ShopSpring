package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Shop {
    @Autowired
    private ShoppingCard shoppingCard;

    public void purchase(){
shoppingCard.addProductToShoppingCard(new Product(1, "TV"));
shoppingCard.addProductToShoppingCard(new Product(2, "iPhone"));
    }
}
