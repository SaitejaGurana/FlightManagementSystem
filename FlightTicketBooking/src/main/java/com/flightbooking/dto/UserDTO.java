package com.flightbooking.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserDTO {
	@NotNull(message = "User ID cannot be null.")
	private Integer userId;
@NotNull(message="User Name should not be Null")
	private String userName;
	@Min(8)
	@Max(20)
	private String password;
	@Email()
	private String email;
	@NotNull(message= "Mobile Number not Null")
	private Long mobileNumber;

	public UserDTO(Integer userId, String userName, String password, String email, Long mobileNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

}
