package com.ing.customerapidemo.mapper;

import com.ing.customerapidemo.dto.AccountDto;
import com.ing.customerapidemo.model.Account;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AccountMapper {

    public Account getAccountObject(AccountDto accountDto) {
        Account account = new Account();
        account.setAccountId(accountDto.getAccountId());
        account.setAccountNumber(accountDto.getAccountNumber());
        account.setAccountType(accountDto.getAccountType());
        account.setBalance(accountDto.getBalance());
        return account;
    }
    public AccountDto getAccountDto(Account account) {
        return AccountDto.builder().accountId(account.getAccountId()).accountNumber(account.getAccountNumber())
                .accountType(account.getAccountType()).balance(account.getBalance()).build();
    }
    public List<AccountDto> getAccountObjects(List<Account> accounts) {
        return accounts.stream().map(this::getAccountDto).collect(Collectors.toList());
    }
}
