package com.contoso.samples.echo;

import org.junit.Test;
import static org.junit.Assert.*;

import com.contoso.samples.echo.service.EchoService;

public class EchoServiceTests {
	@Test
	public void whenValidMessage_thenReturnTheMessage() {
		EchoService echoService = new EchoService();
		String message = "Hello World";
		assertEquals(message, echoService.echo(message));
	}
}
