package com.farmily.farmilyback.data.repository;

import com.farmily.farmilyback.data.entity.Qna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QnaRepository extends JpaRepository<Qna ,Object> {
}
