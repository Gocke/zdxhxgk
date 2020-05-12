package com.kk.zdxhxgk.business.mapper;

import com.kk.zdxhxgk.business.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestJpa extends JpaRepository<Test,Integer> {
    public List<Test> findByNameLike(String name);
}
