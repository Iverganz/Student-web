package main.com.mycompany.app.dao;


import main.com.mycompany.app.dao.Interface.*;
import main.com.mycompany.app.Entity.*;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;


public class GroupDaoImpl implements GroupDao {

    @PersistenceContext
    private EntityManager entityManager;

    private static final String ALL_GROUP_QUERY = "select a from GroupEntity a";



    @Override
    public GroupEntity getById(Integer id) {
        final GroupEntity groupEntity = this.entityManager.find(GroupEntity.class, id);
        return groupEntity;
    }

    @Override
    public List<GroupEntity> getAll() {
        final TypedQuery<GroupEntity> query = this.entityManager.createQuery(ALL_GROUP_QUERY, GroupEntity.class);
        final List<GroupEntity> result = query.getResultList();

        return result;
    }
    
    @Override
    public GroupEntity save(GroupEntity groupEntity) {
        this.entityManager.persist(groupEntity);

        return groupEntity;
    }

    @Override
    public GroupEntity update(GroupEntity groupEntity) {
        this.entityManager.merge(groupEntity);

        return groupEntity;
    }

    @Override
    public GroupEntity deleteById(Integer id) {
        final GroupEntity group = this.getById(id);
        this.entityManager.remove(group);

        return group;
    }
}
