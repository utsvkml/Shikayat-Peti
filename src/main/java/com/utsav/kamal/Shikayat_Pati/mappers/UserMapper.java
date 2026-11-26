package com.utsav.kamal.Shikayat_Pati.mappers;

import com.utsav.kamal.Shikayat_Pati.commons.CommonMapper;
import com.utsav.kamal.Shikayat_Pati.entity.UsersEntity;
import com.utsav.kamal.Shikayat_Pati.model.Users;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends CommonMapper<UsersEntity, Users> {
}
