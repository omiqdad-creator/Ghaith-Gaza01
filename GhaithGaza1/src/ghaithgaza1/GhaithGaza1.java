package ghaithgaza1;
import model.Appointment;
import view.AppointmentView;
import controller.AppointmentController;

public class GhaithGaza1 {

    public static void main(String[] args) {
       // test for documentation
        Appointment myAppointment = new Appointment(101, "Ahmad", "Ultrasound");
        Appointment myAppointment2 = new Appointment(102, "ola", "Ultrasound");
        Appointment myAppointment3 = new Appointment(102, "ola", "Ultrasound");
        
        AppointmentView myView = new AppointmentView();

        AppointmentController controller =
                new AppointmentController(myAppointment, myView);

        controller.registerAppointment();
        controller.updateAppointmentStatus("Completed");
        controller.trackAppointment();
    }
}