package Java8;

import java.util.Random;

//This is a random player class with two functionalities playGames and playMusic
class RandomPlayer {

	public void playGame(String gameName) throws InterruptedException {

		System.out.println(gameName + " game started");
		Thread.sleep(500);
		System.out.println(gameName + " game ended");
	}

	public void playMusic(String trackName) throws InterruptedException {

		System.out.println(trackName + " track started");
		Thread.sleep(500);
		System.out.println(trackName + " track ended");
	}
}

public class lamndaThread {

	// games and tracks arrays which are being used for
	// picking random items
	 static String[] games = { "COD", "Prince Of Persia", "GTA-V5", "Valorant", "FIFA 22", "Fortnite" };
	static String[] tracks = { "Believer", "Cradles", "Taki Taki", "Sorry", "Let Me Love You" };

	public static void main(String[] args) {

		RandomPlayer player = new RandomPlayer();

		// Random class for choosing random items from above
		// arrays
		Random random = new Random();

		Runnable gameRunner = () -> {

			try {

				player.playGame(games[random.nextInt(games.length)]); // Choosing game track for playing
			} catch (InterruptedException e) {

				e.getMessage();
			}
		};

		Runnable musicPlayer = () -> {

			try {

				player.playMusic(tracks[random.nextInt(tracks.length)]);
			} catch (InterruptedException e) {

				e.getMessage();
			}
		};

		// Instantiating two thread classes with runnable references
		Thread game = new Thread(gameRunner);
		Thread music = new Thread(musicPlayer);

		// Starting two different threads
		game.start();
		music.start();

		/*
		 * Note: As we are dealing with threads output may differ every single time we
		 * run the program
		 */
	}
}
