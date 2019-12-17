package main.com.mycompany.app.dao;


import main.com.mycompany.app.dao.Interface.StudentDao;
import main.com.mycompany.app.Entity.StudentEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    EntityManager entityManager;

    private static final String ALL_STUDENT_QUERY = "select s from StudentEntity s";

    @Override
    public StudentEntity getById(Integer id) {
        final StudentEntity studentEntity = this.entityManager.find(StudentEntity.class, id);
        return studentEntity;
    }

    @Override
    public List<StudentEntity> getAll() {
        final TypedQuery<StudentEntity> query = this.entityManager.createQuery(ALL_STUDENT_QUERY, StudentEntity.class);
        final List<StudentEntity> result = query.getResultList();

        return result;
    }

    @Override
    public StudentEntity save(StudentEntity studentEntity) {
        this.entityManager.persist(studentEntity);

        return studentEntity;
    }

    @Override
    public StudentEntity update(StudentEntity studentEntity) {
        this.entityManager.merge(studentEntity);

        return studentEntity;
    }

    @Override
    public StudentEntity deleteById(Integer id) {
        final StudentEntity student = this.getById(id);
        this.entityManager.remove(student);

        return student;
    }

    @Override
    public List<StudentEntity> getByGroup(Integer groupId) {
        List<StudentEntity> result = this.entityManager.createQuery("SELECT s FROM student s WHERE s.group_num LIKE :group\"").setParameter("group", groupId).getResultList();

        return result;
    }
}
