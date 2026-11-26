package com.utsav.kamal.Shikayat_Pati.service;

import com.utsav.kamal.Shikayat_Pati.model.Complains;

import java.util.List;

public interface ComplainService {
    public String registerComplain(Complains complains);
    public String updateComplain(Long id,Complains complains);
    public List<Complains> getAllComplains();
    public Complains getComplain(Long id);
    public String removeComplain();
}
