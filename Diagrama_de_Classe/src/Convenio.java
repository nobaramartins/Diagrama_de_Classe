public class Convenio {
    private Long id;
    private String nome;
    private String razaoSocial;
    private String cnpj;
    private String representante;
    private String email;
    private String telefone;
    private Boolean ativo;

    // Construtor
    public Convenio(Long id, String nome, String razaoSocial, String cnpj, String representante, String email, String telefone, Boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.representante = representante;
        this.email = email;
        this.telefone = telefone;
        this.ativo = ativo;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRepresentante() {
        return representante;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    

    public void ativar() {
        this.ativo = true;
        System.out.println("Convênio " + this.nome + " ativado.");
    }

    public void desativar() {
        this.ativo = false;
        System.out.println("Convênio " + this.nome + " desativado.");
    }
}