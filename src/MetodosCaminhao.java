
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MetodosCaminhao {

    Scanner scan = new Scanner(System.in);

    ArrayList<Caminhoes> lista = new ArrayList<>();

    public void metodoAdicionaCaminhao() throws IOException {

        System.out.println("\nDigite o Id do Caminhao:");
        Integer id = scan.nextInt();
        System.out.println("Digite o nome do motorista:");
        scan.nextLine();
        String motorista = scan.nextLine();
        System.out.println("Digite a marca do caminhao:");
        String marca = scan.nextLine();
        System.out.println("Digite o tamanho do caminhao:");
        int tamanho = scan.nextInt();
        System.out.println("Digite o local atual:");
        scan.nextLine();
        String LocalAtual = scan.nextLine();
        System.out.println("Digite o local de destino:");
        String LocalDestino = scan.nextLine();
        System.out.println("Digite o salario do motorista:");
        double SalarioMotorista = scan.nextDouble();
        System.out.println("Digite a quantidade de litros");
        double KMLitro = scan.nextDouble();

        Caminhoes caminhao = new Caminhoes();

        caminhao.setId(id);
        caminhao.setMotorista(motorista);
        caminhao.setMarca(marca);
        caminhao.setTamanho(tamanho);
        caminhao.setLocalAtual(LocalAtual);
        caminhao.setLocalDestino(LocalDestino);
        caminhao.setSalarioMotorista(SalarioMotorista);
        caminhao.setKMLitro(KMLitro);

        //lista.add(new Caminhoes(id, motorista, marca, tamanho, LocalAtual, LocalDestino, SalarioMotorista, KMLitro));
        lista.add(caminhao);

        try (FileWriter arq = new FileWriter("caminhoes.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);

            for (int i = 0; i < lista.size(); i++) {
                gravarArq.println("---------------------------------------------");
                gravarArq.println();
                gravarArq.println("  Caminhao ");
                gravarArq.println();
                gravarArq.println("\n ID: " + lista.get(i).getId());
                gravarArq.println("\n Motorista: " + lista.get(i).getMotorista());
                gravarArq.println("\n Marca: " + lista.get(i).getMarca());
                gravarArq.println("\n Tamanho: " + lista.get(i).getTamanho());
                gravarArq.println("\n Local Atual: " + lista.get(i).getLocalAtual());
                gravarArq.println("\n Local Destino: " + lista.get(i).getLocalDestino());
                gravarArq.println("\n Salario do Motorista: " + lista.get(i).getSalarioMotorista());
                gravarArq.println("\n Km por Litro: " + lista.get(i).getKMLitro());

                gravarArq.println("---------------------------------------------");
            }
        }
    }

    public void metodoRemoveCaminhao() throws IOException {

        System.out.println("\nDigite o Id do caminhão a ser removido");
        int c = scan.nextInt();
        for (int i = 0; i < lista.size(); i++) {
            Caminhoes p = lista.get(i);

            if (p.getId() == c) {
                
                // Remove.
                lista.remove(p);
                
                // Sai do loop.
                break;
            }

        }
        
                try (FileWriter arq = new FileWriter("caminhoes.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);

            for (int i = 0; i < lista.size(); i++) {
                gravarArq.println("---------------------------------------------");
                gravarArq.println();
                gravarArq.println("  Caminhao ");
                gravarArq.println();
                gravarArq.println("\n ID: " + lista.get(i).getId());
                gravarArq.println("\n Motorista: " + lista.get(i).getMotorista());
                gravarArq.println("\n Marca: " + lista.get(i).getMarca());
                gravarArq.println("\n Tamanho: " + lista.get(i).getTamanho());
                gravarArq.println("\n Local Atual: " + lista.get(i).getLocalAtual());
                gravarArq.println("\n Local Destino: " + lista.get(i).getLocalDestino());
                gravarArq.println("\n Salario do Motorista: " + lista.get(i).getSalarioMotorista());
                gravarArq.println("\n Km por Litro: " + lista.get(i).getKMLitro());

                gravarArq.println("---------------------------------------------");
            }
        }

    }

    public void metodoEditaCaminhao() throws IOException {

        System.out.println("\nDigite o Id do caminhão a ser Editado");
        int k = scan.nextInt();

        System.out.println("\nDigite o Id do Caminhao:");
        Integer id1 = scan.nextInt();
        System.out.println("Digite o nome do motorista:");
        scan.nextLine();
        String motorista1 = scan.nextLine();
        System.out.println("Digite a marca do carro:");
        String marca1 = scan.nextLine();
        System.out.println("Digite o tamanho do caminhao:");
        int tamanho1 = scan.nextInt();
        System.out.println("Digite o local atual:");
        scan.nextLine();
        String LocalAtual1 = scan.nextLine();
        System.out.println("Digite o local de destino:");
        String LocalDestino1 = scan.nextLine();
        System.out.println("Digite o salario do motorista:");
        double SalarioMotorista1 = scan.nextDouble();
        System.out.println("Digite a quantidade de litros");
        double KMLitro1 = scan.nextDouble();

        for (int i = 0; i < lista.size(); i++) {
            Caminhoes p = lista.get(i);

            if (p.getId() == k) {

                lista.get(i).setId(id1);
                lista.get(i).setMotorista(motorista1);
                lista.get(i).setMarca(marca1);
                lista.get(i).setTamanho(tamanho1);
                lista.get(i).setLocalAtual(LocalAtual1);
                lista.get(i).setLocalDestino(LocalDestino1);
                lista.get(i).setSalarioMotorista(SalarioMotorista1);
                lista.get(i).setKMLitro(KMLitro1);

                // Sai do loop.
                break;
            }

        }
        
        try (FileWriter arq = new FileWriter("caminhoes.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);

            for (int i = 0; i < lista.size(); i++) {
                gravarArq.println("---------------------------------------------");
                gravarArq.println();
                gravarArq.println("  Caminhao ");
                gravarArq.println();
                gravarArq.println("\n ID: " + lista.get(i).getId());
                gravarArq.println("\n Motorista: " + lista.get(i).getMotorista());
                gravarArq.println("\n Marca: " + lista.get(i).getMarca());
                gravarArq.println("\n Tamanho: " + lista.get(i).getTamanho());
                gravarArq.println("\n Local Atual: " + lista.get(i).getLocalAtual());
                gravarArq.println("\n Local Destino: " + lista.get(i).getLocalDestino());
                gravarArq.println("\n Salario do Motorista: " + lista.get(i).getSalarioMotorista());
                gravarArq.println("\n Km por Litro: " + lista.get(i).getKMLitro());

                gravarArq.println("---------------------------------------------");
            }
        }

    }

    public void metodoImprimeCaminhao() {

        if (lista.isEmpty()) {

            System.out.println("\nLista Vazia.\n");
        } else {
            System.out.println();
            for (int i = 0; i < lista.size(); i++) {

                System.out.println(i + "" + lista.get(i));
            }
        }

    }
    
    public void buscaCaminhao (){
        
        System.out.println("\nDigite o Id do caminhão que queira verificar");
        int c = scan.nextInt();
        for (int i = 0; i < lista.size(); i++) {
            Caminhoes p = lista.get(i);

            if (p.getId() == c) {
                
                //adiciona a id com os atributos a variavel a
                Caminhoes a = p;
                System.out.println (a);
                
                // Sai do loop.
                break;
            }

        }
               
    }

}

