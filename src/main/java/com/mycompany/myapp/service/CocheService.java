package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.Coche;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing {@link Coche}.
 */
public interface CocheService {
    /**
     * Save a coche.
     *
     * @param coche the entity to save.
     * @return the persisted entity.
     */
    Coche save(Coche coche);

    /**
     * Partially updates a coche.
     *
     * @param coche the entity to update partially.
     * @return the persisted entity.
     */
    Optional<Coche> partialUpdate(Coche coche);

    /**
     * Get all the coches.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<Coche> findAll(Pageable pageable);

    /**
     * Get the "id" coche.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Coche> findOne(Long id);

    /**
     * Delete the "id" coche.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);

    /**
     * Obtiene todos los coche por el color.
     *
     * @param color the pagination information.
     * @return lista de los coches del mismo color.
     */
    List<Coche> findAllByColor(String color);

    /**
     * Obtiene todos los coche por el color.
     *
     * @param color the pagination information.
     * @return lista de los coches del mismo color.
     */
    List<Coche> findAllByColorStartingWith(String color);

    /**
     * Obtiene todos los coche por el color.
     *
     * @param modelo the pagination information.
     * @param pageable
     * @return lista de los coches del mismo color.
     */
    Page<Coche> findAllByModelo(String modelo, Pageable pageable);

    List<Coche> findAllByModeloStartingWith(String modelo);
}
