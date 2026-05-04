public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private String status;

    public Tarefa(int id, String titulo, String descricao, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.id = id;
        this.status = status;
    }
    public int getID() {
        return id;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getStatus(){
        return status;
    }
    public String getDescricao(){
        return descricao;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void exibir () {
        System.out.println("ID : " + id + " | " + " Título " + titulo);
        System.out.println("Status: " + status);
        System.out.println("Desc: " + descricao);
    }
}
