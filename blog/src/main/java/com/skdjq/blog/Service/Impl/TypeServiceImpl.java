package com.skdjq.blog.Service.Impl;

import com.skdjq.blog.Service.TypeService;
import com.skdjq.blog.dao.TypeDao;
import com.skdjq.blog.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeDao typeDao;

    @Transactional
    @Override
    public int saveType(Type type) {
        return typeDao.saveType(type);
    }

    @Transactional
    @Override
    public Type getType(Long id) {
        Type type = typeDao.getTypeById(id);
        return type;
    }

    @Transactional
    @Override
    public List<Type> getAllType() {
        List<Type> list = typeDao.getAllType();
        return list;
    }

    @Transactional
    @Override
    public List<Type> getAdminType() {
        List<Type> list = typeDao.getAdminType();
        return list;
    }

    @Transactional
    @Override
    public Type getTypeByName(String name) {
        Type type = typeDao.getTypeByName(name);
        return type;
    }

    @Transactional
    @Override
    public int updateType(Type type) {
        return typeDao.updateType(type);
    }

    @Transactional
    @Override
    public int deleteType(Long id) {
        return typeDao.deleteType(id);
    }
}
