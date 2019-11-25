package main.com.mycompany.app.dao.Interface;

import main.com.mycompany.app.entity.GroupEntity;

import java.util.List;

public interface GroupDao {
    GroupEntity getById(Integer id);

    List< GroupEntity> getAll();

    GroupEntity save( GroupEntity groupEntity);

    GroupEntity update( GroupEntity groupEntity);

    GroupEntity deleteById(Integer id);

}
