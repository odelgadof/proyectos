import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class BotTelegram  extends TelegramLongPollingBot {

	Correo correo;
    public void onUpdateReceived(Update update) {
        String message = update.getMessage().getText();
        String respuesta = "no te entiendo";
        String [] ID = message.split("#");//    #0905-18-1748
        
        /*
         * ingrese su carnet (ej. #1234-56-7891)
         * */
        
        if (ID[1].equals("0905-18-1748")) {
            Alumno alumno = new Respuesta().datosAlumno(ID[1]);
            StringBuilder info = new StringBuilder(); 
            
           info.append(( alumno.getNombre()));
           info.append("\n");
           info.append("su carnet:  ");
 		   info.append(alumno.getCarnet());
 		   info.append("\n");
 		   info.append("su corrreo:  ");
 		   info.append(alumno.getCorreo()); 	
 		   info.append("\n");
 		   info.append("la media es:  ");
 		   info.append(alumno.getMedia());
 		   info.append("\n");
		   info.append("la mediana es:  ");
 		   info.append(alumno.getMediana());
 		   info.append("\n");
		   info.append("la moda es:  ");
 		   info.append(alumno.getModa());
 		   info.append("\n");
		   info.append("la desviacion es:  ");
 		   info.append(alumno.getDesviacion());
 		   info.append("\n");
		   info.append("el rango es:  ");
 		   info.append(alumno.getRango());
            respuesta = info.toString();
            System.out.print("prueba6");
 		   
            correo= new Correo (alumno);
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (ID[1].equals("0905-18-1749")) {
            Alumno alumno = new Respuesta().datosAlumno(ID[1]);
            StringBuilder info = new StringBuilder(); 
            info.append(( alumno.getNombre()));
            info.append("\n");
            info.append("su carnet:  ");
  		   info.append(alumno.getCarnet());
  		   info.append("\n");
  		   info.append("su corrreo:  ");
  		   info.append(alumno.getCorreo()); 	
  		   info.append("\n");
  		   info.append("la media es:  ");
  		   info.append(alumno.getMedia());
  		   info.append("\n");
 		   info.append("la mediana es:  ");
  		   info.append(alumno.getMediana());
  		   info.append("\n");
 		   info.append("la moda es:  ");
  		   info.append(alumno.getModa());
  		   info.append("\n");
 		   info.append("la desviacion es:  ");
  		   info.append(alumno.getDesviacion());
  		   info.append("\n");
 		   info.append("el rango es:  ");
  		   info.append(alumno.getRango());
  		 respuesta = info.toString();
            correo= new Correo (alumno);
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (ID[1].equals("0905-18-1750")) {
            Alumno alumno = new Respuesta().datosAlumno(ID[1]);
            StringBuilder info = new StringBuilder(); 
            info.append(( alumno.getNombre()));
            info.append("\n");
            info.append("su carnet:  ");
  		   info.append(alumno.getCarnet());
  		   info.append("\n");
  		   info.append("su corrreo:  ");
  		   info.append(alumno.getCorreo()); 	
  		   info.append("\n");
  		   info.append("la media es:  ");
  		   info.append(alumno.getMedia());
  		   info.append("\n");
 		   info.append("la mediana es:  ");
  		   info.append(alumno.getMediana());
  		   info.append("\n");
 		   info.append("la moda es:  ");
  		   info.append(alumno.getModa());
  		   info.append("\n");
 		   info.append("la desviacion es:  ");
  		   info.append(alumno.getDesviacion());
  		   info.append("\n");
 		   info.append("el rango es:  ");
  		   info.append(alumno.getRango());
             respuesta = info.toString();
            correo= new Correo (alumno);
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (ID[1].equals("0905-18-1751")) {
            Alumno alumno = new Respuesta().datosAlumno(ID[1]);
            StringBuilder info = new StringBuilder(); 
            info.append(( alumno.getNombre()));
            info.append("\n");
            info.append("su carnet:  ");
  		   info.append(alumno.getCarnet());
  		   info.append("\n");
  		   info.append("su corrreo:  ");
  		   info.append(alumno.getCorreo()); 	
  		   info.append("\n");
  		   info.append("la media es:  ");
  		   info.append(alumno.getMedia());
  		   info.append("\n");
 		   info.append("la mediana es:  ");
  		   info.append(alumno.getMediana());
  		   info.append("\n");
 		   info.append("la moda es:  ");
  		   info.append(alumno.getModa());
  		   info.append("\n");
 		   info.append("la desviacion es:  ");
  		   info.append(alumno.getDesviacion());
  		   info.append("\n");
 		   info.append("el rango es:  ");
  		   info.append(alumno.getRango());
             respuesta = info.toString();
            correo= new Correo (alumno);
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (ID[1].equals("0905-18-1752")) {
            Alumno alumno = new Respuesta().datosAlumno(ID[1]);
            StringBuilder info = new StringBuilder(); 
            info.append(( alumno.getNombre()));
            info.append("\n");
            info.append("su carnet:  ");
  		   info.append(alumno.getCarnet());
  		   info.append("\n");
  		   info.append("su corrreo:  ");
  		   info.append(alumno.getCorreo()); 	
  		   info.append("\n");
  		   info.append("la media es:  ");
  		   info.append(alumno.getMedia());
  		   info.append("\n");
 		   info.append("la mediana es:  ");
  		   info.append(alumno.getMediana());
  		   info.append("\n");
 		   info.append("la moda es:  ");
  		   info.append(alumno.getModa());
  		   info.append("\n");
 		   info.append("la desviacion es:  ");
  		   info.append(alumno.getDesviacion());
  		   info.append("\n");
 		   info.append("el rango es:  ");
  		   info.append(alumno.getRango());
             respuesta = info.toString();
            correo= new Correo (alumno);
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (ID[1].equals("0905-18-1753")) {
            Alumno alumno = new Respuesta().datosAlumno(ID[1]);
            StringBuilder info = new StringBuilder(); 
            info.append(( alumno.getNombre()));
            info.append("\n");
            info.append("su carnet:  ");
  		   info.append(alumno.getCarnet());
  		   info.append("\n");
  		   info.append("su corrreo:  ");
  		   info.append(alumno.getCorreo()); 	
  		   info.append("\n");
  		   info.append("la media es:  ");
  		   info.append(alumno.getMedia());
  		   info.append("\n");
 		   info.append("la mediana es:  ");
  		   info.append(alumno.getMediana());
  		   info.append("\n");
 		   info.append("la moda es:  ");
  		   info.append(alumno.getModa());
  		   info.append("\n");
 		   info.append("la desviacion es:  ");
  		   info.append(alumno.getDesviacion());
  		   info.append("\n");
 		   info.append("el rango es:  ");
  		   info.append(alumno.getRango());
             respuesta = info.toString();
            correo= new Correo (alumno);
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (ID[1].equals("0905-18-1754")) {
            Alumno alumno = new Respuesta().datosAlumno(ID[1]);
            StringBuilder info = new StringBuilder();
            info.append(( alumno.getNombre()));
            info.append("\n");
            info.append("su carnet:  ");
  		   info.append(alumno.getCarnet());
  		   info.append("\n");
  		   info.append("su corrreo:  ");
  		   info.append(alumno.getCorreo()); 	
  		   info.append("\n");
  		   info.append("la media es:  ");
  		   info.append(alumno.getMedia());
  		   info.append("\n");
 		   info.append("la mediana es:  ");
  		   info.append(alumno.getMediana());
  		   info.append("\n");
 		   info.append("la moda es:  ");
  		   info.append(alumno.getModa());
  		   info.append("\n");
 		   info.append("la desviacion es:  ");
  		   info.append(alumno.getDesviacion());
  		   info.append("\n");
 		   info.append("el rango es:  ");
  		   info.append(alumno.getRango());
             respuesta = info.toString();
            correo= new Correo (alumno);
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (ID[1].equals("0905-18-1755")) {
            Alumno alumno = new Respuesta().datosAlumno(ID[1]);
            StringBuilder info = new StringBuilder(); 
            info.append(( alumno.getNombre()));
            info.append("\n");
            info.append("su carnet:  ");
  		   info.append(alumno.getCarnet());
  		   info.append("\n");
  		   info.append("su corrreo:  ");
  		   info.append(alumno.getCorreo()); 	
  		   info.append("\n");
  		   info.append("la media es:  ");
  		   info.append(alumno.getMedia());
  		   info.append("\n");
 		   info.append("la mediana es:  ");
  		   info.append(alumno.getMediana());
  		   info.append("\n");
 		   info.append("la moda es:  ");
  		   info.append(alumno.getModa());
  		   info.append("\n");
 		   info.append("la desviacion es:  ");
  		   info.append(alumno.getDesviacion());
  		   info.append("\n");
 		   info.append("el rango es:  ");
  		   info.append(alumno.getRango());
             respuesta = info.toString();
            correo= new Correo (alumno);
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (ID[1].equals("0905-18-1756")) {
            Alumno alumno = new Respuesta().datosAlumno(ID[1]);
            StringBuilder info = new StringBuilder(); 
            info.append(( alumno.getNombre()));
            info.append("\n");
            info.append("su carnet:  ");
  		   info.append(alumno.getCarnet());
  		   info.append("\n");
  		   info.append("su corrreo:  ");
  		   info.append(alumno.getCorreo()); 	
  		   info.append("\n");
  		   info.append("la media es:  ");
  		   info.append(alumno.getMedia());
  		   info.append("\n");
 		   info.append("la mediana es:  ");
  		   info.append(alumno.getMediana());
  		   info.append("\n");
 		   info.append("la moda es:  ");
  		   info.append(alumno.getModa());
  		   info.append("\n");
 		   info.append("la desviacion es:  ");
  		   info.append(alumno.getDesviacion());
  		   info.append("\n");
 		   info.append("el rango es:  ");
  		   info.append(alumno.getRango());
             respuesta = info.toString();
            correo= new Correo (alumno);
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (ID[1].equals("0905-18-1757")) {
            Alumno alumno = new Respuesta().datosAlumno(ID[1]);
            StringBuilder info = new StringBuilder(); 
            info.append(( alumno.getNombre()));
            info.append("\n");
            info.append("su carnet:  ");
  		   info.append(alumno.getCarnet());
  		   info.append("\n");
  		   info.append("su corrreo:  ");
  		   info.append(alumno.getCorreo()); 	
  		   info.append("\n");
  		   info.append("la media es:  ");
  		   info.append(alumno.getMedia());
  		   info.append("\n");
 		   info.append("la mediana es:  ");
  		   info.append(alumno.getMediana());
  		   info.append("\n");
 		   info.append("la moda es:  ");
  		   info.append(alumno.getModa());
  		   info.append("\n");
 		   info.append("la desviacion es:  ");
  		   info.append(alumno.getDesviacion());
  		   info.append("\n");
 		   info.append("el rango es:  ");
  		   info.append(alumno.getRango());
             respuesta = info.toString();
            correo= new Correo (alumno);
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (ID[1].equals("0905-18-1758")) {
        	Alumno alumno = new Respuesta().datosAlumno(ID[1]);
        	   StringBuilder info = new StringBuilder(); 
               info.append(( alumno.getNombre()));
               info.append("\n");
               info.append("su carnet:  ");
     		   info.append(alumno.getCarnet());
     		   info.append("\n");
     		   info.append("su corrreo:  ");
     		   info.append(alumno.getCorreo()); 	
     		   info.append("\n");
     		   info.append("la media es:  ");
     		   info.append(alumno.getMedia());
     		   info.append("\n");
    		   info.append("la mediana es:  ");
     		   info.append(alumno.getMediana());
     		   info.append("\n");
    		   info.append("la moda es:  ");
     		   info.append(alumno.getModa());
     		   info.append("\n");
    		   info.append("la desviacion es:  ");
     		   info.append(alumno.getDesviacion());
     		   info.append("\n");
    		   info.append("el rango es:  ");
     		   info.append(alumno.getRango());
             respuesta = info.toString();
            correo= new Correo (alumno);
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (ID[1].equals("0905-18-1759")) {
            Alumno alumno = new Respuesta().datosAlumno(ID[1]);
            StringBuilder info = new StringBuilder(); 
            info.append(( alumno.getNombre()));
            info.append("\n");
            info.append("su carnet:  ");
  		   info.append(alumno.getCarnet());
  		   info.append("\n");
  		   info.append("su corrreo:  ");
  		   info.append(alumno.getCorreo()); 	
  		   info.append("\n");
  		   info.append("la media es:  ");
  		   info.append(alumno.getMedia());
  		   info.append("\n");
 		   info.append("la mediana es:  ");
  		   info.append(alumno.getMediana());
  		   info.append("\n");
 		   info.append("la moda es:  ");
  		   info.append(alumno.getModa());
  		   info.append("\n");
 		   info.append("la desviacion es:  ");
  		   info.append(alumno.getDesviacion());
  		   info.append("\n");
 		   info.append("el rango es:  ");
  		   info.append(alumno.getRango());
             respuesta = info.toString();
            correo= new Correo (alumno);
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (ID[1].equals("0905-18-1760")) {
            Alumno alumno = new Respuesta().datosAlumno(ID[1]);
            StringBuilder info = new StringBuilder(); 
            info.append(( alumno.getNombre()));
            info.append("\n");
            info.append("su carnet:  ");
  		   info.append(alumno.getCarnet());
  		   info.append("\n");
  		   info.append("su corrreo:  ");
  		   info.append(alumno.getCorreo()); 	
  		   info.append("\n");
  		   info.append("la media es:  ");
  		   info.append(alumno.getMedia());
  		   info.append("\n");
 		   info.append("la mediana es:  ");
  		   info.append(alumno.getMediana());
  		   info.append("\n");
 		   info.append("la moda es:  ");
  		   info.append(alumno.getModa());
  		   info.append("\n");
 		   info.append("la desviacion es:  ");
  		   info.append(alumno.getDesviacion());
  		   info.append("\n");
 		   info.append("el rango es:  ");
  		   info.append(alumno.getRango());
             respuesta = info.toString();
            correo= new Correo (alumno);
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (ID[1].equals("0905-18-1761")) {
            Alumno alumno = new Respuesta().datosAlumno(ID[1]);
            StringBuilder info = new StringBuilder(); 
            info.append(( alumno.getNombre()));
            info.append("\n");
            info.append("su carnet:  ");
  		   info.append(alumno.getCarnet());
  		   info.append("\n");
  		   info.append("su corrreo:  ");
  		   info.append(alumno.getCorreo()); 	
  		   info.append("\n");
  		   info.append("la media es:  ");
  		   info.append(alumno.getMedia());
  		   info.append("\n");
 		   info.append("la mediana es:  ");
  		   info.append(alumno.getMediana());
  		   info.append("\n");
 		   info.append("la moda es:  ");
  		   info.append(alumno.getModa());
  		   info.append("\n");
 		   info.append("la desviacion es:  ");
  		   info.append(alumno.getDesviacion());
  		   info.append("\n");
 		   info.append("el rango es:  ");
  		   info.append(alumno.getRango());
             respuesta = info.toString();
            correo= new Correo (alumno);
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (ID[1].equals("0905-18-1762")) {
            Alumno alumno = new Respuesta().datosAlumno(ID[1]);
            StringBuilder info = new StringBuilder(); 
            info.append(( alumno.getNombre()));
            info.append("\n");
            info.append("su carnet:  ");
  		   info.append(alumno.getCarnet());
  		   info.append("\n");
  		   info.append("su corrreo:  ");
  		   info.append(alumno.getCorreo()); 	
  		   info.append("\n");
  		   info.append("la media es:  ");
  		   info.append(alumno.getMedia());
  		   info.append("\n");
 		   info.append("la mediana es:  ");
  		   info.append(alumno.getMediana());
  		   info.append("\n");
 		   info.append("la moda es:  ");
  		   info.append(alumno.getModa());
  		   info.append("\n");
 		   info.append("la desviacion es:  ");
  		   info.append(alumno.getDesviacion());
  		   info.append("\n");
 		   info.append("el rango es:  ");
  		   info.append(alumno.getRango());
             respuesta = info.toString();
            correo= new Correo (alumno);
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (ID[1].equals("0905-18-1763")) {
            Alumno alumno = new Respuesta().datosAlumno(ID[1]);
            StringBuilder info = new StringBuilder(); 
            info.append(( alumno.getNombre()));
            info.append("\n");
            info.append("su carnet:  ");
  		   info.append(alumno.getCarnet());
  		   info.append("\n");
  		   info.append("su corrreo:  ");
  		   info.append(alumno.getCorreo()); 	
  		   info.append("\n");
  		   info.append("la media es:  ");
  		   info.append(alumno.getMedia());
  		   info.append("\n");
 		   info.append("la mediana es:  ");
  		   info.append(alumno.getMediana());
  		   info.append("\n");
 		   info.append("la moda es:  ");
  		   info.append(alumno.getModa());
  		   info.append("\n");
 		   info.append("la desviacion es:  ");
  		   info.append(alumno.getDesviacion());
  		   info.append("\n");
 		   info.append("el rango es:  ");
  		   info.append(alumno.getRango());
             respuesta = info.toString();
            correo= new Correo (alumno);
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (ID[1].equals("0905-18-1764")) {
            Alumno alumno = new Respuesta().datosAlumno(ID[1]);
            StringBuilder info = new StringBuilder(); 
            info.append(( alumno.getNombre()));
            info.append("\n");
            info.append("su carnet:  ");
  		   info.append(alumno.getCarnet());
  		   info.append("\n");
  		   info.append("su corrreo:  ");
  		   info.append(alumno.getCorreo()); 	
  		   info.append("\n");
  		   info.append("la media es:  ");
  		   info.append(alumno.getMedia());
  		   info.append("\n");
 		   info.append("la mediana es:  ");
  		   info.append(alumno.getMediana());
  		   info.append("\n");
 		   info.append("la moda es:  ");
  		   info.append(alumno.getModa());
  		   info.append("\n");
 		   info.append("la desviacion es:  ");
  		   info.append(alumno.getDesviacion());
  		   info.append("\n");
 		   info.append("el rango es:  ");
  		   info.append(alumno.getRango());
             respuesta = info.toString();
            correo= new Correo (alumno);
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (ID[1].equals("0905-18-1765")) {
            Alumno alumno = new Respuesta().datosAlumno(ID[1]);
            StringBuilder info = new StringBuilder(); 
            info.append(( alumno.getNombre()));
            info.append("\n");
            info.append("su carnet:  ");
  		   info.append(alumno.getCarnet());
  		   info.append("\n");
  		   info.append("su corrreo:  ");
  		   info.append(alumno.getCorreo()); 	
  		   info.append("\n");
  		   info.append("la media es:  ");
  		   info.append(alumno.getMedia());
  		   info.append("\n");
 		   info.append("la mediana es:  ");
  		   info.append(alumno.getMediana());
  		   info.append("\n");
 		   info.append("la moda es:  ");
  		   info.append(alumno.getModa());
  		   info.append("\n");
 		   info.append("la desviacion es:  ");
  		   info.append(alumno.getDesviacion());
  		   info.append("\n");
 		   info.append("el rango es:  ");
  		   info.append(alumno.getRango());
             respuesta = info.toString();
            correo= new Correo (alumno);
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (ID[1].equals("Hola")) {
            respuesta = "Hola como estas?";
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (message.equals("Bien y tu")) {
            respuesta = "Me alegro, muy bien gracias a Dios";
            sendMsg(update.getMessage().getChatId().toString(), respuesta);

        } else if (message.equals("A que bueno me podes hacer un favor")) {
            respuesta = "si claro contame";
            sendMsg(update.getMessage().getChatId().toString(), respuesta);
           
           
            {
            sendMsg(update.getMessage().getChatId().toString(),respuesta);
            }
      
        }
    }
    
    

    public synchronized void sendMsg(String chatId, String s) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText(s);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            System.out.print(e.toString());

        }
    }

    public String getBotUsername() {
        return "ORVIN_BOT";
    }

    public String getBotToken() {
        return "719623027:AAF7urZqEssu9DkTfTNuI3TqI4sunDccl0o";
    }
}
