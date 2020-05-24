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
public class TesteExercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlunoFatecSJC aluno = new AlunoFatecSJC("Denise",123,"Banco de Dados",7);
        System.out.println(aluno.nome);
        System.out.println(aluno.ra);
        System.out.println(aluno.curso);
        System.out.println(aluno.nota);
        
        AlunoFatecSJC aluno1 = new AlunoFatecSJC("Wilson",456,"Banco de Dados",7);
        System.out.println(aluno1.nome);
        System.out.println(aluno1.ra);
        System.out.println(aluno1.curso);
        System.out.println(aluno1.nota);
        
        AlunoFatecSJC aluno2 = new AlunoFatecSJC("Caroline",789,"Banco de Dados",6);
        System.out.println(aluno2.nome);
        System.out.println(aluno2.ra);
        System.out.println(aluno2.curso);
        System.out.println(aluno2.nota);
        
        Calcado calcado = new Calcado("Scarpin",35,"preto","couro");
        System.out.println(calcado.tipo);
        System.out.println(calcado.numeracao);
        System.out.println(calcado.material);
        System.out.println(calcado.cor);
        calcado.pisar();
        System.out.println(calcado.pes_descalcos);
        
        Calcado calcado1 = new Calcado("tenisallstar",38,"branco","lona");
        System.out.println(calcado1.tipo);
        System.out.println(calcado1.numeracao);
        System.out.println(calcado1.material);
        System.out.println(calcado1.cor);
        calcado1.pisar();
        System.out.println(calcado1.pes_descalcos);
        
        InstrumentoMusical instrumento = new InstrumentoMusical("Violão","corda","preto","madeira");
        System.out.println(instrumento.nome);
        System.out.println(instrumento.tipo);
        System.out.println(instrumento.material);
        System.out.println(instrumento.cor);
        instrumento.afinar();
        System.out.println(instrumento.afinado);
        
        InstrumentoMusical instrumento1 = new InstrumentoMusical("Flauta","sopro","branca","madeira");
        System.out.println(instrumento1.nome);
        System.out.println(instrumento1.tipo);
        System.out.println(instrumento1.material);
        System.out.println(instrumento1.cor);
        instrumento1.afinar();
        System.out.println(instrumento1.afinado);
        
        Lugar lugar = new Lugar("Praia de Ipanema","Rio de Janeiro",true);
        System.out.println(lugar.nome);
        System.out.println(lugar.cidade);
        lugar.tempobom();
        System.out.println(lugar.clima);
        
        Pessoa pessoa = new Pessoa("Denise",55,160,"parda",true,true);
        System.out.println(pessoa.nome);
        System.out.println(pessoa.peso);
        System.out.println(pessoa.altura);
        System.out.println(pessoa.etnia);
        pessoa.leitura();
        System.out.println(pessoa.ler);
        pessoa.exercicios();
        System.out.println(pessoa.exercitar);
        
        Profissional profissional = new Profissional("Alice",28,"Veterinaria","Petlovers",true);
        System.out.println(profissional.nome);
        System.out.println(profissional.idade);
        System.out.println(profissional.profissao);
        System.out.println(profissional.empresa);
        profissional.faculdade();
        System.out.println(profissional.diploma);
        
    }
    
}
