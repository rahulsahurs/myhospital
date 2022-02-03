package com.rakuten.myhospital.dao;

import org.springframework.data.repository.CrudRepository;

import com.rakuten.myhospital.entities.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer>{

}