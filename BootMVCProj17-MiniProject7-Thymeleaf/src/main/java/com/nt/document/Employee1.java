package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Employee1 
{

	@Id
	private String id;
	
	
	private String ename;
	
	private String job;
	
	private Integer sal;
	
	private Integer deptno;
	
	private String employeeLoc;
	
	private Integer mNum;
	
	private String addr;


}
