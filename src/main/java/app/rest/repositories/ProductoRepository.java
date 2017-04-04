package app.rest.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import app.rest.models.Producto;

@Repository
public interface ProductoRepository extends PagingAndSortingRepository<Producto, Long> {

}
