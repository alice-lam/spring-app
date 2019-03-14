package springapp.command;

import springapp.domain.Appointment;

public class AppointmentCommand {
	private Integer id;
	private Integer clientID;
	private Integer petID;
	private String Date;
	private String Time;
	private String VisitReason;
	
	public AppointmentCommand(Appointment appointment){
		if(appointment != null) {
			this.id = appointment.getId();
			this.clientID = appointment.getClientID();
			this.petID = appointment.getPetID();
			this.Date = appointment.getDate();
			this.Time = appointment.getTime();
			this.VisitReason = appointment.getVisitReason();
		}
	}

	public Integer getId() {
		return id;
	}

	public Integer getclientID() {
		return clientID;
	}

	public Integer getpetID() {
		return petID;
	}

	public String getDate() {
		return Date;
	}

	public String getTime() {
		return Time;
	}

	public String getVisitReason() {
		return VisitReason;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setclientID(Integer clientID) {
		this.clientID = clientID;
	}

	public void setpetID(Integer petID) {
		this.petID = petID;
	}

	public void setDate(String date) {
		this.Date = date;
	}

	public void setTime(String time) {
		this.Time = time;
	}

	public void setVisitReason(String visitReason) {
		this.VisitReason = visitReason;
	}
}
