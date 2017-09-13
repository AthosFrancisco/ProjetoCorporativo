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
import util.JPAUtil;

/**
 *
 * @author athos.carmo
 */
public class TesteUsuario {
 
    public static void main(String[] args) {
        
        Usuario usu = new Usuario();
        
        usu.setNome("Miranda");
        usu.setEmail("miranda@gmail.com");
        usu.setLogin("Miranda");
        usu.setSenha("1234");
        
        EntityManager manager = JPAUtil.getConexao();
        
        manager.getTransaction().begin();
        manager.persist(usu);
        manager.getTransaction().commit();
        
        manager.close();
    }
    
}
