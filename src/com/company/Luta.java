package com.company;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private  int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


        public void marcaLuta(Lutador lutador1, Lutador lutador2){
            if(lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2){
                this.setAprovada(true);
                this.setDesafiado ( lutador1 );
                this.setDesafiante( lutador2 );
            }
            else {
                this.setAprovada(false);
                this.setDesafiado(null);
                this.setDesafiante(null);
            }
        }

        public void luta(){
        if(isAprovada()){
            desafiado.Apresentar();
            desafiante.Apresentar();
            Random random = new Random();
            int vencedor = random.nextInt (3);
            switch (vencedor){
                case 0:
                    System.out.println ("EEEEMPAAAAATEEEE");
                    this.desafiado.empataLuta ();
                    this.desafiante.empataLuta ();
                    break;
                case 1:
                    System.out.println (this.desafiado.getNome () + " ELE VEEEENCEU!!!");
                    this.desafiado.ganharLuta ();
                    this.desafiante.perdeLuta ();
                    break;
                case 2:
                    System.out.println (this.desafiante.getNome () + " ELE VEEENCEEEU!!!");
                    this.desafiado.perdeLuta ();
                    this.desafiante.ganharLuta ();
            }
            desafiado.Status ();
            desafiante.Status ();

        }
        else{
            System.out.println ("Não pode haver as lutas");
        }
    }
}