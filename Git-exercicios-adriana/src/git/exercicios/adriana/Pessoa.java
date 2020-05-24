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
public class Pessoa {
    public String nome;
    public float peso;
    public float altura;
    public String etnia;
    public boolean ler;
    public boolean exercitar;

    public String getNome() {
        return nome;
    }

    public boolean isExercitar() {
        return exercitar;
    }

    public void setExercitar(boolean exercitar) {
        this.exercitar = exercitar;
    }

    public boolean isLer() {
        return ler;
    }

    public void setLer(boolean ler) {
        this.ler = ler;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }
public Pessoa(String nome,float peso,float altura,String etnia,boolean ler,boolean exercitar){
    this.nome = nome;
    this.peso = peso;
    this.altura = altura;
    this.etnia = etnia;
    this.ler = false;
    this.exercitar = false;
    
}    
public void leitura(){
    this.ler = true;
    System.out.println("Eu já li 5 livros este ano!");
    
}
public void exercicios(){
    this.exercitar = true;
    System.out.println("Eu pratico corrida e natação!");
}
}
