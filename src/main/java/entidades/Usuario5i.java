/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.*;

/**
 *
 * @author athos.carmo
 */
@Entity
@Table(name = "TB_USUARIO5i")
@Access(AccessType.FIELD)
public class Usuario5i implements Serializable{
    
    public Usuario5i(){
        this.id = new Usuario5iId();
    }
    
    public Usuario5i(Usuario5iId id, String nome, String email, String senha, Calendar data){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = data;
    }
    
    @EmbeddedId
    private Usuario5iId id;
    @Column(name = "TXT_NOME")
    private String nome;
    @Column(name = "TXT_EMAIL")
    private String email;
    @Column(name = "TXT_SENHA")
    private String senha;
    @Temporal(TemporalType.DATE)
    @Column(name = "DT_NASCIMENTO")
    private Calendar dataNascimento;
    @Transient // atributo não persiste
    private Integer idade;
    
    
    public String getCpf(){
        return id.getCpf();
    }
    
    public Usuario5iId getId(){
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
