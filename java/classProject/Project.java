package classproject;

/**
 * Project
 */
public class Project {
    private String nombre;
    private String descripcion;
    private double initialCost;
    public String elevatorPitch(){
        return nombre+" ("+initialCost+"): "+descripcion;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public double getCost(){
        return initialCost;
    }
    public void setCost(double initialCost){
        this.initialCost = initialCost;
    }
    public Project(){
        this("nombre por defecto", "descripcion por defecto");
    }
    public Project(String nombre){
        this(nombre, "descripcion por defecto");
    }
    public Project(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.initialCost = 10.0;
    }
}