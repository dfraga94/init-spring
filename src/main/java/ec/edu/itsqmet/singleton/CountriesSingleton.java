package ec.edu.itsqmet.singleton;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CountriesSingleton {

	private int code;
	private String name;

}
