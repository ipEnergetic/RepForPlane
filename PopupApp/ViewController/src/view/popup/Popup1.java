package view.popup;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.faces.component.UIComponent;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;

import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichSelectManyShuttle;

import oracle.binding.BindingContainer;

import oracle.jbo.uicli.binding.JUCtrlListBinding;

public class Popup1 {
    private RichSelectManyShuttle myShuttle;

    public Popup1() {
    }

    //Метод для получения BindingContainer

    public BindingContainer getBindingsCont() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    //Метод для получения текущего DepartmentId

    public Object getCurrentDepartment(BindingContainer bc, String iteratorName) {
        DCIteratorBinding dcib = (DCIteratorBinding)bc.get(iteratorName);
        Object currentDepartment = dcib.getCurrentRow().getAttribute("DepartmentId");
        return currentDepartment;
    }

    //Закрытие popup элемента

    public static void hidePopup(UIComponent popup) {
        while (true) {
            if (popup instanceof RichPopup)
                break;
            popup = popup.getParent();
            if (popup == null)
                return;
        }
        ((RichPopup)popup).hide();
    }

    //Закрытие Popup (Shuttle)

    public String cancelShuttle() {
        //Get Binding Container of Page
        BindingContainer bc = this.getBindingsCont();
        //Get shuttle binding from pagedef
        JUCtrlListBinding listBindings = (JUCtrlListBinding)bc.get("EmpDepFreeView");
        //Стирание выделенных в правой части shuttle знвчений
        listBindings.clearSelectedIndices();
        hidePopup(myShuttle);
        return null;
    }

    //Метод для добавления Free Employees кнопкой OK в shuttle

    public String addFreeEmp() {
        //Get Binding Container of Page
        BindingContainer bc = this.getBindingsCont();
        //Get shuttle binding from pagedef
        JUCtrlListBinding listBindings = (JUCtrlListBinding)bc.get("EmpDepFreeView");
        //Get Selected Values
        Object str[] = listBindings.getSelectedValues();
        // Если есть добавленные в правую часть Shuttle значения, то выполнить код
        if (str.length > 0) {
            //создаем соедениение с БД
            Connection connection = null;
            String url = "jdbc:oracle:thin:@scbrs.softclub.by:1521:BRS";
            String name = "hr";
            String password = "hr";
            Object currentDepartment = getCurrentDepartment(bc, "DepartmentsView1Iterator");
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                connection = DriverManager.getConnection(url, name, password);
                Statement statement = null;
                statement = connection.createStatement();
                for (int i = 0; i < str.length; i++) {
                    statement.executeUpdate("UPDATE employees SET Department_Id = " + currentDepartment +
                                            " WHERE Employee_Id =" + str[i]);
                }
                connection.close();
            } catch (SQLException e) {
                System.out.println("ОШИБКА! " + e);
            } catch (Exception e) {
            }
            //Стирание выделенных в правой части shuttle значений
            listBindings.clearSelectedIndices();
            // Update значений, подающихся на вход в shuttle
            listBindings.executeQuery();
            //обновление значений в таблице Employees
            DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding dcItteratorBindings = bindings.findIteratorBinding("EmployeesView3Iterator");
            dcItteratorBindings.executeQuery();
            //Закрытие Popup
            hidePopup(myShuttle);
        }
        return null;
    }

    public void setMyShuttle(RichSelectManyShuttle myShuttle) {
        this.myShuttle = myShuttle;
    }

    public RichSelectManyShuttle getMyShuttle() {
        return myShuttle;
    }
}
