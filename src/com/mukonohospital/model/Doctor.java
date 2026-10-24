public class Doctor extends MedicalStaff {
    private String specialization;

    public Doctor(String employeeId, String department, int workingHours, String specialization) {
        super(employeeId, department, workingHours);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void performDuties() {
        System.out.println("Doctor with ID " + getEmployeeId() + " specializing in " + specialization + " is examining patients and prescribing treatments in the " + getDepartment() + " department.");
    }
}