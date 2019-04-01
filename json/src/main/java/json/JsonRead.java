package json;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
public class JsonRead {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("test1.json"));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            String lastName = (String) jsonObject.get("");
            System.out.println(lastName);

            String firstName = (String) jsonObject.get("First Name");
            System.out.println(firstName);

            // loop array
            JSONArray msg = (JSONArray) jsonObject.get("skills");
            Iterator<String> iterator = msg.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


}
