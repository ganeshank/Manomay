package com.manomay.service;

import com.manomay.model.Users;

public interface UserService {
	void save(Users stock);
	void update(Users stock);
	void delete(Users stock);
	Users findByStockCode(String stockCode);
}
