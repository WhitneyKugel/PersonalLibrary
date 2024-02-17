package com.whitneykugel.PersonalLibrary.service;

import com.whitneykugel.PersonalLibrary.data.doa.RenterRepository;
import com.whitneykugel.PersonalLibrary.data.entity.Renter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RenterService {

	private final RenterRepository renterRepository;

	public List<Renter> getRenter() {
		return renterRepository.findAll();
	}

	public void addRenter(Renter renter) {

		Optional<Renter> renterOptional = renterRepository.findRenterByEmail(renter.getEmail());

		if (renterOptional.isPresent()) {
			throw new IllegalStateException("email already taken");
		}

		renterRepository.save(renter);

	}

	public void deleteRenter(String email) {
		if (!renterRepository.existsById(email)) {
			throw new IllegalStateException("renter with email " + email + " does not exist");
		}
		renterRepository.deleteById(email);
	}

	@Transactional
	public void updateRenter(String currentEmail, String lastName, String newEmail) {

		Renter renter = renterRepository.findById(currentEmail)
				.orElseThrow(() -> new IllegalStateException("renter with id " + currentEmail + " does not exist"));

		if (lastName != null && !lastName.isEmpty() && !lastName.equals(renter.getFirstName())) {
			renter.setFirstName(lastName);
		}

		if (newEmail != null && !newEmail.isEmpty() && !newEmail.equals(renter.getEmail())) {

			Optional<Renter> renterOptional = renterRepository.findRenterByEmail(newEmail);
			if (renterOptional.isPresent()) {
				throw new IllegalStateException("email taken");
			}
			renter.setEmail(newEmail);
		}

		renterRepository.save(renter);

	}
}
