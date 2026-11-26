package com.utsav.kamal.Shikayat_Pati.controller;


import com.utsav.kamal.Shikayat_Pati.commons.CommonController;
import com.utsav.kamal.Shikayat_Pati.commons.Services;
import com.utsav.kamal.Shikayat_Pati.entity.ComplainsEntity;
import com.utsav.kamal.Shikayat_Pati.model.Complains;
import com.utsav.kamal.Shikayat_Pati.service.impl.ComplainServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/complains")
public class ComplainsController extends CommonController<ComplainsEntity, Complains,Long> {
    public ComplainsController(ComplainServiceImpl services) {
        super(services);
    }
}
