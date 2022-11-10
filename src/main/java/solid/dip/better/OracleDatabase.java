package solid.dip.better;

public class OracleDatabase implements Database {
    @Override
    public void saveEmpIdDatabase(String empId) {
        System.out.println("The Id" + empId + " is saved in the Oracle DB");
    }
}
