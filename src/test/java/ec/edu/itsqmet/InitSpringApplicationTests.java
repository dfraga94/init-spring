package ec.edu.itsqmet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.itsqmet.repository.ICountryCatalogRepository;

@SpringBootTest
class InitSpringApplicationTests {

	@Autowired
	private ICountryCatalogRepository iccr;
	
	
	@Test
	void testCountryCount() {
		System.out.println(iccr.count());

	}

}
