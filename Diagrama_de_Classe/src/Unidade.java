public class Unidade {
    private Long id;
    private String nome;
    private String endereco;

    // Construtor
    public Unidade(Long id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    public void atualizarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
        System.out.println("Endereço da unidade " + this.nome + " atualizado para: " + this.endereco);
    }

    public void exibirInformacoes() {
        System.out.println("--- Informações da Unidade ---");
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("-----------------------------");
    }
}