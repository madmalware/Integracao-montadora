/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexão;

import Classes.Cliente;
import Classes.Cor;
import Classes.Modelo;
import Classes.Montadoras;
import Classes.Usuario;
import Classes.Veiculo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author msousa
 */
public class DatabaseConnection {
    
    public static final String URL = "jdbc:mysql://localhost:3306/montadora";
    public static final String USER = "root";
    public static final String PASSWORD = "";
    
    public static Connection getConnection(){
        try{
            System.out.println("Funcionou");
            return  DriverManager.getConnection(URL, USER, PASSWORD);     
        }catch(SQLException e){
            System.err.println("whom whom whom...");
            throw new RuntimeException(e);
        }
    }
    
    // FUNÇÕES CREATE ->
    
    public void createUsuario(Usuario pessoa) {
        // Query SQL para inserção.
        String query = "INSERT INTO Usuario (nome, cpf, email, senha) VALUES (?, ?, ?, ?)";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui os valores da pessoa para a query.
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getCpf());
            stmt.setString(3, pessoa.getEmail());
            stmt.setString(4, pessoa.getSenha());
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    
    public void createModelo(Modelo m) {
        // Query SQL para inserção.
        String query = "INSERT INTO Modelo (quantidade, nome, crlv, anoModelo, especieVeiculo) VALUES (?, ?, ?, ?, ?)";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui os valores da pessoa para a query.
            stmt.setInt(1, m.getQuant());
            stmt.setString(2, m.getNome());
            stmt.setString(3, m.getCrlv());
            stmt.setInt(4, m.getAno());
            stmt.setString(5, m.getEspecie());
            
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    
    public void createVeiculo(Veiculo m) {
        // Query SQL para inserção.
        String query = "INSERT INTO Veiculo (placa, quantPortas, quantRodas, status, ipva, revisaoPeriodica, chassi, renavam ) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui os valores da pessoa para a query.
            stmt.setString(1, m.getPlaca());
            stmt.setInt(2, m.getQuantPortas());
            stmt.setInt(3, m.getQuantRodas());
            stmt.setString(4, m.getStatus());
            stmt.setString(5, m.getIpva());
            stmt.setString(6, m.getRevisaoPeriodica());
            stmt.setString(7, m.getChassi());
            stmt.setString(8, m.getRenavam());
            
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    
    public void createMontadora(Montadoras m) {
        // Query SQL para inserção.
        String query = "INSERT INTO Montadora (nome, endereco, tel, email) VALUES (?, ?, ?, ?)";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui os valores da pessoa para a query.
            stmt.setString(1, m.getNome());
            stmt.setString(2, m.getEndereco());
            stmt.setString(3, m.getTel());
            stmt.setString(4, m.getEmail());
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    
    public void createCliente(Cliente m) {
        // Query SQL para inserção.
        String query = "INSERT INTO Cliente(nome, cpf, tel, email) VALUES (?, ?, ?, ?)";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui os valores da pessoa para a query.
            stmt.setString(1, m.getNome());
            stmt.setString(2, m.getCpf());
            stmt.setString(3, m.getTel());
            stmt.setString(4, m.getEmail());
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    
    public void createCor(Cor m) {
        // Query SQL para inserção.
        String query = "INSERT INTO Cores (cor) VALUES (?)";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui os valores da pessoa para a query.
            stmt.setString(1, m.getCor());
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    
    public void createAno(Veiculo m) {
        // Query SQL para inserção.
        String query = "INSERT INTO Fabricacao(ano) VALUES (?)";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui os valores da pessoa para a query.
            stmt.setInt(1, m.getAno());
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    
    // FUNÇÕES UPDATE ->
    
    public void updateUsuario(Usuario pessoa, int id) {
        // Query SQL para atualização.
        String query = "UPDATE Usuario SET nome = ?, cpf = ?, email = ?, senha = ? WHERE id = ?";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui os valores da pessoa para a query.
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getCpf());
            stmt.setString(3, pessoa.getEmail());
            stmt.setString(4, pessoa.getSenha());
            stmt.setInt(5, id);
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    
    public void updateModelo(Modelo m, int id) {
        // Query SQL para atualização.
        String query = "UPDATE Modelo SET quantidade = ?, nome = ?, crlv = ?, anoModelo = ?, especieVeiculo = ? WHERE id = ?";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui os valores da pessoa para a query.
            stmt.setInt(1, m.getQuant());
            stmt.setString(2, m.getNome());
            stmt.setString(3, m.getCrlv());
            stmt.setInt(4, m.getAno());
            stmt.setString(5, m.getEspecie());
            stmt.setInt(6, id);
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    
    public void updateCliente(Cliente m, int id) {
        // Query SQL para atualização.
        String query = "UPDATE Cliente SET nome = ?, cpf = ?, tel= ?, email = ? WHERE id = ?";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui os valores da pessoa para a query.
            stmt.setString(1, m.getNome());
            stmt.setString(2, m.getCpf());
            stmt.setString(3, m.getTel());
            stmt.setString(4, m.getEmail());
            stmt.setInt(5, id);
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    
    public void updateMontadora(Montadoras m, int id) {
        // Query SQL para atualização.
        String query = "UPDATE Montadora SET nome = ?, endereco = ?, tel= ?, email = ? WHERE id = ?";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui os valores da pessoa para a query.
            stmt.setString(1, m.getNome());
            stmt.setString(2, m.getEndereco());
            stmt.setString(3, m.getTel());
            stmt.setString(4, m.getEmail());
            stmt.setInt(5, id);
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    
    public void updateVeiculo(Veiculo m, int id) {
        // Query SQL para atualização.
        String query = "UPDATE Veiculo SET placa = ?, quantPortas = ?, quantRodas = ?, status = ?, ipva = ?, revisaoPeriodica = ?, chassi = ?, renavam = ? WHERE id = ?";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui os valores da pessoa para a query.
            stmt.setString(1, m.getPlaca());
            stmt.setInt(2, m.getQuantPortas());
            stmt.setInt(3, m.getQuantRodas());
            stmt.setString(4, m.getStatus());
            stmt.setString(5, m.getIpva());
            stmt.setString(6, m.getRevisaoPeriodica());
            stmt.setString(7, m.getChassi());
            stmt.setString(8, m.getRenavam());
            stmt.setInt(5, id);
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    
    public void updateCor(Cor m, int id) {
        // Query SQL para atualização.
        String query = "UPDATE Cores SET cor = ? WHERE id = ?";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui os valores da pessoa para a query.
            stmt.setString(1, m.getCor());
            stmt.setInt(5, id);
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    
    public void updateAno(Veiculo m, int id) {
        // Query SQL para atualização.
        String query = "UPDATE Fabricacao SET ano = ? WHERE id = ?";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui os valores da pessoa para a query.
            stmt.setInt(1, m.getAno());
            stmt.setInt(5, id);
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    
    // FUNÇÕES LEITURA ->
    
    public ArrayList<Usuario> readUsers() {
        // Lista para armazenar as pessoas recuperadas.
        ArrayList<Usuario> pessoas = new ArrayList<>();
        // Query SQL para seleção.
        String query = "SELECT * FROM Usuario";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query);
            // Executa a query e armazena o resultado.
            ResultSet rs = stmt.executeQuery()
        ) {
            // Itera sobre o resultado.
            while (rs.next()) {
                // Adiciona cada pessoa à lista.
                pessoas.add(new Usuario(rs.getString("nome"), rs.getString("cpf"),rs.getString("email"), rs.getString("senha")));
            }
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
        // Retorna a lista de pessoas.
        return pessoas;
    }
    
    public ArrayList<Cliente> readClientes() {
        // Lista para armazenar as pessoas recuperadas.
        ArrayList<Cliente> pessoas = new ArrayList<>();
        // Query SQL para seleção.
        String query = "SELECT * FROM Cliente";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query);
            // Executa a query e armazena o resultado.
            ResultSet rs = stmt.executeQuery()
        ) {
            // Itera sobre o resultado.
            while (rs.next()) {
                // Adiciona cada pessoa à lista.
                pessoas.add(new Cliente(rs.getString("nome"), rs.getString("cpf"),rs.getString("tel"), rs.getString("email")));
            }
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
        // Retorna a lista de pessoas.
        return pessoas;
    }
    
    public ArrayList<Montadoras> readMontadora() {
        // Lista para armazenar as pessoas recuperadas.
        ArrayList<Montadoras> pessoas = new ArrayList<>();
        // Query SQL para seleção.
        String query = "SELECT * FROM Montadora";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query);
            // Executa a query e armazena o resultado.
            ResultSet rs = stmt.executeQuery()
        ) {
            // Itera sobre o resultado.
            while (rs.next()) {
                // Adiciona cada pessoa à lista.
                pessoas.add(new Montadoras(rs.getString("nome"), rs.getString("Endereço"),rs.getString("Telefone"), rs.getString("Email")));
            }
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
        // Retorna a lista de pessoas.
        return pessoas;
    }
    
    /*
    public ArrayList<Usuario> readAll() {
        // Lista para armazenar as pessoas recuperadas.
        ArrayList<Usuario> pessoas = new ArrayList<>();
        // Query SQL para seleção.
        String query = "SELECT * FROM Usuario";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query);
            // Executa a query e armazena o resultado.
            ResultSet rs = stmt.executeQuery()
        ) {
            // Itera sobre o resultado.
            while (rs.next()) {
                // Adiciona cada pessoa à lista.
                pessoas.add(new Usuario(rs.getString("nome"), rs.getString("cpf"),rs.getString("email"), rs.getString("senha")));
            }
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
        // Retorna a lista de pessoas.
        return pessoas;
    }
    
    public ArrayList<Usuario> readAll() {
        // Lista para armazenar as pessoas recuperadas.
        ArrayList<Usuario> pessoas = new ArrayList<>();
        // Query SQL para seleção.
        String query = "SELECT * FROM Usuario";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query);
            // Executa a query e armazena o resultado.
            ResultSet rs = stmt.executeQuery()
        ) {
            // Itera sobre o resultado.
            while (rs.next()) {
                // Adiciona cada pessoa à lista.
                pessoas.add(new Usuario(rs.getString("nome"), rs.getString("cpf"),rs.getString("email"), rs.getString("senha")));
            }
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
        // Retorna a lista de pessoas.
        return pessoas;
    }
    
    public ArrayList<Usuario> readAll() {
        // Lista para armazenar as pessoas recuperadas.
        ArrayList<Usuario> pessoas = new ArrayList<>();
        // Query SQL para seleção.
        String query = "SELECT * FROM Usuario";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query);
            // Executa a query e armazena o resultado.
            ResultSet rs = stmt.executeQuery()
        ) {
            // Itera sobre o resultado.
            while (rs.next()) {
                // Adiciona cada pessoa à lista.
                pessoas.add(new Usuario(rs.getString("nome"), rs.getString("cpf"),rs.getString("email"), rs.getString("senha")));
            }
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
        // Retorna a lista de pessoas.
        return pessoas;
    }
    
    public ArrayList<Usuario> readAll() {
        // Lista para armazenar as pessoas recuperadas.
        ArrayList<Usuario> pessoas = new ArrayList<>();
        // Query SQL para seleção.
        String query = "SELECT * FROM Usuario";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query);
            // Executa a query e armazena o resultado.
            ResultSet rs = stmt.executeQuery()
        ) {
            // Itera sobre o resultado.
            while (rs.next()) {
                // Adiciona cada pessoa à lista.
                pessoas.add(new Usuario(rs.getString("nome"), rs.getString("cpf"),rs.getString("email"), rs.getString("senha")));
            }
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
        // Retorna a lista de pessoas.
        return pessoas;
    }
*/    



    // FUNÇÕES DELETE ->
    
    public void deleteUsuario(int id) {
        // Query SQL para deleção.
        String query = "DELETE FROM Usuario WHERE id= ?";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui o CPF para a query.
            stmt.setInt(1, id);
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    
    public void deleteCor(int id) {
        // Query SQL para deleção.
        String query = "DELETE FROM Cores WHERE id= ?";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui o CPF para a query.
            stmt.setInt(1, id);
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    public void deleteAno(int id) {
        // Query SQL para deleção.
        String query = "DELETE FROM Fabricacao WHERE id= ?";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui o CPF para a query.
            stmt.setInt(1, id);
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    public void deleteCliente(int id) {
        // Query SQL para deleção.
        String query = "DELETE FROM Cliente WHERE id= ?";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui o CPF para a query.
            stmt.setInt(1, id);
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    
    public void deleteVeiculo(int id) {
        // Query SQL para deleção.
        String query = "DELETE FROM Veiculo WHERE id= ?";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui o CPF para a query.
            stmt.setInt(1, id);
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    
    public void deleteMontadora(int id) {
        // Query SQL para deleção.
        String query = "DELETE FROM Montadora WHERE id= ?";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui o CPF para a query.
            stmt.setInt(1, id);
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    
    public void deleteModelo(int id) {
        // Query SQL para deleção.
        String query = "DELETE FROM Modelo WHERE id= ?";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui o CPF para a query.
            stmt.setInt(1, id);
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
}
