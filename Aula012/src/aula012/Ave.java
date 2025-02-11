package aula012;
public class Ave extends Animal {
    //Atributos
    private String corPena;
    
    


    //Metodos publicos
    public void fazerNinho(){
        System.out.println("Fazendo ninho");
    }



    //Metodos especiais

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
   
    
    
    
    
    
    
    //Metodos abstratos implementados da classe mãe
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    
}
