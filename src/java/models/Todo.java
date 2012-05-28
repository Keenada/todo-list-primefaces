package models;

import java.io.Serializable;
import java.util.Date;

/**
 * Model a todo item.
 *
 * @author Gerald.Hurdle@AlgonquinCollege.com
 */
public class Todo implements Serializable {
    // TODO :: use plugin to generate
    private static final long serialVersionUID = -2223642102698573238L;
    
    private static int INCREMENT_SEED;

    private Date    dateCreated;
    private Date    dateModified;
    private String  todo;
    private Integer todoID;
    
    static {
        INCREMENT_SEED = 1;
    }

    private Todo() { }

    public Todo(String todo) {
        super();

        this.todoID = INCREMENT_SEED;
        INCREMENT_SEED++;

        this.todo = todo;

        this.dateCreated = this.dateModified = new Date();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public String getTodo() {
        return todo;
    }

    public Integer getTodoID() {
        return todoID;
    }

    public void setTodo(String todo) {
        this.todo = todo;

        this.dateModified = new Date();
    }

    @Override
    public String toString() {
        return todo;
    }
}
