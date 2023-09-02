package com.mlinzi.api_management.repository;

import com.mlinzi.api_management.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,String> {
}
