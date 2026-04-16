public class Lab04Main {
    public static void main(String[] args) {
        Lecturer lec = new Lecturer("De Silva", "L01", "IT", 4, 50000);

        lec.displayLecturerDetails();
        System.out.println("Monthly Payment: " + lec.calculateMonthlyPayment());
    }
}

public class Lab04Main {
    public static void main(String[] args) {
        Lecturer lec = new Lecturer("De Silva", "L01", "IT", 4, 50000);
        LabAssistant lab = new LabAssistant("Ravikumar", "A01", "IT", 120, 500);

        lec.displayLecturerDetails();
        lab.displayLabAssistantDetails();
    }
}

