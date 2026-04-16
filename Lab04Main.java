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

public class Lab04Main {
    public static void main(String[] args) {
        StaffMember.showSystemName();

        Lecturer l1 = new Lecturer("Ram", "L04", "IT", 2, 40000);
        Lecturer l2 = new Lecturer("Bala", "L08", "CS", 3, 45000);
        LabAssistant lab = new LabAssistant("Danial", "A02", "IT", 100, 500);

        System.out.println("Total Staff: " + StaffMember.getStaffCount());
    }
}

