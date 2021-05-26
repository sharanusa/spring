package com.xworkz.common.repository;

import com.xworkz.common.entity.EndgameEntity;

public interface EndgameRepo {

	public Integer save(EndgameEntity entity);

	public EndgameEntity getByEmailId(String emailId);

}