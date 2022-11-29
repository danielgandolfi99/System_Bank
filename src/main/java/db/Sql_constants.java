package db;

public class Sql_constants {
    public static final String insertCliente = "INSERT INTO cliente" +
                                        "(cliente_id, nome, cpf, ,telefone, email, nascimento)" +
                                        "VALUES (null,?,?,?,?,?)";

    public static final String updateCliente = "UPDATE cliente " +
                                                "SET nome = ?, telefone = ?, email = ?, nascimento = ? " +
                                                "WHERE cpf = ?";

    public static final String removeCliente = "DELETE FROM cliente " +
                                                "WHERE cpf = ?";

    public static final String searchCliente = "SELECT * FROM cliente";

    public static final String insertConta = "INSERT INTO conta (conta_id, agencia, saldo, tipo, cpf) VALUES (null, ?, ?, ?, ?)";

    public static final String updateConta = "UPDATE conta SET agencia = ?, tipo = ? WHERE cpf = ?";

    public static final String removeConta = "DELETE FROM conta WHERE cpf = ?";

    public static final String searchConta = "SELECT * FROM conta";

}
