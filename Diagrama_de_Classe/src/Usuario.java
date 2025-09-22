public class Usuario {
    private Long id;
    private String nomeCompleto;
    private String nomeUsuario;
    private String senha;
    private Boolean ativo;
    private String papel;

    // Construtor
    public Usuario(Long id, String nomeCompleto, String nomeUsuario, String senha, Boolean ativo, String papel) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.ativo = ativo;
        this.papel = papel;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public String getPapel() {
        return papel;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public void mudarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("A senha do usuário " + this.nomeUsuario + " foi alterada.");
    }
}