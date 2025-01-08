package com.bookmark.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info =  @Info(
        contact = @Contact(
            name = "Abhinav LV",
            email = "venkatabhinavlv@gmail.com"
        ),
        description = "This is a simple bookmark application",
        title = "Bookmark Application using spring boot",
        version = "1.0"
    ),
    servers = {
        @Server(
            url = "http://localhost:8081",
            description = "Local server for testing dev changes"
        )
    }
)
public class SwaggerConfig {

}
