package com.dydko.application.views.data.repository;

import com.dydko.application.views.data.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
