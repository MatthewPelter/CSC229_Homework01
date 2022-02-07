// Matthew Pelter | CSC229 | Homework_01
public class Course {
    // Member variables
    private int id;
    private String name;
    private int code;
    
    // Default Constructor
    public Course() {
        id = -1;
        name = "Default Course";
        code = -1;
    }
    
    // Overloaded Constructor with 3 parameters
    public Course(int id, String name, int code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    // GET ID
    public int getId() {
        return id;
    }

    // SET ID
    public void setId(int id) {
        this.id = id;
    }

    // GET Name
    public String getName() {
        return name;
    }

    // SET Name
    public void setName(String name) {
        this.name = name;
    }

    // GET Code
    public int getCode() {
        return code;
    }

    // SET Code
    public void setCode(int code) {
        this.code = code;
    }
    
    // Main class
    public static void main(String[] args) {
        // initialize course 1
        Course c1 = new Course();
        // Setting the id
        c1.setId(1);
        // Setting the name
        c1.setName("Data Structures");
        // Setting the code
        c1.setCode(135);
        
        // Displaying the object variables using the getters
        System.out.println("Course 1 \nCourse ID: " + c1.getId() + "\nCourse Name: " + c1.getName() + "\nCourse Code: " + c1.getCode());
        
        // Line break
        System.out.println("");
        
        // initializing course 2 using overloaded parameters
        Course c2 = new Course(2, "Algorithms", 123);
        
        // displaying the objects variables using the getters again
        System.out.println("Course 2 \nCourse ID: " + c2.getId() + "\nCourse Name: " + c2.getName() + "\nCourse Code: " + c2.getCode());
    }
}
