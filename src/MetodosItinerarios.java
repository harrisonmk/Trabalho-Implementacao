
import java.util.ArrayList;
import java.util.Scanner;


public class MetodosItinerarios {
 
 Scanner scan = new Scanner (System.in);   
 ArrayList <Itinerarios> lista4 = new ArrayList ();   
  
 
 
public void InsereItinerarios (){
  System.out.println("\nDigite o id do Itinerario");
  Integer id = scan.nextInt();
  
  Itinerarios itinerario1 = new Itinerarios ();
  
  MetodosCaminhao caminhao5 = new MetodosCaminhao();
  
  caminhao5.buscaCaminhao();
 
  itinerario1.setId(id);
  
  lista4.add(itinerario1);
  
  
 }
  
public void imprimeItinerarios (){
    
   if (lista4.isEmpty()) {

            System.out.println("\nLista Vazia.\n");
        } else {
            System.out.println();
            for (int i = 0; i < lista4.size(); i++) {

                System.out.println(i + ""  + lista4.get(i));
            }
        } 
    
    
}
  

}
