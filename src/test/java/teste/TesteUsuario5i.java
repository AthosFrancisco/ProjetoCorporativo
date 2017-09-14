/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import entidades.Usuario5;
import entidades.Usuario5Id;
import entidades.Usuario5i;
import entidades.Usuario5iId;
import java.util.Calendar;
import util.JPAUtil;

/**
 *
 * @author athos.carmo
 */
public class TesteUsuario5i {
    
    public static void main(String[] args) {
        
        Calendar data = Calendar.getInstance();
        data.set(1994, Calendar.DECEMBER, 4);
        
        Usuario5iId uId = new Usuario5iId();
        uId.setCpf("12345678927");
        uId.setLogin("Ath");
        
        Usuario5i usu = new Usuario5i(uId, "athos", "athos@gmail.com", "123", data);

        JPAUtil.inserir(usu);

        
        Usuario5iId usua = new Usuario5iId();
        usua.setCpf("12345678927");
        usua.setLogin("Ath");
        
        Usuario5i u = JPAUtil.getConexao().find(Usuario5i.class, usua);
        
        System.out.println("nome: "+u.getNome());
        System.out.println("email: "+u.getEmail());
        System.out.println("senha: "+u.getSenha());
        
    }
}
