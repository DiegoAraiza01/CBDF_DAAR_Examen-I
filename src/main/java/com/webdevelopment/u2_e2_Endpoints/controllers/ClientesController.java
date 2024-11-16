package com.webdevelopment.u2_e2_Endpoints.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/clientes")
public class ClientesController {
    //Respuesta a todos los clientes - GET
    @GetMapping
    public String listClients(){
        return "Listado de todos los clientes - GET";
    }
    //Respuesta a cliente por Id - GET
    @GetMapping("/{id}")
    public String listClient(@PathVariable int id){
        return "Obtener un cliente por ID - GET" + id;
    }

    //Agregar cliente - POST
    @PostMapping
    public String addClient(@RequestBody String client){
        return "Agregar cliente - POST" + client;
    }
    //Actualizar un cliente  -           PUT
    @PutMapping("/{id}")
    public String actualizarCliente(@PathVariable int id, @RequestBody String cliente){
        return "Actualizar cliente - PUT: " + cliente + " con id: " + id;
    }

    //Eliminar un cliente  -              DELETE
    @DeleteMapping("/{id}")
    public String eliminarCliente(@PathVariable int id){
        return "Eliminar un cliente - DELETE: " + id;
    }

    @GetMapping("/{id}/facturas")
    public String listarFacturas(@PathVariable int id) {
        return "Obtener todas las facturas del cliente con id: " + id;
    }

    @GetMapping("/{id}/facturas/{idFactura}")
    public String listarFacturas(@PathVariable int id, @PathVariable int idFactura) {
        return "Obtener la factura con id: " + idFactura + " del cliente id: " + id;
    }
}
