public class Challenge {
    public static void main(String[] args) {
        //1
        byte one = 10;

        //2
        short Vnumber = 20;

        int Var = 50;

        //also long combo = 50000L + 10L * (long) (one + Vnumber + Var); works as well
        //but it isn't needed as it auto converts to long
        long combo = 50000L + 10L * (one + Vnumber + Var);
        short shortTotal = (short) (1000 + 10*(one + Vnumber + Var));
        System.out.println(combo);
        System.out.println(shortTotal);

    }
 }
