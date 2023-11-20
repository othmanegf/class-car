package car;

class Carmain {
    public static void main(String[] args) {
        CAR myCar = new CAR();
        myCar.name = "mercedes";
        myCar.color = "black";
        myCar.speed = 350;
        myCar.enginePower = 300;

        myCar.start();
        myCar.changeGear();
        myCar.changeGear();
        myCar.stop();
    }
}
