package com.nnt.fs.expend.demo.repository;

import com.nnt.fs.expend.demo.model.entity.Expends;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpendsRepository extends JpaRepository<Expends,Long> {
}
