package main.com.mycompany.app.dao.Interface;

import main.com.mycompany.app.Entity.StudentEntity;

import java.util.List;

public interface StudentDao {
    StudentEntity getById(Integer id);

    List<StudentEntity> getAll();

    StudentEntity save(StudentEntity studentEntity);

    StudentEntity update(StudentEntity studentEntity);

    StudentEntity deleteById(Integer id);

    List<StudentEntity> getByGroup(Integer groupId);

}
