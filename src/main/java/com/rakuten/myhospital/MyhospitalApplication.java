package com.rakuten.myhospital;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rakuten.myhospital.dao.BedRepository;
import com.rakuten.myhospital.dao.PatientRepository;
import com.rakuten.myhospital.entities.Bed;
import com.rakuten.myhospital.entities.Patient;

@SpringBootApplication
public class MyhospitalApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(MyhospitalApplication.class, args);
//		HibernateTransactionManager tx = new HibernateTransactionManager();

		BedRepository b = ac.getBean(BedRepository.class);
		PatientRepository p = ac.getBean(PatientRepository.class);

		Bed b1 = new Bed(1, 2, true);
		Patient p1 = new Patient(1, "Tarun", 89, "M", "Bhopal", 9128276543L, "Fever", b1, "02/02/2022");

		Bed b2 = new Bed(1, 3, true);
		Patient p2 = new Patient(1, "Harshad", 78, "M", "Mumbai", 9128288883L, "Fever", b2, "03/03/2020");
		
		b.save(b1);
		p.save(p1);
		b.save(b2);
		p.save(p2);
	}

}
