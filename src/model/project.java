package model;

import java.sql.Date;

public class project {

    public static int getid() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static String name() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Object getCreatAt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Object getUpdatAt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int id;
    private String name;
    private String description;
    private Date creatAt;
    private Date updatAt;

    public project(int id, String name, String description, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.creatAt = createdAt;
        this.updatAt = updatedAt;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getCreatedAt() {
        return creatAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.creatAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatAt = updatedAt;
    }

    @Override
    public String toString() {
        return this.name;
    }
            
            
            
     
    
}
