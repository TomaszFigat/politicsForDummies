package com.tomaszfigat.politicsForDummies.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.List;

import static java.util.Collections.singletonList;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//import springfox.documentation.swagger2.mappers.ModelMapper;


@Configuration
//@EnableSwagger2
public class Config {
    @Bean
    public Docket swaggerApi() {
        return new Docket(DocumentationType. SWAGGER_2 )
                .ignoredParameterTypes(UsernamePasswordAuthenticationToken.class)
                .select()
                .paths(PathSelectors. regex ( "^(?!/(error).*$).*$" ))
                .build()
                .securitySchemes(singletonList(createSchema()))
                .securityContexts(singletonList(createContext()));
    }

    private SecurityContext createContext() {
        return SecurityContext.builder()
                .securityReferences(createRef())
                .forPaths(PathSelectors.any())
                .build();
    }

    private List<SecurityReference> createRef() {
        AuthorizationScope authorizationScope = new AuthorizationScope(
                "global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return singletonList(new SecurityReference("apiKey", authorizationScopes));
    }

    private SecurityScheme createSchema() {
        return new ApiKey("apiKey", "Authorization", "header");
    }
//    @Bean
//    public ModelMapper modelMapper() {
//        ModelMapper modelMapper = new ModelMapper();
//        return modelMapper;
//    }
//        @Bean
//         public UserMapper modelMapper() {
//            UserMapper userMapper = new ModelMapper();
//            return userMapper;
//        }
//    @Bean
//    public UserMapper modelMapper() {
//        UserMapper UserMapper = new UserMapper() {
//            @Override
//            public UserDTO toUserDTO(User user) {
//                return null;
//            }
//
//            @Override
//            public List<UserDTO> toUserDTOs(List<User> users) {
//                return null;
//            }
//
//            @Override
//            public User toUser(UserDTO userDTO) {
//                return null;
//            }
//        };
//        return UserMapper;
//    }
}
