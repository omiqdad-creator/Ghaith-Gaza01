package model;

public class Appointment {

    // تعريف الخصائص (Attributes)
    private int id;
  private String patientName;
    private String serviceName;
    private String status;

    public Appointment(int id, String name, String service) {
        this.id = id;
        this.patientName = name;
        this.serviceName = service;
        this.status = "Booked";
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }
    
    public String getStatus() { return status; }
    public int getId() { return id; }
    public String getPatientName() { return patientName; }
    public String getServiceName() { return serviceName; }
}