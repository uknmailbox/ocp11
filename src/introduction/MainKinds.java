/**
 * MainKinds class includes all the acceptable main method declaration
 */
class MainKinds {
    /**
     * Standard main
     *
     * @param args
     */
    /*public static void main(String args[]) {
        System.out.println("Standard main method");
    }*/

    /**
     * This main method declaration will execute
     * @param args
     */
    /*public static void main(String... args) {
        System.out.println("Variable arguments - main method");
    }*/

    /**
     * This main method declaration will execute
     * @param args
     */
    /*public static void main(String...args) {
        System.out.println("Variable arguments with no spaces between variable operator (...) and the identifier - main method");
    }*/

    /**
     * This main method declaration will execute
     * @param args
     */
    /*public static void main(String []args) {
        System.out.println("With no spaces between square brackets and the identifier- main method");
    }*/

    /**
     *
     * @param args
     */
    public static void main(final String []args) {
        System.out.println("final identifier - main method");
    }

    /**
     * This main method declaration will execute
     */
    /*public static void main(String[] args) throws Exception {
        System.out.println("A main method throwing Exception");
    }*/

    /**
     * Another static main with no arguments- Non Executable
     */
    public static void main() {
        System.out.println("Another static main with no arguments");
    }

    /**
     * Another static main with single argument - Non Executable
     *
     * @param args
     */
    public static void main(String args) {
        System.out.println("static main with single argument");
    }
}