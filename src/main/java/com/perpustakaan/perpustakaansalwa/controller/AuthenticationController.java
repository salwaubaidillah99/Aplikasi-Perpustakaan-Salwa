package com.perpustakaan.perpustakaansalwa.controller;

import com.perpustakaan.perpustakaansalwa.common.Response;
import com.perpustakaan.perpustakaansalwa.entity.dto.AuthenticationDTO;
import com.perpustakaan.perpustakaansalwa.entity.dto.ResponseAuthDTO;
import com.perpustakaan.perpustakaansalwa.entity.dto.UserDTO;
import com.perpustakaan.perpustakaansalwa.service.Impl.AuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthServiceImpl service;

    @PostMapping("/login")
    public Response login(@RequestBody AuthenticationDTO dto){
        ResponseAuthDTO data = service.login(dto);
        return new Response(data, data != null ? "Login Berhasil" : "Login Gagal", HttpStatus.OK);
    }

    @PostMapping("/register")
    public Response register(@RequestBody UserDTO dto){
        ResponseAuthDTO data = service.register(dto);
        return new Response(data, data != null ? "Registrasi Berhasil" : "Registrasi Gagal", HttpStatus.OK);

    }
}