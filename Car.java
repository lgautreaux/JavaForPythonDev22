enum PowerType {
    ELECTRIC, UNLEADED, DIESEL
}

enum CarStyle {SEDAN, COUPE, TRUCK, SUV}

enum Make { Toyota, Jeep, Nissan}
enum Model { Highlander, Wrangler, Sentra}

public class Car {
    private int horsePower = 180;
    private PowerType powerType;
    private CarStyle carStyle;
    double mileage;
    static int numberOfCars;
    final int year; 

    public double ConvertMileageToKilometers(){
        return this.mileage * 1.609;

    }


    public Car(Make carMake, Model carModel, int year) {
        numberOfCars++;
        this.year = year;
    }

    // this is a public getter/accessor
    public int getHorsePower() {
        return horsePower;
    }


    // this is a public setter/mutator
    public void setHorsePower(int HP) {
        // Google told us HP is typically 180-200
        if (HP < 180)
            horsePower = 180;
        else if (HP > 200)
            horsePower = 200;
        else horsePower = HP;
    }

    // this is a public getter/accessor
    public PowerType getPowerType() {
        return powerType;
    }
    
    // this is a public setter/mutator
    public void setPowerType(PowerType powerType) {
        this.powerType = powerType;
    }
    
    // this is a public getter/accessor
    public CarStyle getCarStyle() {
        return carStyle;
    }
    
    // this is a public setter/mutator
    public void setCarStyle(CarStyle carStyle) {
        this.carStyle = carStyle;
    }
    public void drive(double distance) {
        mileage += distance;
    }
    

    public void Honk () {
        System.out.println("Honk");
    }
}