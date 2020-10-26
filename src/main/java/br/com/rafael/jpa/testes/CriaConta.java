package br.com.rafael.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.rafael.jpa.modelo.Conta.Conta;

public class CriaConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("Rafael");
		conta.setAgencia(144);
		conta.setNumero(623401);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(conta);
		em.getTransaction().commit();

	}

}
