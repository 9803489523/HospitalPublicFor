package com.exapmle.Sweater.repos;

import com.exapmle.Sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message,Long> { //позволяет получить полный список полей или найти их по идентификатору
    List<Message> findByTag(String tag);
}
