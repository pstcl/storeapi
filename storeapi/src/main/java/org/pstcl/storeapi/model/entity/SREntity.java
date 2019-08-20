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

	@Column(name="datevoucher")
	private LocalDate datevoucher;
	@Column(name="datesentstore")
	private LocalDate datesentstore;
	@Column(name="dateapprovestore")
	private LocalDate dateapprovestore;

	@Column private String  stockitemyype;
	@Column  private String stockitemcode;
	@Column   private String stockitemname;
	public Integer getItxno() {
		return itxno;
	}
	public void setItxno(Integer itxno) {
		this.itxno = itxno;
	}
	public LocalDate getDatevoucher() {
		return datevoucher;
	}
	public void setDatevoucher(LocalDate datevoucher) {
		this.datevoucher = datevoucher;
	}
	public LocalDate getDatesentstore() {
		return datesentstore;
	}
	public void setDatesentstore(LocalDate datesentstore) {
		this.datesentstore = datesentstore;
	}
	public LocalDate getDateapprovestore() {
		return dateapprovestore;
	}
	public void setDateapprovestore(LocalDate dateapprovestore) {
		this.dateapprovestore = dateapprovestore;
	}
	public String getStockitemyype() {
		return stockitemyype;
	}
	public void setStockitemyype(String stockitemyype) {
		this.stockitemyype = stockitemyype;
	}
	public String getStockitemcode() {
		return stockitemcode;
	}
	public void setStockitemcode(String stockitemcode) {
		this.stockitemcode = stockitemcode;
	}
	public String getStockitemname() {
		return stockitemname;
	}
	public void setStockitemname(String stockitemname) {
		this.stockitemname = stockitemname;
	}
	
	
}
