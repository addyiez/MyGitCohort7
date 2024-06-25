package com.acc.lkm.service;

import java.util.List;

import com.acc.lkm.businessbean.PatientBean;

public interface PatientService {
	Long addPatient(PatientBean employeeBean) throws Exception;

	PatientBean getPatient(Long long1) throws Exception;

	PatientBean updatePatientDetails(PatientBean patientBean) throws Exception;
	
	List<PatientBean> getPatientList() throws Exception;
}
