package com.contoso.samples.echo.service;

import org.springframework.stereotype.Service;

@Service
public class EchoService {
    public String echo(String message)
    {
        return message;
    }
}
