package com.example.studenttask.service;

import com.example.studenttask.dao.entity.StudentEntity;
import com.example.studenttask.dao.repository.StudentRepository;
import com.example.studenttask.mapper.StudentMapper;
import com.example.studenttask.model.dto.StudentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public void createStudent(StudentDto dto) {
        repository.save(StudentMapper.mapDtoToEntity(dto));
    }

    public Object getStudent(Long id) {
        if (!repository.findById(id).isPresent()) {
            return "Student not found";
        }
        return repository.findById(id);
    }

    public Iterable<StudentEntity> getAllStudents() {
        return repository.findAll();
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }


}
