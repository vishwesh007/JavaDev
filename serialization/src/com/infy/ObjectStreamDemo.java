package com.infy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {

	public static void main(String[] args) {
		try (ObjectOutputStream objStreamOut = new ObjectOutputStream(new FileOutputStream("EmployeeData.txt"));
				ObjectInputStream objStreamIn = new ObjectInputStream(new FileInputStream("EmployeeData.txt"));) {

			EmployeeDTO eDTO = new EmployeeDTO("1234", "John", "SE", 3);

			objStreamOut.writeObject(eDTO);

			EmployeeDTO e = (EmployeeDTO) objStreamIn.readObject();

			System.out.println(e);

            //Use this code for collection serialization 
            /*
            EmployeeDTO eDTO = new EmployeeDTO("1234", "John", "SE", 3, new Address("blr", 560076));
			EmployeeDTO eDTO1 = new EmployeeDTO("1235", "Robert", "SSE", 3, new Address("chn", 600017));
			EmployeeDTO eDTO2 = new EmployeeDTO("1235", "Nick", "TA", 4, new Address("hyd", 500008));

			ArrayList<EmployeeDTO> emp = new ArrayList<>();
			emp.add(eDTO);
			emp.add(eDTO1);
			emp.add(eDTO2);
			objStreamOut.writeObject(emp);

			ArrayList<EmployeeDTO> emp1 = (ArrayList<EmployeeDTO>) objStreamIn.readObject();
			for (EmployeeDTO employeeDTO : emp1) {
				System.out.println(employeeDTO.getEmpId() + " " + employeeDTO.getName());

			} */


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}