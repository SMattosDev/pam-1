
package projetobanco;

import javax.swing.JOptionPane;


public class ProjetoBanco {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Conta conta = new Conta();
        
       conta.nome = JOptionPane.showInputDialog("Digite seu Nome");
       conta.saldo = Double.parseDouble( JOptionPane.showInputDialog("Digite seu saldon"));
        
        
        conta.exibirSaldo();
        
        conta.depositar(50);
        
        conta.exibirSaldo ();
        
        conta.sacar(200);
    }
    
}
