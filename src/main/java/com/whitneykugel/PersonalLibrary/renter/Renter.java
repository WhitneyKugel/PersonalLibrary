package com.whitneykugel.PersonalLibrary.renter;/*
    Author: Whitney Kugel
    Date:     Purpose:
*/

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Renter {

	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate dob;

}
