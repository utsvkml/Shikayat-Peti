package com.utsav.kamal.Shikayat_Pati.repo;

import com.utsav.kamal.Shikayat_Pati.commons.CommonRepos;
import com.utsav.kamal.Shikayat_Pati.entity.ComplainsEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplainsRepo extends CommonRepos<ComplainsEntity,Long> {
}
