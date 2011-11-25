package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Model a todo list.
 *
 * @author Gerald.Hurdle@AlgonquinCollege.com
 */
public class TodoListModel implements Serializable {
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

    public ArrayList<Todo> getTodoList() {
        return todoList;
    }
}
