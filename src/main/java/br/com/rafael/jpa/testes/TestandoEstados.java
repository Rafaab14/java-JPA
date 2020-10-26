package br.com.rafael.jpa.testes;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.rafael.jpa.modelo.Conta;

public class TestandoEstados {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setTitular("Laura");
		conta.setAgencia(1405);
		conta.setSaldo(20000);
		conta.setNumero(24);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(conta);
		em.remove(conta);
		
		em.getTransaction().commit();
	}
}
