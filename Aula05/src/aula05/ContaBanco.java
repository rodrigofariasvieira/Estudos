
package aula05;
public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
     //Metodos personalizados
    
    public void estadoAtual(){
        System.out.println("------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    
    
    public void abrirConta(String t){
    this.setTipo(t);
    this.setStatus(true);
        if ("CC".equals(t)) {
         this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
            
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("CONTA NAO PODE SER FECHADA POIS TEM SALDO");
        } else if (this.getSaldo() < 0) {
            System.out.println("CONTA NAO PODE SER FECHADA POIS TEM DEBITO");
        } else {
            this.setStatus(false);
        }
      
  }  
    public void depositar (float v){
        if (this.getStatus()) { 
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de: " + this.getDono());
        } else{
            System.out.println("Não é possível depositar em conta inativa");
        }
    }
    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo() >= 0) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de: " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        }else {
            System.out.println("Impossível sacar de uma conta fechada");
        }
        
        
        
    }
    public void pagarMensal(){
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso pelo(a) " + this.getDono());
        } else {
            System.out.println("Impossivel pagar mensalidade de conta inativa");
        }
         
 
   }
    
    //Metodos especiais 

    public ContaBanco() {
    this.setSaldo(0);
    this.setStatus(false);
            
        
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    

   
    
    
    
    
}
