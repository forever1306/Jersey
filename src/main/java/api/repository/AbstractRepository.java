package api.repository;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.MappedSuperclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

@MappedSuperclass
public abstract class AbstractRepository<T> {
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public Class<T> getPersistenClass() {
		return ((Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
	}
	
	public List<T> list(){
		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<T> list=session.createCriteria(getPersistenClass()).list();
		return list;
	}
	
}
