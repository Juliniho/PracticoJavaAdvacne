package clase1;

public class Test0 {

	 //literales
	 double a; // default initialization(en metodos no!!) ==0.0
	 float b=0.3f; // !=0.3
	 int [] c={1,2,1};
	 //es inmutable
	 String d="juan"; 


	 //metodos
	 public String mostrarString(){
	  return d.concat(" Cardenas");
	 }


	 //Referencias
	 public void cambiaValor(double c){
	  this.a = c;
	 }

}
