package com.nagendra.restws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.nagendra.restws.model.Patient;

@Service
public class PatientServiceImpl implements PatientService {

	Map<Long, Patient> patients = new HashMap<>();
	long currentid = 123;

	public PatientServiceImpl() {
		init();
	}

	public void init() {
		Patient patient = new Patient();
		patient.setId(currentid);
		patient.setName("Nagendra");

		patients.put(patient.getId(), patient);
		
		patient = new Patient();
		patient.setId(456);
		patient.setName("John");
		
		patients.put(patient.getId(), patient);
	}

	@Override
	public List<Patient> getPatients() {
		Collection<Patient> tempPatients = patients.values();
		List<Patient> list = new ArrayList<>(tempPatients);
		return list;
	}

	@Override
	public Patient getPatient(Long id) {
		System.out.println("Hello World");
		return patients.get(id);
	}

}
