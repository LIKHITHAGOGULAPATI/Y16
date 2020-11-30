public class ThrowsAndThrowDemo {
    public static void main(String[] args) throws InterruptedException {
        try {
               System.out.println("First Statement");
               if (true) {
                   Thread.sleep(1000);
                   throw new java.io.IOException();
               }
               System.out.println("Another Statement");
        } 
        catch (java.io.IOException e) {
            e.printStackTrace();
        } 
        finally {
            System.out.println("In Finally Block");
        }
    }
}
