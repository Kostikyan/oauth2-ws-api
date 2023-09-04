package com.itspace.ws.api.resourceserver.endpoint;

import com.itspace.ws.api.resourceserver.entity.UserRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserEndpoint {

    @Autowired
    private Environment env ;

    // access token test
    @GetMapping("/status/check")
    public String status(){
        return "Working..." + env.getProperty("local.server.port");
    }

    // @Secured annotation test example
    @Secured("ROLE_developer")
    @DeleteMapping("/{id}")
    public String securedDeleteUser(@PathVariable String id){
        return "secured: deleted user id: " + id;
    }

    // @PreAuthorize annotation test example
    @PreAuthorize("hasRole('ROLE_developer') or #id == #jwt.subject")
    @DeleteMapping("pr-a/{id}")
    public String preAuthorizeDeleteUser(@PathVariable String id, @AuthenticationPrincipal Jwt jwt){
        return "pre authorize: deleted user id: " + id + " and JWT subject " + jwt.getSubject();
    }

    // @PostAuthorize annotation test example
    @PostAuthorize("returnObject.userId == #jwt.subject")
    @GetMapping("/{id}")
    public UserRest postAuthorizeById(@PathVariable String id, @AuthenticationPrincipal Jwt jwt){
        return new UserRest("Vahe", "Kostikyan", "2f3fka-ll2asd-mm23x-99zwd0dzx");
    }
}
