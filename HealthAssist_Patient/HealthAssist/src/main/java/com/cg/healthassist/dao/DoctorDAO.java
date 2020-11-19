package com.cg.healthassist.dao;

import java.util.List;

import com.cg.healthassist.model.Doctor;
import com.cg.healthassist.model.Patient;

public interface DoctorDAO {
	/**
	 * This method will save the data of the patient in database.
	 * @param doctor, Instance of doctor to persist.
	 */
	
	public void persist(Doctor doctor);
	
	/**
	 * give all the instances of doctors present inside database.
	 * @return the list of doctor instances.
	 */
	
	public List<Doctor> findAll();
	

	/**
	 * Search the doctor with given id in the database.
	 * @param id of the doctor to search.
	 * @return the instance of patient if present else return null.
	 */

	Doctor findByDoctorId(long doctorId);
	
	
	

}
