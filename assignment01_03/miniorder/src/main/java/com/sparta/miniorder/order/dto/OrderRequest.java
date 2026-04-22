package com.sparta.miniorder.order.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class OrderRequest {

    // [확장] userId도 받아올 듯
    // product ID의 유효성에 대해서는 product가 검증하므로
    // Order에서는 productID가 있거나, 없는 것만 검증하면 된다.
    // blank 들어올 수 있는지? - 연관관계이므로 안 들어오지 않을까
    @NotNull(message = "상품 정보가 없습니다.")
    private Long productId;
}