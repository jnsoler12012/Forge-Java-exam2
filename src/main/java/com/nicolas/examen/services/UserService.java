package com.nicolas.examen.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicolas.examen.models.User;
import com.nicolas.examen.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User findByEmail(String email) {
        User user =  userRepository.findByEmail(email);
        return user;
    }

    public User findByEmail(String email, String password) {
        User user =  userRepository.findByEmail(email);
        if(user != null){
            boolean passwoordValid = autenticar(user, password);
            if(!passwoordValid){
                return null;
            }
        }
        return user;

    }

    private boolean autenticar(User user, String password) {
        return (BCrypt.checkpw(password, user.getPassword()));
    }

    public User save(User user) {
        encryptPassword(user);
        return userRepository.save(user);
    }

    public void encryptPassword(User user) {
        String password = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(password);
    }
}
