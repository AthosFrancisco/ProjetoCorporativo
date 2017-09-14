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
@IdClass(Usuario5Id.class)
@Table(name = "TB_USUARIO5")
@Access(AccessType.FIELD)
public class Usuario5 implements Serializable{
    
    public Usuario5(){}
    
    public Usuario5(String cpf, String nome, String email, String login, String senha, Calendar data){
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.dataNascimento = data;
    }
    
    @Id
    @Column(name = "TXT_CPF")
    private String cpf;
    @Id
    @Column(name = "TXT_LOGIN")
    private String login;
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
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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
