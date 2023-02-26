
package main;


import controller.projectController;
import controller.TaskController;
import java.sql.Connection;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.List;
import model.project;
import model.task;


public class main {
    public static void main(String[] args)  {

      //  ProjectController projectController = new projectController();
//
  //      Project project = new Project();
    //    project.setName("project test");
      //  project.setDescription("descroption");
        //projectController.save(Project);
        projectController projectController = new projectController();
        
        Project project = new Project();
        project.setId();
        project.setName(" novo nome da tarefa");
        project.setDescription("description");
        projectController.update(project);
        
        List<project> projects = projectController.getAll();
        System.out.println("total de tarefas = " + projects.size());
        
        projectController.removeById();
        
        task Task = new task();
        task.setIdProject(2);
        task.setName("criar as telas de aplicação");
        task.setDescription("devem ser criadas telas para as cadastro");
        task.setNotes("sem notas");
        task.setIsCompleted(false);
        task.setDeadline(new Date());
        
        task.Controller.save(task);
        
        task.setName("alterar telas da aplicação");
        task.Controller.update (task);
        List<task> tasks = taskController.getAll();
        System.out.println("total de tarefas = " + tasks.size());
        
                
        
        
    



    }
    
}
