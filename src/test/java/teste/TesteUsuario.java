/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import entidades.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author athos.carmo
 */
public class TesteUsuario {
 
    public static void main(String[] args) {
        
        Usuario usu = new Usuario();
        
        usu.setId(1);
        usu.setNome("athos");
        usu.setEmail("athos@gmail.com");
        usu.setLogin("Athos");
        usu.setSenha("1234");
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("teste");
        
        EntityManager manager = factory.createEntityManager();
        
        manager.getTransaction().begin();
        manager.persist(usu);
        manager.getTransaction().commit();
        
        manager.close();
    }
    
}
