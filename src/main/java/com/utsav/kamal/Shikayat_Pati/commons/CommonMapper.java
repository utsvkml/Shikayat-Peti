package com.utsav.kamal.Shikayat_Pati.commons;

import java.util.List;


public interface CommonMapper<E,M> {
    E modeToEntity(M m);
    M EntityToModel(E e);
    List<M> EntitiesToModes(List<E> e);
    List<E> ModelsToEntities(List<M> m);
}
