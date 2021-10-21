package com.example.ssasignmentgetall.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ssasignmentgetall.entity.Department;
import com.example.ssasignmentgetall.service.DashboardService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/getall")
@Slf4j
public class getAllController {
	
	@Autowired
    private DashboardService dashboardService;
	
	
	@GetMapping("/")
	public List<Department> getall()
	{
		List<Department> l1 = new ArrayList<Department>();
		
		l1 = dashboardService.getAll();
		
		return l1;
		
	}

}
