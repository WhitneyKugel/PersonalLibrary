package com.whitneykugel.PersonalLibrary.renter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RenterService {

	private final RenterRepository renterRepository;

	public List<Renter> getRenter() {
		return renterRepository.findAll();
	}
}
