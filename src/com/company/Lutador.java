package com.company;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double  peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empates;

    public Lutador(){

    }

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitoria, int derrota, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        this.categoria = categoria;
        if(this.peso < 52.2){
            this.categoria = "Invalido";
        }
        else if (this.peso <= 70.3){
        this.categoria = "leve";
        }

        else if(this.peso <= 83.9){
            this.categoria = "Medio";
        }

        else if(this.peso <= 125.8){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Invalido";
        }
    }


    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }


    public void Apresentar(){
        System.out.println("CHAMANDO O LUTADOR \t" + this.getNome());
        System.out.println("PESANDO " + this.getPeso() + " E MEDINDO " + this.getAltura());
        System.out.println("ELE VENCEU " + this.getVitoria() + " VEZES" + ", PEERDEU " + this.getDerrota()+ " VEZEEES" + " E EMPATOU " + this.getEmpates() +" VEZES!!!!!!!");

    }
    public void Status(){
        System.out.println ("Nome: " +  this.getNome ());
        System.out.println ("Categoria " + this.getCategoria () + " Venceu ( " + this.getVitoria () + " ), perdeu ( " + this.getDerrota () + " ) e Empatou ( " + this.getEmpates () + " )");

    }
    public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
    }

    public void perdeLuta(){
        this.setDerrota(this.getEmpates() + 1);

    }

    public void empataLuta(){
            this.setEmpates(this.getEmpates() + 1);
    }
}