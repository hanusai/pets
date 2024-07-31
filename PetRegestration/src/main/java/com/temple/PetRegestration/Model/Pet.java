package com.temple.PetRegestration.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Pet {
	
	@Id()
	int id;

}
