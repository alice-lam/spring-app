package springapp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import springapp.command.ClientCommand;
import springapp.domain.Appointment;
import springapp.service.AppointmentService;
import springapp.service.ClientService;

/**
 * This controller handles all client related pages
 *
 * Notice the @PreAuthorize annotations on the methods
 */

@Controller
@RequestMapping("/appointments") //notice that this path is set at the class level.
public class AppointmentController {
	
	
	@Autowired
	AppointmentService appointmentService;
	
    private Logger logger = LoggerFactory.getLogger(AppointmentController.class);
   
    @GetMapping
    public String appointments() {
      return "appointments/appointments";
    }
    
    @PreAuthorize("hasAuthority('LIST_CLIENTS')")
	//@GetMapping
	public String listAppointments(Model model) {
    	logger.info("Inside Appointment Controller listAppointments");
    	List<Appointment> appointments = appointmentService.getAppointments();
    	model.addAttribute("appointments", appointments);
    	return "appointments/listAppointments";
   }


}