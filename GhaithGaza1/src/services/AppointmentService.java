package services;

import model.Appointment;

public class AppointmentService {

    public void registerAppointment() {
        System.out.println("Processing appointment registration...");
    }

    public void updateAppointmentStatus(Appointment appointment, String newStatus) {
        appointment.updateStatus(newStatus);
        System.out.println("Updating appointment status...");
    }
}
