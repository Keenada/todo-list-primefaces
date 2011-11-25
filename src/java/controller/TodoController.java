package controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIInput;
import javax.faces.event.ActionEvent;
import model.OptionsModel;
import model.Todo;
import model.TodoListModel;

/**
 * Controller for a todo list.
 *
 * @author Gerald.Hurdle@AlgonquinCollege.com
 */
@ManagedBean (name="controller")
@SessionScoped
public class TodoController implements Serializable {
    private static final long serialVersionUID = 4391946429563992152L;

    private           TodoListModel model;
    // TODO :: transient to prevent GF error
    private transient UIInput       newTodoText;
    private           OptionsModel  optionsModel;
    // TODO :: transient to prevent GF error
    private transient Todo          selectedTodo;

    public TodoController() {
        super();

        model = new TodoListModel();
        optionsModel = new OptionsModel();

        newTodoText = new UIInput();
        selectedTodo = null;
    }

    public String doToggleControlColumn() {
        optionsModel.toggleControlColumn();

        return null;
    }

    public TodoListModel getModel() {
        return model;
    }

    public UIInput getNewTodoText() {
        return newTodoText;
    }

    public OptionsModel getOptionsModel() {
        return optionsModel;
    }

    public Todo getSelectedTodo() {
        return selectedTodo;
    }

    public void handleNewTodo( ActionEvent e ) {

        if ( newTodoText.getValue() == null )
            return;

        if ( newTodoText.getValue().toString().equals("") )
            return;

        // GET new todo from View
        Todo newTodo = new Todo( newTodoText.getValue().toString() );

        // SET Model to new state (i.e. append new todo)
        model.append( newTodo );

        newTodoText.setValue( "" );
    }

    public void setNewTodoText(UIInput newTodoText) {
        this.newTodoText = newTodoText;
    }

    public void setSelectedTodo( Todo selectedTodo ) {
        this.selectedTodo = selectedTodo;
    }
}
