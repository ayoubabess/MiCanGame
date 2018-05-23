
public class Depart_un_can_un_miss extends Operation{
	

	public Etat Action(Etat e) {
		
		 Etat_Miss_Can courant=(Etat_Miss_Can) e;
		  System.out.println(" 1 CAN 1 Miss -----> \n");
		   if ((courant.getNb_can_g()>=1)&&(courant.getNb_miss_g()>=1)&&(courant.getBateau()==BATEAU.gauche)&&((courant.getNb_can_g()-1==courant.getNb_miss_g()-1)||(courant.getNb_miss_g()-1==0)))
		   { return new  Etat_Miss_Can(courant.getNb_can_g()-1,courant.getNb_miss_g()-1,BATEAU.droite);
		   
		   }
		   else

		   return null;
	}

}
