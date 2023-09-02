package com.mlinzi.api_management.services;

import com.mlinzi.api_management.models.Users;

import java.util.List;

public interface UserService {
    Users crreer(Users users);
    List<Users> lire ();

    Users modifier(String id,Users users);

    String supprimer(String id);
}
