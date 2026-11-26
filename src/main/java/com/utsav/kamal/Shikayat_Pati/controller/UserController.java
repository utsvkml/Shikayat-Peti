package com.utsav.kamal.Shikayat_Pati.controller;

import com.utsav.kamal.Shikayat_Pati.commons.CommonController;
import com.utsav.kamal.Shikayat_Pati.commons.Services;
import com.utsav.kamal.Shikayat_Pati.entity.UsersEntity;
import com.utsav.kamal.Shikayat_Pati.model.Users;
import com.utsav.kamal.Shikayat_Pati.service.UsersService;
import com.utsav.kamal.Shikayat_Pati.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController extends CommonController<UsersEntity, Users,Long> {
    public UserController(UserServiceImpl services) {
        super(services);
    }
}
