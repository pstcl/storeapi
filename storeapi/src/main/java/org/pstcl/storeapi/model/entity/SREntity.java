package org.pstcl.storeapi.model.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="stockissuetable")
public class SREntity {
	@Id
	private Integer itxno;

	
	
	@Column(name="estimateno")
	private String estimateno ;
	
	@Column(name="divid")
	private String divid ;
	
	@Column(name="srchallanbookno")
	private String srchallanbookno ;
	
	@Column(name="srchallanpageno")
	private String srchallanpageno ;
	
	@Column(name="srchallandate")
	private LocalDate srchallandate;
	
	@Column(name="totalvalue")
	private Double totalvalue;
	
	@Column(name="grandtotal")
	private Double grandtotal;
	
	public void setEstimateno(String estimateno) {
		this.estimateno = estimateno;
	}
	public void setTotalvalue(Double totalvalue) {
		this.totalvalue = totalvalue;
	}
	public Integer getItxno() {
		return itxno;
	}
	public void setItxno(Integer itxno) {
		this.itxno = itxno;
	}
	
	
	public String getEstimateno() {
		return estimateno;
	}
	public void seEstimateno(String estimateno) {
		this.estimateno = estimateno;
	}
	
	public String getDivid() {
		return divid;
	}
	public void setDivid(String divid) {
		this.divid = divid;
	}
	
	
	
	public String getSrchallanbookno() {
		return srchallanbookno;
	}
	public void setSrchallanbookno(String srchallanbookno) {
		this.srchallanbookno = srchallanbookno;
	}
	
	
	
	public String getSrchallanpageno() {
		return srchallanpageno;
	}
	public void setSrchallanpageno(String srchallanpageno) {
		this.srchallanpageno = srchallanpageno;
	}
	
	
	public Double getTotalvalue() {
		return totalvalue;
	}
	public void setSrchallanpageno(Double totalvalue) {
		this.totalvalue = totalvalue;
	}
	public Double getGrandtotal() {
		return grandtotal;
	}
	public void setGrandtotal(Double grandtotal) {
		this.grandtotal = grandtotal;
	}
	
	public LocalDate getSrchallandate() {
		return srchallandate;
	}
	public void setSrchallandate(LocalDate srchallandate) {
		this.srchallandate = srchallandate;
	}
	
	
	
}
