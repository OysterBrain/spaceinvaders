package model;

import fr.unilim.iut.spaceinvaders.utils.MissileException;

public class Vaisseau extends Sprite {



	public Vaisseau(Dimension dimension, Position positionOrigine, int vitesse) {
		super(dimension, positionOrigine, vitesse);
	}

	public Missile tirerUnMissile(Dimension dimensionMissile, int vitesseMissile) {
		if (dimensionMissile.longueur > this.longueur())
			throw new MissileException("La longueur du missile est supérieure à celle du vaisseau");
		
		Position positionOrigineMissile = calculerLaPositionDeTirDuMissile(dimensionMissile);
		return new Missile(dimensionMissile, positionOrigineMissile, vitesseMissile);
	}

	private Position calculerLaPositionDeTirDuMissile(Dimension dimensionMissile) {
		int absVaisseau = this.abscisseLaPlusAGauche() + (this.longueur() / 2);
		int abscisseOriMissile = absVaisseau - (dimensionMissile.longueur() / 2);

		int ordonneeeOrigineMissile = this.ordonneeLaPlusHaute() - 1;
		Position oriMissile = new Position(abscisseOriMissile, ordonneeeOrigineMissile);
		return oriMissile;
}

	
	
}
