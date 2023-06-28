package assignmentJava;

public class Politician extends Person { 

    private String party; 
    private double salary; 

 

    public Politician(String name, int age, String party, double salary) { 

        super(name, age); 
        this.party = party; 
        this.salary = salary; 

    } 

 

    public double calculateSalary() { 

        return salary; 

    } 

 

    @Override 

    public void display() { 

        super.display(); 
        System.out.println("Party: " + party); 
        System.out.println("Salary: " + salary); 

    }



	

} 