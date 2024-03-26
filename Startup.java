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
        
        Car car1 = new Car(Make.Toyota, Model.Highlander, 2001);
        // System.out.println(car1);
        car1.setHorsePower(14);
        car1.setCarStyle(CarStyle.SUV);
        car1.setPowerType(PowerType.UNLEADED);
        car1.drive(140);
        System.out.println("current mileage before driving: " + car1.mileage);
        car1.drive(20);
        System.out.println("current mileage after driving: " + car1.mileage);
        System.out.println(car1.year);

        Car car2 = new Car(Make.Jeep, Model.Wrangler, 2018);
        car2.setHorsePower(165);

        Car car3 = new Car(Make.Nissan, Model.Sentra, 2014);
        car3.drive(classLocal);
        car3.setHorsePower(195);
        System.out.println("Current mileage in kilometers: " + car3.ConvertMileageToKilometers());

        System.out.println(car1.getHorsePower());
        System.out.println(car2.getHorsePower());
        System.out.println(car3.getHorsePower());

        System.out.println("Number of cars on the road: " + Car.numberOfCars);

        // Call the method to demonstrate
        // harmonic(5);

        // Call the method to demonstrate
        // System.out.println("Number of vowels: " + getVowels("gautreaux"));
    }

    // Stub implementation for the harmonic method
    // public static double harmonic(int n){
    //     // Implement the method here
    // }

    // Stub implementation for the getVowels method
    // public static int getVowels(String term) {
    //     // Implement the method here
    // }
}
