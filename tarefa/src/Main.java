/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



public class Main {

   
    public static void main(String[] args) {
        Moto m1 = new Moto();
        m1.setLigar(true);
        m1.setTamanho("Grande");
        m1.setAndando(true);
        m1.setModelo("Honda");
        m1.setPlaca("HCG5U82");
        m1.setEstadoPneu("Calibrado");
        m1.setCor("Vermelho");
        m1.setPotencia(180f);
        m1.status();
        m1.statusMoto();

    }
    
}
