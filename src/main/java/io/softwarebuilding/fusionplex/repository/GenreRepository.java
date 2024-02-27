package io.softwarebuilding.fusionplex.repository;

import io.softwarebuilding.fusionplex.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface GenreRepository extends JpaRepository<Genre, UUID> {

    Optional<Genre> findByName( String name );

}
