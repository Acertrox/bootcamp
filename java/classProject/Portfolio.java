package classproject;

import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects;
    public Portfolio(){
        projects = new ArrayList<>();
        projects.add(new Project("Por defecto1","Por defecto1"));
        projects.add(new Project("Por defecto2","Por defecto2"));
        projects.add(new Project("Por defecto3","Por defecto3"));
        projects.add(new Project("Por defecto4","Por defecto4"));
        projects.add(new Project("Por defecto5","Por defecto5"));
    }
    public Portfolio(ArrayList<Project> projects){
        this.projects = projects;
    }
    public ArrayList<Project> getProjects(){
        return projects;
    }
    public void setProjects(ArrayList<Project> projects){
        this.projects = projects;
    }
    public double getPortfolioCost(){
        double suma= 0.0;
        for (Project project : projects) {
            suma += project.getCost();
        }
        return suma;
    }
    public void showPortfolio(){
        for (Project project : projects) {
            System.out.println(project.elevatorPitch());
        }
    }
}
