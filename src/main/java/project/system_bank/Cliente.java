package project.system_bank;

public class Cliente {
    private int cliente_id;
    private String nome;
    private String cpf_cliente;
    private String telefone;
    private String email;
    private String nascimento;


    public Cliente(String nome, String cpf_cliente, String telefone, String email, String nascimento) {
        this.nome = nome;
        this.cpf_cliente = cpf_cliente;
        this.telefone = telefone;
        this.email = email;
        this.nascimento = nascimento;
    }

    public Cliente(){
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cliente_id=" + cliente_id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf_cliente + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", nascimento='" + nascimento + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
