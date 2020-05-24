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
public class Lugar {
    public String nome;
    public String cidade;
    public boolean clima;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public boolean isClima() {
        return clima;
    }

    public void setClima(boolean clima) {
        this.clima = clima;
    }
public Lugar(String nome,String cidade,boolean clima){
    this.nome = nome;
    this.cidade = cidade;
    this.clima = false;
    
}
public void tempobom(){
    this.clima = true;
    System.out.println("Vamos a praia, está fazendo sol!");
    
}
    }
