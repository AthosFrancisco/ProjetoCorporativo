/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import entidades.Usuario2;
import entidades.Usuario3;
import entidades.Usuario4;
import java.util.Calendar;
import javax.persistence.EntityManager;
import util.JPAUtil;

/**
 *
 * @author athos.carmo
 */
public class TesteUsuario2 {
    
    public static void main(String[] args) {
        
//        Calendar data = Calendar.getInstance();
//        data.set(1994, Calendar.DECEMBER, 4);
//        
//        Usuario2 usu = new Usuario2("athos", "athos@gmail.com", "Athos", "123", data);
//        
          Usuario3 usu = new Usuario3();
        
        //Usuario4 usu = new Usuario4();

        EntityManager em = JPAUtil.getConexao();
        
        em.getTransaction().begin();
        em.persist(usu);
        em.getTransaction().commit();
        em.close();
    }
}
