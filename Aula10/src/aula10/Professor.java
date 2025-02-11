package aula10;
public class Professor extends Pessoa {
    
    //Atributos
    private String especialidade;
    private float salario;
    
    //Metodo
    
    public void receberAum(float a){
        this.setSalario(this.getSalario() + a);
        
        
        
    }
    
    //Metodos especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
