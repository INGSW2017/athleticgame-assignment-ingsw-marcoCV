package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {
	
	private static AthleticGame game;

	@BeforeClass
	public static void inizialize() {
		game = new AthleticGame("calcio");
		System.out.println("Prima di tutto");
	}

	@Test
	public void addArrivalTest() {
		game.addArrival("ciccio", Instant.now());
		Assert.assertEquals(1, game.getArrivals().size());
	}

	@Test(expected = IllegalArgumentException.class)
	public void getPartecipanteTimeTest() {
		game.getParecipiantTime("pasticcio");
	}

}
