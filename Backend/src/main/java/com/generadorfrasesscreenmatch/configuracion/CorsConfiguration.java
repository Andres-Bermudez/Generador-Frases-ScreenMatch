package com.generadorfrasesscreenmatch.configuracion;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        // El asterisco doble "/**" es una expresión que indica que esta
        // configuración se aplica a todas las rutas en la aplicación:
        registry.addMapping("/**")

                // Esta línea especifica que solo se permite el origen http://127.0.0.1:5500
                // para realizar solicitudes a la aplicación. Esto significa que solo las
                // solicitudes procedentes de esta dirección IP y puerto serán permitidas
                // por la configuración CORS:
                .allowedOrigins("http://127.0.0.1:5500")

                // Esta línea especifica los métodos HTTP permitidos para las solicitudes:
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS",
                        "HEAD", "TRACE", "CONNECT");
    }
}
