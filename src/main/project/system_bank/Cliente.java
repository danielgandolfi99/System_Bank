package project.system_bank;

public class Cliente {
    private int cliente_id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String nascimento;

    public Cliente(String nome, String cpf, String telefone, String email, String nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.nascimento = nascimento;
    }

    public Cliente() {
    }

    public Cliente(int cliente_id, String nome, String cpf, String telefone, String email, String nascimento) {
        this.cliente_id = cliente_id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.nascimento = nascimento;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cliente_id=" + cliente_id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", nascimento='" + nascimento + '\'' +
                '}';
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

}
