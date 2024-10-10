package com.usman.DemoSpringBootAndJdbc;

import com.usman.DemoSpringBootAndJdbc.model.Student;
import com.usman.DemoSpringBootAndJdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoSpringBootAndJdbcApplication {

	public static void main(String[] args) {
	 ApplicationContext context =  SpringApplication.run(DemoSpringBootAndJdbcApplication.class, args);
		Student s = context.getBean(Student.class);

//		Injecting Values
		s.setRollNo(1010);
		s.setName("Usman");
		s.setMarks(100);

//		Calling Services to Add Student
		StudentService sc = context.getBean(StudentService.class);
		sc.addStudent(s);

//		Fetching List Of Students
		List<Student> studentList = sc.getStudents();
		System.out.println(studentList);

	}

}
