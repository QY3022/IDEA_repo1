package com.qy.repository;

import com.qy.myEntity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author QY3022
 * @date 1/14
 */
public interface UserRepository extends UserRepositoryCustomer, JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

}
