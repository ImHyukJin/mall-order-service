package com.dmall.orderservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "order_items")
@Getter
@Setter
@NoArgsConstructor
public class Order_items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id")
    private Long id;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "`option`")
    private String option; // 예약어 충돌 방지를 위해 백틱 사용

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id2") // 실제 테이블에 맞춰서 조인 컬럼명 설정
    private Order order;

    @Column(name = "product_id")
    private Integer productId; // 외래키로 설정 가능
}
