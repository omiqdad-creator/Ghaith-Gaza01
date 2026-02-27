package ghaithgaza1;
import model.Appointment;
import view.AppointmentView;
import controller.AppointmentController;

public class GhaithGaza1 {

    public static void main(String[] args) {

        Appointment myAppointment = new Appointment(101, "Ahmad", "Ultrasound");
        
        AppointmentView myView = new AppointmentView();

        AppointmentController controller =
                new AppointmentController(myAppointment, myView);

        controller.registerAppointment();
        controller.updateAppointmentStatus("Completed");
        controller.trackAppointment();
    }
}