package com.utsav.kamal.Shikayat_Pati.commons;


import lombok.Data;

import java.util.List;

@Data
public abstract class Services<E,M,ID> {
    public final CommonRepos<E,ID> repo;
    public final CommonMapper<E,M> mapper;

    public M create(M m){
        E entity = mapper.modeToEntity(m);
        E saved = repo.save(entity);
        System.out.print("Returned Response from Controller");
        return mapper.EntityToModel(saved);
    }

    public List<M> getAll(){
        List<E> entities = repo.findAll();
        System.out.println("Entity name"+repo.getClass().getTypeName());
        return mapper.EntitiesToModes(entities);
    }

    public M getById(ID id){
        E entity = repo.findById(id).orElseThrow(()->new RuntimeException("Resource with the Id "+id +" is not present"));

        return mapper.EntityToModel(entity);
    }

    public void deleteById(ID id){
        repo.deleteById(id);
    }

    public M update(M m){
        E entity = repo.save(mapper.modeToEntity(m));
        return mapper.EntityToModel(entity);
    }




}
