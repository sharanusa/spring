package com.xworkz.common.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.common.dto.RegistrationDTO;
import com.xworkz.common.entity.EndgameEntity;
import com.xworkz.common.repository.EndgameRepo;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	private Logger logger;

	@Autowired
	private EndgameRepo repo;

	public RegistrationServiceImpl() {
		logger = Logger.getLogger(getClass());
	}

	public String validateAndSave(RegistrationDTO dto) {
		logger.info("inside the {} ");
		EndgameEntity entity = new EndgameEntity();
		try {

			EndgameEntity edEntity = repo.getByEmailId(dto.getEmailId());
			if (edEntity == null) {

				BeanUtils.copyProperties(dto, entity);
				entity.setRegisteredBy("Sharanu");
				LocalDateTime ldate = LocalDateTime.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
				String date = formatter.format(ldate);
				entity.setRegisteredDate(date);

				int affectedRows = repo.save(entity);
				if (affectedRows > 0) {
					logger.info("user successfully registered");
					return "user successfully registered";
				} else {
					logger.info("user not registered");
					return "user not registered";
				}
			} else {
				logger.info("user already exist");
				return "user already exist";
			}
		} catch (Exception e) {
			logger.error("you have an Exception in {} " + e.getMessage(), e);
		}
		return "";
	}

}
