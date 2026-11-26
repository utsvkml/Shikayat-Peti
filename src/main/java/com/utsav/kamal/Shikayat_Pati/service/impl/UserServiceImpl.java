package com.utsav.kamal.Shikayat_Pati.service.impl;

import com.utsav.kamal.Shikayat_Pati.commons.CommonMapper;
import com.utsav.kamal.Shikayat_Pati.commons.CommonRepos;
import com.utsav.kamal.Shikayat_Pati.commons.Services;
import com.utsav.kamal.Shikayat_Pati.entity.UsersEntity;
import com.utsav.kamal.Shikayat_Pati.mappers.UserMapper;
import com.utsav.kamal.Shikayat_Pati.model.Users;
import com.utsav.kamal.Shikayat_Pati.repo.UsersRepo;
import com.utsav.kamal.Shikayat_Pati.service.UsersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends Services<UsersEntity,Users,Long> implements UsersService {
    public UserServiceImpl(UsersRepo repo, UserMapper mapper) {
        super(repo, mapper);
    }

    @Override
    public Users registerUser(Users users) {
        return null;
    }

    @Override
    public Users getUser(Long id) {
        return null;
    }

    @Override
    public List<Users> getAllUsers() {
        return List.of();
    }

    @Override
    public String removeUser() {
        return "User removed successfully";
    }
}
