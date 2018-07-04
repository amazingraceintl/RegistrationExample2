package com.amazing.auth.repository;


        import com.amazing.auth.model.Role;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
