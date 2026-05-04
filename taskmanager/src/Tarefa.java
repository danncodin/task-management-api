public class Tarefa {
    int id;
    String titulo;
    String descricao;
    String status;

    private Tarefa (int id, String titulo, String descricao, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.id = id;
        this.status = status;
    }
    public void exibir () {
        System.out.println("ID : " + id + " | " + " Título " + titulo);
        System.out.println("Status: " + status);
        System.out.println("Desc: " + descricao);
    }
}
