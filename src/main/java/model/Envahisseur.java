package model;

public class Envahisseur extends Sprite {

	boolean SeDeplaceVersDroite;
	
	public Envahisseur(Dimension dimension, Position positionOrigine, int vitesse) {
		super(dimension, positionOrigine, vitesse);
		
		this.SeDeplaceVersDroite = true;
	}
	
	public boolean doitSeDeplacerVersLaDroite() {
		return this.SeDeplaceVersDroite;
	}

	public void changerDirection() {
		this.SeDeplaceVersDroite = !this.SeDeplaceVersDroite;
	}
	
}
