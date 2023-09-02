package com.mlinzi.api_management.services;

import com.mlinzi.api_management.models.Users;
import com.mlinzi.api_management.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UsersServiceImplent implements UserService {
    private final UserRepository userRepository;

    @Override
    public Users crreer(Users users) {
        return userRepository.save(users);
    }

    @Override
    public List<Users> lire() {
        return userRepository.findAll();
    }

    @Override
    public Users modifier(String id, Users users) {
        return userRepository.findById(id)
                .map(p->{
                    p.setFullname(users.getFullname());
                    p.setName(users.getName());
                    p.setObservation(users.getObservation());
                    return userRepository.save(p);
                }).orElseThrow(()-> new RuntimeException("User not found"));

    }

    @Override
    public String supprimer(String id) {
        userRepository.deleteById(id);
        return "User deleted";
    }
}
