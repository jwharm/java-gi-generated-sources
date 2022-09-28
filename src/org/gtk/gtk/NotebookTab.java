package org.gtk.gtk;

/**
 * The parameter used in the action signals of {@code GtkNotebook}.
 */
public class NotebookTab {

    /**
     * the first tab in the notebook
     */
    public static final NotebookTab FIRST = new NotebookTab(0);
    
    /**
     * the last tab in the notebook
     */
    public static final NotebookTab LAST = new NotebookTab(1);
    
    private int value;
    
    public NotebookTab(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(NotebookTab[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
