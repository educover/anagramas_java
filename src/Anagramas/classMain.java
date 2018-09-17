package Anagramas;

import java.io.*;
import java.util.*;

public class classMain {

		// TODO Auto-generated method stub
		public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
	        String cadena;
	        FileReader f = new FileReader(archivo);
	        BufferedReader b = new BufferedReader(f);
	        ArrayList<String> miLista = new ArrayList<String>();
	        while((cadena = b.readLine())!=null) {
	        	miLista.add(cadena.toLowerCase().trim());
	        }
	        CompruebaAnagramas miAnagrama = new CompruebaAnagramas();
	        for(int i=0; i<miLista.size(); i++){
	        	for(int c = i+1; c<miLista.size()-1; c++){
	        		if((miAnagrama.esAnagrama(miLista.get(i), miLista.get(c)))==true){
	        			System.out.println("Anagrama encontrado-> "+miLista.get(i) +" - "+ miLista.get(c));
	        			break;
	        		}
	        	}
	        }
	        b.close();
	    }

	    public static void main(String[] args) throws IOException {
	        muestraContenido("C:/Users/edu/Desktop/wordlist.txt");
	    }
}

class CompruebaAnagramas{
	public boolean esAnagrama(String word1, String word2){
		boolean x = false;
		if(word1.length()!=word2.length()){
			return x;
		} else {
			 word1=word1.toLowerCase(); 
			 word2=word2.toLowerCase(); 
		     char[] c1 = word1.toCharArray(); 
		     char[] c2 = word2.toCharArray(); 
		     Arrays.sort(c1); 
		     Arrays.sort(c2); 
		     String sc1 = new String(c1); 
		     String sc2 = new String(c2); 
		     return sc1.equals(sc2); 
		}
	}
}
