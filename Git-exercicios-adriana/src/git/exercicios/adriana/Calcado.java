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
public class Calcado {
    public String tipo;
    public int numeracao;
    public String cor;
    public String material;
    public boolean pes_descalcos;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
   public Calcado(String tipo, int numeracao, String cor, String material) {
        this.tipo = tipo;
        this.numeracao = numeracao;
        this.cor = cor;
        this.material = material;
        this.pes_descalcos = true;
    } 
   public void pisar(){
       this.pes_descalcos = false;
       System.out.println("Você está calçado! Pode sair para caminhar.");
       
   } 
}
