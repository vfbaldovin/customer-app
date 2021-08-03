package com.ing.customerapidemo.dto;

import com.ing.customerapidemo.model.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountDto {

    private Long accountId;
    private String accountNumber;
    private AccountType accountType;
    private BigDecimal balance;
}
