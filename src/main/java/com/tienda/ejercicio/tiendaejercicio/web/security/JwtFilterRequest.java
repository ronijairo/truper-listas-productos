package com.tienda.ejercicio.tiendaejercicio.web.security;


import com.tienda.ejercicio.tiendaejercicio.domian.service.SecurityUserDetailService;
import com.tienda.ejercicio.tiendaejercicio.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtFilterRequest extends OncePerRequestFilter {

    @Autowired
    private JWTUtil jwtUtil;

    @Autowired
    private SecurityUserDetailService securityService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authorizationHeader = request.getHeader("Authorization");
        if(authorizationHeader !=null && authorizationHeader.startsWith("Bearer")){
            String jwt = authorizationHeader.substring(7);
            Utils.setToken(jwt);
            String username = jwtUtil.extracUserName(jwt);
            if(username!=null && SecurityContextHolder.getContext().getAuthentication() ==null){
                UserDetails userDetails = securityService.loadUserByUsername(username);

                if(jwtUtil.validateToken(jwt, userDetails)){
                    UsernamePasswordAuthenticationToken authToken
                            = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                    authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                    SecurityContextHolder.getContext().setAuthentication(authToken);
                }
            }
        }
        filterChain.doFilter(request,response);
    }
}
