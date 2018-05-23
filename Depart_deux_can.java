
public class Depart_deux_can extends Operation {

	
	public Etat Action(Etat e) {
		
		 Etat_Miss_Can courant=(Etat_Miss_Can) e;
		  System.out.println(" 2 CAN -----> \n");
		   if ((courant.getNb_can_g()>=2)&&(courant.getBateau()==BATEAU.gauche)&&((courant.getNb_can_g()-2==courant.getNb_miss_g())||(courant.getNb_miss_g()==0)||(courant.getNb_miss_g()==3)))
		   { return new  Etat_Miss_Can(courant.getNb_can_g()-2,courant.getNb_miss_g(),BATEAU.droite);
		   
		   }
		   else

		   return null;
	}


}
