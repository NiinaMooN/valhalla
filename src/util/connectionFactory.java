package util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet; 
import java.sql.DriverManager;

public class connectionFactory {
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/valhalla";
    public static final String USER = "root";
    public static final String PASS = "";
    
      public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriveManager.getConnection(URL,  USER, PASS);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Erro na conexão com o banco de dados");
        }           
    }

    /**
     *
     * @param connection
     * @param statement
     */
    public static void closeConnection (Connection connection, PreparedStatement statement) {
        try  {
            if (connection != null) {
                connection.close();
            }
            if(statement != null) {
                statement.close();
            }
        } catch (SQLException ex)  {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados");
        }
    
    }
   
    public static void closeConnection (Connection connection, Object resultSet)  {
            
        try  {
            if (connection != null)  {
                connection.close();
            }
            Object statement = null;
            if (statement != null)   {
                statement.close();    
            }
            if (resultSet != null)   {
                resultSet.close();
            }
        } catch (SQLException ex)   { 
            throw new RuntimeException( "Erro ao fechar a conexão com o banco de dados");
        }       
    }
// apartir daqui foi corrigido automaticamente 
    private static class PreparedStatement {

        public PreparedStatement() {
        }

        private void close() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }


}