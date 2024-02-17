package com.whitneykugel.PersonalLibrary.data.doa;

import com.whitneykugel.PersonalLibrary.data.entity.Renter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RenterRepository extends JpaRepository<Renter, Long> {

	Optional<Renter> findRenterByEmail(String email);

}
