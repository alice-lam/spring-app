package springapp.domain;

public class Appointment {
	private final int id;
	private final int ClientID;
	private final int PetID;
	private final String Date;
	private final String Time;
	private final String VisitReason;
	
	public Appointment (int id, int clientid, int petid, String date, String time, String visitreason) {
		this.id = id;
		this.ClientID = clientid;
		this.PetID = petid;
		this.Date = date;
		this.Time = time;
		this.VisitReason = visitreason;
	}

	public int getId() {
		return id;
	}

	public int getClientID() {
		return ClientID;
	}

	public int getPetID() {
		return PetID;
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
	
	
	
	
}
