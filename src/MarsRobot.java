public class MarsRobot implements Robot {
    String status;
    int speed;
    float temperature;


   public void checkTemperature() {
        if (temperature < -80) {
            status = "powrót do domu" ;
            speed = 5;
        }
    }

    void showAttributes() {
        System.out.println("status: " + status);
        System.out.println("szybkość: " + speed);
        System.out.println("temperatura: " + temperature);


        }

    @Override
    public void checkStatus() {
        System.out.println("status jest: " + status);
    }
}

