
package controller;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import model.task;
import util.connectionFactory;


public class TaskController {
    
    public void save( model.task) throw (SQLException);
     String sql = "INSERT INTO tasks (idProject, name,"
                + "description, completed, notes, "
                + "creatAt, deadline, updatAt)"
                + "+VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        
        
        Connection connection= null;
        PreparedStatement statement = null;
        
        try {
            connection = util.connectionFactory.getConnection();
            statement = connection.prepareStatemente(sql);
            statement.setInt(1, task.getIdproject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5,task.isIsComplete());
            statement.setInt(6, task.id());
            statement.setDate(7, new Date (task.getdeadline().getTime()));
            statement.setDate(8, new Date (task.getCreatAt().getTime()));
            statement.setDate(9, new Date (task.getUpdatAt().getTime()));
            statement.execute; 
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar a tarefa"
            + ex.getMessage(), ex);
        } finally {
            connectionFactory.closeConnection(connection, (connectionFactory.PreparedStatement) statement);
        }
    
    public void update(model.taskTask task){
        String sql = "UPDATE task SET"
                + "idProject = ?, name = ?"
                + "description = ?, notes = ?,"
                + "completed = ?, deadline = ?,"
                + "creatAt = ?, updatAt = ?"
                + "WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //estabelendo a conexao com banco de dados 
            connection = util.connectionFactory.getConnection();
            statement = connection.prepareStatemente(sql);
            statement.setInt(1, task.getName()); 
            statement.setString(2, task.getDescription());
            statement.setString(3, task.getNotes());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setDate(5, new Date (task.getDeadline().getTime()));
            statement.setDate(6, new Date (task.getCreatAt().getTime()));
            statement.setDate(7, new Date (task.getUpdatAt().getTime()));
            statement.exculte;

        } catch (Exception ex) {
           throw new RuntimeException("Erro ao atualizar a tarefa" 
                   + ex.getmessege(), ex);
        } finally {
            connectionFactory.closeConnection(connection, (connectionFactory.PreparedStatement) statement); 
    }
}
     

    public void removeById(int taskId) {
        String sql = "DETELE FROM tasks WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection.ConnectionFactory.getConnection();
            statement = connection.prepareStatemente(sql);
            statement.execute();
        } catch (Exception ex) {
            throw new runTimeException ("Erro ao deletar a tarefa" + ex.getMessege);
        } finally {
            util.connectionFactory.closeConnection(connection, statement);
        }
           
}

    public List<Task> getAll(int idProject){
        String sql = "SELECT * FRON tasks WHERE idProject = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Task> tasks = new ArrayList<Task>(); 
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.PreparedStatement(sql);
            statement.setInt(1, idProject);
            resultSet = statement.executeQuery();
          
            while (resultSet.next()) {

                model.task Task = new Task();
                task.setId(resultSet.getInd("id"));
                task.setIdProject(resulSet.getInt("idProject"));
                task.setName(resulteSet.getSring ("name"));
                task.setDescription(resultset.getString("description"));
                task.isIScompleted(resultSet.getBoolean("completed"));
                task.setDeadline(resultSet.getDate("Deadline"));
                task.setCreatAt(result.set.getDate("creatAt"));
                task.setUpdatAt(result.set.getDate("updatAt"));
                tasks.add(task);
            
    } catch (Exception ex) {
         throw new RumTimeException("Erro ao inserir a tarefa" + ex.getMessege(),ex);
} finally {
    connectionFactory.closeConnection(connection, statement);
}
return tasks;

}

}

}
