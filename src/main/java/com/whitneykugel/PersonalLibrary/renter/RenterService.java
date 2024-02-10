package com.whitneykugel.PersonalLibrary.renter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
