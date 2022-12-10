package ec.edu.itsqmet.service;

import java.util.List;

import ec.edu.itsqmet.dto.CountryCatalogDTO;

public interface ICountryCatalogService {

	List<CountryCatalogDTO> getAllCountries();
}
