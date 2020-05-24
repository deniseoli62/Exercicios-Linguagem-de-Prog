/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.exercicios.adriana;

/**
 *
 * @author Denise
 */
public class Profissional {
    public String nome;
    public int idade;
    public String profissao;
    public String empresa;
    public boolean diploma;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public boolean isDiploma() {
        return diploma;
    }

    public void setDiploma(boolean diploma) {
        this.diploma = diploma;
    }
public Profissional(String nome,int idade,String profissao,String empresa,boolean diploma){
    
    this.nome = nome;
    this.idade = idade;
    this.profissao = profissao;
    this.empresa = empresa;
    this.diploma = false;
    
}
public void faculdade(){
    this.diploma = true;
    System.out.println("Tenho diploma em Medicina Veterinária.");
    
}
}
