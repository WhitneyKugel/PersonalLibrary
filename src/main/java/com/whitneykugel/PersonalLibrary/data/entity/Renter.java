package com.whitneykugel.PersonalLibrary.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table
public class Renter {

	@Id
	private String email;
	private String firstName;
	private String lastName;
	private LocalDate dob;

	public String  getFullName() {
		return this.firstName + this.lastName;
	}

}
