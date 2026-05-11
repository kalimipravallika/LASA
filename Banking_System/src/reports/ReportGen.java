import java.util.ArrayList;
import java.util.List;

public class ReportGen {

    public static void main(String[] args) {

        List<String> reports = new ArrayList<>();

        reports.add("Sales Report");
        reports.add("Audit Report");
        reports.add("Inventory Report");

        System.out.println("REPORT GENERATION STARTED");

        for (String report : reports) {
            generateReport(report);
        }

        System.out.println("REPORT GENERATION COMPLETED");
    }

    public static void generateReport(String reportName) {

        System.out.println("--------------------------------");
        System.out.println("Generating: " + reportName);

        int totalRecords = fetchRecordCount(reportName);

        System.out.println("Total Records: " + totalRecords);

        System.out.println(reportName + " Generated Successfully");
    }

    public static int fetchRecordCount(String reportName) {

        return reportName.length() * 10;
    }
}
