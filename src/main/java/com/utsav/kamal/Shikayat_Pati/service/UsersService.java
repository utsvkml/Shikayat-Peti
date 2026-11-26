package com.utsav.kamal.Shikayat_Pati.service;

import com.utsav.kamal.Shikayat_Pati.entity.UsersEntity;
import com.utsav.kamal.Shikayat_Pati.model.Users;

import java.util.List;

public interface UsersService {

    public Users registerUser(Users users);
    public Users getUser(Long id);
    public List<Users> getAllUsers();
    public String removeUser();
}
