/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Moto extends Veículo{
    private String placa;
    private String estadoPneu;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getEstadoPneu() {
        return estadoPneu;
    }

    public void setEstadoPneu(String estadoPneu) {
        this.estadoPneu = estadoPneu;
    }
    
    public void statusMoto(){
        System.out.println("Placa: "+this.getPlaca());
        System.out.println("Estado do Pneu: "+ this.getEstadoPneu());
    }
    
   
    
}
