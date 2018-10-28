package com.akhil.singtel.questions;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BirdTest {

	public static final boolean DEBUG = false;
	private final static ByteArrayOutputStream sysout = new ByteArrayOutputStream();
	private final static ByteArrayOutputStream syserr = new ByteArrayOutputStream();
	private final static PrintStream sysoutOri = System.out;
	private final static PrintStream syserrOri = System.err;

	@Before
	public void setUpStreams() {
		if (!DEBUG) {
			System.setOut(new PrintStream(sysout));
			System.setErr(new PrintStream(syserr));
		}
	}

	@After
	public void restoreStreams() {
		if (!DEBUG) {
			System.setOut(sysoutOri);
			System.setErr(syserrOri);
		}
	}

	@Test
	public void testSing() {
		Bird b = new Bird("");
		b.sing();
		String expected = "Queek Queek Queek";
		String actual = sysout.toString();
		assertTrue(expected.equals(actual));

	}
}
