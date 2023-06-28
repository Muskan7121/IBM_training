package assignmentJava;

public class Sportsman extends Person { 

    private String sport; 
    private double salary; 

 

    public Sportsman(String name, int age, String sport, double salary) { 
        super(name, age); 
        this.sport = sport; 
        this.salary = salary; 
    } 

 

    public double calculateSalary() { 
        return salary; 

    } 

 

    @Override 

    public void display() { 

        super.display(); 
        System.out.println("Sport: " + sport); 
        System.out.println("Salary: " + salary); 

    } 
    
    public static void main(String[] args) { 

        Politician politician = new Politician("John Doe", 45, "XYZ Party", 10000.0); 
        politician.display(); 
        double politicianSalary = politician.calculateSalary(); 
        System.out.println("Politician's Salary: " + politicianSalary); 

 
        System.out.println(); 
 

        Sportsman sportsman = new Sportsman("Jane Smith", 28, "Football", 5000.0); 
        sportsman.display(); 
        double sportsmanSalary = sportsman.calculateSalary(); 
        System.out.println("Sportsman's Salary: " + sportsmanSalary); 

    } 
}  