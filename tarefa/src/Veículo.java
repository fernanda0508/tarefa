/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Veículo {
    private String cor;
    private String modelo;
    private String tamanho;
    private float potencia;
    boolean ligar;
    boolean andando;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public boolean isLigar() {
        return ligar;
    }

    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    public boolean isAndando() {
        return andando;
    }

    public void setAndando(boolean andando) {
        this.andando = andando;
    }
    
    public void ligado(){
        if (this.ligar){
            System.out.println("Ligado");
        }else{
            System.out.println("Parado");
            
        }  
    }
    public void status(){
        System.out.println("Está ligado: "+ this.ligar);
        System.out.println("Está andando: "+ this.andando);
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tamanho: "+ this.tamanho);
        
    }

    }
    

