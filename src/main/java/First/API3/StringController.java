package First.API3;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strings")
public class StringController {

    public String getConcact(@PathVariable String string1, @RequestParam (required = false) String string2){
        if (string2 == null){
            string2= " ";
        }
        return string1.concat(" " + string2);
    }
}
