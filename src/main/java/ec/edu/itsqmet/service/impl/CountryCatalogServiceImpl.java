package ec.edu.itsqmet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.itsqmet.dto.CountryCatalogDTO;
import ec.edu.itsqmet.repository.ICountryCatalogRepository;
import ec.edu.itsqmet.service.ICountryCatalogService;

@Service
public class CountryCatalogServiceImpl implements ICountryCatalogService {
	@Autowired
	private ICountryCatalogRepository countryCatalgRep;

	@Override
	public List<CountryCatalogDTO> getAllCountries() {
		return countryCatalgRep.findAll();
	}

}
