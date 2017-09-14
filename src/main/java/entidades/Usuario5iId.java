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
@Embeddable
public class Usuario5iId implements Serializable{
    
    @Column(name = "TXT_CPF")
    private String cpf;
    @Column(name = "TXT_LOGIN")
    private String login;
    
    @Override
    public int hashCode(){
        return getCpf().hashCode()+getLogin().hashCode();
    }
    
    @Override
    public boolean equals(Object objeto){
        if(objeto == null){
            return false;
        }else if(getClass() != objeto.getClass()){
            return false;
        }else{
            return (cpf.equals(((Usuario5iId)objeto).getCpf()) && login.equals(((Usuario5iId)objeto).getCpf()));
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}
