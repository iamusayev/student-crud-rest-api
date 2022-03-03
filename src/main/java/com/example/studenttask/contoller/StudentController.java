package com.example.studenttask.contoller;


import com.example.studenttask.dao.entity.StudentEntity;
import com.example.studenttask.model.dto.StudentDto;
import com.example.studenttask.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody StudentDto dto) {
        service.createStudent(dto);
    }

    @GetMapping("/{id}")
    public Object getStudent(@PathVariable Long id) {
        return service.getStudent(id);
    }

    @GetMapping
    public Iterable<StudentEntity> getAllStudents() {
        return service.getAllStudents();
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
    }

}
