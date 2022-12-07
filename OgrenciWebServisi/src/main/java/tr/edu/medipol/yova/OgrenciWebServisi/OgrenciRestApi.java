package tr.edu.medipol.yova.OgrenciWebServisi;

import java.util.*;

import org.springframework.web.bind.annotation.*;


// http://localhost:8080/ogrenci/listele

@RestController
@RequestMapping("/ogrenci")
public class OgrenciRestApi {
	
	private static List<String> OGRENCILER = new ArrayList<>();
	{
		OGRENCILER.add("Jane");
		OGRENCILER.add("Joe");
	}

	@GetMapping("/listele")
	public List<String> listele(){
		return OGRENCILER;
	}
}
