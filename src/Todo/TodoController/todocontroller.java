package Todo.TodoController; 

import Todo.TodoController.TodoModel.todomodel; 
import Todo.TodoController.TodoView.todoview; 
import java.util.ArrayList;

public class todocontroller {
    
   
    private ArrayList<todomodel> listaTareas;
    private todoview vista;

    
    public todocontroller() {
        this.listaTareas = new ArrayList<>();
        this.vista = new todoview();
    }


    public void iniciar() {
        String opcion = "";
        
       
        do {
            opcion = vista.mostrarMenu();
            
           
            if (opcion == null) {
                break;
            }

            switch (opcion) {
                case "1":
                    agregarTarea();
                    break;
                case "2":
                    verTareas();
                    break;
                case "3":
                    cambiarEstadoTarea();
                    break;
                case "4":
                    vista.mostrarMensaje("¡Saliendo de la aplicación. Hasta luego!");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        } while (!opcion.equals("4"));
    }


    private void agregarTarea() {
      
        String nombre = vista.solicitarTarea();
        if (nombre == null || nombre.trim().isEmpty()) return;

        String prioridadStr = vista.solicitarPrioridad();
        if (prioridadStr == null) return;

        String descripcion = vista.solicitarDescripcion();
        if (descripcion == null) return;

        try {
           
            int prioridad = Integer.parseInt(prioridadStr);

       
            todomodel nuevaTarea = new todomodel(nombre, prioridad, descripcion);

            listaTareas.add(nuevaTarea);

           
            vista.mostrarMensaje("¡Tarea creada y guardada con éxito!");

        } catch (NumberFormatException e) {
            vista.mostrarMensaje("Error: La prioridad debe ser un número entero.");
        }
    }

    private void verTareas() {
        if (listaTareas.isEmpty()) {
            vista.mostrarMensaje("No hay tareas registradas todavía.");
            return;
        }

        StringBuilder sb = new StringBuilder("=== LISTADO DE TAREAS ===\n\n");
        for (int i = 0; i < listaTareas.size(); i++) {
            sb.append((i + 1)).append(". ").append(listaTareas.get(i).toString()).append("\n\n");
        }

        vista.mostrarListaTareas(sb.toString());
    }

    private void cambiarEstadoTarea() {
        if (listaTareas.isEmpty()) {
            vista.mostrarMensaje("No hay tareas para modificar.");
            return;
        }


        StringBuilder sb = new StringBuilder("Seleccione el número de la tarea a cambiar estado:\n\n");
        for (int i = 0; i < listaTareas.size(); i++) {
            sb.append((i + 1)).append(". ").append(listaTareas.get(i).getTarea())
              .append(" [Estado: ").append(listaTareas.get(i).isEstado() ? "Completada" : "Pendiente").append("]\n");
        }

        String indexStr = javax.swing.JOptionPane.showInputDialog(null, sb.toString());
        if (indexStr == null) return;

        try {
            int index = Integer.parseInt(indexStr) - 1;             
            if (index >= 0 && index < listaTareas.size()) {
                todomodel tareaSeleccionada = listaTareas.get(index);
               
                boolean estadoActual = tareaSeleccionada.isEstado();
                tareaSeleccionada.setEstado(!estadoActual);
                
                vista.mostrarMensaje("¡Estado de la tarea actualizado con éxito!");
            } else {
                vista.mostrarMensaje("Número de tarea inválido.");
            }
        } catch (NumberFormatException e) {
            vista.mostrarMensaje("Por favor, ingrese un número válido.");
        }
    }
}