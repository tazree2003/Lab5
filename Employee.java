class Employee {
    private String name;
    private int id;
    private double salary;
    private String designation;
    public Employee(String name, int id, double salary, String designation) {
    this.name = name;
    this.id = id;
    this.salary = salary;
    this.designation = designation;
    }
    
    public Employee(String name, int id) {
    this(name, id, 0.0, "N/A");
    }
    
    public void setName(String name) {
    this.name = name;
    }
    public void setId(int id) {
    this.id = id;
    }
    public void setSalary(double salary) {
    this.salary = salary;
    }
    public void setDesignation(String designation) {
    this.designation = designation;
    }
    
    public void displayInfo() {
    System.out.println("Name: " + this.name);
    
    System.out.println("ID: " + this.id);
    System.out.println("Salary: " + this.salary + " Taka");
    System.out.println("Designation: " + this.designation);
    }
    
    public static void main(String[] args) {
    Employee emp1 = new Employee("Tazree", 100, 20000, "Intern");
    emp1.displayInfo();
    Employee emp2 = new Employee("Ayan", 101, 2000000, "Manager");
    emp2.displayInfo();
    Employee emp3 = new Employee("Upoma", 103, 50000, "HR Head");
    emp3.displayInfo();
    }
    }