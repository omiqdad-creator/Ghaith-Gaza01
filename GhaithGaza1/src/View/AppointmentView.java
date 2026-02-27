package view;

import model.Appointment;

public class AppointmentView {

    // ميثود لعرض معلومات الموعد
    public void displayAppointmentInfo(Appointment appointment) {
        System.out.println("Appointment ID: " + appointment.getId());
        System.out.println("Patient: " + appointment.getPatientName());
        System.out.println("Service: " + appointment.getServiceName());
        System.out.println("Status: " + appointment.getStatus());
    }

    // ميثود لعرض الإشعارات
    public void showNotification(String message) {
        System.out.println("Notification: " + message);
    }
}