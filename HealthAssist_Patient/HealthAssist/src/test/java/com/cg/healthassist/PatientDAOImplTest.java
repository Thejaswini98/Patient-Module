package com.cg.healthassist;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.healthassist.daoimpl.PatientDAOImpl;
import com.cg.healthassist.model.Patient;

public class PatientDAOImplTest {
	
	@Test
	public void test_Persist_GivenPatient() {
		PatientDAOImpl dao = new PatientDAOImpl();
		Patient patient = new Patient("Chaitanya",21,6382963639L,"Mars","ABC","123");
		dao.persist(patient);
		Patient patientFound = dao.findByPatientId(patient.getPatientId());
		assertEquals(patient.getPatientUserName(), patientFound.getPatientUserName());
	}

}
