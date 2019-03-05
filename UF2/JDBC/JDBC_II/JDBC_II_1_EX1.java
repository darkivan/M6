import java.sql.*;

public class JDBC_II_1_EX1 {
	public static void main (String [] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion=DriverManager.getConnection
					("jdbc:mysql://192.168.69.10/ejemplo","austria","123");
			DatabaseMetaData dbmd = conexion.getMetaData();
			ResultSet resul = dbmd.getColumns("ejemplo", null, "depart", null);
			while (resul.next()){
				String nombre = resul.getString("COLUMN_NAME");
				String tipo = resul.getString("TYPE_NAME");
				int nullNoNull= resul.getInt("NULLABLE");
				String mida = resul.getString("COLUMN_SIZE");
				System.out.printf("Nombre: %s, Tipo: %s, null: %s, Mida: %s %n", nombre,tipo, nullNoNull, mida);
			}
			conexion.close();
		}
		catch (ClassNotFoundException cn) {cn.printStackTrace();}
		catch (SQLException e) {e.printStackTrace();}
	}
}

