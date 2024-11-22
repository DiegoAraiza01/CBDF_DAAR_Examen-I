package com.webdevelopment.Unidad2.u2_examen.services;
import java.util.List;

import com.webdevelopment.Unidad2.u2_examen.models.Productos;
import com.webdevelopment.Unidad2.u2_examen.repository.RepositoryProductos;
import org.springframework.stereotype.Service;

@Service
public class ServiceProductos {
    // Requerimos el REPO (Datos - Listado) - Categorias

    RepositoryProductos repositoryProductos;

    // Constructor - Cuando crea la instancia le pasa el repositorio
    public ServiceProductos(RepositoryProductos repositoryProductos) {
        this.repositoryProductos = repositoryProductos;
    }

    // GET - Todas las categorias
    public List<Productos> getAllOrders() {
        return repositoryProductos.obtenerTodas();
    }

    // GET - Categorias por id
    public Productos getOrderById(Long id) {
        return repositoryProductos.obtenerPorId(id);
    }

    // POST - Crear categoria
    public Productos createOrders(Productos productos) {
        return repositoryProductos.guardar(productos);
    }

    // PUT - Axtualizar categoria
    public Productos updateOrders(Productos productos) {
        return repositoryProductos.actualizar(productos);
    }

    // DELETE - Eliminar categoria
    public void deleteOrders(Long id) {
        repositoryProductos.eliminar(id);
    }
}