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
public class Endereco implements Serializable{
    
    @Column(name = "END_TXT_LOGRADOURO")
    private String logradouro;    
    @Column(name = "BAIRRO")
    private String bairro;
    @Column(name = "END_NUMERO")
    private Integer numero;
    @Column(name = "END_TXT_COMPLEMENTO")
    private String complemento;
    @Column(name = "END_TXT_CEP")
    private String cep;
    @Column(name = "END_TXT_CIDADE")
    private String cidade;
    @Column(name = "END_TXT_ESTADO")
    private String estado;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
