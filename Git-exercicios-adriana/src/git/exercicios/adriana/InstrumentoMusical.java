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
public class InstrumentoMusical {
    
    public String nome;
    public String tipo;
    public String material;
    public String cor;
    public boolean afinado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
 public InstrumentoMusical(String nome, String tipo, String cor, String material) {
        this.nome = nome;
        this.tipo = tipo;
        this.cor = cor;
        this.material = material;
        this.afinado = false;
    }   

    /**
     *
     */
    public void som(){ 
         
}
    public void afinar(){ 
        this.afinado = true;
        System.out.println("Seu instrumento está afinado!");
         
}

}
