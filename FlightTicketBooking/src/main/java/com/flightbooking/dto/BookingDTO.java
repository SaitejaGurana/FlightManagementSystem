package com.flightbooking.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookingDTO {
	 @NotNull
	private Integer bookingId;
	 @NotNull
	private LocalDate bookingDate;
	 @Valid
	    @NotEmpty
	private List<PassengerDTO> passengerList;
	 @NotNull
	private Double totalCost;
	 @Valid
	    @NotNull
	private FlightDTO flight;
	@Valid
    @NotNull
	private ScheduleDTO schedule;
	@NotNull
    @Min(value = 1, message = "Number of passengers must be at least 1.")
	private Integer noOfPassengers;

	public BookingDTO(Integer bookingId, Double totalCost, Integer noOfPassengers) {
		super();
		this.bookingId = bookingId;
		this.totalCost = totalCost;
		this.noOfPassengers = noOfPassengers;
	}

}
