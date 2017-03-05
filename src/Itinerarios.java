
import java.util.Arrays;


public class Itinerarios {
    
   private Integer id;
   private Caminhoes id_caminhao;
   private Cargas id_carga;
   private Cidades id_cidade;

    public Itinerarios(int id, Caminhoes id_caminhao, Cargas id_carga, Cidades id_cidade) {
        this.id = id;
        this.id_caminhao = id_caminhao;
        this.id_carga = id_carga;
        this.id_cidade = id_cidade;
    }

    
   public Itinerarios (){
          
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Caminhoes getId_caminhao() {
        return id_caminhao;
    }

    public void setId_caminhao(Caminhoes id_caminhao) {
        this.id_caminhao = id_caminhao;
    }

    public Cargas getId_carga() {
        return id_carga;
    }

    public void setId_carga(Cargas id_carga) {
        this.id_carga = id_carga;
    }

    public Cidades getId_cidade() {
        return id_cidade;
    }

    public void setId_cidade(Cidades id_cidade) {
        this.id_cidade = id_cidade;
    }
   
   

    @Override
    public String toString() {
        return "\n id: "+this.id;
                //"id caminhao: "+this.id_caminhao+
                //"id Cargas: "+this.id_carga+
                //"Id Cidades: "+this.id_cidade;
    }

    
   
   
   
   
    
    
}
