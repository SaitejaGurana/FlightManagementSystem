package com.flightbooking.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ScheduleDTO {
	@NotNull(message = "Schedule ID cannot be null.")
	private Integer scheduleId;
	 @NotNull(message = "Source airport cannot be null.")
	private AirportDTO sourceAirport;
	 @NotNull(message = "Destination airport cannot be null.")
	private AirportDTO destinationAirport;
	 @NotNull
	private LocalDate arrivalDate;
	 @NotNull
	private LocalDate departureDate;

}
