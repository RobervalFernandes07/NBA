package usa.com.nba.atletas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class operacoesController {
	
	@FXML
	private TextField txf_nome;
	@FXML
	private TextField txf_sobre;
	@FXML
	private TextField txf_idade;
	@FXML
	private TextField txf_pos;
	@FXML
	private TextField txf_equipe;
	@FXML
	private Button btn_cadastrar;
	
	class OperacoesBanco {
		 public static void inserirAluno() {
		     String sql = "INSERT INTO atletas_tb (id, nome, sobrenome, idade, posicao, equipe) VALUES (?, ?, ?, ?, ?, ?)";
		     try (Connection conexao = Conexao.conectar();
		          PreparedStatement pstmt = conexao.prepareStatement(sql)) {
		         pstmt.setInt(1, 1);
		         pstmt.setString(2, txf_nome.getText());
		         pstmt.setString(3, txf_sobre.getText());
			 pstmt.setString(4, txf_idade.getText());
			 pstmt.setString(5, txf_posicao.getText());
			 pstmt.setString(6, txf_equipe.getText());
		         pstmt.executeUpdate();
		     } catch (SQLException e) {
		         e.printStackTrace();
		     }
		 }
	}
	
}
