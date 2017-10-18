package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameAdvancedTest {
	private static AthleticGame game;

	@BeforeClass
	public static void inizialize() {
		game = new AthleticGame("calcio");
	}

	@Before
	public void startTest() {
		game.start();
	}

	@After
	public void resetTest() {
		game.reset();
	}

	@Test
	public void getWinnerType1Test() {
		game.addArrival("ciccio", Instant.now().plusMillis(1000));
		game.addArrival("ale", Instant.now().plusMillis(1000));
		game.addArrival("marco", Instant.now().plusMillis(1000));
		Assert.assertEquals("marco", game.getWinner());
		System.out.println(game.getWinner());
	}

	@Test
	public void getWinnerType2Test() {
		game.addArrival("ciccio", Instant.now().plusMillis(1000));
		game.addArrival("ale", Instant.now().plusMillis(1000));
		game.addArrival("marco", Instant.now().plusMillis(1000));
		game.addArrival("kekko", Instant.now().plusMillis(500));
		Assert.assertEquals("kekko", game.getWinner());
	}

}
