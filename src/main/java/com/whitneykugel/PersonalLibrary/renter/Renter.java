package com.whitneykugel.PersonalLibrary.renter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
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
	@SequenceGenerator(
			name = "renter_sequence",
			sequenceName = "renter_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "renter_sequence"
	)
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate dob;

	@Transient
	private Integer age;

	public Integer getAge() {
		return Period.between(this.dob, LocalDate.now()).getYears();
	}
}
