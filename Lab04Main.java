public class Lab04Main {
    public static void main(String[] args) {
        Lecturer lec = new Lecturer("De Silva", "L01", "IT", 4, 50000);

        lec.displayLecturerDetails();
        System.out.println("Monthly Payment: " + lec.calculateMonthlyPayment());
    }
}
