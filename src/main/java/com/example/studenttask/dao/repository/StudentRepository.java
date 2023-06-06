package com.example.studenttask.dao.repository;

import com.example.studenttask.dao.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity, Long> {
}
