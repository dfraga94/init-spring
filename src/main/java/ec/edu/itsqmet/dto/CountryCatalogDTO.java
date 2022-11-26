package ec.edu.itsqmet.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "country_catalog")
public class CountryCatalogDTO {

	@Id
	private Integer id;
	private Integer code;
	private String name;
}
