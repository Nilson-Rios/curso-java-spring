package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) {
		Connection con;
		try {
			con = FabricaConexao.getConexao();
			if (con != null) {
				System.out.println("Conexão estabelecida!");
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
