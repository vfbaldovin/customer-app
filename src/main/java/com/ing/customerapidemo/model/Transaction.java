package com.ing.customerapidemo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;
    private BigDecimal amount;
    @ManyToOne(fetch = FetchType.LAZY)
    private User payee;
    @ManyToOne(fetch = FetchType.LAZY)
    private User recipient;
    @ManyToOne
    private Account account;
    private LocalDateTime created;
}
