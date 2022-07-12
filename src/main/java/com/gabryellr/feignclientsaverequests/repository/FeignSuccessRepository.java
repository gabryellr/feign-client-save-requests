package com.gabryellr.feignclientsaverequests.repository;

import com.gabryellr.feignclientsaverequests.model.requests.SuccessEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeignSuccessRepository extends JpaRepository<SuccessEntity, Long> {
}
