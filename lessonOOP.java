import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class lessonOOP {
    public static void main(String[] args) {
//        stringsExample();
//        sbExample();
//        catsAndBowls();
        Fighter fighter1 = new Fighter("Sub-zero", 100,15);
        Fighter fighter2 = new Fighter("Scorpion", 80,20);

        while (fighter1.getHealth() > 0 && fighter2.getHealth() >0) {
            fighter1.hit(fighter2);
            if (fighter2.getHealth() <= 0 ) {
                System.out.println(fighter2 + "dead");
                break;
            }
            fighter2.hit(fighter1);
            if (fighter1.getHealth() <= 0 ) {
                System.out.println(fighter1 + "dead");
                break;


        }




    }


//    private static void catsAndBowls() {
//        Cat cat = new Cat("Barsik", 10 );
//        Cat cat1 = new Cat("Murzik", 10 );
//        Bowl bowl = new Bowl ();
//        bowl.putFood(40);
//        System.out.printf("There is %d food in bowl\n", bowl.getFoodAmount());
//        cat.eat(bowl);
//        System.out.printf("There is %d food in bowl\n", bowl.getFoodAmount());
//        cat1.eat(bowl);
//        System.out.printf("There is %d food in bowl\n", bowl.getFoodAmount());
//
//
//        cat.setFleas(new Flea[]{
//                new Flea(),
//                new Flea(),
//                new Flea(),
//                new Flea(),
//
//        });
//
//        System.out.println(cat);
//    }

//    private static void sbExample() {
//        String s1 = "Example";
//
//
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < 3000_000; i++) {
//            s1 += i;
//
//        }
//
//        long finish = System.currentTimeMillis() - startTime;
//        System.out.println(s1);
//        System.out.println("Time: " + finish);
//
//        StringBuilder sb =  new StringBuilder("Example");
//        startTime = System.currentTimeMillis();
//        for (int i = 0; i < 300_000; i++) {
//            sb.append(i);
//        }
//        finish = System.currentTimeMillis() - startTime;
//        System.out.println("Time with sb:" + finish);
//        System.out.println(s1.equals(sb.toString()));
//
//        StringBuffer stringBuffer = new StringBuffer();
//    }


//    private static void stringsExample() {
//        Scanner scanner = new Scanner(System.in);
//        String s1 = "Hello!";
//        String s2 = "Hello!";
//        String s3 = "Hel";
//        String s4 = "lo!";
//        String s5 = s3 + s4;
//        String s6 = new String( "Hello!");
//        String s7 = new String(new char[]  {'H', 'e', 'l', 'l', 'o','!'}).intern();
//        String s8 = new String(new byte[]{26, 25, 48, 56, 72});
//        String s9 = new String(s7);
//        String s10 = scanner.next();
//
////        System.out.println(s1 == s2);
////        System.out.println(s1 == s5);
////        System.out.println(s1 == s6);
////        System.out.println(s1 == s7);
////        System.out.println(s1 == s9);
////        System.out.println(s1 == s10);
//
//
//        System.out.println(s1.contains("Hello"));
//        System.out.println(s1.equals(s5));
//        System.out.println(s1.equals(s6));
//        System.out.println(s1.equals(s7));
//        System.out.println(s1.equals(s9));
//        System.out.println(s1.equals(s10));
//    }
}}

