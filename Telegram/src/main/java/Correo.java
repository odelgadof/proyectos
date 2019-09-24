import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Correo {
	Alumno alumno;
	public Correo (Alumno alumno) {
		this.alumno=alumno;
	}
	 public void enviarcorreo () {
		 
		 
		   
		 
		   final String Username = "forvin198@gmail.com";
		   final String PassWord = "O40728953";
		  
		   
		   
		    Properties props = new Properties();
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.port", "465");//587
	        
	     
	        
	        Session session = Session.getInstance(props,
	                new javax.mail.Authenticator() {
	                    protected PasswordAuthentication getPasswordAuthentication() {
	                        return new PasswordAuthentication(Username, PassWord);
	                    }
	                });

	        try {
	        	
	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress("forvin198@gmail.com"));
	            message.setRecipients(Message.RecipientType.TO,
	            		InternetAddress.parse("forvin198@gmail.com")); //este solo para prueba 
	                  //  InternetAddress.parse(alumno.getCorreo()));
	            message.setSubject("aqui te mando los datos");
	            
	            StringBuilder info= new StringBuilder(); 
	 		   info.append(alumno.getNombre());
	 		   info.append(alumno.getCarnet());
	 		   info.append(alumno.getMedia());
	 		   info.append(alumno.getMediana());
	 		   info.append(alumno.getModa());
	 		   info.append(alumno.getDesviacion());
	 		   info.append(alumno.getRango());
	            message.setText(info.toString());

	            Transport.send(message);
	        

	        } catch (MessagingException e) {
	            throw new RuntimeException(e);
	        }
	    }
}
