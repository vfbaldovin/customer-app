package com.ing.customerapidemo.service;

import com.ing.customerapidemo.exception.ServiceException;
import com.ing.customerapidemo.model.User;
import com.ing.customerapidemo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUserByUsername(username)
                .orElseThrow(() -> new ServiceException(String.format("User with id %s not found.", username)));

        return new org.springframework.security
                .core.userdetails.User(user.getUsername(), user.getPassword(), user.isEnabled(), true,
                true, true, Collections.emptyList());
    }


}
