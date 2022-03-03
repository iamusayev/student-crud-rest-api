package com.example.studenttask.mapper;

import com.example.studenttask.dao.entity.StudentEntity;
import com.example.studenttask.model.dto.StudentDto;
import com.example.studenttask.model.enums.Status;

public class StudentMapper {

    public static StudentEntity mapDtoToEntity(StudentDto dto) {
        return StudentEntity
                .builder()
                .name(dto.getName())
                .lastname(dto.getLastname())
                .age(dto.getAge())
                .status(Status.ACTIVE)
                .build();
    }

}
