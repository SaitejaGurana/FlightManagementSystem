package com.flightbooking.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FlightDTO {
	@NotNull(message = "Flight ID cannot be null.")
	private Integer flightId;
	 @NotBlank(message = "Flight name cannot be blank.")
	private String flightName;
	 @NotNull(message = "Seat capacity cannot be null.")
	    @Min(value = 1, message = "Seat capacity must be at least 1.")
	private Integer seatCapacity;
	 @NotNull(message = "Fare cannot be null.")
	    @Min(value = 0, message = "Fare must be a non-negative value.")
	private Double fare;

	public FlightDTO(Integer flightId, String flightName, Integer seatCapacity, Double fare) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.seatCapacity = seatCapacity;
		this.fare = fare;
	}

}
