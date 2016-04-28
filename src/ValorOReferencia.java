
public class ValorOReferencia {

		
		public static void modificar(Object original){
		    Object modificado = new Object();
		    System.out.println(modificado.hashCode());
		    original = modificado;
		}
		public static void main(String[] args){
		    Object o = new Object();
		    System.out.println(o.hashCode());
		    modificar(o);
		    System.out.println(o.hashCode());
		}
	
}
