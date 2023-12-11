import com.sun.jdi.event.StepEvent;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 9, 100, 18, 100, "yellow", "pika-pika");
        ElectricPokemon tapukoko = new ElectricPokemon("Tapu Koko", 4, 100, 6, 25, "orange", "bzzzzz-bzzz");
        WaterPokemon sharpedo = new WaterPokemon("Sharpedo", 20, 100, 33, 250, "tidal wave", "aaaarrggghh..swoooshh");
        FirePokemon blaziken = new FirePokemon("Blaziken", 24, 100, 42, 325, "red", "Toasty!");
        GroundPokemon steelix = new GroundPokemon("Steelix", 12, 100, 35, 300, "rocky", "Rumble in the tunnel!");
        DragonPokemon roaringmoon = new DragonPokemon("Roaring Moon", 3000, 100, 75, 1200, "white", "*Dark trumpet sound roaring trough the sky*", false);

        System.out.println("I feel something is coming..");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Let's kick this plastic funny looking " + blaziken.getFireColor() + "-" + roaringmoon.getlightColor() + " ball just laying there..");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("*KICK*");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The ball begins to shake..");
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("and..");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("FLASH!!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("CHOOSE YOUR POKEMON :");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("1. Pikachu - " + pikachu.getType());
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2. Tapu Koko - " + tapukoko.getType());
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("3. Sharpedo - " + sharpedo.getType());
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("4. Blaziken - " + blaziken.getType());
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("5. Steelix - " + steelix.getType());

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();


        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (userInput.equals("1")) {
            System.out.println("You selected Pikachu !");
            System.out.println(" ");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Level = " + pikachu.getLevel());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Power = " + pikachu.getPower());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Health = " + pikachu.getHp());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Shield = " + pikachu.getShield());
            System.out.println(" ");
        }
        if (userInput.equals("2")) {
            System.out.println("You selected Tapu Koko !");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Level = " + tapukoko.getLevel());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Power = " + tapukoko.getPower());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Health = " + tapukoko.getHp());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Shield = " + tapukoko.getShield());
            System.out.println(" ");
        }
        if (userInput.equals("3")) {
            System.out.println("You selected Sharpedo !");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Level = " + sharpedo.getLevel());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Power = " + sharpedo.getPower());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Health = " + sharpedo.getHp());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Shield = " + sharpedo.getShield());
            System.out.println(" ");
        }
        if (userInput.equals("4")) {
            System.out.println("You selected Blaziken !");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Level = " + blaziken.getLevel());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Power = " + blaziken.getPower());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Health = " + blaziken.getHp());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Shield = " + blaziken.getShield());
            System.out.println(" ");
        }
        if (userInput.equals("5")) {
            System.out.println("You selected Steelix !");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Level = " + steelix.getLevel());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Power = " + steelix.getPower());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Health = " + steelix.getHp());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Shield = " + steelix.getShield());
            System.out.println(" ");
        } else {
            new InputMismatchException("Please select a Pokemon 1-5..");
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Suddenly a wild " + steelix.getName() + " appeared!");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(steelix.getName() + " growls : WHAT ARE YOU DOING HERE?");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I AM A LVL" + steelix.getLevel() + " UNDERBOSS.");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("GO AWAY");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" ");
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Choose your next move :");
        System.out.println(" ");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1. Attack");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2. Let it slide");

        scanner.nextLine();

        if (userInput.equals("1")) {
            System.out.println("You attacked " + steelix.getName() + ".");
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("AAAAARGGG!!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(steelix.getName() + " lost HP!");
            }
            if (userInput.equals("2")) {
                System.out.println("Relax " + steelix.getName() + "i am not even here");
            } else {
                new InputMismatchException("game over");
            }
            scanner.close();
        }


    }
}