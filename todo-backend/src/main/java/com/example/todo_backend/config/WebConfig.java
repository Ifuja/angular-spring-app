/*Les CORS (Cross-Origin Resource Sharing) sont une politique de sécurité mise en place par les navigateurs web 
pour limiter les requêtes HTTP/HTTPS entre différents domaines. 
Cela permet à mon application frontend et backend de communiquer sans être bloquée par les restrictions de sécurité CORS.
*/
package com.example.todo_backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    
    @Override
    public void addCorsMappings(@SuppressWarnings("null") CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200") // Autorise l'origine de mon frontend Angular
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Autorise les méthodes HTTP nécessaires
                .allowedHeaders("*"); // Autorise tous les en-têtes HTTP
    }
}