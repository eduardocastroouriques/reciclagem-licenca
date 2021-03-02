package br.com.realizecfi.reciclagem;

import org.junit.Test;

public class ReciclagemApplicationTest {

	@Test
	public void assertConfig() {
		new ReciclagemApplication().main(new String[] { "--spring.profiles.active=test" });
	}
}
