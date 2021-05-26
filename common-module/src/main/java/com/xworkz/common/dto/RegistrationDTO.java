package com.xworkz.common.dto;

import lombok.Data;

@Data
public class RegistrationDTO {

	private String fullName;
	private String EmailId;
	private String dob;
	private long contact;
	private String address;
	private String gender;
	private String password;

}
