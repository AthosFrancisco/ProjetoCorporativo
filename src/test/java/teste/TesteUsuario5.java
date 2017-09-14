/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import entidades.Usuario5;
import entidades.Usuario5Id;
import java.util.Calendar;
import util.JPAUtil;

/**
 *
 * @author athos.carmo
 */
public class TesteUsuario5 {
    
    public static void main(String[] args) {
        
//        Calendar data = Calendar.getInstance();
//        data.set(1994, Calendar.DECEMBER, 4);
//        
//        Usuario5 usu = new Usuario5("12345678925", "athos", "athos@gmail.com", "Athos", "123", data);
//        
//        JPAUtil.inserir(usu);

        Usuario5Id usu = new Usuario5Id();
        
        usu.setCpf("12345678925");
        usu.setLogin("Athos");
        Usuario5 u = JPAUtil.getConexao().find(Usuario5.class, usu);
        
        System.out.println("nome: "+u.getNome());
        System.out.println("email: "+u.getEmail());
        System.out.println("senha: "+u.getSenha());
        
    }
}
