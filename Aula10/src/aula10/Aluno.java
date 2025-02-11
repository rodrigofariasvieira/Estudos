package aula10;
public class Aluno extends Pessoa {
    
    //Atributos
    private int matr;
    private String curso;
    
    //Metodo
    public void cancelarMatr(){
        System.out.println("Matricula será cancelada");
        this.matr = 0;
        this.setCurso("Matricula cancelada");
        
    }
    
    //Metodos especiais

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
    
    
}
