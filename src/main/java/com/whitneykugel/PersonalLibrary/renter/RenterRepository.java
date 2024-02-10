package com.whitneykugel.PersonalLibrary.renter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RenterRepository extends JpaRepository<Renter, Long> {

	Optional<Renter> findRenterByEmail(String email);

}
