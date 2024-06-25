package com.acc.lkm.dao;

import java.util.List;

import com.acc.lkm.businessbean.PatientBean;

public interface PatientDao {
	Long addPatient(PatientBean employeeBean) throws Exception;

	PatientBean getPatient(Long id) throws Exception;

	PatientBean updatePatientDetails(PatientBean patientBean) throws Exception;

	List<PatientBean> getPatientList() throws Exception;
}
