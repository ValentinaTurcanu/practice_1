package json;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class JsonWrite {
    public static void main(String[] args) {

        Map empDetails = new LinkedHashMap(5);
        empDetails .put("lastName", "King");
        empDetails .put("firstName", "Alex");
        empDetails .put("birthDate", "01.01.1970");
        empDetails .put("positio", "Department Manager");
        JSONArray list = new JSONArray();
        list.add("Communication");
        list.add("Java");
        empDetails .put("skills", list);


        Map empDetails1 = new LinkedHashMap(5);
        empDetails1.put("lastName", "King");
        empDetails1.put("firstName", "Alex");
        empDetails1.put("birthDate", "01.01.1970");
        empDetails1.put("positio", "Department Manager");
        JSONArray list1 = new JSONArray();
        list1.add("Communication");
        list1.add("Java");
        empDetails1.put("skills", list1);

        Map empDetails2 = new LinkedHashMap(5);
        empDetails2.put("lastName", "King");
        empDetails2.put("firstName", "Alex");
        empDetails2.put("birthDate", "01.01.1970");
        empDetails2.put("positio", "Department Manager");
        JSONArray list2 = new JSONArray();
        list2.add("Communication");
        list2.add("Java");
        empDetails2.put("skills", list2);
        Map empDetails10 = new LinkedHashMap(5);
        empDetails10 .put("lastName", "King");
        empDetails10 .put("firstName", "Alex");
        empDetails10 .put("birthDate", "01.01.1970");
        empDetails10 .put("positio", "Department Manager");
        JSONArray list10 = new JSONArray();
        list10.add("Communication");
        list10.add("Java");
        empDetails10 .put("skills", list10);


        Map empDetails11 = new LinkedHashMap(5);
        empDetails11.put("lastName", "King");
        empDetails11.put("firstName", "Alex");
        empDetails11.put("birthDate", "01.01.1970");
        empDetails11.put("positio", "Department Manager");
        JSONArray list11 = new JSONArray();
        list11.add("Communication");
        list11.add("Java");
        empDetails11.put("skills", list1);

        JSONObject empDetails12  = new JSONObject();
        empDetails12.put("lastName", "King");
        empDetails12.put("firstName", "Alex");
        empDetails12.put("birthDate", "01.01.1970");
        empDetails12.put("positio", "Department Manager");
        JSONArray list12 = new JSONArray();
        list12.add("Communication");
        list12.add("Java");
        empDetails12.put("skills", list2);

        JSONArray employeeList = new JSONArray();
        employeeList.add(empDetails);
        employeeList.add(empDetails1);
        employeeList.add(empDetails2);
        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeList);
        JSONArray employeeList1 = new JSONArray();
        employeeList1.add(empDetails10);
        employeeList1.add(empDetails11);
        employeeList1.add(empDetails12);
        JSONObject employeeObject1 = new JSONObject();
        employeeObject1.put("employee", employeeList1);
      JSONArray depList = new JSONArray();
        depList.add(employeeObject);
        depList.add(employeeObject1);
        JSONObject depObject = new JSONObject();
        depObject.put("depatment",depList);

       JSONObject compObject = new JSONObject();
        compObject.put("company",depObject);


        try (FileWriter file = new FileWriter("test1.json")) {

            file.write(compObject.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(depList);

    }

}