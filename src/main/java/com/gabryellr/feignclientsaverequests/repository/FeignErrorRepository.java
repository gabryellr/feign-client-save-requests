package com.gabryellr.feignclientsaverequests.repository;

import com.gabryellr.feignclientsaverequests.model.requests.ErrorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeignErrorRepository extends JpaRepository<ErrorEntity, Long> {
}
