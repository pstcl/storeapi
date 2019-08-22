package org.pstcl.storeapi;

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

@org.springframework.stereotype.Service
public class Service {

	
	@Autowired
	private SREntityRepository entityRepository;

	private Pageable getPageRequest(Integer page,Integer limit)
	{
		Pageable pageRequest =PageRequest.of(page, limit);
		return pageRequest;

	}

	
	public  List<SREntity> srlist( Integer page,Integer size) {
		if(null==page)
		{
			page=0;
		}
		if(null==size)
		{
			size=30;
		}
		return entityRepository.findAll(getPageRequest(page,size)).getContent();
	}
	
	public  List<SREntity> srlistbymonth( Integer month, Integer year,String loc) {
		List<SREntity> srlistbymonth=null;
		srlistbymonth=entityRepository.findBySrChallanDateBetween(DateUtil.startDateForMonth(month, year),DateUtil.endDateForMonth(month, year));
		return srlistbymonth;
	}
}
