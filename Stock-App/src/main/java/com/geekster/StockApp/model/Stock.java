package com.geekster.StockApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long StockId;
    @Column(unique = true)
    private String stockName;

    private Double stockPrice;

    private Integer stockOwnerCount;

    @Enumerated(EnumType.STRING)
    private StockType stockType;

    private LocalDateTime stockBirthTimeStamp;
}
