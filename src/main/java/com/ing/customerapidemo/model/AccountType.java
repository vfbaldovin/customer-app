package com.ing.customerapidemo.model;

public enum AccountType {
    CASH, BANK, CREDIT, DEPOSITS;

    public static boolean contains(AccountType test) {
        for (AccountType c : AccountType.values()) {
            if (c.equals(test))
                return true;
        }
        return false;
    }
}
