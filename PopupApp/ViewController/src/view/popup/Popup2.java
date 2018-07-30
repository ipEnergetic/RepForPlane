package view.popup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.faces.component.UIComponent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;

import oracle.adf.view.rich.component.rich.RichDialog;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.uicli.binding.JUCtrlListBinding;

public class Popup2 {
    private RichDialog myDialog;

    public Popup2() {
    }

    public BindingContainer getBindingsCont() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public void setMyDialog(RichDialog myDialog) {
        this.myDialog = myDialog;
    }

    public RichDialog getMyDialog() {
        return myDialog;
    }

    public void removeEmp(DialogEvent dialogEvent) {
        DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding dcItteratorBindings = bindings.findIteratorBinding("EmployeesView3Iterator");
        ViewObject voTableData = dcItteratorBindings.getViewObject();
        Row rowSelected = voTableData.getCurrentRow();
        Object currentEmpl = rowSelected.getAttribute("EmployeeId");

        Connection connection = null;
        String url = "jdbc:oracle:thin:@scbrs.softclub.by:1521:BRS";
        String name = "hr";
        String password = "hr";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(url, name, password);
            Statement statement = null;
            statement = connection.createStatement();
            statement.executeUpdate("UPDATE employees SET Department_Id = NULL WHERE Employee_Id = " + currentEmpl);
            connection.close();
        } catch (SQLException e) {
            System.out.println("Œÿ»¡ ¿! " + e);
        } catch (Exception e) {
        }

        dcItteratorBindings.executeQuery();

        BindingContainer bc = this.getBindingsCont();
        //Get shuttle binding from pagedef
        JUCtrlListBinding listBindings = (JUCtrlListBinding)bc.get("EmpDepFreeView");
        listBindings.executeQuery();
    }
}
