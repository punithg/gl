package com.gl.hackathon;

import com.gl.hackathon.service.CompilerService;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class CompilerServiceTestConfiguration {


    @Primary
    @Bean
    public CompilerService compilerService(){
        return Mockito.mock(CompilerService.class);
    }
}
