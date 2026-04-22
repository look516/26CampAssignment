package com.sparta.miniorder.order.service;

import com.sparta.miniorder.order.dto.OrderRequest;
import com.sparta.miniorder.order.dto.OrderResponse;
import com.sparta.miniorder.order.entity.Order;
import com.sparta.miniorder.order.repository.OrderRepository;
import com.sparta.miniorder.product.entity.Product;
import com.sparta.miniorder.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional (readOnly = true)
public class OrderService {

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;

    @Transactional
    public OrderResponse createOrder(OrderRequest request) {

        Product product = findProductById(request.getProductId());

        Order order = new Order(product);
        Order saved =  orderRepository.save(order);
        return new OrderResponse(saved);
    }

    // 여러 오더가 하나의 상품을 참조할 수 있는가?
    // product_id는 이렇게 받아와도 되는가?
    public OrderResponse getOrder(Long id){
        Order order = findOrderById(id);
        return new OrderResponse(order);
    }

    // ProductService의 메소드와 같은 역할을 하니
    // 추후에는 Service 호출로 Refactor
    private Product findProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 상품이 존재하지 않습니다. id=" + id));
    }

    private Order findOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 주문이 존재하지 않습니다. id=" + id));
    }
}
