package jdp3e.solid.dip.better;

public class MySQLDatabase implements Database {
    @Override
    public void saveEmpIdDatabase(String empId) {
        System.out.println("The Id" + empId + " is saved in the MYSQL DB");
    }
}
