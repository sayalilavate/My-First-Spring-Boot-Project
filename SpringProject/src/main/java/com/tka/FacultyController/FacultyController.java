package com.tka.FacultyController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.FacultyService.FacultyService;

@RestController
public class FacultyController {
	@Autowired
	FacultyService facultyService;

	@GetMapping("FacultySubject")
	List<String> facultySubjects() {

		return facultyService.allSubjects();
	}

	@GetMapping("FacultyMoreExp")
	public String facultyMoreExp() {

		return facultyService.facultyMoreExp();
	}

}
