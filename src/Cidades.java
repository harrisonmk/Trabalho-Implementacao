
import java.util.Arrays;


public class Cidades {

private int id;
private String nome;
private String[] vizinhos ;
private double[] distancia ;
private String vizinhos1;
private String distancia1;
private double ValorCombustivel;

    public Cidades(int id, String nome, String[] vizinhos, double[] distancia, double ValorCombustivel) {
        this.id = id;
        this.nome = nome;
        this.vizinhos = vizinhos;
        this.distancia = distancia;
        this.ValorCombustivel = ValorCombustivel;
    }

public Cidades (){
    
    
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(String[] vizinhos) {
        this.vizinhos = vizinhos;
    }

    public double[] getDistancia() {
        return distancia;
    }

    public void setDistancia(double[] distancia) {
        this.distancia = distancia;
    }

    public double getValorCombustivel() {
        return ValorCombustivel;
    }

    public void setValorCombustivel(double ValorCombustivel) {
        this.ValorCombustivel = ValorCombustivel;
    }
    
    public static void menu (){
        
            System.out.println("\nDigite 1 para inserir Dados Das Cidades.");
            System.out.println ("Digite 2 para editar um cidade");
            System.out.println ("Digite 3 para remover uma cidade");
            System.out.println ("Digite 4 para verificar se existe uma cidade na lista");
            System.out.println("Digite 5 para Imprimir os dados das Cidades.");
            System.out.println ("Digite 6 para retornar ao menu anterior.");
            System.out.println ("Digite 0 para sair.");
            System.out.print("Opcao: ");
        
        
    }

    
    @Override
	public String toString() {
		return "\n ID: " +this.id+
                       "\n Cidade: "+this.nome+
                       "\n Vizinhos: "+Arrays.toString(this.vizinhos)+
                       "\n Distancia: "+Arrays.toString(this.distancia)+
                       "\n Valor Combustivel: "+this.ValorCombustivel;                       
                        
	}


    
}
