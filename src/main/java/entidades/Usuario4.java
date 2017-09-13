/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author athos.carmo
 */
@Entity
public class Usuario4 implements Serializable{
    
    @Id
    private String id;
    
    @PrePersist
    public void gerarChavePrimaria(){
        id = java.util.UUID.randomUUID().toString();
    }
}
