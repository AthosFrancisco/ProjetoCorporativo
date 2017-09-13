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
    
    static{
        emf = Persistence.createEntityManagerFactory("teste");
        em = emf.createEntityManager();
    }
    
    public static EntityManager getConexao(){
        return em;
    }
}
