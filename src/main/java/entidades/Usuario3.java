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
@Table(name="TB_USUARIO")
@Access(AccessType.FIELD)
public class Usuario3 implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_IDS")
    @TableGenerator(name = "TB_IDS", table = "TB_GERADOR_ID", pkColumnName = "NM_SEQUENCIA", pkColumnValue = "TB_USUARIO_ID", valueColumnName = "ID_SEQUENCIA", allocationSize = 20)
    private Integer id;
}
