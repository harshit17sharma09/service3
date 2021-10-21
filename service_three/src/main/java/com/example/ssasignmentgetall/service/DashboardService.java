package com.example.ssasignmentgetall.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.ssasignmentgetall.entity.Dashboard;
import com.example.ssasignmentgetall.entity.Department;


@Service
public class DashboardService {

	  @Autowired
	    private RestTemplate restTemplate;
	
	
	public List<Department> getAll() {
		// TODO Auto-generated method stub
		List<Department> l1 = new ArrayList<Department>();
		
		Dashboard d1 = new Dashboard();
		Department[] dep = getAllDepartment();
		
		
		 l1 = Arrays.asList(dep);
		
	return l1;	
	}
		
		 public Department[] getAllDepartment() {
		        System.out.println("Inside getAllDepartment of DashBoardService");
		        
		        Dashboard vo = new Dashboard();
		        
		      /*  Dashboard department =
		                restTemplate.getForObject("http://localhost:9001/departments/findall"
				        ,Dashboard.class);
		        */
		        ResponseEntity<Department[]> response =
		        		  restTemplate.getForEntity(
		        		  "http://service1:9001/departments/findall",
		        		  Department[].class);
		        		Department[] employees = response.getBody();
		       
		        return  employees;
		    }
		
	

}
