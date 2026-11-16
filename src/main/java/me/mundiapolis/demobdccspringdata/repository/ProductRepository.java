package me.mundiapolis.demobdccspringdata.repository;

import me.mundiapolis.demobdccspringdata.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product, Long> {
}
