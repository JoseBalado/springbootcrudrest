package com.companyname.springbootcrudrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.companyname.springbootcrudrest.model.Student;;

@Repository
public interface studentRepository extends JpaRepository<Student, Long>{
}
