import java.util.LinkedList;

public class Hospital
{
	private DataBase db;

	private DataBase getDatabaseSupportInstance()
	{
		if(db==null)
			db=new DataBase();
		return db;
	}

<<<<<<< HEAD
	public boolean addPatient(String patient_id, String patient_name) throws ObjectNotFoundException
	{
		return getDatabaseSupportInstance().getPatient(patient_id).addPatient(patient_name);
	}
	public boolean addDoctor(String doctor_id, String doctor_name) throws ObjectNotFoundException
	{
		return getDatabaseSupportInstance().getDoctor(doctor_id).addDoctor(doctor_name);
	}

	public boolean givePrescription(int app_id, String pre)
	{
		Appointment app = null;
		try{
			app = getDatabaseSupportInstance().getAppointment(app_id);
		}
		catch(Exception e)
		{
			return false;
		}
		app.setprescription(pre);
		return true;
	}

	public LinkedList<Appointment> checkSchedule(String doctor_name)
	{
		LinkedList<Appointment> schedule = null;
		try{
			schedule = getDatabaseSupportInstance().checkSchedule(doctor_name);
		}
		catch(Exception e)
		{
			return null;
		}
		return schedule;
	}

	public boolean makeAppointment(String name, String day, int hours, int minutes, String doctorName) {
		Appointment ap = getDatabaseSupportInstance().getPatient(name).makeAppointment(day, hours, minutes, doctorName);
		return getDatabaseSupportInstance().addAppointment(ap);
	}

=======
	public boolean givePrescription(int app_id, String pre)
	{
		Appointment app = null;
		try{
			app = getDatabaseSupportInstance().getAppointment(app_id);
		}
		catch(Exception e)
		{
			return false;
		}
		app.setprescription(pre);
		return true;
	}

	public LinkedList<Appointment> checkSchedule(String doctor_name)
	{
		LinkedList<Appointment> schedule = null;
		try{
			schedule = getDatabaseSupportInstance().checkSchedule(doctor_name);
		}
		catch(Exception e)
		{
			return null;
		}
		return schedule;
	}

	public boolean makeAppointment(String name, String day, int hours, int minutes, String doctorName) {
		Appointment ap = getDatabaseSupportInstance().getPatient(name).makeAppointment(day, hours, minutes, doctorName);
		return getDatabaseSupportInstance().addAppointment(ap);
	}

>>>>>>> 1253e007b7a56a6474a8ac03b420c370068ca55a
	public String getPrescription(String patient_name) {
		String prescription = "";
		try {
			prescription = getDatabaseSupportInstance().getPrescription(patient_name);
		}
		catch(Exception e) {
			return null;
		}
		return prescription;
	}
}
