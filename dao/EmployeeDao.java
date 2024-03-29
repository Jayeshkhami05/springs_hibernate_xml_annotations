package springs_hibernate_xml_annotations_pesm7.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import springs_hibernate_xml_annotations_pesm7.dto.Employee;

@Component
public class EmployeeDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("rajath").createEntityManager();
	}

	public void saveEmployee(Employee employee) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}

}
