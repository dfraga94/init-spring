package ec.edu.itsqmet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.itsqmet.dto.CountryCatalogDTO;

public interface ICountryCatalogRepository extends JpaRepository<CountryCatalogDTO, Integer> {

}
