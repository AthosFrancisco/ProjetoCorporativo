/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import javax.persistence.*;
import util.JPAUtil;

/**
 *
 * @author athos.carmo
 */

@Entity
@Access(AccessType.FIELD)
public class Usuario7 implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @CollectionTable(name = "TB_TELEFONE", joinColumns = @JoinColumn(name = "ID_USUARIO", nullable = false))
    private Collection<String> telefones;
    
    public Collection<String> getTelefones(){
        return telefones;
    }
    
    public void addTelefone(String telefone){
        if(telefones == null){
            telefones = new HashSet<>();
        }
        telefones.add(telefone);
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public Integer GetId(){
        return id;
    }
    
    public static void main(String[] args) {
        Usuario7 usu = new Usuario7();
        
        usu.setId(801);
//        usu.addTelefone("34526547");
//        usu.addTelefone("34526555");
//        
//        JPAUtil.inserir(usu);
        
        Usuario7 a = JPAUtil.getConexao().find(Usuario7.class, 801);
        
        System.out.println(a.getTelefones().size());
        System.out.println(a.getTelefones().toString());
        //System.out.println(a.getTelefones().size());
    }
}
