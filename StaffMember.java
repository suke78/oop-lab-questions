
abstract class StaffMember {
    private String fullName;
    private final String staffId;
    protected String department;

    // Constructor
    public StaffMember(String fullName, String staffId, String department) {
        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;
    }

    // Getters
    public String getFullName() {
        return fullName;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getDepartment() {
        return department;
    }

    // Final method
    public final void displayBasicDetails() {
        System.out.println("Name: " + fullName);
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }

    // Abstract method
    public abstract double calculateMonthlyPayment();
}

/*
Reason:
StaffMember is abstract because it is a general design and should not be instantiated directly.
Only child classes like Lecturer and LabAssistant should create objects.
*/



abstract class StaffMember {
    private String fullName;
    private final String staffId;
    protected String department;


private static int staffCount = 0;

public StaffMember(String fullName, String staffId, String department) {
    this.fullName = fullName;
    this.staffId = staffId;
    this.department = department;
    staffCount++; // increase count
}

public static void showSystemName() {
    System.out.println("Campus Staff Payment System");
}

public static int getStaffCount() {
    return staffCount;
    }
}

/*
Reason:
staffCount is static because it is shared among all objects.
*/
