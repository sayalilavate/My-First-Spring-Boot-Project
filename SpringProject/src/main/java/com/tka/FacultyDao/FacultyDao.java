package com.tka.FacultyDao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.tka.Entity.Faculty;
import com.tka.Entity.Subject;

@Repository
public class FacultyDao {

	public ArrayList<Faculty> facultySubject() {

		ArrayList<Faculty> alfacultywithSub = new ArrayList<Faculty>();

		ArrayList<Subject> alSub1 = new ArrayList<>();
		alSub1.add(new Subject(1, "Java"));
		alSub1.add(new Subject(2, "Python"));
		Faculty faculty1 = new Faculty(1, "Ram", 5, alSub1);

		ArrayList<Subject> alSub2 = new ArrayList<>();
		alSub2.add(new Subject(1, "REACT"));
		alSub2.add(new Subject(2, "MEARN"));
		Faculty faculty2 = new Faculty(1, "SHYAM", 15, alSub2);

		alfacultywithSub.add(faculty1);
		alfacultywithSub.add(faculty2);

		return alfacultywithSub;

	}

}
