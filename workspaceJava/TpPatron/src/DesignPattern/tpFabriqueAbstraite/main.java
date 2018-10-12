package DesignPattern.tpFabriqueAbstraite;

import DesignPattern.tpFabriqueAbstraite.main.GameMaker.GentilType;
import DesignPattern.tpFabriqueAbstraite.main.GameMaker.MechantType;

public class main {
	public static class GameMaker implements GameFactory{
		public enum GentilType{
			BATMAN,SUPERMAN
		}
		public enum MechantType {
			JOKER,CRYPTONMAN
		}
		
		public static GameFactory makeGame(GentilType gType) {
			switch(gType) {
				case BATMAN:
					return new GameMaker().createGame(new GentilFactory().createBatman(),new MechantFactory().createJoker());
				case SUPERMAN:
					return new GameMaker().createGame(new GentilFactory().createSuperman(),new MechantFactory().createCryptonMan());
				default:
					throw new IllegalArgumentException("Gentil type not supported");
			}
		}
		
		public static GameFactory makeGame(MechantType mType) {
			switch(mType) {
				case JOKER:
					return new GameMaker().createGame(new GentilFactory().createBatman(),new MechantFactory().createJoker());
				case CRYPTONMAN:
					return new GameMaker().createGame(new GentilFactory().createSuperman(),new MechantFactory().createCryptonMan());
				default:
					throw new IllegalArgumentException("Mechant type not supported");
			}
		}

		@Override
		public GameMaker createGame(Gentil g, Mechant m) {
			g.seBattre(m);
			return this;
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameFactory game = new GameMaker().makeGame(GentilType.BATMAN);
		GameFactory game2 = new GameMaker().makeGame(MechantType.CRYPTONMAN);
	}

}
