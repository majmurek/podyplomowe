public class MarsApplication {

    public static void main(String[] args) {

        MarsRobot spirit = new MarsRobot();
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;
        spirit.showAttributes();

        System.out.println("zwiększenie prędkości do 6.");
        spirit.speed = 6;
        spirit.showAttributes();

        System.out.println("zmiana temp na -80");
        spirit.temperature = -80;
        spirit.showAttributes();

        System.out.println("sprawdzenenie temperatury");
        spirit.checkTemperature();
        spirit.showAttributes();

        System.out.println("--------------------");

        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "eksploracja";
        opportunity.speed = 3;
        opportunity.temperature = -50;
        opportunity.showAttributes();

        System.out.println("sprawdzenenie samego statusu.");
        opportunity.checkStatus();


    }



    }
/*
class A {}
interface I {
void checkStatus();

 */