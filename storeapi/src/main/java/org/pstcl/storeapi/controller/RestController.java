package org.pstcl.storeapi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pstcl.storeapi.model.entity.SREntity;
import org.pstcl.storeapi.repository.SREntityRepository;
import org.pstcl.storeapi.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private SREntityRepository entityRepository;

	private Pageable getPageRequest(int page,int limit)
	{
		Pageable pageRequest =PageRequest.of(page, limit);
		return pageRequest;

	}

	@CrossOrigin(allowCredentials="true")
	@GetMapping(value = "/srlist") 
	public  List<SREntity> srlist(@RequestParam(value = "page") Integer page,
			@RequestParam(value = "size") Integer size,HttpServletResponse response,HttpServletRequest request) {
		return entityRepository.findAll(getPageRequest(page,size)).getContent();
	}
	
	@CrossOrigin(allowCredentials="true")
	@GetMapping(value = "/srlistbymonth") 
	public  List<SREntity> srlistbymonth(@RequestParam(value = "month") Integer month,
			@RequestParam(value = "year") Integer year,HttpServletResponse response,HttpServletRequest request) {
		return entityRepository.findBySrChallanDateBetween(DateUtil.startDateForMonth(month, year),DateUtil.endDateForMonth(month, year));
	}

}

