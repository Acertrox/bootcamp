package classProject;

public class Index {
    public static void main(String[] args) {
        Project test = new Project("prueba","prueba de clase project");
        System.out.println(test.elevatorPitch());

        Portfolio portfolio = new Portfolio();
        System.out.println(portfolio.getPortfolioCost());
        portfolio.showPortfolio();
    }
}
