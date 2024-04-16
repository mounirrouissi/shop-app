package com.mounir.ecommerce.dao;

import com.mounir.ecommerce.entity.Cart;
import com.mounir.ecommerce.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface CartDao extends CrudRepository<Cart, Integer > {
    public List<Cart> findByUser(User user);
    @Modifying
@Query("UPDATE Cart c SET c.product = null WHERE c.product.id = :productId")
void nullifyProduct(@Param("productId") Integer productId);
}
