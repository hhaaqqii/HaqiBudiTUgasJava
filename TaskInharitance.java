class Car {
}

class MPV extends Car {
}

class SUV extends Car {
}

public class Hyundai extends MPV {
    
    public static void main(String args[]) {
        Car c = new Car();
        MPV m = new MPV();
        Hyundai h = new Hyundai();
        
        System.out.println(m instanceof Car);
        System.out.println(h instanceof MPV);
        System.out.println(h instanceof Car);
    }
}
