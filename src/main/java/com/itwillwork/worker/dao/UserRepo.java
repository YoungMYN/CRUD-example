package com.itwillwork.worker.dao;

import com.itwillwork.worker.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Long> {
}
