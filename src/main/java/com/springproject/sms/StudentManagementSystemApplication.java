package com.springproject.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springproject.sms.entity.Student;
import com.springproject.sms.repository.StudentRepo;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepo studentRepo;
    
	@Override
	public void run(String... args) throws Exception {
		
//		Student stu1 = new Student("Rupam", "Chakraborty", "rup@gmail.com");
//		studentRepo.save(stu1);
//		
//		Student stu2 = new Student("Ritam", "Chakraborty", "rit@gmail.com");
//		studentRepo.save(stu2);
//		
//		Student stu3 = new Student("Ranjan", "Chakraborty", "ron@gmail.com");
//		studentRepo.save(stu3);
		
		
	}

}
