/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author athos.carmo
 */
public class JPAUtil {
    
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    public static EntityManager getConexao(){
        emf = Persistence.createEntityManagerFactory("teste");
        em = emf.createEntityManager();
        return em;
    }
    
    public static void inserir(Object obj){
        
        EntityManager entiMana = getConexao();
        
        entiMana.getTransaction().begin();
        entiMana.persist(obj);
        entiMana.getTransaction().commit();
        entiMana.close();
    }
}
