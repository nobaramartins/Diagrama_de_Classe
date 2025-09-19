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
}