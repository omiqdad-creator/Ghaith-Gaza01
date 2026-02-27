package controller;

import model.Appointment;
import view.AppointmentView;

import services.AppointmentService;
import services.NotificationService;

public class AppointmentController {
    private Appointment appointment;
    private AppointmentView view;
    private AppointmentService appointmentService;
    private NotificationService notificationService;
    public AppointmentController(Appointment appointment, AppointmentView view) {
        this.appointment = appointment;
        this.view = view;

        this.appointmentService = new AppointmentService();
        this.notificationService = new NotificationService();
    }

    public void registerAppointment() {
        appointmentService.registerAppointment();
        notificationService.sendNotification("Appointment registered successfully");
        view.displayAppointmentInfo(appointment);
    }

    public void updateAppointmentStatus(String status) {
        appointmentService.updateAppointmentStatus(appointment, status);
        notificationService.sendNotification("Status updated to: " + status);
        view.displayAppointmentInfo(appointment);
    }

    public void trackAppointment() {
        view.displayAppointmentInfo(appointment);
    }
}