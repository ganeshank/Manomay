package com.manomay.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.manomay.repository.GeneralRepository;

public class GeneralRepositoryImpl<T,K> implements GeneralRepository<T, K> {

	@Autowired
	protected SessionFactory sessionFactory;
	
	protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
