package com.ing.customerapidemo.service;

import com.ing.customerapidemo.exception.ServiceException;
//import com.ing.customerapidemo.model.RefreshToken;
//import com.ing.customerapidemo.repository.RefreshTokenRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
@Transactional
public class RefreshTokenService {

//    private final RefreshTokenRepository refreshTokenRepository;

//    public RefreshToken generateRefreshToken() {
//        RefreshToken refreshToken = new RefreshToken();
//        refreshToken.setToken(UUID.randomUUID().toString());
//        refreshToken.setCreatedDate(LocalDateTime.now());
//
//        return refreshTokenRepository.save(refreshToken);
//    }

//    void validateRefreshToken(String token) {
//        refreshTokenRepository.findByToken(token)
//                .orElseThrow(() -> new ServiceException("Invalid refresh Token"));
//    }
//
//    public void deleteRefreshToken(String token) {
//        refreshTokenRepository.deleteByToken(token);
//    }
}
