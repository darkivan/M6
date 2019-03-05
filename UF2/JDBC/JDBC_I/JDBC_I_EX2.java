import java.sql.*;

public class JDBC_I_EX2 {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion=DriverManager.getConnection
					("jdbc:mysql://192.168.69.10/ejemplo","austria","123");
			Statement sentencia =conexion.createStatement();
			String sql = "select apellido,salario,dept_no from emple order by salario desc limit 1;";
			ResultSet result = sentencia.executeQuery(sql);
			while (result.next()){
				System.out.printf("%d, %s, %s, %n",
						result.getInt(2),
						result.getString(1),
						result.getString(3));
			}
			result.close();
			sentencia.close();
			conexion.close();
		} catch (ClassNotFoundException cn) { cn.printStackTrace();
		} catch (SQLException e) {e.printStackTrace();
		}
	}
}
