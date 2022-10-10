package com.perpustakaan.perpustakaansalwa.controller;

import com.perpustakaan.perpustakaansalwa.common.Response;
import com.perpustakaan.perpustakaansalwa.entity.dto.UserDTO;
import com.perpustakaan.perpustakaansalwa.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl service;

    @GetMapping("/find-all")
    public Response getAllData(){
        List<UserDTO> data = service.getAllData();
        return new Response(data, "Menampilkan Data User", data.size(), HttpStatus.OK);
    }

    @GetMapping("/find-by-username")
    public Response findByUsername(@RequestParam String username){
        return new Response(service.findByUsername(username), "Menampilkan Data", HttpStatus.OK);
    }
}
