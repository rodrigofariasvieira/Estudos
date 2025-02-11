package ultraemojicombat;

import java.util.Random;

public class Luta {
    
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    
    
    //Metodos publicos
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1!=l2){
            
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
            
            
            
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            
            
            
        }
    
        
        
        
    }
    
    public void lutar(){
        if (this.aprovada){
            System.out.println("### DESAFIADO ###");
            desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("===========RESULTADO DA LUTA============");
            switch (vencedor){
                
                case 0://empate
                    System.out.println("empatou");
                    this.desafiado.empatarluta();
                    this.desafiante.empatarluta();
                    break;
                
                case 1://desafido ganhou a luta
                    System.out.println("O vencedor foi: " + this.getDesafiado().getNome());
                    this.desafiado.ganharluta();
                    this.desafiante.perderluta();
                    break;
                case 2://desafiante ganhou a luta
                    System.out.println("O vencedor foi: " + this.getDesafiante().getNome());
                    this.desafiante.ganharluta();
                    this.desafiado.perderluta();
                    break;
            } 
            System.out.println("================================================");
            
        
        }else{
            System.out.println("A luta não pode acotencer!");
        }
          
        
    }
    
    
    //Metodos especiais

    
    

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
    
}
