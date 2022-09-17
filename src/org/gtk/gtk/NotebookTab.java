package org.gtk.gtk;

/**
 * The parameter used in the action signals of <code>GtkNotebook</code>.
 */
public enum NotebookTab {

    /**
     * the first tab in the notebook
     */
    FIRST,
    
    /**
     * the last tab in the notebook
     */
    LAST;
    
    public static NotebookTab fromValue(int value) {
        return switch(value) {
            case 0 -> FIRST;
            case 1 -> LAST;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case FIRST -> 0;
            case LAST -> 1;
        };
    }

}
