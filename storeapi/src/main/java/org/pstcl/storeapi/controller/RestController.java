package org.pstcl.storeapi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pstcl.storeapi.Service;
import org.pstcl.storeapi.model.entity.SREntity;
import org.pstcl.storeapi.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private Service service;

	@CrossOrigin(allowCredentials="true")
	@GetMapping(value = "/srlist") 
	public  List<SREntity> srlist(@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "size", required = false) Integer size,HttpServletResponse response,HttpServletRequest request) {
		return service.srlist(page, size);
	}

	@CrossOrigin(allowCredentials="true")
	@GetMapping(value = "/srlistbymonth") 
	public  List<SREntity> srlistbymonth(
			@RequestParam(value = "month", required = false) Integer month,
			@RequestParam(value = "year", required = false) Integer year,
			@RequestParam(value = "loc", required = false) String loc,
			HttpServletResponse response,HttpServletRequest request) {
		return service.srlistbymonth(month, year, loc);
	}

}

