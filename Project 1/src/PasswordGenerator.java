import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        Random Generate = new Random();

        int x = 0;

        int Letters = 26;

        char Letter;

        String Symbols = "!@#$%&?./";

        while(x < 4){
            int Index = Generate.nextInt(2);

            if(Index == 0){
                Letter = (char) ('A'+ Generate.nextInt(Letters));
            }else{
                Letter = (char) ('a'+ Generate.nextInt(Letters));
            }

            int RandomSymbolIndex = Generate.nextInt(Symbols.length());

            char Symbol = Symbols.charAt(RandomSymbolIndex);

            int Num = Generate.nextInt(10);

            System.out.print(Letter);
            System.out.print(Num);
            System.out.print(Symbol);

            x++;
        }


    }

}
