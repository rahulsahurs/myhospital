package com.rakuten.myhospital;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rakuten.myhospital.dao.BedRepository;
import com.rakuten.myhospital.dao.PatientRepository;
import com.rakuten.myhospital.dao.TestDetailsRepository;
import com.rakuten.myhospital.entities.Bed;
import com.rakuten.myhospital.entities.Patient;
import com.rakuten.myhospital.entities.TestDetails;

@SpringBootApplication
public class MyhospitalApplication {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(MyhospitalApplication.class, args);

		BedRepository b = ac.getBean(BedRepository.class);
		PatientRepository p = ac.getBean(PatientRepository.class);
		TestDetailsRepository t = ac.getBean(TestDetailsRepository.class);

		Bed b1 = new Bed(1, 2, true);
		Patient p1 = new Patient(1, "Tarun", 89, "M", "Bhopal", 9128276543L, "Fever", b1, "02/02/2022");

		Bed b2 = new Bed(2, 3, true);
		Patient p2 = new Patient(2, "Harshad", 78, "M", "Mumbai", 9128288883L, "Fever", b2, "03/03/2020");
		
		TestDetails td = new TestDetails(1, p1, 23, "DYDYV");

		b.save(b1);
		p.save(p1);
		b.save(b2);
		p.save(p2);
		t.save(td);

	}

}
