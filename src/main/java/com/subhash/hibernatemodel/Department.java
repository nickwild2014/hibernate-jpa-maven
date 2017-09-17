package com.subhash.hibernatemodel;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Department", uniqueConstraints = @UniqueConstraint(columnNames = "service"))
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Department.findAll", query = "SELECT e FROM Department e") })
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private BigDecimal id;
	@Column(name = "SERVICE")
	private String service;
	

	@Lob
	private byte[] picture;

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public java.util.Calendar getDob() {
		return dob;
	}

	public void setDob(java.util.Calendar dob) {
		this.dob = dob;
	}

	@Column(name = "OPERATION")
	private String operation;
	@Column(name = "BRANCH")
	private String branch;
	@Column(name = "START_DATE", columnDefinition = "DATE DEFAULT CURRENT_DATE")
	private java.sql.Date startDate;
	@Temporal(TemporalType.DATE)
	private java.util.Calendar dob;

	public java.sql.Date getStartDate() {
		return startDate;
	}

	public void setStartDate(java.sql.Date startDate) {
		this.startDate = startDate;
	}

	public Department() {
	}

	public Department(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Department)) {
			return false;
		}
		Department other = (Department) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.subhash.hibernatemodel.Department[ id=\" + id + \", service=\" + service + \", branch=\" + branch + \", operation=\" + operation + \" ]";
	}
}
