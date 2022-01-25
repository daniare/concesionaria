package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Coche;
import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Coche entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CocheRepository extends JpaRepository<Coche, Long> {
    List<Coche> findAllByColor(String color);

    List<Coche> findAllByColorStartingWith(String color);
}
