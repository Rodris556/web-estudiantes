package com.univerm.student.controller;

import com.univerm.student.Model.Estudiante;
import com.univerm.student.entity.EstudianteEntity;
import com.univerm.student.repository.Estudianterepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NuevoContoller {
    @Autowired
    private Estudianterepository estudianterepository;

    @GetMapping("/registro")
    public String Formulario() {
        return "form";
    }

    @PostMapping("/guardado")
    public String success(@ModelAttribute Estudiante request) {
        System.out.println(request);
        EstudianteEntity estudiante =new EstudianteEntity();
        estudiante.setName(request.getName());
        estudiante.setLastname(request.getLastname());

        estudianterepository.save(estudiante);
        return "success";

    }


}

