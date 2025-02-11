package projeto.livro;
public class Livro implements Publicacacao {
    
    //teste para o git
    
    //Atributo
    private String titulo;
    private String autor;
    private int totPagina;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    
    //Metodo publico (TO STRING PRA FACILITAR TIRA O OVERRYDE)

    
    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + 
                ", autor=" + autor + ", totPagina=" + totPagina + 
                ", pagAtual=" + pagAtual + ", aberto=" + aberto + 
                ", leitor=" + leitor.getNome() + '}';
    }
    
   
    
    
    
    
    //Metodos especiais

    public Livro(String titulo, String autor, int totPagina, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPagina = totPagina;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPagina() {
        return totPagina;
    }

    public void setTotPagina(int totPagina) {
        this.totPagina = totPagina;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    //Metodos Abstratos
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPagina){
            this.pagAtual = 0;
        }else
            this.pagAtual = p;
        
            
        
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }

    
    }

    
    
    
    
    
    

