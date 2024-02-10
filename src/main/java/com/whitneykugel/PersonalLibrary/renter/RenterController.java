package com.whitneykugel.PersonalLibrary.renter;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api/v1/renter")
public class RenterController {

	private final RenterService renterService;

	@GetMapping
	public List<Renter> getRenter() {
		return renterService.getRenter();
	}
}
