package org.team3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.team3.repository.entity.Admin;
import org.team3.repository.enums.Role;


import java.util.Optional;

@Repository
public interface IAdminRepository extends JpaRepository<Admin,Long> {

    Optional<Admin> findOptionalById(Long adminid);
    Admin findByRole(Role role);
}