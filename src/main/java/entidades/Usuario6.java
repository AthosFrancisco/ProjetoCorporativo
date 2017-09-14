/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.*;
import util.JPAUtil;

/**
 *
 * @author athos.carmo
 */

@Entity
@Access(AccessType.FIELD)
public class Usuario6 implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "TXT_TIPO_USUARIO")
    private TipoUsuario tipo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
    
    public static void main(String[] args) {
        Usuario6 usu = new Usuario6();
        
        usu.setTipo(TipoUsuario.ADMIN);
        
        JPAUtil.inserir(usu);
    }
}
