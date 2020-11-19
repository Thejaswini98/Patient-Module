package com.cg.healthassist;

import com.cg.healthassist.daoimpl.DoctorDAOImpl;
import com.cg.healthassist.daoimpl.PatientDAOImpl;
import com.cg.healthassist.model.Doctor;
import com.cg.healthassist.util.JPAUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PatientDAOImpl obj = new PatientDAOImpl();
        DoctorDAOImpl obj1 = new DoctorDAOImpl();
        Doctor doctor = new Doctor("Sample1","MBBS","Physician","123445789");
        obj1.persist(doctor);       
        
    }
}
