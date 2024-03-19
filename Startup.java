public class Startup {
    public static void main(String[] args) {
        //static int classLocal;
        Circle circle = new Circle();
        circle.radius = 5;
        System.out.println("Circle 1s radius " + circle.radius);

        Circle circle2 = circle;
        System.out.println("Circle 2s radius " + circle2.radius);


        circle.radius = 10;
        System.out.println("Circle 2s radius " + circle2.radius);


        String name = "Logan";
        //String name1= "Logan12";

        System.out.println(name.toLowerCase());

        Student student = new Student();
        System.out.println(student.studentName);
        student.studentName = "Logan";
        System.out.println(student.studentName);
        student.GPA = Float.parseFloat("458.1");
        System.out.println("GPA " + student.GPA);
        //System.out.println(classLocal);

        System.out.println(getVowels("gautreaux"));
    }

    public static double harmonic(int n){
        int local = 0;
        System.out.println(local);
        //System.out.println(classLocal);
        for (int i = 0; i< 3; i++) {
            int forLoopLocal = 1;
            System.out.println(forLoopLocal);
        }
        return n;
    }
    public static int getVowels(String term) {
        int counter = 0; // Initialize counter variable
        
        for (int i = 0; i < term.length(); i++) {
            char letter = term.charAt(i);
    
            // Check if the character is a vowel
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                counter++; // Increment counter if the character is a vowel
            }
        }
    
        return counter; // Return the count of vowels
    }
}