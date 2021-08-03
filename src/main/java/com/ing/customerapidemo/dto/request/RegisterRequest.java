package com.ing.customerapidemo.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegisterRequest {
    private String email;
    private String username;
    private String password;
}

