package ec.edu.itsqmet;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.itsqmet.builder.person.Carro;
import ec.edu.itsqmet.builder.person.Person;
import ec.edu.itsqmet.service.ICountryCatalogService;
import ec.edu.itsqmet.singleton.CountriesSingleton;

@SpringBootTest
class InitSpringApplicationTests {

	@Autowired
	private ICountryCatalogService countryService;

//	@Test
	void testCountryCount() {
		// System.out.println(countryService.getAllCountries().size());
		// System.out.println(CountriesSingleton.getCountries().size());
//
//		for (int i = 0; i < 500; i++) {
//			System.out.println(countryService.getAllCountries().size());
//		}
//		
		for (int i = 0; i < 500; i++) {
			System.out.println(CountriesSingleton.getCountries(countryService).size());
		}

	}

	@Test
	void testingBuilder() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date = "03/05/1994";
		// convert String to LocalDate
		LocalDate localDate = LocalDate.parse(date, formatter);
		Person persona = new Person("Darwin", "Fraga", localDate, "La Ecuatoriana", "Programador");
		Person persona1 = new Person("Cristian", "Naranjo");
		Person persona2 = new Person("Pedpito", null, null, "La magdalena", null);
		Person persona3 = Person.builder().name("Pepito").address("La magdalena").build();
		Person personsa4 = Person.builder().lastName("Santo").birthday(localDate).profession("Contador").build();
	
	
		Carro carro1 = Carro.builder().marca("Nissan").build();
		Carro carro2 = Carro.builder().marca("Nissan").color("Rojo").build();
		Carro carro3 = Carro.builder().marca("Nissan").color("Rojo").tipos("Sedan").build();
		
		System.out.println(carro1);
		
	}
}
