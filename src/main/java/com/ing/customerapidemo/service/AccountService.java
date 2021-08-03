package com.ing.customerapidemo.service;

import com.ing.customerapidemo.mapper.AccountMapper;
import com.ing.customerapidemo.dto.AccountDto;
import com.ing.customerapidemo.exception.InvalidRequest;
import com.ing.customerapidemo.exception.ServiceException;
import com.ing.customerapidemo.model.Account;
import com.ing.customerapidemo.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    public AccountDto save(AccountDto accountDto) {
        Account account = accountRepository.save(accountMapper.getAccountObject(accountDto));
        return accountMapper.getAccountDto(account);
    }

    public List<AccountDto> getAll() {
        return accountMapper.getAccountObjects(accountRepository.findAll());
    }

    public AccountDto findById(Long id) {
        return accountMapper.getAccountDto(accountRepository.findById(id)
                .orElseThrow(() -> new ServiceException(String.format("Account not found for ID = %d", id))));
    }

    public AccountDto update(AccountDto accountDto) {
        if (accountDto.getAccountId() == null)
            throw new InvalidRequest("Please provide an Id in the object");

        Account account = accountRepository.findById(accountDto.getAccountId())
                .orElseThrow(() -> new ServiceException(String.format("Account not found for ID = %d", accountDto.getAccountId())));

        account.setAccountId(accountDto.getAccountId());
        account.setAccountNumber(accountDto.getAccountNumber());
        account.setAccountType(accountDto.getAccountType());
        account.setBalance(accountDto.getBalance());
        accountRepository.save(account);

        return accountMapper.getAccountDto(account);
    }
}
