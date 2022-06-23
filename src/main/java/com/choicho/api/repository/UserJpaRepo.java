package com.choicho.api.repository;

import com.choicho.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepo extends JpaRepository<User,Long> {}
