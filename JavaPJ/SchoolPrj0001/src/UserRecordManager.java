import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class UserRecordManager {
    private static final String DATA_FILE = "data.txt";
    private static Map<String, String> records = new HashMap<>();

    public static void main(String[] args) {
        loadData();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Save");
            System.out.println("2. View");
            System.out.println("3. Update");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    saveRecord(scanner);
                    break;
                case "2":
                    viewAllRecords();
                    break;
                case "3":
                    updateRecord(scanner);
                    break;
                case "4":
                    saveData();
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void loadData() {
        File file = new File(DATA_FILE);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(";");
                    if (parts.length == 2) {
                        records.put(parts[0], parts[1]);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error reading data file: " + e.getMessage());
            }
        }
    }

    private static void saveData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATA_FILE))) {
            for (Map.Entry<String, String> entry : records.entrySet()) {
                writer.write(entry.getKey() + ";" + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing data file: " + e.getMessage());
        }
    }

    private static void saveRecord(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter date of birth (YYYY-MM-DD): ");
        String dob = scanner.nextLine();

        if (records.containsKey(name)) {
            System.out.println("Name already exists. Use update to modify the record.");
        } else {
            records.put(name, dob);
            System.out.println("Record saved.");
        }
    }

    private static void viewAllRecords() {
        if (records.isEmpty()) {
            System.out.println("No records found.");
        } else {
            System.out.println("All records:");
            for (Map.Entry<String, String> entry : records.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Date of Birth: " + entry.getValue());
            }
        }
    }

    private static void updateRecord(Scanner scanner) {
        System.out.print("Enter the name to update: ");
        String name = scanner.nextLine();

        if (records.containsKey(name)) {
            System.out.print("Enter new date of birth (YYYY-MM-DD): ");
            String dob = scanner.nextLine();
            records.put(name, dob);
            System.out.println("Record updated.");
        } else {
            System.out.println("Record not found.");
        }
    }
    public void delete(String name){
        if(Files.notExists(DATA_FILE)){
            System.out.println("No record yet");
            return;
        }
        try {
            StringBuilder remainRecord = new StringBuilder();
            List<String> allline = Files.readAllLines(DATA_FILE);
            for(String line:allline){
                String data[] = line.split("");
                if(!name.equals(data[0])){ 
                    
                }
            }
        } catch (Exception e) {
        }
    }
}