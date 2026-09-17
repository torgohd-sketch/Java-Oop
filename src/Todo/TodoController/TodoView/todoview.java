package Todo.TodoController.TodoView;

import javax.swing.JOptionPane;

public class todoview {
    

    
    public String mostrarMenu() {
        return JOptionPane.showInputDialog(null,
                "=== MENÚ TO-DO LIST ===\n" +
                "1. Crear nueva tarea\n" +
                "2. Ver todas las tareas\n" +
                "3. Cambiar estado de una tarea\n" +
                "4. Salir\n\n" +
                "Elija una opción:", 
                "Gestor de Tareas", 
                JOptionPane.QUESTION_MESSAGE);
    }

   
    public String solicitarTarea() {
        return JOptionPane.showInputDialog(null, "Ingrese el nombre de la tarea:", "Nueva Tarea", JOptionPane.QUESTION_MESSAGE);
    }

   
    public String solicitarPrioridad() {
        return JOptionPane.showInputDialog(null, "Ingrese la prioridad (ej. 1, 2, 3):", "Prioridad", JOptionPane.QUESTION_MESSAGE);
    }

   
    public String solicitarDescripcion() {
        return JOptionPane.showInputDialog(null, "Ingrese la descripción de la tarea:", "Descripción", JOptionPane.QUESTION_MESSAGE);
    }

    
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

   
    public void mostrarListaTareas(String listadoTareas) {
        JOptionPane.showMessageDialog(null, listadoTareas, "Lista de Tareas", JOptionPane.INFORMATION_MESSAGE);
    }
}
