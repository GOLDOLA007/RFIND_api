package com.api.RFIND_api.RFIND_api.service;

import jakarta.persistence.EntityNotFoundException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.module.ResolutionException;
import java.util.List;

public abstract class GenericService<T, ID> {

    protected abstract JpaRepository<T, ID> getRepository();

    public List<T> findAll() {
        return getRepository().findAll();
    }

    public T findById(ID id) {
        return getRepository().findById(id).get();
    }

    public T save(T entity) {
        return getRepository().save(entity);
    }

    public void delete(ID id) {
        if(!getRepository().existsById(id)){
            throw new ResourceNotFoundException("Invalid ID");
        }
        getRepository().deleteById(id);
    }
}
