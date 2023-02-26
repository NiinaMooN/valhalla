/**/
package model;

import java.util.Date;


public class task {

    public static Object get;

    public static int getIdproject() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static boolean isIsComplete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Object getdeadline() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Object getCreatAt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static long getUpdatAt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static String Notes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private final int Id = 0;
    private int idProject;
    private String name;
    private String description;
    private String notes;
    private boolean isCompleted;
    private Date deadline;
    private Date creatAt;
    private Date updatAt;
    private int id;

    public task(int id, int idProject, String name, String description, String notes, boolean isCompleted, Date deadline, Date creatdAt, Date updatedAt) {
        this.id = id;
        this.idProject = idProject;
        this.name = name;
        this.description = description;
        this.notes = notes;
        this.isCompleted = isCompleted;
        this.deadline = deadline;
        this.creatAt = creatdAt;
        this.updatAt = updatedAt;
    }
    
    public task(){
        this.creatAt = new Date();
    }
    
    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getCreatdAt() {
        return creatAt;
    }

    public void setCreatdAt(Date creatdAt) {
        this.creatAt = creatdAt;
    }

    public Date getUpdatedAt() {
        return updatAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatAt = updatedAt;
    }

    @Override
    public String toString() {
        return updatAt + "task{" + "id=" + id + ", idProject=" 
                + idProject + ", name=" + name + ", description=" 
                + description + ", notes=" + notes + ", isCompleted=" 
                + isCompleted + ", deadline=" + deadline + ", creatAt="
                + creatAt + ", updatAt=" + '}';
    }
    
    
    
    
    
}
