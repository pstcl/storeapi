package org.pstcl.storeapi.repository;

import org.pstcl.storeapi.model.entity.SREntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="srlist",path="srlist")
public interface SREntityRepository extends PagingAndSortingRepository<SREntity, Integer>{

	
}

