package models;

import java.io.Serializable;

/**
 * Hold the state of all options.
 *
 * @author Gerald.Hurdle@AlgonquinCollege.com
 */
public class OptionsModel implements Serializable {
    private static final long serialVersionUID = -5363908145671481129L;

    private Boolean isControlColumn;
    private Boolean isShowDates;

    public OptionsModel() {
        super();

        isControlColumn = isShowDates = false;
    }

    public Boolean getIsControlColumn() {
        return isControlColumn;
    }

    public Boolean getIsShowDates() {
        return isShowDates;
    }

    public void setIsShowDates( Boolean newIsShowDates ) {
        this.isShowDates = newIsShowDates;
    }

    public void toggleControlColumn() {
        isControlColumn = ! isControlColumn;
    }
}
