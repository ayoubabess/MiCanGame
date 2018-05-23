
public class Etat_Miss_Can extends Etat{
	private int nb_can_g;
	private int nb_miss_g;
	private BATEAU bateau;
	

	public Etat_Miss_Can(int nb_can, int nb_miss, BATEAU b) {
		nb_can_g=nb_can;
		nb_miss_g=nb_miss;
		bateau=b;
	}

	public boolean test_but() {
		
		return  ((nb_can_g==0)&&(nb_miss_g==0)&&(bateau==BATEAU.droite));
	}

	public void afficher()
	{System.out.println(""+nb_can_g+"CAN |é~~é~~é~~~é|"+(3-nb_can_g)+"");
	System.out.println(""+nb_miss_g+"CAN |é~~é~~é~~~é|"+(3-nb_miss_g)+"");
	if (bateau==BATEAU.gauche)
		System.out.println("bateau |é~~é~~é~~~é|");	
	else
		System.out.println("          |é~~é~~é~~~é|bateau");
	}
	public int getNb_can_g() {
		return nb_can_g;
	}


	public void setNb_can_g(int nb_can_g) {
		this.nb_can_g = nb_can_g;
	}


	public int getNb_miss_g() {
		return nb_miss_g;
	}


	public void setNb_miss_g(int nb_miss_g) {
		this.nb_miss_g = nb_miss_g;
	}


	public BATEAU getBateau() {
		return bateau;
	}


	public void setBateau(BATEAU bateau) {
		this.bateau = bateau;
	}
	

}
