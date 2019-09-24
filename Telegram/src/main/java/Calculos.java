import java.util.Scanner;
public class Calculos {
	
	public Calculos() {
		
	}
	
	 public int[] llenarArreglo(int elementos) {
	        int i;
	        int[] arreglo;
	        arreglo = new int[elementos];
	        
	        Scanner sc = new Scanner(System.in);

	        for (i = 0; i < elementos; i++) {
	            System.out.print(" [ " + i + " ] = ");
	            arreglo [i] = sc.nextInt();
	        }

	        return arreglo;
	    }

	    public double promedio(double[] arreglo) {
	        double prom = 0.0;
	        for (int i = 0; i < arreglo.length; i++) {
	            prom += arreglo[i];
	        }

	        return prom / (double) arreglo.length;
	    }

	    public double desviacion(double[] arreglo) {
	        double prom, sum = 0;
	        int i, n = arreglo.length;
	        prom = promedio(arreglo);

	        for (i = 0; i < n; i++) {
	            sum += Math.pow(arreglo[i] - prom, 2);
	        }

	        return Math.sqrt(sum / (double) n);
	    }

	    // 0 - Menor a Mayor, 1 - Mayor a menor
	    public double[] burbuja(double[] arreglo, int ord) {
	        int i, j, n = arreglo.length;
	        double aux = 0;

	        for (i = 0; i < n - 1; i++) {
	            for (j = i + 1; j < n; j++) {
	                if (ord == 0) {
	                    if (arreglo[i] > arreglo[j]) {
	                        aux = arreglo[j];
	                        arreglo[j] = arreglo[i];
	                        arreglo[i] = aux;
	                    } else if (ord == 1) {
	                        if (arreglo[i] < arreglo[j]) {
	                            aux = arreglo[i];
	                            arreglo[i] = arreglo[j];
	                            arreglo[j] = aux;
	                        }
	                    }
	                }
	            }
	        }

	        return arreglo;
	    }

	    public double mediana(double [] arreglo) {
	        
	        int pos = 0, n = arreglo.length;
	        double temp = 0, temp0 = 0;
	       
	        // ordenar de menor a mayor
	        arreglo = burbuja(arreglo, 0);

	        temp = n / 2;
	        if (n % 2 == 0) {
	            pos = (int) temp;
	            temp0 = (double) (arreglo[pos] / arreglo[pos + 1]);
	        }
	        if (n % 2 == 1) {
	            pos = (int) (temp + 0.5);
	            temp0 = (double) (arreglo[pos]);
	        }

	        return temp0;
	    }

	    public  double rango(double [] arreglo) {
	        // ordenar de mayor a menor
	        
	        arreglo = burbuja(arreglo, 1);

	        return arreglo[arreglo.length - 1] - arreglo[0];
	    }

	    public double moda(double[] arreglo) {
	        int i, j, moda = 0, n = arreglo.length, frec;
	        int frecTemp, frecModa = 0;
	        double moda1 = -1;
	        
	        // ordenar de menor a mayor
	        arreglo = burbuja(arreglo, 0);

	        for (i = 0; i < n; i++) {
	            frecTemp = 1;
	            for (j = i + 1; j < n; j++) {
	                if (arreglo[i] == arreglo[j]) {
	                    frecTemp++;
	                }
	            }
	            if (frecTemp > frecModa) {
	                frecModa = frecTemp;
	                moda1 = arreglo[i];
	            }
	        }
	        return moda1;
	    }

	    public static void reportaVector(int[] arreglo) {
	        for (int i = 0; i < arreglo.length; i++) {
	            System.out.print(arreglo[i] + " ");
	        }
	        System.out.println("");
	    }  
	}