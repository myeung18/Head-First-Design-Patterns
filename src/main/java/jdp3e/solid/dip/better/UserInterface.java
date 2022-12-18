package jdp3e.solid.dip.better;

public class UserInterface {
    Database database;

    public UserInterface(Database database) {
        this.database = database;
    }

    public void saveEmployeeId(String empId) {
        database.saveEmpIdDatabase(empId);
    }
}
