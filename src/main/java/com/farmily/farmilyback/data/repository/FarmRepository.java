package com.farmily.farmilyback.data.repository;

import com.farmily.farmilyback.data.entity.Farm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FarmRepository extends JpaRepository<Farm, Object> {

}
