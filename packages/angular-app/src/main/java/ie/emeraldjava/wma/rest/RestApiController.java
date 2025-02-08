package ie.emeraldjava.wma.rest;

import ie.emeraldjava.wma.dto.WmaException;
import ie.emeraldjava.wma.dto.WmaResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * https://spring.io/guides/tutorials/bookmarks/
 * Created by pauloconnell on 03/01/17.
 */
@RestController
@RequestMapping("/api")
public class RestApiController {

    @RequestMapping(method = RequestMethod.GET )//, value = "/{bookmarkId}")
    WmaResult readBookmark(@PathVariable Integer age, @PathVariable String gender, @PathVariable String kmDistance)
        throws WmaException {
        WmaResult result = new WmaResult();
        result.ageRating = 85.99d;
        return result;
    }
}
