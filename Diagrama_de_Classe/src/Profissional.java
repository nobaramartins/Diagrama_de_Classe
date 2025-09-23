public class Profissional {
    private Long id;
    private String nome;
    private String registroConselho;
    private String telefone;
    private String email;
    
    // Relações com outras classes
    private Unidade unidade;
    private Especialidade especialidade;
    private Usuario usuario; 

    // Construtor
    public Profissional(Long id, String nome, String registroConselho, String telefone, String email, Unidade unidade, Especialidade especialidade, Usuario usuario) {
        this.id = id;
        this.nome = nome;
        this.registroConselho = registroConselho;
        this.telefone = telefone;
        this.email = email;
        
        this.unidade = unidade;
        this.especialidade = especialidade;
        this.usuario = usuario;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRegistroConselho() {
        return registroConselho;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRegistroConselho(String registroConselho) {
        this.registroConselho = registroConselho;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    public void atualizarContato(String novoTelefone, String novoEmail) {
        this.telefone = novoTelefone;
        this.email = novoEmail;
    }
    
    public void exibirDados() {
        System.out.println("--- Dados do Profissional ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Registro: " + this.registroConselho);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("-----------------------------");
    }
}