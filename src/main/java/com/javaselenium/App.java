package com.javaselenium;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");
        // Google testGoogle = new Google();

        // testGoogle.testGoogleSearch();

        SGLogin sg = new SGLogin();

    sg.testLogin();
    }
}
