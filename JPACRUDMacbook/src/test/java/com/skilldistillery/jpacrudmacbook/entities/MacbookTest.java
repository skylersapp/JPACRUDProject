package com.skilldistillery.jpacrudmacbook.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MacbookTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Macbook macbook;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAMacbook");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		macbook = em.find(Macbook.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		macbook = null;
		em.close();
	}

	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}

//	@Disabled
	@DisplayName("Testing Macbook entity mappings")
	@Test
	public void testColor() {
		assertNotNull(macbook);
		assertEquals("silver", macbook.getColor());

	}
}
