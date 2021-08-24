package com.sachin.soap;

import com.sachin.soap.dao.SoapDAO;
import com.sachin.soap.dao.SoapDAOImpl;
import com.sachin.soap.dto.SoapDTO;

public class SoapTester {

	public static void main(String[] args) {
		SoapDTO dto = new SoapDTO(1, "Cinthol","red","Hrithik roshan");

		SoapDAO dao = new SoapDAOImpl();
		dao.save(dto);

	}

}
