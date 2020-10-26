package br.com.rafael.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.rafael.jpa.modelo.Conta;

public class AlteraSaldo {

	public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		Conta contaRafael = em.find(Conta.class, 1L);
		
		
		em.getTransaction().begin();
		contaRafael.setSaldo(10000);
		em.getTransaction().commit();
		
	}

}
 