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
public class Usuario8 implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Embedded
    private Endereco endereco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public static void main(String[] args) {
        Usuario8 usu = new Usuario8();
        
        Endereco end = new Endereco();
        end.setBairro("Passarinho");
        end.setCep("53.170-280");
        end.setCidade("Olida");
        end.setComplemento("");
        end.setEstado("PE");
        end.setLogradouro("Rua Antonio Berenguer");
        end.setNumero(257);
        
        usu.setEndereco(end);
        
        JPAUtil.inserir(end);
    }
}
