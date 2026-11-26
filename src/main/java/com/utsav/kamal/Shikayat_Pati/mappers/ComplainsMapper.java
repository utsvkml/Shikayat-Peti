package com.utsav.kamal.Shikayat_Pati.mappers;

import com.utsav.kamal.Shikayat_Pati.commons.CommonMapper;
import com.utsav.kamal.Shikayat_Pati.entity.ComplainsEntity;
import com.utsav.kamal.Shikayat_Pati.model.Complains;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ComplainsMapper extends CommonMapper<ComplainsEntity, Complains> {
}
