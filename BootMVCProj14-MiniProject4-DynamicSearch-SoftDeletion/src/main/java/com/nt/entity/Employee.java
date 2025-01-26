package com.nt.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;
import org.hibernate.annotations.Where;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="emp")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@SQLDelete(sql = "update emp set status='inactive' where empno=?")
@SQLRestriction("status <> 'inactive' ")
public class Employee 
{
   @SequenceGenerator(name="seq3",sequenceName = "emp_seq2",initialValue = 1000,allocationSize = 5)
   @GeneratedValue(generator = "seq3",strategy = GenerationType.SEQUENCE)
   @Id
	private Integer empno;
	
	//@NonNull
	@Column(length = 30)
	private String ename;
	//@NonNull
	@Column(length = 30)
	private String job;
	//@NonNull
	private Double sal;
	//@NonNull
	private String deptno;
	
}
