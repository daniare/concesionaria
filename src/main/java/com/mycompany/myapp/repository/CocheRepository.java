package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Coche;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Coche entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CocheRepository extends JpaRepository<Coche, Long> {
    List<Coche> findAllByColor(String color);

    List<Coche> findAllByColorStartingWith(String color);

    @Query("select c from Coche c where c.modelo like :modelo%")
    Page<Coche> findAllByModelo(@Param("modelo") String modelo, Pageable pageable);

    List<Coche> findAllByModeloStartingWith(String modelo);
}
