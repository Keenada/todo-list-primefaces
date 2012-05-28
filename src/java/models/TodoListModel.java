package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.model.ListDataModel;
import org.primefaces.model.SelectableDataModel;

/**
 * Model a todo list.
 *
 * Reference:
 *  http://www.primefaces.org/showcase/ui/datatableRowSelectionRadioCheckbox.jsf
 *
 * @author Gerald.Hurdle@AlgonquinCollege.com
 */
public class TodoListModel extends ListDataModel<Todo>
                           implements SelectableDataModel<Todo>, Serializable {
    // TODO :: use plugin to generate
    private static final long serialVersionUID = 2764660107984440385L;

    private ArrayList<Todo> todoList;

    public TodoListModel() {
        super();

        todoList = new ArrayList<Todo>();

        //populate with some same data
        // TODO
        //for (int i = 0; i < 20; i++) {
            todoList.add(new Todo("Eat"));
            todoList.add(new Todo("Sleep"));
            todoList.add(new Todo("STUDY"));
        //}
    }

    public void append( Todo newTodo ) {
        todoList.add( newTodo );
    }

    public int getNumberOfTodos() {
        return todoList.size();
    }

    @Override
    public Todo getRowData(String rowKey) {
        List<Todo> todos = (List<Todo>) getWrappedData();

        for(Todo todo : todos) {
            if(todo.getTodo().equals(rowKey))
                return todo;
        }

        return null;
    }

    @Override
    public Object getRowKey(Todo object) {
        return object.getTodo();
    }

    public List<Todo> getTodoList() {
        return todoList;
    }
}
