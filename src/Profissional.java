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
}