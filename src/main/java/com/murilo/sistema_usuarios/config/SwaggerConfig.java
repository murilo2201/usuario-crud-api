package com.murilo.sistema_usuarios.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Usuario Crud API")
                        .version("1.0.0")
                        .description("""
                            ## 🚀 API RESTful para Gerenciamento de Usuários
                            
                            Uma API completa para operações CRUD de usuários desenvolvida em Spring Boot 3.
                            
                            ### 📋 Funcionalidades
                            - ✅ Criar novo usuário
                            - ✅ Listar todos os usuários  
                            - ✅ Buscar usuário por ID
                            - ✅ Atualizar usuário existente
                            - ✅ Deletar usuário
                            - ✅ Validação de email único
                            
                            ### 🛠️ Tecnologias
                            - Java 17
                            - Spring Boot 3.2
                            - Spring Data JPA
                            - MySQL Database
                            - Bean Validation
                            -H2 Database (Desenvolvimento)
                            
                                ### 📊 Banco de Dados
                                
                            **Desenvolvimento:** H2 Database (em memória)
                            **Produção:** MySQL (persistente)
                            """)
                        .summary("API para gerenciamento completo de usuários")
                        .contact(new Contact()
                                .name("Murilo França de Sousa")
                                .email("murilofs.sousa@gmail.com")
                                .url("https://github.com/murilo2201"))
                        .license(new License()
                                .name("MIT License")
                                .url("https://opensource.org/licenses/MIT")));

    }
}
