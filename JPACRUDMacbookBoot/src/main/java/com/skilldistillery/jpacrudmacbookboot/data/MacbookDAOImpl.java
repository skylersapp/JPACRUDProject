package com.skilldistillery.jpacrudmacbookboot.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpacrudmacbook.entities.Macbook;

@Service
@Transactional
public class MacbookDAOImpl implements MacbookDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Macbook findMacbookById(Integer id) {
		return em.find(Macbook.class, id);
		
	}

	@Override
	public List<Macbook> findAll() {
		
		String jpql = "SELECT macbook FROM Macbook macbook";
		List<Macbook> macbook = em.createQuery(jpql, Macbook.class).getResultList();
		return macbook;
	}

	@Override
	public boolean delete(Integer id) {
		Macbook macbook = em.find(Macbook.class, id);
		em.remove(macbook);
		boolean isGone = !em.contains(macbook);
		return isGone;
	}

	@Override
	public Macbook create(Macbook macbook) {
		em.persist(macbook);
		em.flush();
		return macbook;
	}

	@Override
	public Macbook update(Integer id, Macbook macbook) {
		Macbook updatedMacbook = em.find(Macbook.class, id);
		updatedMacbook.setScreenSize(macbook.getScreenSize());
		updatedMacbook.setHdCapacity(macbook.getHdCapacity());
		updatedMacbook.setColor(macbook.getColor());
		updatedMacbook.setYear(macbook.getYear());
		em.flush();
		return updatedMacbook;
	}





	
	

}
