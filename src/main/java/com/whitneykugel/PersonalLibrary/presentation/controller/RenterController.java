package com.whitneykugel.PersonalLibrary.presentation.controller;

import com.whitneykugel.PersonalLibrary.data.entity.Renter;
import com.whitneykugel.PersonalLibrary.service.RenterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@PostMapping
	public void addRenter(@RequestBody Renter renter) {
		renterService.addRenter(renter);
	}

	@PutMapping(path = "{renterId}")
	public void updateRenter(@PathVariable("renterId") String currentEmail,
	                         @RequestParam(required = false) String lastName,
	                         @RequestParam(required = false) String email) {
		renterService.updateRenter(currentEmail, lastName, email);
	}

	@DeleteMapping(path = "{currentEmail}")
	public void deleteRenter(@PathVariable("currentEmail") String currentEmail) {
		renterService.deleteRenter(currentEmail);
	}


}
