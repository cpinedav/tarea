package laboratorio;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab {
	public static void main (String[] args){
		String patron = (hola|adios)([a-z0-9]+)|([+|-|*|/|<|>|%])|");
		String Texto = "32  + slñkdafjñ hola adios 25 2ds";
		Pattern p = Pattern.compile(patron);
		Matcher matcher = p.matcher(Texto);
		while(matcher.find())
		{
			String tokenTipo1 = matcher.group(1);
			if(tokenTipo1 != null)
			{
				System.out.println("palabra "+ tokenTipo1);
			}
			
			
			String tokenTipo2 = matcher.group(2);
			if(tokenTipo2 != null)
			{
				System.out.println("numero: "+ tokenTipo2);
			}
			
			
			String tokenTipo3 = matcher.group(3);
			if(tokenTipo3 != null)
			{
				System.out.println("operador: "+ tokenTipo3);
			}
			
			
			String tokenTipo4 = matcher.group(4);
			if(tokenTipo4 != null)
			{
				System.out.println("variable: "+ tokenTipo4);
			}
			
		}
		
	}

}