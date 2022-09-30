package ca.sheridancollege.palazov.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {

	private Long id;
	private String title;
	private String publisher;
	private String platform;
	private double price;
	
	
	private String[] platforms = {"your", "favourite", "consoles"};
	
}



