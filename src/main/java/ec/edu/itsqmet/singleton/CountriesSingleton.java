package ec.edu.itsqmet.singleton;

import java.util.List;

import ec.edu.itsqmet.dto.CountryCatalogDTO;
import ec.edu.itsqmet.service.ICountryCatalogService;

public final class CountriesSingleton {

	private static CountriesSingleton instance;
	private static List<CountryCatalogDTO> countries;

	private CountriesSingleton() {
	}

	public static List<CountryCatalogDTO> getCountries(ICountryCatalogService countryService) {
		if (countries == null) {
			countries = countryService.getAllCountries();
		}
		return countries;
	}

	public CountriesSingleton getInstance() {
		if (instance == null) {
			instance = new CountriesSingleton();
		}
		return instance;
	}

}
