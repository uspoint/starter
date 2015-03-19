package play.jin.cal;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}
	
	@RequestMapping(value="/darkadmin", method={RequestMethod.GET, RequestMethod.POST})
	public String darkadmin(Locale locale, Model model){
		return "/darkadmin/dark_index";
	}
	
	@RequestMapping(value="/bsbinary", method={RequestMethod.GET, RequestMethod.POST})
	public String bsbinary(Locale locale, Model model){
		return "/bsbinary/main";
	}
	
	@RequestMapping(value="/bsbinary/ui", method={RequestMethod.GET, RequestMethod.POST})
	public String bsUi(){
		return "/bsbinary/ui";
	}
	
	@RequestMapping(value="/bsbinary/tab-panel", method={RequestMethod.GET, RequestMethod.POST})
	public String bsTabPanel(){
		return "/bsbinary/tab-panel";
	}
	
	@RequestMapping(value="/bsbinary/chart", method={RequestMethod.GET, RequestMethod.POST})
	public String bsChart(){
		return "/bsbinary/chart";
	}
	
	@RequestMapping(value="/bsbinary/table", method={RequestMethod.GET, RequestMethod.POST})
	public String bsTable(){
		return "/bsbinary/table";
	}
	
	@RequestMapping(value="/bsbinary/form", method={RequestMethod.GET, RequestMethod.POST})
	public String bsForm(){
		return "/bsbinary/form";
	}
	
	@RequestMapping(value="/bsbinary/blank", method={RequestMethod.GET, RequestMethod.POST})
	public String bsBlank(){
		return "/bsbinary/blank";
	}
	
}
