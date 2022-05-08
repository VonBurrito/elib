package org.elib.repository;

import org.elib.model.Periodic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodicRepository extends JpaRepository<Periodic, Long> {
}
