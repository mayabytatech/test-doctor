package com.bytatech.ayoos.service;

import com.bytatech.ayoos.service.dto.StatusDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing Status.
 */
public interface StatusService {

    /**
     * Save a status.
     *
     * @param statusDTO the entity to save
     * @return the persisted entity
     */
    StatusDTO save(StatusDTO statusDTO);

    /**
     * Get all the statuses.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<StatusDTO> findAll(Pageable pageable);


    /**
     * Get the "id" status.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<StatusDTO> findOne(Long id);

    /**
     * Delete the "id" status.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

    /**
     * Search for the status corresponding to the query.
     *
     * @param query the query of the search
     * 
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<StatusDTO> search(String query, Pageable pageable);

	
	/**
	 * @param reservedSlotId
	 * @return
	 */
	StatusDTO findByReservedSlotId(Long reservedSlotId);
}
