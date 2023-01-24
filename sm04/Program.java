package sm04;

public class Program {
    public static void main(String[] args) {
        Worker w = new Worker(1, "Vasya");
        String petya = "Petya";
        Integer num = 10;
        System.out.println(JSON.Marshal(w));
        System.out.println(JSON.Marshal(petya));
        System.out.println(JSON.Marshal(num));

        System.out.println();

        String j1 = "1";
        int i = (int) JSON.Unmarshal(j1);

        String j2 = """
                "ivan"
                """;
        String s = (String) JSON.Unmarshal(j2);

        String j3 = """
            {
                "id": 2,
                "name": "Alex"
            }""";
        Worker w1 = (Worker) JSON.Unmarshal(j3);
        
        System.out.println(i);
        System.out.println(s);
        System.out.println(w1);
    }
}
