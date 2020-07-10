package com.skdjq.blog.Service;

import com.skdjq.blog.entity.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TypeService {

    int saveType(Type type);

    Type getType(Long id);

    List<Type> getAllType();

    List<Type> getAdminType();

    Type getTypeByName(String name);

    int updateType(Type type);

    int deleteType(Long id);
}
