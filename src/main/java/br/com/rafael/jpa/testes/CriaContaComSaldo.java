package br.com.rafael.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.rafael.jpa.modelo.Conta.Conta;

public class CriaContaComSaldo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("Carla");
		conta.setAgencia(16500);
		conta.setNumero(140795);
		conta.setSaldo(50);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(conta);
		em.getTransaction().commit();
		
		em.close();
		
		EntityManager em2 = emf.createEntityManager();
		conta.setSaldo(200);
		
		em2.getTransaction().begin();
		em2.merge(conta);
		em2.getTransaction().commit();
		
		System.out.print("conta");
		

	}


}
