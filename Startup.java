import java.time.LocalDate;


public class Startup {
    static int classLocal;

    public static void main(String[] args) {
        Student student = new Student();
        student.major = Major.COMPUTERSCIENCE;
        student.name = "Logan";
        student.dateOfBirth = LocalDate.of(1995, 5, 13);
        System.out.println(student);
        System.out.println(student.getAge());

        Student student2 = new Student();
        student2.major = Major.PSYCHOLOGY;
        student2.name = "Liam";
        student2.dateOfBirth = LocalDate.of(2018, 3, 21);
        System.out.println(student2.toString("Gautreaux"));
        System.out.println(student2.getAge());

        if (student.major == Major.COMPUTERSCIENCE) {
            System.out.println("Computers are the best");
        }
            
            Car car1 = new Car();
            car1.setHorsePower(14);
            car1.setCarStyle(CarStyle.SUV);
            car1.setPowerType(PowerType.UNLEADED);
    
            Car car2 = new Car();
    
            Car car3 = new Car();
            car3.setHorsePower(195);
    
            System.out.println(car1.getHorsePower());
            System.out.println(car2.getHorsePower());
            System.out.println(car3.getHorsePower());
            
        // Circle circle2 = circle;
        // System.out.println("Circle 2s radius " + circle2.radius);
        // circle.radius = 10;
        // System.out.println("Circle 2s radius " + circle2.radius);
        // String name = "Logan";
        //String name1= "Logan12";

        // System.out.println(name.toLowerCase());

        // // Student student3 = new Student();
        // System.out.println(student3.studentName);
        // student.studentName = "Logan";
        // System.out.println(student.studentName);
        // student.GPA = Float.parseFloat("458.1");
        // System.out.println("GPA " + student.GPA);
        // System.out.println(classLocal);

        // System.out.println(getVowels("gautreaux"));
    

    // public static double harmonic(int n){
    //     int local = 0;
    //     System.out.println(local);
    //     //System.out.println(classLocal);
    //     for (int i = 0; i< 3; i++) {
    //         int forLoopLocal = 1;
    //         System.out.println(forLoopLocal);
    //     }
    //     return n;
    // }
    // public static int getVowels(String term) {
    //     int counter = 0; // Initialize counter variable
        
    //     for (int i = 0; i < term.length(); i++) {
    //         char letter = term.charAt(i);
    
    //         // Check if the character is a vowel
    //         if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
    //             counter++; // Increment counter if the character is a vowel
    //         }
    //     }
    
        // return counter; // Return the count of vowels
    }
}