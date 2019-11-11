package com.example.demo.fees;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FeeService {

	@Autowired
	private FeeRepository feeRepository;

	public List<Fee> getAllFees() {
		List<Fee> fees = new ArrayList<>();
		feeRepository.findAll()
		.forEach(fees::add);
		return fees;
	}

	public void addFee(Fee fee) {
		feeRepository.save(fee);
	}

	public void updateFee(String id,Fee fee) {
		feeRepository.save(fee);
	}

	public void deleteFee(String id) {
		feeRepository.deleteById(id);
	}

}
