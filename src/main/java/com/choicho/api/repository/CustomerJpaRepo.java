package com.choicho.api.repository;

import com.choicho.api.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerJpaRepo extends JpaRepository<Customer,Long> {}
