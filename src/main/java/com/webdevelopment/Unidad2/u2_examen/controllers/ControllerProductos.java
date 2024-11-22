package com.webdevelopment.Unidad2.u2_examen.controllers;

import java.util.List;

import com.webdevelopment.Unidad2.u2_examen.models.Productos;
import com.webdevelopment.Unidad2.u2_examen.services.ServiceProductos;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/v1/products")
public class ControllerProductos {
    // Requiero INYECTAR una dependencia del servicio
    ServiceProductos ordersService;

    public ControllerProductos(ServiceProductos ordersService){
        this.ordersService = ordersService;
    }

    // GET - Todas las categorias
    @GetMapping
    public ResponseEntity<List<Productos>> getOrders(){
        return ResponseEntity.ok(ordersService.getAllOrders());
    }

    // GET- Solo una categoria
    @GetMapping("/{id}")
    public ResponseEntity<Productos> getOrderid(@PathVariable Long id){
        return ResponseEntity.ok(ordersService.getOrderById(id));
    }

    // POST - Creamos una categoria
    @PostMapping
    public ResponseEntity<Productos> addOrder(@RequestBody Productos productos){
        return ResponseEntity.ok(ordersService.createOrders(productos));
    }

    // PUT - Actualizar una categoria
    @PutMapping("/{id}")
    public ResponseEntity<Productos> updateOrder(@RequestBody Productos productos, @PathVariable Long id){
        //Que se requiere antes de actualizarla
        productos.setid(id);
        return ResponseEntity.ok(ordersService.updateOrders(productos));
    }

    // DELETE - Eliminar una categoria por Id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id){
        ordersService.deleteOrders(id);
        return ResponseEntity.noContent().build();
    }
}