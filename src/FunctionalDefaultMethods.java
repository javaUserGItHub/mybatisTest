public  interface FunctionalDefaultMethods {
    void method();

    default void defaultMethod() {
        System.out.println("interface");
    }

}
