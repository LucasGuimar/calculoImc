/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeciclo3;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class AtividadeCiclo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String peso;
        String altura;
        float resp1;
        float resp2;
        float result;
        
        peso = JOptionPane.showInputDialog("Digite seu Peso Kg: ");
        resp1 = Float.parseFloat(peso);
        
        altura = JOptionPane.showInputDialog("Digite sua altura: ");
        resp2 = Float.parseFloat(altura);
        
        result = resp1 / (resp2 * resp2);
        
        if (result < 17){
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    result) + "\n Situação: Muito abaixo do peso");            
        }else if ((result > 17) && (result < 18.49)){
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    result) + "\n Situação: Abaixo do peso");        
        }else if ((result > 18.50) && (result < 24.99)){
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    result) + "\n Situação: Peso normal"); 
        }else if ((result > 25) && (result < 29.99)){
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    result) + "\n Situação: Acima do peso");
        }else if ((result > 30) && (result < 34.99)){
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    result) + "\n Situação: Obesidade I");
        }else if ((result > 35) && (result < 39.99)){
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    result) + "\n Situação: Obesidade II [severa]");
        }else{
            JOptionPane.showMessageDialog(null, String.format("O seu IMC é: %.2f", 
                    result) + "\n Situação: Obesidade III [mórbida]");
                
        }
        
        
        
    }
    
}
