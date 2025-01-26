package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Table(name = "emp")
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Emp
{

	@SequenceGenerator(name = "sq" ,sequenceName = "hello",initialValue = 9,allocationSize = 1)
	@GeneratedValue(generator = "sq",strategy = GenerationType.SEQUENCE)
	@Id
	private Integer empno;
	@NonNull
	private String ename;
	@NonNull
	private String job;
	@NonNull
	private Double sal;
}
