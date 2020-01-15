package com.qy.repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author QY3022
 * @date 1/14
 */
public class UserRepositoryCustomerImpl implements UserRepositoryCustomer {
    private EntityManager em;

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

}
