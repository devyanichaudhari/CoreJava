package com.eb.dao;
import java.util.List;
import com.eb.entity.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;


public class StudentDaoImpl implements StudentDao
{
	private HibernateTemplate hTemplate;
	public void setHibernateTemplate(HibernateTemplate hTemplate)
	{
		this.hTemplate=hTemplate;
	}
	@Override
	@Transactional
	public int insert(Student s) 
	{
		return (int) hTemplate.save(s);
	}
	@Override
	@Transactional
	public void delete(int id) 
	{
		Student s = hTemplate.get(Student.class,id);
		hTemplate.delete(s);
	}
	@Override
	@Transactional
	public void delete(Student s) 
	{
		
	}

	@Override
	public void update(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
