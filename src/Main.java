import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //Aldaketak GitHub-en
        Scanner sc = new Scanner(System.in);

        int elmBat = -1;

        while(elmBat != 0) {

            System.out.print("""

                    Aukeratu eragiketa bat, sartu 0 programa amaitzeko:

                    1. Batuketa \t2. Kenketa

                    3. Biderketa\t4. Zatiketa
                    
                    5. Errokarratua \t6. Faktoriala

                    """);

            elmBat = sc.nextInt();



            if (elmBat >= 1 && elmBat <= 6) {



                System.out.print("Sartu lehenengo zenbakia: ");

                float elmBi = sc.nextFloat();



                System.out.print("Sartu bigarren zenbakia: ");

                float elmHiru = sc.nextFloat();



                switch (elmBat) {

                    case 1:

                        System.out.println("Eragiketaren emaitza " + gehiketa(elmBi,elmHiru) + " da.");

                        break;

                    case 2:

                        System.out.println("Eragiketaren emaitza " + kenketa(elmBi,elmHiru) + " da.");

                        break;

                    case 3:

                        System.out.println("Eragiketaren emaitza " + biderketa(elmBi, elmHiru) + " da.");

                        break;

                    case 4:

                        if (elmHiru == 0) {

                            System.out.println("Ezin da zati 0 egin.");

                        } else {

                            System.out.println("Eragiketaren emaitza " + zatiketa(elmBi, elmHiru) + " da.");

                        }

                        break;
                    case 5:
                        errokarratua();
                        break;
                    default:
                        faktoriala();
                        break;

                }



            } else if(elmBat != 0) {

                System.out.println("ERROR: sartu 0 eta 6 zenbakien arteko balio bat sartu beahr da.");

            }

        }



        System.out.println("Programa amaitu da.");

        sc.close();

    }



    public static float gehiketa(float n1, float n2) {

        return(n1+n2);

    }

    public static float kenketa(float n1, float n2) {

        return(n1-n2);

    }

    public static float biderketa(float n1, float n2) {

        return(n1*n2);

    }

    public static float zatiketa(float n1, float n2) {

        return(n1/n2);

    }
    public static void errokarratua() {

    }
    public static void faktoriala() {

    }

}/*Kalkulagailua*/
