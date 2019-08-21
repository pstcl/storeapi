package org.pstcl.storeapi.model.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

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
	private LocalDate srChallanDate;
	
	@Column(name="totalvalue")
	private BigDecimal totalvalue;
	
	@Column(name="grandtotal")
	private BigDecimal grandtotal;
	
	public void setEstimateno(String estimateno) {
		this.estimateno = estimateno;
	}
	
	public BigDecimal getTotalvalue() {
		return totalvalue;
	}

	public void setTotalvalue(BigDecimal totalvalue) {
		this.totalvalue = totalvalue;
	}

	public BigDecimal getGrandtotal() {
		return grandtotal;
	}

	public void setGrandtotal(BigDecimal grandtotal) {
		this.grandtotal = grandtotal;
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

	public LocalDate getSrChallanDate() {
		return srChallanDate;
	}

	public void setSrChallanDate(LocalDate srChallanDate) {
		this.srChallanDate = srChallanDate;
	}
	
	


	
	
	
}
