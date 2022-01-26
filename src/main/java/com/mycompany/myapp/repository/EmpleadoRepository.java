package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Empleado;
import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Empleado entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    /*
        Activos True
    */
    List<Empleado> findAllByActivoTrue();

    List<Empleado> findAllByActivoFalse();
}
