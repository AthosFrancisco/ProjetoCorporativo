/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;

/**
 *
 * @author athos.carmo
 */
public class Usuario5Id implements Serializable{
    
    private String cpf;
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
            return (cpf.equals(((Usuario5Id)objeto).getCpf()) && login.equals(((Usuario5Id)objeto).getCpf()));
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
