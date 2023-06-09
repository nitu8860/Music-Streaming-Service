package com.geekster.Music.Streaming.Service.service;

import com.geekster.Music.Streaming.Service.model.User;
import com.geekster.Music.Streaming.Service.model.UserRole;
import com.geekster.Music.Streaming.Service.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User registerUser(User user) {
        // Set default role to USER
        List<UserRole> roles = Collections.singletonList(UserRole.USER_ROLE);
        user.setRole(roles.get(0));

        // Encode password
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        // Save user to repository
        return userRepository.save(user);
    }
}
