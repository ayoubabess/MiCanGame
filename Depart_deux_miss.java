

public class Depart_deux_miss extends Operation{
	

	public Etat Action(Etat e) {
		
		 Etat_Miss_Can courant=(Etat_Miss_Can) e;
		  System.out.println(" 2 Miss -----> \n");
		   if ((courant.getNb_miss_g()>=2)&&(courant.getBateau()==BATEAU.gauche)&&((courant.getNb_can_g()==courant.getNb_miss_g()-2)||(courant.getNb_miss_g()-2==0)))
		   { return new  Etat_Miss_Can(courant.getNb_can_g(),courant.getNb_miss_g()-2,BATEAU.droite);
		   
		   }
		   else

		   return null;
	}
	

}
