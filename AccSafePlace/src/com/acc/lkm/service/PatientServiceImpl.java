package com.acc.lkm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.lkm.businessbean.PatientBean;
import com.acc.lkm.dao.PatientDao;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientDao patientdao;

	public Long addPatient(PatientBean patientBean) throws Exception {
		return patientdao.addPatient(patientBean);
	}

	public PatientBean getPatient(Long id) throws Exception {
		PatientBean patientBean = patientdao.getPatient(id);
		return patientBean;
	}

	public PatientBean updatePatientDetails(PatientBean patientBean) throws Exception {
		PatientBean patient = patientdao.updatePatientDetails(patientBean);
		return patient;
	}

	public List<PatientBean> getPatientList() throws Exception {
		return patientdao.getPatientList();
	}
	
}
