package com.sparta.miniorder.product;

import com.sparta.miniorder.product.dto.ProductRequest;
import com.sparta.miniorder.product.dto.ProductResponse;
import com.sparta.miniorder.product.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = ProductTestApplication.class)
@Transactional
class ProductApplicationTests {

	@Autowired
	ProductService productService;

	@Test
	void CRUD사이클() {
		// 생성
		ProductRequest req1 = new ProductRequest("치킨", 18000);
		ProductRequest req2 = new ProductRequest("피자", 20000);

		ProductResponse p1 = productService.createProduct(req1);
		ProductResponse p2 = productService.createProduct(req2);

		// product 조회
		ProductResponse getP1 = productService.getProduct(p1.getId());
		ProductResponse getP2 = productService.getProduct(p2.getId());

		assert getP1.getName().equals(p1.getName());
		assert getP2.getName().equals(p2.getName());

		// products 조회
		var products = productService.getProducts();
		assert products.size() == 2;

		// 수정
		ProductRequest updateReq = new ProductRequest("뿌링클", 21000);
		productService.updateProduct(p1.getId(), updateReq);

		ProductResponse updateP1 = productService.getProduct(p1.getId());
		assert updateP1.getName().equals(updateReq.getName());
		assert updateP1.getPrice().equals(updateReq.getPrice());

		// 삭제
		productService.deleteProduct(p1.getId());
		productService.deleteProduct(p2.getId());

		var after = productService.getProducts();
		assert after.size() == 0;
	}
}
