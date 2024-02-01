module com.todolist.to_do_list {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.todolist.to_do_list to javafx.fxml;
    exports com.todolist.to_do_list;
}