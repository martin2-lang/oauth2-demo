package com.ejemplo.oauth2demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String inicio() {
        return "index";
    }

    @GetMapping("/perfil")
    public String perfil(@AuthenticationPrincipal OidcUser usuario,
                         Model model) {
        model.addAttribute("nombre", usuario.getFullName());
        model.addAttribute("correo", usuario.getEmail());
        model.addAttribute("foto", usuario.getPicture());
        model.addAttribute("identificador", usuario.getSubject());
        return "perfil";
    }
}
