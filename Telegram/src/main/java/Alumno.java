import java.util.ArrayList;

public class Alumno {
	 private int id;
	    private String nombre,carnet,correo, idTelegram;
	    private double media, desviacion, mediana, moda, rango;

		private ArrayList <Double> notas;
	    
	    public Alumno(){
	        notas = new ArrayList();
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	     public String getCarnet() {
	        return carnet;
	    }

	    public void setCarnet(String carnet) {
	        this.carnet = carnet;
	    }

	     public String getCorreo() {
	        return correo;
	    }

	    public void setCorreo(String correo) {
	        this.correo = correo;
	    }

	    public String getIdTelegram() {
	        return idTelegram;
	    }

	    public void setIdTelegram(String idTelegram) {
	        this.idTelegram = idTelegram;
	    }
	    
	    public ArrayList<Double> getNotas() {
	        return notas;
	    }

	    public void setNotas(ArrayList<Double> notas) {
	        this.notas = notas;
	    }

		public double getMedia() {
			return media;
		}

		public void setMedia(double media) {
			this.media = media;
		}

		public double getDesviacion() {
			return desviacion;
		}

		public void setDesviacion(double desviacion) {
			this.desviacion = desviacion;
		}

		public double getMediana() {
			return mediana;
		}

		public void setMediana(double mediana) {
			this.mediana = mediana;
		}

		public double getModa() {
			return moda;
		}

		public void setModa(double moda) {
			this.moda = moda;
		}

		public double getRango() {
			return rango;
		}

		public void setRango(double rango) {
			this.rango = rango;
		}
	    
	    
	}
