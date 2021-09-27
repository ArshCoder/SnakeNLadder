package SnakeNLadder;

public class UC3OptionGenerated {
	private static final int no_play = 0 ;
	private static final int ladder = 6;
	private static final int Snake = 3;

	public static void main(String args[]) {
		int min = 1;
		int max = 6;

		int int_random = (int) Math.floor(Math.random() * (max - min + 1) + min);
		System.out.println("Dice Rolled You Get : " + int_random);
		switch (int_random) {
		case no_play:
			System.out.println("You Have No Play Try Next Time");
			break;
		case ladder:
			System.out.println("You Got A Ladder");
			break;
		case Snake:
			System.out.println("You Are Bitten By Snake");
			break;

		}

	}
}
