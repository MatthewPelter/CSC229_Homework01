public class Course {
    // Member variables
    private int id;
    private String name;
    private int code;
    
    public Course() {
        id = -1;
        name = "Default Course";
        code = -1;
    }
    
    public Course(int id, String name, int code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    public static void main(String[] args) {
        Course c1 = new Course();
        c1.setId(1);
        c1.setName("Data Structures");
        c1.setCode(135);
        
        System.out.println("Course 1 \nCourse ID: " + c1.getId() + "\nCourse Name: " + c1.getName() + "\nCourse Code: " + c1.getCode());
        
        System.out.println("");
        
        Course c2 = new Course(2, "Algorithms", 123);
        System.out.println("Course 2 \nCourse ID: " + c2.getId() + "\nCourse Name: " + c2.getName() + "\nCourse Code: " + c2.getCode());
    }
}
