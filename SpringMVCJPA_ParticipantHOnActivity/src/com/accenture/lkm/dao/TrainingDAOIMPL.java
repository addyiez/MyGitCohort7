package com.accenture.lkm.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.lkm.business.bean.JavaLearningBean;
import com.accenture.lkm.entity.JavaLearningEntity;

//1.8-> Add annotation to indicate the class provides the mechanism for storage, retrieval, update, delete and search operation on objects
@SuppressWarnings("unchecked")
//1.9-> Add annotation to perform  Transactions in JPA
public class TrainingDAOIMPL implements TrainingDAO {

	//1.10-> Add annotation to indicate that the EntityManager must be automatically injected
	//1.11->Add/override the methods to perform persist/add,update,delete and get operation
	//1.12-> provide utility method to convert bean to entity and entity to bean
	

}
