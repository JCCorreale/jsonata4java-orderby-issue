import com.api.jsonata4java.expressions.EvaluateException;
import com.api.jsonata4java.expressions.Expressions;
import com.api.jsonata4java.expressions.ParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOrderBy {

    @Test
    void testOrderByShouldSortAscending() throws IOException, ParseException, EvaluateException {

        var objectMapper = new ObjectMapper();

        var source = objectMapper.readTree("""
        {
          "Email":
          [
            {
              "type": "office"
            },
            {
              "type": "home"
            }
          ]
        }
        """);

        var expr = Expressions.parse("Email^(type)");

        var result = expr.evaluate(source);

        assertEquals("home", result.get(0).get("type").asText());
        assertEquals("office", result.get(1).get("type").asText());
    }

    @Test
    void testOrderByShouldSortDescending() throws IOException, ParseException, EvaluateException {

        var objectMapper = new ObjectMapper();

        var source = objectMapper.readTree("""
        {
          "Email":
          [
            {
              "type": "home"
            },
            {
              "type": "office"
            }
          ]
        }
        """);

        var expr = Expressions.parse("Email^(>type)");

        var result = expr.evaluate(source);

        assertEquals("office", result.get(0).get("type").asText());
        assertEquals("home", result.get(1).get("type").asText());
    }
}
