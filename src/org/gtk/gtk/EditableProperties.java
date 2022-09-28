package org.gtk.gtk;

/**
 * The identifiers for {@code Gtk.Editable} properties.
 * <p>
 * See {@link Gtk#Editable} for details on how to
 * implement the {@code GtkEditable} interface.
 */
public class EditableProperties {

    /**
     * the property id for {@code Gtk.Editable:text}
     */
    public static final EditableProperties PROP_TEXT = new EditableProperties(0);
    
    /**
     * the property id for {@code Gtk.Editable:cursor-position}
     */
    public static final EditableProperties PROP_CURSOR_POSITION = new EditableProperties(1);
    
    /**
     * the property id for {@code Gtk.Editable:selection-bound}
     */
    public static final EditableProperties PROP_SELECTION_BOUND = new EditableProperties(2);
    
    /**
     * the property id for {@code Gtk.Editable:editable}
     */
    public static final EditableProperties PROP_EDITABLE = new EditableProperties(3);
    
    /**
     * the property id for {@code Gtk.Editable:width-chars}
     */
    public static final EditableProperties PROP_WIDTH_CHARS = new EditableProperties(4);
    
    /**
     * the property id for {@code Gtk.Editable:max-width-chars}
     */
    public static final EditableProperties PROP_MAX_WIDTH_CHARS = new EditableProperties(5);
    
    /**
     * the property id for {@code Gtk.Editable:xalign}
     */
    public static final EditableProperties PROP_XALIGN = new EditableProperties(6);
    
    /**
     * the property id for {@code Gtk.Editable:enable-undo}
     */
    public static final EditableProperties PROP_ENABLE_UNDO = new EditableProperties(7);
    
    /**
     * the number of properties
     */
    public static final EditableProperties NUM_PROPERTIES = new EditableProperties(8);
    
    private int value;
    
    public EditableProperties(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(EditableProperties[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
