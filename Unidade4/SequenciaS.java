package Unidade4;

public class SequenciaS {

	public static void main(String[] args) {
		
		double s,s9=0,s10=0,s100=0,s10000=0;
		s = 1;
		for(int i =2; i<=10000; i++)
		{ //Inicio
			s = s + 3;
			if (i == 9)
				s9 = s;
			if (i == 10)
				s10 = s;
			if (i == 100)
				s100 = s;
			if (i == 10000)
				s10000 = s;
				
			
		} //Fim
		System.out.println("s9="+s9);
		System.out.println("s10="+s10);
		System.out.println("s100="+s100);
		System.out.println("s10000="+s10000);
	}

}
