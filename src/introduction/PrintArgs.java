public class PrintArgs {
    /**
     *$java -cp PrintArgs.jar PrintArgs "A B C"
     * 0:A B C
     *
     * $java -cp PrintArgs.jar PrintArgs 'A, B, C'
     * 0:A, B, C
     *
     * $java -cp PrintArgs.jar PrintArgs 'A''B''C'
     * 0:ABC
     *
     * $java -cp PrintArgs.jar PrintArgs 'A','B','C'
     * 0:A,B,C
     *
     * $java -cp PrintArgs.jar PrintArgs "A","B","C"
     * 0:A,B,C
     *
     * $java -cp PrintArgs.jar PrintArgs A, B, C
     * 0:A,
     * 1:B,
     * 2:C
     *
     *
     * @param args
     */
    public static void main(String... args) {
        if(args != null && args.length > 0) {
            for(int i=0; i<args.length; i++) {
                System.out.println(i + ":" + args[i]);
            }
        }
    }
}
