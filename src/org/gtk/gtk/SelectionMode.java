package org.gtk.gtk;

/**
 * Used to control what selections users are allowed to make.
 */
public enum SelectionMode {

    /**
     * No selection is possible.
     */
    NONE,
    
    /**
     * Zero or one element may be selected.
     */
    SINGLE,
    
    /**
     * Exactly one element is selected.
     *   In some circumstances, such as initially or during a search
     *   operation, it’s possible for no element to be selected with
     *   %GTK_SELECTION_BROWSE. What is really enforced is that the user
     *   can’t deselect a currently selected element except by selecting
     *   another element.
     */
    BROWSE,
    
    /**
     * Any number of elements may be selected.
     *   The Ctrl key may be used to enlarge the selection, and Shift
     *   key to select between the focus and the child pointed to.
     *   Some widgets may also allow Click-drag to select a range of elements.
     */
    MULTIPLE;
    
    public static SelectionMode fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> SINGLE;
            case 2 -> BROWSE;
            case 3 -> MULTIPLE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case SINGLE -> 1;
            case BROWSE -> 2;
            case MULTIPLE -> 3;
        };
    }

}
