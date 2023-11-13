package com.flightbooking.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AirportDTO {
	@NotNull(message = "Airport ID cannot be null.")
	private Integer airportid;
	@NotBlank(message = "Airport name cannot be blank.")
	private String airportName;
	@NotBlank(message = "Airport city cannot be blank.")
	private String airportCity;
	@NotBlank(message = "Airport country cannot be blank.")
	private String airportCountry;
	
	
	public AirportDTO(Integer airportid, String airportName, String airportCity, String airportCountry) {
		super();
		this.airportid =airportid ;
		this.airportName = airportName;
		this.airportCity = airportCity;
		this.airportCountry = airportCountry;
	}

}
