package com.sadesh.singtel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class SoultionA1TestBird {
	String flyMessage = "I am flying";

	@Test
	public void testFly() {
		Bird bird = new Bird();

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		bird.fly();
		assertEquals(flyMessage, outContent.toString().trim());
	}

}
