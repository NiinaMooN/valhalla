package controller;

import model.project;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.connectionFactory;
import java.sql.ResultSet;


public class projectController {
    
    public void save(Project project ) {
    
     String sql = "INSERT INTO projects ( name,"
                + "description, creatAt, updatAt)"
                + "+VALUES(?, ?, ?, ?)";
        
        
        Connection connection = null;
        PreparedStatement statement = null;
    }    
        try {
    // cria uma conexão com o banco de dados
          
            connection = util.connectionFactory.getConnection(); 
    // cria um prepareStatement, classe usada para criar a query        
            
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date (project.getCreatAt().getTime()));
            statement.setDate(4, new Date (project.getUpdatAt().getTime()));
            statement.execute; 
            
        } catch (SQLException ex) {
            Logger.getLogger(projectController.class.getName()).log(Level.SEVERE, ("erro ao salvar a tarefa", ex);
        
        } finally {
            connectionFactory.closeConnection(connection, (connectionFactory.PreparedStatement) statement);
        }
    
    public void update(model.project Project){
        String sql = "UPDATE project SET"
                + "name = ?,"
                + "description = ?,"
                + "creatAt = ?, updatAt = ?"
                + "WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //estabelendo a conexao com banco de dados 
            connection = util.connectionFactory.getConnection();
            statement = connection.prepareStatemente(sql); 
            statement.setString(1, project.name());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date (project.getCreatAt().getTime()));
            statement.setDate(4, new Date (project.getUpdatAt().getTime()));
            statement.setInt(5, project.getid());
            statement.exculte;

        } catch (SQLException ex) {
           throw new RuntimeException("Erro ao atualizar a tarefa" 
                   + ex.getMessage(), ex);
        } finally {
            connectionFactory.closeConnection(connection, (connectionFactory.PreparedStatement) statement); 
    }
}
     

    public void removeById(int id) {
        String sql = "DETELE FROM tasks WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection.ConnectionFactory.getConnection();
            statement = connection.prepareStatemente(sql);
            statement = setInt(1, idproject);
            statement.execute();
        } catch (Exception ex) {
            throw new runTimeException ("Erro ao deletar a tarefa" + ex.getMessage() );
        } finally {
            util.connectionFactory.closeConnection(connection, statement);
        }
           
}

    public List<project> getAll(){
        
        String sql = "SELECT * FRON projects";
        List<Project> Projects = new ArrayList<>(); 
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.PreparedStatement(sql);
            resultSet = statement.executeQuery();
            
            List<project> projects = null;
          
            while (resultSet.next()) {

                project Project = new project();
                project.setId(resultSet.getInd("id"));
                project.setName(resulteSet.getSring ("name"));
                project.setDescription(resultset.getString("description"));
                project.setCreatAt(resultSet.getDate("creatAt"));
                project.setUpdatAt(resultSet.getDate("updatAt"));
                projects.add(project);
            
    } catch (Exception ex) {
         throw new RumTimeException("Erro ao inserir a tarefa", ex);
} finally {
    connectionFactory.closeConnection(connection, statement);
}
return projects;

}

}

}

    
