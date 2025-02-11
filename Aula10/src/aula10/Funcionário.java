package aula10;
public class Funcionário extends Pessoa {
   
    //Atributos
    private String setor;
    private boolean trabalhando;
    
    // metodos
    
    public void mudarTrabalho(){
        if (this.trabalhando){
            this.setTrabalhando(false);
        }
        
    }
   
    //Metodos especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
    
    
}
