package com.webdevelopment.Unidad2.u2_examen.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.webdevelopment.Unidad2.u2_examen.models.Productos;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryProductos {
    //Alamacenar en un listado las categoria: salvar, listas, eliminar
    //Generar de manera unida el id para cada categoria
    private List<Productos> orders = new ArrayList<Productos>();
    private AtomicLong id = new AtomicLong();

    //Agregamos la orden al listado y la regresamos
    //POST
    public Productos guardar(Productos order){
        order.setid(id.incrementAndGet());
        orders.add(order);
        return order;
    }

    //GET - Todas las categorias
    public List<Productos> obtenerTodas(){
        return orders;
    }

    //GET - Una categoria
    public Productos obtenerPorId(Long id){

        //Funcional
        return orders.stream().filter(productos -> productos.getid().equals(id)).findFirst().orElse(null);
    }

    //DELETE
    public void eliminar(Long id){
        orders.removeIf(Productos -> Productos.getid().equals(id));
    }

    //PUT
    public Productos actualizar(Productos order){
        eliminar(order.getid());
        orders.add(order);
        return order;
    }
}