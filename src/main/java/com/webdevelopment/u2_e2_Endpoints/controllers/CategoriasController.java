package com.webdevelopment.u2_e2_Endpoints.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/categorias")
public class CategoriasController {
    //Respuesta para categorías GET
    @GetMapping
    public String listCategories(){
        return "Listado de categorías - GET";
    }
    //Respuesta para una categoría por ID
    @GetMapping("/{id}")
    public String listIdCategory(@PathVariable int id){
        return "Obtener categoría por ID - GET" + id;
    }

    //Agrega una categoría - POST
    @PostMapping
    public String addCategory(@RequestBody String category){
        return "Agregar categoría - POST" + category;
    }
    //ActualizarCategoría - PUT
    @PutMapping("/{id}")
    public String updateCategory(@PathVariable int id, @RequestBody String category){
        return "Actualizar Categoría - PUT" + category + " con id: " + id;
    }
    //Eliminar categoría - DELETE
    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable int id){
        return "Eliminar categoría - DELETE" + id;
    }
}
