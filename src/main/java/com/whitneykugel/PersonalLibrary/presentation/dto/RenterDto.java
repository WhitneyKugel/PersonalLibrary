package com.whitneykugel.PersonalLibrary.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class RenterDto {

	private String email;
	private String firstName;
	private String lastName;
	private LocalDate dob;

}
