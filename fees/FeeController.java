package com.example.demo.fees;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeeController {
	
	@Autowired
	private FeeService feeService;

	@RequestMapping("/fees")
	public List<Fee> getAllFee() {
		return feeService.getAllFees();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/fees")
	public void addFee(@RequestBody Fee fee) {
		System.out.printf(fee.getBusFee(),fee.getExamFee(),fee.getJntuFee(),fee.getTutionFee(),fee.getCondonationFee());
		feeService.addFee(fee);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/fees/{id}")
	public void updateDept(@RequestBody Fee fee, @PathVariable String id) {
		feeService.updateFee(id, fee);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/fees/{id}")
	public void deleteteFee(@PathVariable String id) {
		feeService.deleteFee(id);
	}

}
