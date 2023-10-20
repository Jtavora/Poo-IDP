import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.h2.command.dml.Insert;


public class Main {

    public static void main(String[] args) throws SQLException {

        // 1. Habilitar o driver JDBC a partir da aplicação cliente;
        //      ok

        // 2. Estabelecer uma conexão entre a aplicação cliente e servidor do banco de dados;
        String paramsConexao = "jdbc:h2:mem:testdb";
        String usuario = "";
        String senha = "";
        Connection conexao = DriverManager.getConnection(paramsConexao, usuario, senha);

        // 3. Montar e executar a consulta SQL desejada;
        String criacaoSql = "create table pessoa (id int primary key, nome varchar(150), qtdAcesso int, naturalidade varchar(75) )";
        Statement stmtC = conexao.createStatement();
        stmtC.executeUpdate(criacaoSql);
        stmtC.close();

        Statement stmtInsert = conexao.createStatement();
        String insertpessoas = "insert into pessoa(id, nome, qtdAcesso, naturalidade) values (1, 'João', 10, 'Brasileiro')";
        stmtInsert.executeUpdate(insertpessoas);
        insertpessoas = "insert into pessoa(id, nome, qtdAcesso, naturalidade) values (2, 'Maria', 20, 'Brasileiro')";
        stmtInsert.executeUpdate(insertpessoas);
        insertpessoas = "insert into pessoa(id, nome, qtdAcesso, naturalidade) values (3, 'José', 30, 'Brasileiro')";
        stmtInsert.executeUpdate(insertpessoas);
        insertpessoas = "insert into pessoa(id, nome, qtdAcesso, naturalidade) values (4, 'Pedro', 40, 'Brasileiro')";
        stmtInsert.executeUpdate(insertpessoas);
        stmtC.close();

        String consulta = "select * from pessoa";
        //consulta = "select nome as nome_completo, naturalidade from pessoa";
        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(consulta);

        // 4. Processar no cliente o resultado da consulta.
        while (resultado.next()) {
            String nome = resultado.getString("nome");
            Integer quantidade = resultado.getInt("qtdAcesso");
            String naturalidade = resultado.getString("naturalidade");

            Pessoa pessoa = new Pessoa();
            pessoa.setNome(nome);
            pessoa.setQuantidadeAcesso(quantidade);
            pessoa.setNaturalidade(naturalidade);
            // print
            System.out.println("Nome:" + pessoa.getNome());
            System.out.println("Quantidade:" + pessoa.getQuantidadeAcesso());
            System.out.println("Naturalidade:" + pessoa.getNaturalidade());
            System.out.println("====================================");

            // add list
        }

        System.out.println("\nTchau, até a próxima\n\n\t\t:-)");
    }

}
