package com.utsav.kamal.Shikayat_Pati.commons;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CommonRepos<E,ID> extends JpaRepository<E,ID> {
}
