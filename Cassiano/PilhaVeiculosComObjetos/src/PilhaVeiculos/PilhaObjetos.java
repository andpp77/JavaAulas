package PilhaVeiculos;

import javax.swing.JOptionPane;

public class PilhaObjetos {
    private Pilha p = null;  
    
    public static void main(String[] args) {
        new PilhaObjetos();
    }
    
    public PilhaObjetos() {
       DadosPilha();      
       System.out.println("Pilha inicial de VEICULOS:");
       System.out.println( p.toString());  
       
       System.out.println("Adicionamos mais um veículo");
       p.push(new Veiculo("CUL 7845", "Toyota", "Corolla", 2024));
       System.out.println("e a pilha fica assim:");
       System.out.println( p.toString());  
       
       System.out.println("Retirando e esvaziando a pilha:");
       while ( !p.isEmpty() ) {
           System.out.println(p.pop());
       }
       if ( p.isEmpty() ) System.out.println("Pilha de veiculos totalmente vázia."); 
       
    }
    
    public void DadosPilha() {
        p = new Pilha(15);
        p.push(new Veiculo("MFD 8723", "Fiat", "Fiat Uno", 2025));
        p.push(new Veiculo("LOR 1684", "Fiat", "Fiat Toro", 2017));
        p.push(new Veiculo("RES 1597", "Volkswagen", "Polo", 2014));
        p.push(new Veiculo("ERE 4951", "Ferrari", "Roma", 2024));
        p.push(new Veiculo("ERE 4951", "Mazda", "Rx7", 2017));
        p.push(new Veiculo("ERE 4951", "Mazda", "Miata MX 5", 2016));
        p.push(new Veiculo("ERE 4951", "Lamborghini", "Urus", 2024));
    }   
}
