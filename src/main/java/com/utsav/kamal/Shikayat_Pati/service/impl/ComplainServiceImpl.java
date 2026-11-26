package com.utsav.kamal.Shikayat_Pati.service.impl;

import com.utsav.kamal.Shikayat_Pati.commons.CommonMapper;
import com.utsav.kamal.Shikayat_Pati.commons.Services;
import com.utsav.kamal.Shikayat_Pati.entity.ComplainsEntity;
import com.utsav.kamal.Shikayat_Pati.mappers.ComplainsMapper;
import com.utsav.kamal.Shikayat_Pati.model.Complains;
import com.utsav.kamal.Shikayat_Pati.repo.ComplainsRepo;
import com.utsav.kamal.Shikayat_Pati.service.ComplainService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplainServiceImpl extends Services<ComplainsEntity,Complains,Long> implements ComplainService {

    public ComplainServiceImpl(ComplainsRepo repo, ComplainsMapper mapper) {
        super(repo, mapper);
    }

    @Override
    public String registerComplain(Complains complains) {
        super.create(complains);
        return "Complain register successfully";
    }

    @Override
    public String updateComplain(Long id, Complains complains) {
        return "Complain updated SuccessFully";
    }

    @Override
    public List<Complains> getAllComplains() {
        return List.of();
    }

    @Override
    public Complains getComplain(Long id) {
        return null;
    }

    @Override
    public String removeComplain() {
        return "Complain removed successfully";
    }
}
