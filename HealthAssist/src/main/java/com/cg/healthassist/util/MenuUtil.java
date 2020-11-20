package com.cg.healthassist.util;
import java.util.Scanner;

import com.cg.healthassist.model.Doctor;
import com.cg.healthassist.model.Hospital;
import com.cg.healthassist.model.Laboratory;
import com.cg.healthassist.model.MedicalStore;
import com.cg.healthassist.model.Patient;

public class MenuUtil {
	
	public void showMenu()
	{
		Scanner sc = new Scanner(System.in);
					System.out.println("-----------Patient Services-----------");
					int choice = sc.nextInt();
				
					if(choice==1)
						System.out.println("Upload prescription copy");
						
						else if (choice==2)
							System.out.println("Order medicines as per doctor’s prescription");
						else if(choice==3)
							System.out.println("Search a medical store on a given medicine availability");
					 sc.close();
					}
					
					

			
	}


