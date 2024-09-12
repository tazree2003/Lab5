class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    public Person(String name, int age, String gender, String address) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.address = address;
    }
    public Person(String name, int age) {
    this(name, age, "N/A", "N/A");
    }
    public Person(String name) {
    this(name, 0, "N/A", "N/A");
    }
    public void setDetails(String name, int age, String gender, String address) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.address = address;
    }
    
    public void setDetails(String name, String address) {
    this.name = name;
    this.address = address;
    }
    
    public void displayInfo() {
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
    
    System.out.println("Gender: " + this.gender);
    System.out.println("Address: " + this.address);
    }
    
    public static void main(String[] args) {
    Person person1 = new Person("Tazree", 21, "Female", "Mohammadpur");
    person1.displayInfo();
    Person person2 = new Person("Ayan", 23, "Male", "Kallyanpur");
    person2.displayInfo();
    Person person3 = new Person("Roza", 22, "Male", "Dhanmondi");
    person3.displayInfo();
    }
    }