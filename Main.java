import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Select what formulae you wish to calculate on");
        System.out.println("pick from the few below");
        System.out.println("For Kinetic Energy, press 1");
        System.out.println("For Potential Energy, press 2");
        System.out.println("For Momentum, press 3");
        System.out.println("For Force, press 4");
        System.out.println("For Workdone, press 5");
        System.out.println("For Velocity, press 8");


        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        Energy calculator = new Energy();
        switch (choice) {
            case 1:
                System.out.println("Input Mass = ");
                double kmass = sc.nextDouble();
                System.out.println("Input Velocity = ");
                double kvelocity = sc.nextDouble();
                System.out.println(calculator.kineticEnergy(kmass,kvelocity));
                break;
            case 2:
                System.out.println("Input Mass = ");
                double pmass = sc.nextDouble();
                System.out.println("Gravity = 9.8 m/s");
                System.out.println("Input Height = ");
                double height = sc.nextDouble();
                System.out.println(calculator.potentialEnergy(pmass,height));
                break;
            case 3:
                System.out.println("Input Mass = ");
                double smass = sc.nextDouble();
                System.out.println("Input Velocity = ");
                double svelocity = sc.nextDouble();
                System.out.println(calculator.momentum(smass,svelocity));
                break;
            case 4:
                System.out.println("Input Mass = ");
                double lmass = sc.nextDouble();
                System.out.println("Input Acceleration =");
                double acceleration = sc.nextDouble();
                System.out.println(calculator.force(lmass,acceleration));
                break;
            case 5:
                System.out.println("Input Force = ");
                double force = sc.nextDouble();
                System.out.println("Input Distance = ");
                double distance = sc.nextDouble();
                System.out.println(calculator.workDone(force,distance));
                break;
            case 6:
                System.out.println("Input mass = ");
                double force = sc.nextDouble();
                System.out.println("Input volume = ");
                double distance = sc.nextDouble();
                System.out.println(calculator.density(mass,volume));
                break
            case 7:
                System.out.println("Input velocity = ");
                double force = sc.nextDouble();
                System.out.println("Input time = ");
                double distance = sc.nextDouble();
                System.out.println(calculator.Acceleration(velocity,time));
                break;
             case 8:
                System.out.println("Input displacement = ");
                double force = sc.nextDouble();
                System.out.println("Input time = ");
                double distance = sc.nextDouble();
                System.out.println(calculator.velocity(displacement,time));
                break;
             case 9:
                System.out.println("Input speed = ");
                double speed = sc.nextDouble();
                System.out.println("Input time = ");
                double time = sc.nextDouble();
                System.out.println(calculator.distance(speed,time));
                break;  
              case 10:
                System.out.println("Input quantity of charge = ");
                double quantity of charge = sc.nextDouble();
                System.out.println("Input voltage = ");
                double voltage = sc.nextDouble();
                System.out.println(calculator.capacitane(quantity of charge,voltage));
                break;     
        }

    }
}
