package main.com.mycompany.app.dao.Interface;

import main.com.mycompany.app.entity.StudentEntity;

import java.util.List;

public interface StudentDao {
    StudentEntity getById(Integer id);

    List<StudentEntity> getAll();

    StudentEntity save(StudentEntity studentEntity);

    StudentEntity update(StudentEntity studentEntity);

    StudentEntity deleteById(Integer id);

}
