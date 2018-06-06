package model;

public class Collision {
	
	
	
	private Sprite sprite1;
	private Sprite sprite2;
	
	public Collision(Sprite Sprite1, Sprite Sprite2) {
		this.sprite1 = Sprite1;
		this.sprite2 = Sprite2;
	}

	public boolean detecterCollision(SpaceInvaders spaceInvaders) {
		return deuxiemeSpriteTouchePremierSprite();
	}

	private boolean deuxiemeSpriteTouchePremierSprite() {
		return coinSuperieurGaucheDeuxiemeSpriteTouchePremierSprite() || coinInferieurGaucheDeuxiemeSpriteTouchePremierSprite() || coinInferieurDroitDeuxiemeSpriteTouchePremierSprite() || coinSuperieurDroitDeuxiemeSpriteTouchePremierSprite();
	}

	private boolean coinSuperieurDroitDeuxiemeSpriteTouchePremierSprite() {
		return abscisseLaPlusADroiteTouche() && ordonneeLaPlusHauteTouche();
	}

	private boolean coinInferieurDroitDeuxiemeSpriteTouchePremierSprite() {
		return abscisseLaPlusADroiteTouche() && ordonneeLaPlusBasseTouche();
	}

	private boolean coinInferieurGaucheDeuxiemeSpriteTouchePremierSprite() {
		return abscisseLaPlusAGaucheTouche() && ordonneeLaPlusBasseTouche();
	}

	private boolean coinSuperieurGaucheDeuxiemeSpriteTouchePremierSprite() {
		return abscisseLaPlusAGaucheTouche() && ordonneeLaPlusHauteTouche();
	}

	private boolean ordonneeLaPlusBasseTouche() {
		return sprite2.ordonneeLaPlusBasse() <= sprite1.ordonneeLaPlusBasse()
				&& sprite2.ordonneeLaPlusBasse() >= sprite1.ordonneeLaPlusHaute();
	}

	private boolean abscisseLaPlusAGaucheTouche() {
		return sprite2.abscisseLaPlusAGauche() >= sprite1.abscisseLaPlusAGauche()
				&& sprite2.abscisseLaPlusAGauche() <= sprite1.abscisseLaPlusADroite();
	}

	private boolean abscisseLaPlusADroiteTouche() {
		return sprite2.abscisseLaPlusADroite() >= sprite1.abscisseLaPlusAGauche()
				&& sprite2.abscisseLaPlusADroite() <= sprite1.abscisseLaPlusADroite();
	}

	private boolean ordonneeLaPlusHauteTouche() {
		return sprite2.ordonneeLaPlusHaute() <= sprite1.ordonneeLaPlusBasse()
				&& sprite2.ordonneeLaPlusHaute() >= sprite1.ordonneeLaPlusHaute();
	}

	
	
	
}
