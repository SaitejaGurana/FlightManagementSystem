package com.flightbooking.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PassengerDTO {
	@NotNull(message = "Passenger ID cannot be null.")
	private Integer passengerId;
	@NotNull
	@NotBlank(message="Passenger name cannot be blank")
	private String passengerName;
	 @NotNull(message = "Age cannot be null.")
	    @Min(0)
	private Integer age;
	 @NotNull(message = "Passenger UIN cannot be null.")
	private Long passengerUIN;

	public PassengerDTO(Integer passengerId, String passengerName, Integer age, Long passengerUIN) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.age = age;
		this.passengerUIN = passengerUIN;
	}

}
