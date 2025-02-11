package aula012;
public class Peixe extends Animal {
    //Atributos
   private String corEscama;
    
   
   //Metodos publicos
   public void soltarBolhas(){
       System.out.println("Soltando bolhas");
   }
    
    
   //Metodos Especiais

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
   
   
    
    
    //Metodos abstratos implementados da classe mãe
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixa não emite som");
    }
    
}
