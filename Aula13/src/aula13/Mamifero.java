package aula13;
public class Mamifero extends Animal {

    //Atributos
    protected String corPelo;
    
    
    //Metodos especiais

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
    
    //Metodo sobreposto de animal
    
    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
    
    
    
}
