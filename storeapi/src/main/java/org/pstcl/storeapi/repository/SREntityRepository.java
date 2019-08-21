package org.pstcl.storeapi.repository;

import java.time.LocalDate;
import java.util.List;

import org.pstcl.storeapi.model.entity.SREntity;
import org.springframework.data.repository.PagingAndSortingRepository;

//@RepositoryRestResource(collectionResourceRel="srlist",path="srlist")
public interface SREntityRepository extends PagingAndSortingRepository<SREntity, Integer>{
	List<SREntity> findBySrChallanDateBetween(LocalDate start, LocalDate end);
}