package com.bookstore.order_service.OrderEntity;

import jakarta.persistence.*;
import lombok.*;

    @Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public class BookOrder {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private Long userid;

        private String bookName;
        private int quantity;
        private double price;
        private String status;
    }
