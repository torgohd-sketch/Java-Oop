package Todo.TodoController.TodoModel;

import java.time.LocalDate;

public class todomodel {
    
    private String tarea;
    private boolean estado;
    private int prioridad;
    private String descripcion;
    private LocalDate fechaCreacion;
    

    public todomodel(String tarea, int prioridad, String descripcion) {
        this.tarea = tarea;
        this.estado = false;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
        this.fechaCreacion = LocalDate.now();
        
    }   

   public String getTarea() {
        return tarea;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public String toString() {
        return "Tarea: " + tarea + ", Estado: " + (estado ? "Completada" : "Pendiente") +
                ", Prioridad: " + prioridad + ", Descripción: " + descripcion +
                ", Fecha de Creación: " + fechaCreacion;
    }



}
