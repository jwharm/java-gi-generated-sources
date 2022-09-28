package org.gtk.gtk;

/**
 * Used to control what selections users are allowed to make.
 */
public class SelectionMode {

    /**
     * No selection is possible.
     */
    public static final SelectionMode NONE = new SelectionMode(0);
    
    /**
     * Zero or one element may be selected.
     */
    public static final SelectionMode SINGLE = new SelectionMode(1);
    
    /**
     * Exactly one element is selected.
     *   In some circumstances, such as initially or during a search
     *   operation, it’s possible for no element to be selected with
     *   {@link SelectionMode#BROWSE}. What is really enforced is that the user
     *   can’t deselect a currently selected element except by selecting
     *   another element.
     */
    public static final SelectionMode BROWSE = new SelectionMode(2);
    
    /**
     * Any number of elements may be selected.
     *   The Ctrl key may be used to enlarge the selection, and Shift
     *   key to select between the focus and the child pointed to.
     *   Some widgets may also allow Click-drag to select a range of elements.
     */
    public static final SelectionMode MULTIPLE = new SelectionMode(3);
    
    private int value;
    
    public SelectionMode(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SelectionMode[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
