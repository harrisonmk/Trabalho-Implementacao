


public class Caminhoes {
    
   private Integer id;
   private String motorista;
   private String marca;
   private Integer tamanho;
   private String LocalAtual;
   private String LocalDestino;
   private double SalarioMotorista;
   private double KMLitro;

    public Caminhoes(Integer id, String motorista, String marca, Integer tamanho, String LocalAtual, String LocalDestino, double SalarioMotorista, double KMLitro) {
        this.id = id;
        this.motorista = motorista;
        this.marca = marca;
        this.tamanho = tamanho;
        this.LocalAtual = LocalAtual;
        this.LocalDestino = LocalDestino;
        this.SalarioMotorista = SalarioMotorista;
        this.KMLitro = KMLitro;
    }
   
   public Caminhoes (){
       
       
   }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public String getLocalAtual() {
        return LocalAtual;
    }

    public void setLocalAtual(String LocalAtual) {
        this.LocalAtual = LocalAtual;
    }

    public String getLocalDestino() {
        return LocalDestino;
    }

    public void setLocalDestino(String LocalDestino) {
        this.LocalDestino = LocalDestino;
    }

    public double getSalarioMotorista() {
        return SalarioMotorista;
    }

    public void setSalarioMotorista(double SalarioMotorista) {
        this.SalarioMotorista = SalarioMotorista;
    }

    public double getKMLitro() {
        return KMLitro;
    }

    public void setKMLitro(double KMLitro) {
        this.KMLitro = KMLitro;
    }
    
    public static void menu (){
        
        System.out.println();
            System.out.println("Digite 1 para inserir dados do caminhao.");
            System.out.println("Digite 2 para Remover um caminhao.");
            System.out.println("Digite 3 para editar um caminhao");
            System.out.println ("Digite 4 para verificar um caminhao da lista");
            System.out.println("Digite 5 para imprimir os dados do caminhao");
            System.out.println("Digite 6 para retornar ao menu anterior.");
            System.out.println("Digite 0 para sair.");
            System.out.print("Opcao: ");
        
        
        
    }
    
    
    
   
   
   @Override
	public String toString() {
		return "\n ID: " +this.id+
                       "\n Motorista: "+this.motorista+
                       "\n Marca: "+this.marca+
                       "\n Tamanho: "+this.tamanho+
                       "\n Local Atual: "+this.LocalAtual+
                       "\n Local Destino: "+this.LocalDestino+
                       "\n Salario do Motorista: "+this.SalarioMotorista+
                       "\n Km por Litro: "+this.KMLitro; 
                        
	}
    
}
