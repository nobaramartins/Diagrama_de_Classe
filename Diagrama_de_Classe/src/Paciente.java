import java.util.Date;

public class Paciente {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private Date dataNascimento;
    private String grupoSanguineo;
    private String sexo;
    private String cep;
    private String endereco;
    private String cidade;
    private String estado;

    // Construtor
    public Paciente(Long id, String nome, String email, String telefone, Date dataNascimento, String grupoSanguineo, String sexo, String cep, String endereco, String cidade, String estado) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.grupoSanguineo = grupoSanguineo;
        this.sexo = sexo;
        this.cep = cep;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
    }
}