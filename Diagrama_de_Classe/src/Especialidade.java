public class Especialidade {
    private Long id;
    private String nome;

    // Construtor
    public Especialidade(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void exibirDetalhes() {
        System.out.println("--- Detalhes da Especialidade ---");
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
    }
}