package com.xworkz.common.service;

import com.xworkz.common.dto.RegistrationDTO;

public interface RegistrationService {

	public String validateAndSave(RegistrationDTO dto);
}
