package com.nagendra.restws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nagendra.restws.model.Patient;

@Path("/patientservice")
@Produces(MediaType.APPLICATION_XML)
public interface PatientService {

	@Path("/patients")
	@GET
	public List<Patient> getPatients();
	
	
}
