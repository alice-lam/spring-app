package springapp.service;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springapp.dao.AppointmentDao;
import springapp.domain.Appointment;

@Service
public class AppointmentService {
	
	@Autowired
	AppointmentDao appointmentDao;
	
	public List<Appointment> getAppointments(){
		return appointmentDao.list();
		
	}
}
