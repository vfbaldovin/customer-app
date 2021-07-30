package com.ing.customerapidemo.service;

import com.ing.customerapidemo.dto.RegisterRequest;
import com.ing.customerapidemo.model.User;
import com.ing.customerapidemo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@AllArgsConstructor
@Service
public class AuthService {

    private final UserRepository userRepository;

    @Transactional
    public void signup(RegisterRequest registerRequest) {
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setPassword(registerRequest.getPassword());
        user.setCreated(LocalDateTime.now());
        user.setEnabled(true);

        userRepository.save(user);
    }
}
