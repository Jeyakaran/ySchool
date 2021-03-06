package org.yarlithub.yschool.repository.model.dao.yschool.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import org.yarlithub.yschool.repository.model.obj.yschool.StudentClassSubject;
import org.springframework.stereotype.Repository;
import org.yarlithub.yschool.repository.model.dao.yschool.StudentClassSubjectDao;
 
 
/**
 * DAO for table: StudentClassSubject.
 * @author autogenerated
 */
@Repository
public class StudentClassSubjectDaoImpl extends GenericHibernateDaoImpl<StudentClassSubject, Integer> implements StudentClassSubjectDao {
	
	/** Constructor method. */
		public StudentClassSubjectDaoImpl() {
			super(StudentClassSubject.class);
		}
	}

