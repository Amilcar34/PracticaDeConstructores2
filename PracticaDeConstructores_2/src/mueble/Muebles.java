package mueble;

public class Muebles {
	
	String alto;
	double ancho;
	double largo;
	int cantPuertas;
	int cantCajones;
	boolean espejo;
	String mateManija;
	
	public Muebles (){
		
		alto = "2";
		ancho = 2.5;
		largo = 1.5;
		cantPuertas =4;
		cantCajones = 6;
		espejo = true;
		mateManija = "bronce";
	}
	
	public void alto_usuario(String alto_u)
		{this.alto = alto_u;}
	public String alto_para_usuario() 
		{return alto;}

	public void ancho_usuario(double ancho_u)
	{this.ancho = ancho_u;}
	public String ancho_para_usuario()
	{return "el armario tiene un ancho de " + ancho;}
 }
