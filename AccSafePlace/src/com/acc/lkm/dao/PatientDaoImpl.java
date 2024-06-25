package com.acc.lkm.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acc.lkm.businessbean.PatientBean;
import com.acc.lkm.entity.PatientEntity;

@Repository
@SuppressWarnings("unchecked")
@Transactional("txManager")
public class PatientDaoImpl implements PatientDao {

	@PersistenceContext
	private EntityManager entityManager;

	public Long addPatient(PatientBean patientBean) throws Exception {
		Long patientId = 0L;
		PatientEntity patientEntityBean = convertBeanToEntity(patientBean);
		try {
			entityManager.persist(patientEntityBean);
			patientId = patientEntityBean.getId();
		} catch (Exception e) {
			throw e;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
		return patientId;
	}

	public PatientBean getPatient(Long id) throws Exception {
		PatientBean patientBean = null;
		// EntityManager entityManager=null;
		try {
			// entityManager=EntityManagerFactory.createEntityManager();
			PatientEntity patientEntity = (PatientEntity) entityManager.find(PatientEntity.class, id);
			if (patientEntity != null) {
				patientBean = convertEntityToBean(patientEntity);
			}
		} catch (Exception ex) {
			throw ex;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
		return patientBean;
	}

	public PatientBean updatePatientDetails(PatientBean patientBean) throws Exception {
		PatientBean patientBean2 = null;
		try {
			PatientEntity patientEntityBean2 = (PatientEntity) entityManager.find(PatientEntity.class,
					patientBean.getId());
			if (patientEntityBean2 != null) {
				patientBean2.setPhone(patientBean.getPhone());
				patientBean2.setEmail(patientBean.getEmail());
				patientBean2 = convertEntityToBean(patientEntityBean2);
			}
		} catch (Exception ex) {
			throw ex;
		}

		return patientBean2;
	}

	public List<PatientBean> getPatientList() throws Exception {
		List<PatientBean> listPatientBean = null;
		try {
			listPatientBean = new ArrayList<PatientBean>();
			List<PatientEntity> listPatientEntity = (List<PatientEntity>) entityManager
					.createQuery("from PatientEntity").getResultList();
			for (PatientEntity entity : listPatientEntity) {
				PatientBean emp = convertEntityToBean(entity);
				listPatientBean.add(emp);
			}
		} catch (Exception exception) {
			throw exception;
		}
		return (listPatientBean);
	}

	private PatientEntity convertBeanToEntity(PatientBean patientBean) {
		PatientEntity patientEntityBean = new PatientEntity();
		BeanUtils.copyProperties(patientBean, patientEntityBean);
		return patientEntityBean;
	}

	private PatientBean convertEntityToBean(PatientEntity patientEntity) {
		// TODO Auto-generated method stub
		PatientBean patient = new PatientBean();
		BeanUtils.copyProperties(patientEntity, patient);
		return patient;
	}

}
