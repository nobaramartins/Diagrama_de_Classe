import java.util.Date;

public class Atendimento {
    private Long id;
    private Date data;
    private Date hora;
    private double valor;
    private String status;
    private String observacao;
    
    private Paciente paciente;
    private Profissional profissional;
    private Convenio convenio;

    public Atendimento(Long id, Date data, Date hora, double valor, String status, String observacao, Paciente paciente, Profissional profissional, Convenio convenio) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.valor = valor;
        this.status = status;
        this.observacao = observacao;
        
        this.paciente = paciente;
        this.profissional = profissional;
        this.convenio = convenio;
    }
}