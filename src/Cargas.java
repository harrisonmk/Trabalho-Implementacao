


public class Cargas {
   
private Integer id;
private String produto;
private Integer tamanho;
private String origem;
private String destino;
private double ValorFrete;

    public Cargas(Integer id, String produto, Integer tamanho, String origem, String destino, double ValorFrete) {
       
        this.id = id;
        this.produto = produto;
        this.tamanho = tamanho;
        this.origem = origem;
        this.destino = destino;
        this.ValorFrete = ValorFrete;
    }

public Cargas (){
    
    
    
}

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getValorFrete() {
        return ValorFrete;
    }

    public void setValorFrete(double ValorFrete) {
        this.ValorFrete = ValorFrete;
    }

public static void menu (){
    
            System.out.println();
            System.out.println("Digite 1 para inserir os dados das Cargas.");
            System.out.println("Digite 2 para Editar uma Carga.");
            System.out.println("Digite 3 para remover uma carga Da lista.");
            System.out.println("Digite 4 para verificar uma carga da lista");
            System.out.println("Digite 5 para imprimir os dados das Cargas.");
            System.out.println("Digite 6 para retornar ao menu anterior");
            System.out.println("Digite 0 para Sair.");
            System.out.print("Opcao: ");
    
    
    
    
}


@Override
    public String toString() {
        return  "\n ID : "+this.id+
                "\n Produto: "+this.produto+
                "\n Tamanho da Carga: "+this.tamanho+
                "\n Origem do Produto: "+this.origem+
                "\n Destino do Produto: "+this.destino+
                "\n Valor Do Frete: "+this.ValorFrete;        
    }
    

   
   
       
       
   } 
    

