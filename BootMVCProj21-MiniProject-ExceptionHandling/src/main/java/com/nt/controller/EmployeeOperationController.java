package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeMgmtService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmployeeOperationController 
{
   @Autowired
	private IEmployeeMgmtService empMgmt;
   
   @GetMapping("/")
   public String showHome() {
	   return"welcome";
   }
   @GetMapping("/report")
   public String getReport(@PageableDefault(page = 0,size = 5,sort = "job",direction = Direction.ASC)Pageable page, Map<String,Object>map) 
   {
	   Page<Employee>pageable =empMgmt.getEmployeeDateByPage(page);
	   //Put Data in Shared Memory
	   map.put("empdata", pageable);
	return "show_report";   
   }
   
   @GetMapping("/addEmp")//Loading the form
   public String loadForm(@ModelAttribute("emp") Employee employee ) {
	   
	   return "form";
   }
   
 //Submission of Form 1st Method But Not Recommanded 
   //Double Posting Problem will occur
	/*
	 * @PostMapping("/addEmp") public String
	 * formSubmission(Map<String,Object>map,@ModelAttribute("em")Employee emp) { try
	 * { String Msg = empMgmt.addEmployeeRecords(emp);
	 * List<Employee>list=empMgmt.showAllEmployee(); map.put("empdata", list);
	 * map.put("result", Msg); return "show_report"; }catch(Exception e) {
	 * 
	 * e.printStackTrace(); map.put("errorMsg", e.getMessage()); return "error"; } }
	 */

       
   //Here Share memory will not work because it scope is within request
   //and redirect scope is within the multiple request
	/*
	 * @PostMapping("/addEmp") public String
	 * formSubmission(Map<String,Object>map,@ModelAttribute("em")Employee emp) { try
	 * { String Msg = empMgmt.addEmployeeRecords(emp);
	 * List<Employee>list=empMgmt.showAllEmployee(); map.put("empdata", list);
	 * map.put("result", Msg); return "redirect:report"; }catch(Exception e) {
	 * 
	 * e.printStackTrace(); map.put("errorMsg", e.getMessage()); return "error"; } }
	 */
	 
   
        //Using RedirectAttribute its scope is from source to destination
        //handle method  but after one request it will not visible for second request
   
   
		/*
		 * @PostMapping("/addEmp") public String formSubmission(RedirectAttributes
		 * rdda,@ModelAttribute("em")Employee emp) { try { String Msg =
		 * empMgmt.addEmployeeRecords(emp); rdda.addFlashAttribute("result", Msg);
		 * return "redirect:report"; }catch(Exception e) {
		 * 
		 * e.printStackTrace(); rdda.addFlashAttribute("errorMsg", e.getMessage());
		 * return "error"; } 
		 * }
		 * }
		 */

     //Using SessionScope which is available throughtout the project 
   //until browser will shutdowm


@PostMapping("/addEmp") 
public String formSubmission(HttpSession session,@ModelAttribute("em")Employee emp) { try
{ 
String Msg = empMgmt.addEmployeeRecords(emp);
session.setAttribute("result",Msg); 
return "redirect:report"; 
}catch(Exception e) 
{

e.printStackTrace(); 
session.setAttribute("errorMsg", e.getMessage()); 
return "error"; 
}
}


//====================UPDATE OPERATION ==================



@GetMapping("/edit")
public String updateRecord(@RequestParam("no")int no,@ModelAttribute("emp")Employee emp ) {
	
	   Employee emp1 =empMgmt.changeRecord(no);
	
	   BeanUtils.copyProperties(emp1, emp);
	return "edit_report";
}

@PostMapping("/edit")
public String submission(@ModelAttribute("emp")Employee emp,RedirectAttributes rrd)
{
    try { 
	String msg  = empMgmt.UpdateEmp(emp);
	 rrd.addFlashAttribute("result", msg);
	
	return "redirect:report";
    }catch(Exception e) 
    {
    	e.printStackTrace();
    	rrd.addAttribute(e.getMessage());
    	return "error";
    }
    }

//=======================Search=======================

  @GetMapping("/search")
   public String searchEmp() 
  {
	   
	   return "search";
   }

  
  @PostMapping("/show")
	public String showEmp(@RequestParam("empname")String ename,Map<String, Object>map) {
		
	         List<Employee>list  =empMgmt.searchEmp(ename);
	      if(list.isEmpty()) 
	      {
	    	  map.put("dis", "Data Not Found :");
	    	  return "search";
	      }else {
	         map.put("result", list);
		return "result_final";
  }
  }
//====================DELETE OPERATION ======================


   @GetMapping("/delete")
   public String removeRecord(@RequestParam("no")int id,RedirectAttributes rdd)
   {
	           String msg=empMgmt.removeRecord(id);
	   rdd.addFlashAttribute("show", msg);
	   return "redirect:report";
   }


/*

 */
}