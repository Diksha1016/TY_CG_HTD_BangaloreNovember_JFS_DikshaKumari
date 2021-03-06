package com.capge.jpawithhibernate.onetoone;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="emp_othrdet")
public class EmployeeOthrInfo {
	@Id
	@Column
	private int id;
	@Column
	private String pancard;
	@OneToOne(cascade = CascadeType.ALL)
	
	@JoinColumn(name="eid")
	private EmployeeInfo empInfo;
	
	 
	

}
