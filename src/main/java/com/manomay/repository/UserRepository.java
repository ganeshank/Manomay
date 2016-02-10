package com.manomay.repository;

import com.manomay.model.Users;

public interface UserRepository extends GeneralRepository<Users, Long> {
	void save(Users stock);
	void update(Users stock);
	void delete(Users stock);
	Users findByStockCode(String stockCode);
}
