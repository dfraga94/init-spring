package ec.edu.itsqmet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.itsqmet.service.ICountryCatalogService;
import ec.edu.itsqmet.singleton.CountriesSingleton;

@SpringBootTest
class InitSpringApplicationTests {

	@Autowired
	private ICountryCatalogService countryService;

	@Test
	void testCountryCount() {
		// System.out.println(countryService.getAllCountries().size());
		//System.out.println(CountriesSingleton.getCountries().size());
//
//		for (int i = 0; i < 500; i++) {
//			System.out.println(countryService.getAllCountries().size());
//		}
//		
		for (int i = 0; i < 500; i++) {
			System.out.println(CountriesSingleton.getCountries(countryService).size());
		}
	}

}
