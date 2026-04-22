package com.sparta.miniorder.order.dto;

import com.sparta.miniorder.order.entity.Order;
import com.sparta.miniorder.product.entity.Product;
import lombok.Getter;


@Getter
public class OrderResponse {

    private final Long id;
    private final Product product;

    // 추후 annotation?
    public OrderResponse(Order order) {
        this.id = order.getId();
        this.product = order.getProduct();
    }
}