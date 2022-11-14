package db.configs;

public class Sql_constants {
    public static final String insertCliente = "INSERT INTO cliente" +
                                        "(cliente_id, nome, cpf, ,telefone, email, nascimento)" +
                                        "VALUES (null,?,?,?,?,?)";

    public static final String updateCliente = "UPDATE cliente " +
                                                "SET cliente_id = ?, nome = ?, cpf = ?, ,telefone = ?, email = ?, nascimento = ? " +
                                                "WHERE cliente_id = ?";

    public static final String removeCliente = "DELETE FROM cliente " +
                                                "WHERE cliente_id = ?";

    public static final String searchCliente = "SELECT * FROM cliente";

}
