package model;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIInput;
import javax.faces.event.ActionEvent;

/**
 * Backing bean for todo list.
 *
 * @author Gerald.Hurdle@AlgonquinCollege.com
 */
@ManagedBean (name="model")
@SessionScoped
public class TodoBean implements Serializable {
    // TODO :: use plugin to generate
    private static final long serialVersionUID = -2702091165206774335L;

    private           boolean         isControlColumn;
    private           boolean         isDisplayDates;
    // TODO :: transient to prevent GF error
    private transient UIInput         newTodoText;
    private transient Todo            selectedTodo;
    private           ArrayList<Todo> todoList;

    public TodoBean() {
        super();

        isControlColumn = false;
        isDisplayDates  = false;
        todoList        = new ArrayList<Todo>();

        newTodoText = new UIInput();
        
        selectedTodo = null;

        //populate with some same data
        // TODO
        //for (int i = 0; i < 20; i++) {
            todoList.add(new Todo("Eat"));
            todoList.add(new Todo("Sleep"));
            todoList.add(new Todo("STUDY"));
        //}
    }

    public String doDelete() {
        return "index";
    }

    public String doToggleControlColumn() {
        isControlColumn = ! isControlColumn;

        return null;
    }

    public UIInput getNewTodoText() {
        return newTodoText;
    }

    public int getNumberOfTodos() {
        return todoList.size();
    }

    public Todo getSelectedTodo() {
        return selectedTodo;
    }

    public ArrayList<Todo> getTodoList() {
        return todoList;
    }

    public void handleNewTodo( ActionEvent e ) {

        if ( newTodoText.getValue() == null )
            return;

        if ( newTodoText.getValue().toString().equals("") )
            return;

        // GET new todo from View
        Todo newTodo = new Todo( newTodoText.getValue().toString() );

        // SET Model to new state (i.e. append new todo)
        todoList.add( newTodo );

        newTodoText.setValue( "" );
    }

    public boolean isIsControlColumn() {
        return isControlColumn;
    }

    public boolean isIsDisplayDates() {
        return isDisplayDates;
    }

    public void setIsDisplayDates(boolean isDisplayDates) {
        this.isDisplayDates = isDisplayDates;
    }

    public void setNewTodoText(UIInput newTodoText) {
        this.newTodoText = newTodoText;
    }

    public void setSelectedTodo(Todo selectedTodo) {
        this.selectedTodo = selectedTodo;
    }
}
