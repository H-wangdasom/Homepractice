package hwang.dasom.zzory;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		DasomSampleService dsservice = new DasomSampleService();
		/*List<DasomSample> list= dsservice.getSample();	
		model.addAttribute("list", list);*/
		/*String a = dsservice.getDSample();
		model.addAttribute("a",a);*/
		
		Map<String, Object> map= dsservice.dssample();
		model.addAttribute("map",map);
		return "index";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
	
		model.addAttribute("serverTime", "zzory" );
		
		return "home";
	}
	
}
