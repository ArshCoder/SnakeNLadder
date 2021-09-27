package SnakeNLadder;

public class UC4WinnigPoint {
	public static void main(String[] args) {
		int playStartposition = 0;
		while (playStartposition < 100) {
			;
			int diceRoll = (int) (Math.floor(Math.random() * 19) % 6 + 1);
			System.out.println("Dice Rolled You Get : " + diceRoll);
			int option = (int) Math.floor(Math.floor(Math.random() * 16) % 3);
			System.out.println("Dice Rolled You Get : " + diceRoll);
			if (option == 0) {
				playStartposition = diceRoll;
				System.out.println("no play " + playStartposition);
			} 
			else if (option == 1) {
				playStartposition = diceRoll;
				System.out.println("Ladder " + playStartposition);
			} 
			else if (option == 2) {
				int temp = playStartposition = diceRoll;
				System.out.println("pso " + playStartposition);
				if (temp > 6)
					;
				{
					playStartposition = temp;
					System.out.println("Snake" + playStartposition);

				}

			}
		}

	}
}
