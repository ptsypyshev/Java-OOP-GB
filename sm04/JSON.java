package sm04;

public class JSON {
    public static <T> String Marshal(T obj) {
        if (obj instanceof Worker) {
            Worker w = (Worker) obj;
            return String.format("{\n\t\"id\": %d,\n\t\"name\": \"%s\"\n}", w.getID(), w.getName());            
        } else if (obj instanceof String) {
            String s = (String) obj;
            return String.format("\"%s\"", s);            
        } else if (obj instanceof Integer) {
            Integer d = (Integer) obj;
            return String.format("%d", d);            
        }
        return "";
    }

    public static Object Unmarshal(String json) {
        if (!json.contains("\"")) {
            return Integer.parseInt(json);
        } else if (!json.contains(":") && json.contains("\"")) {
            return json.replace("\"", "").trim();
        } else if (json.contains(":")) {
            json = json.replace("{", "").replace("}", "");
            String[] fields = json.split(",", 0);
            int ID = 0;
            String name = "";
            for (String field : fields) {
                String[] fieldSplit = field.trim().split(":");
                if (fieldSplit[0].contains("id")) {
                    ID = Integer.parseInt(fieldSplit[1].trim());
                } else if (fieldSplit[0].contains("name")) {
                    name = fieldSplit[1].trim();
                }
            }
            return new Worker(ID, name);
        }
        return new Object();
    }
}
