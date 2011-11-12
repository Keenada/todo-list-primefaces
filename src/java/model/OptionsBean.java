package model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Gerald.Hurdle@AlgonquinCollege.com
 */
@ManagedBean (name="options")
@SessionScoped
public class OptionsBean implements Serializable {
    private static final long serialVersionUID = -5363908145671481129L;

    private Boolean isControlColumn;
    private Boolean isShowDates;

    public OptionsBean() {
        super();

        isControlColumn = isShowDates = false;
    }

    public Boolean getIsControlColumn() {
        return isControlColumn;
    }

    public Boolean getIsShowDates() {
        return isShowDates;
    }

    public String doToggleControlColumn() {
        isControlColumn = ! isControlColumn;

        return null;
    }

    public void setIsShowDates( Boolean newIsShowDates ) {
        this.isShowDates = newIsShowDates;
    }
}
