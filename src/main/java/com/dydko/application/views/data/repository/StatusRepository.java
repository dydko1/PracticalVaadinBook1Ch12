package com.dydko.application.views.data.repository;

import com.dydko.application.views.data.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}
