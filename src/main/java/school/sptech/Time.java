package school.sptech;

import java.text.MessageFormat;

public class Time {
    String nome;
    Integer vitorias = 0;
    Integer empates = 0;
    Integer derrotas = 0;

    public Time(String nome){
        this.nome = nome;
        this.vitorias = (Integer) 0;
        this.empates = (Integer) 0;
        this.derrotas = (Integer) 0;
    }

    public void registrarVitoria(){
        this.vitorias += 1;
    }

    public void registrarEmpate(){
        this.empates += 1;
    }

    public void registrarDerrota(){
        this.derrotas += 1;
    }

    public Integer getPontos(){
        return (Integer) (this.vitorias * 3) + this.empates;
    }

    public Integer getTotalPartidas(){
        return this.vitorias + this.empates + this.derrotas;
    }

    public Integer getAproveitamento(){
        Integer totalPartidas = this.getTotalPartidas();
        Integer vitorias = this.vitorias;
        double resultado = ((double) vitorias/ totalPartidas)*100;

        return (int) resultado;
    }

    public void compararAproveitamento(Time adversario){
        Integer time = this.getAproveitamento();
        Integer rival = adversario.getAproveitamento();

        if (time == rival){
            System.out.println("Os times " + this.nome + " e " + adversario.nome + " têm o mesmo aproveitamento");
        } else if(time > rival){
            System.out.println("O time " + this.nome + " tem um aproveitamento maior que o time " + adversario.nome);
        } else{
            System.out.println("O time " + adversario.nome + " tem um aproveitamento maior que o time " + this.nome);
        }
    }

    public void exibirInformacoes(){
        System.out.println("Time: " + this.nome);
        System.out.println("Vitórias: " + this.vitorias);
        System.out.println("Empates: " + this.empates);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("\nPontos: " + this.getPontos());
        System.out.println("Total de Partidas: " + this.getTotalPartidas());
        System.out.println("Aproveitamento: " + this.getAproveitamento() + "%");
    }
}
