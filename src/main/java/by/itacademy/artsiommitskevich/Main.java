package by.itacademy.artsiommitskevich;

public class Main {
    public static void main(String[] args) {
        int c = 1;

        while (c <= 100) {
            if(c % 9 == 0 && c % 4 == 0) {
                System.out.println("fournine");
            }else{
                if(c % 4 == 0){
                    System.out.println("four");
                }else if(c % 9 == 0){
                    System.out.println("nine");
                }else {
                    System.out.println(c);
                }
            }
            c++;
        }

    }
}
