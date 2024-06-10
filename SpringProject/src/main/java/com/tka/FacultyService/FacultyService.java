package com.tka.FacultyService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Entity.Faculty;
import com.tka.Entity.Subject;
import com.tka.FacultyDao.FacultyDao;

@Service
public class FacultyService {
	@Autowired
	FacultyDao facultyDao;

	public ArrayList<String> allSubjects() {
		ArrayList<String> alSub = new ArrayList<String>();
		ArrayList<Faculty> facSubjects = facultyDao.facultySubject();
		for (Faculty faculty : facSubjects) {
			List<Subject> subList = faculty.getSubjectName();
			for (Subject subject : subList) {
				alSub.add(subject.getSubjectName());

			}

		} 

		return alSub;
	}

	public String facultyMoreExp() {
	    // Retrieve the list of Faculty objects
	    ArrayList<Faculty> faclArrayList = facultyDao.facultySubject();
	    
	    // Initialize max to hold the highest experience found
	    int max = 0;
	    
	    // First loop to find the maximum experience
	    for (Faculty faculty : faclArrayList) {
	        if (faculty.getFacultyExpYear() >= max) {
	            max = faculty.getFacultyExpYear();
	        }
	    }
	    
	    // Second loop to find the faculty member with the maximum experience
	    for (Faculty faculty : faclArrayList) {
	        if (faculty.getFacultyExpYear() == max) {
	            return faculty.getFacultyName();
	        }
	    }
	    
	    // Return null if no faculty members are found
	    return null;
	}

	}


