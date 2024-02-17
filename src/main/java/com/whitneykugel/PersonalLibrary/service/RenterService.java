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

	public void deleteRenter(Long renterId) {
		if (!renterRepository.existsById(renterId)) {
			throw new IllegalStateException("renter with id " + renterId + " does not exist");
		}
		renterRepository.deleteById(renterId);
	}

	@Transactional
	public void updateRenter(Long renterId, String lastName, String email) {

		Renter renter = renterRepository.findById(renterId)
				.orElseThrow(() -> new IllegalStateException("renter with id " + renterId + " does not exist"));

		if (lastName != null && !lastName.isEmpty() && !lastName.equals(renter.getFirstName())) {
			renter.setFirstName(lastName);
		}

		if (email != null && !email.isEmpty() && !email.equals(renter.getEmail())) {

			Optional<Renter> renterOptional = renterRepository.findRenterByEmail(email);
			if (renterOptional.isPresent()) {
				throw new IllegalStateException("email taken");
			}
			renter.setEmail(email);
		}

		renterRepository.save(renter);

	}
}
