
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MetodosCidades {

    Scanner scan = new Scanner(System.in);
    ArrayList<Cidades> lista3 = new ArrayList<>();

    public void metodoAdicionaCidades() throws IOException {

        System.out.println("\nDigite o Id Da Cidade.");
        Integer id4 = scan.nextInt();
        System.out.println("Digite o nome Da Cidade.");
        scan.nextLine();
        String nome4 = scan.nextLine();
        
        System.out.println ("Digite a quantidade de cidades Vizinhas");
        int quantidadeCidadesVizinhas = scan.nextInt();
        String[] vizinhos4 = new String [quantidadeCidadesVizinhas];
        double[] distancia4 = new double [quantidadeCidadesVizinhas];
        
        for (int i=0;i<quantidadeCidadesVizinhas;++i){
            
         System.out.println ("Digite o nome da cidade vizinha");
         scan.nextLine();
         String cidadevizinha = scan.nextLine();
         System.out.println ("Digite a distancia da cidade");
         double distanciavizinha = scan.nextDouble();
         
         vizinhos4[i] = cidadevizinha;
         distancia4[i] = distanciavizinha;
            
        }

        /*String[] vizinhos4 = new String[2];
        for (int i = 0; i < vizinhos4.length; i++) {
            System.out.println("Digite o nome da cidade Vizinha.");
            vizinhos4[i] = scan.nextLine();
        }*/

        /*double[] distancia4 = new double[2];
        for (int i = 0; i < distancia4.length; i++) {
            System.out.println("Digite a distancia da cidade.");
            distancia4[i] = scan.nextDouble();
        }*/

        System.out.println("Digite o valor do combustivel.");
        double valorCombustivel4 = scan.nextDouble();

        Cidades cidade = new Cidades();

        cidade.setId(id4);
        cidade.setNome(nome4);
        cidade.setVizinhos(vizinhos4);
        cidade.setDistancia(distancia4);
        cidade.setValorCombustivel(valorCombustivel4);

        //lista3.add(new Cidades (id4,nome4,vizinhos4,distancia4,valorCombustivel4));
        lista3.add(cidade);
        
        try (FileWriter arq = new FileWriter("cidades.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);

            for (int i = 0; i < lista3.size(); i++) {
                gravarArq.println("---------------------------------------------");
                gravarArq.println();
                gravarArq.println("  Cidade ");
                gravarArq.println();
                gravarArq.println("\n ID: " + lista3.get(i).getId());
                gravarArq.println("\n Cidade: " + lista3.get(i).getNome());
                gravarArq.println("\n Vizinhos: " + Arrays.toString(lista3.get(i).getVizinhos()));
                gravarArq.println("\n Distancia: " + Arrays.toString(lista3.get(i).getDistancia()));
                gravarArq.println("\n Valor Combustivel: " + lista3.get(i).getValorCombustivel());
                

                gravarArq.println("---------------------------------------------");
            }
        }

    }
    
    public void metodoEditaCidade () throws IOException{
        System.out.println ("Digite o id da cidade a ser Editado.");
        int idcidade = scan.nextInt();
        
        System.out.println("\nDigite o Id Da Cidade.");
        Integer id4 = scan.nextInt();
        System.out.println("Digite o nome Da Cidade.");
        scan.nextLine();
        String nome4 = scan.nextLine();
        
        System.out.println ("Digite a quantidade de cidades Vizinhas");
        int quantidadeCidadesVizinhas = scan.nextInt();
        String[] vizinhos4 = new String [quantidadeCidadesVizinhas];
        double[] distancia4 = new double [quantidadeCidadesVizinhas];
        
        for (int i=0;i<quantidadeCidadesVizinhas;++i){
            
         System.out.println ("Digite o nome da cidade vizinha");
         scan.nextLine();
         String cidadevizinha = scan.nextLine();
         System.out.println ("Digite a distancia da cidade");
         double distanciavizinha = scan.nextDouble();
         
         vizinhos4[i] = cidadevizinha;
         distancia4[i] = distanciavizinha;
            
        }
        System.out.println("Digite o valor do combustivel.");
        double valorCombustivel4 = scan.nextDouble();
        
        for (int i = 0; i < lista3.size(); i++) {
            Cidades p = lista3.get(i);

            if (p.getId() == idcidade) {

              lista3.get(i).setId(id4);
              lista3.get(i).setNome(nome4);
              lista3.get(i).setVizinhos(vizinhos4);
              lista3.get(i).setDistancia(distancia4);
              lista3.get(i).setValorCombustivel(valorCombustivel4);  

                // Sai do loop.
                break;
            }

        }
        
        try (FileWriter arq = new FileWriter("cidades.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);

            for (int i = 0; i < lista3.size(); i++) {
                gravarArq.println("---------------------------------------------");
                gravarArq.println();
                gravarArq.println("  Cidade ");
                gravarArq.println();
                gravarArq.println("\n ID: " + lista3.get(i).getId());
                gravarArq.println("\n Cidade: " + lista3.get(i).getNome());
                gravarArq.println("\n Vizinhos: " + Arrays.toString(lista3.get(i).getVizinhos()));
                gravarArq.println("\n Distancia: " + Arrays.toString(lista3.get(i).getDistancia()));
                gravarArq.println("\n Valor Combustivel: " + lista3.get(i).getValorCombustivel());
                

                gravarArq.println("---------------------------------------------");
            }
        }
    }
    
    public void metodoremovecidade () throws IOException{
        
     System.out.println("\nDigite o Id da carga a ser removido");
        int m = scan.nextInt();
        for (int i = 0; i < lista3.size(); i++) {
            Cidades n = lista3.get(i);

            if (n.getId() == m) {

                // Remove.
                lista3.remove(n);

                // Sai do loop.
                break;
            }

        }   
        
        try (FileWriter arq = new FileWriter("cidades.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);

            for (int i = 0; i < lista3.size(); i++) {
                gravarArq.println("---------------------------------------------");
                gravarArq.println();
                gravarArq.println("  Cidade ");
                gravarArq.println();
                gravarArq.println("\n ID: " + lista3.get(i).getId());
                gravarArq.println("\n Cidade: " + lista3.get(i).getNome());
                gravarArq.println("\n Vizinhos: " + Arrays.toString(lista3.get(i).getVizinhos()));
                gravarArq.println("\n Distancia: " + Arrays.toString(lista3.get(i).getDistancia()));
                gravarArq.println("\n Valor Combustivel: " + lista3.get(i).getValorCombustivel());
                

                gravarArq.println("---------------------------------------------");
            }
        }
        
        
    }

    public void metodoImprimeCidades() {

        if (lista3.isEmpty()) {

            System.out.println("\nLista Vazia.\n");
        } else {
            System.out.println();
            for (int i = 0; i < lista3.size(); i++) {

                System.out.println(i + "" + lista3.get(i));
            }
        }

    }
    
    public void buscaCidades (){
        
        System.out.println("\nDigite o Id do caminhão que queira verificar");
        int c = scan.nextInt();
        
        
        for (int i = 0; i < lista3.size(); i++) {
            Cidades p = lista3.get(i);

            if (p.getId() == c) {
                
                //adiciona a id com os atributos a variavel a
                Cidades a = p;
                System.out.println (a);
                
                // Sai do loop.
                break;
            }

        }
               
    }

}
