package org.gtk.gtk;

/**
 * Describes whether a {@code GtkFileChooser} is being used to open existing files
 * or to save to a possibly new file.
 */
public class FileChooserAction {

    /**
     * Indicates open mode.  The file chooser
     *  will only let the user pick an existing file.
     */
    public static final FileChooserAction OPEN = new FileChooserAction(0);
    
    /**
     * Indicates save mode.  The file chooser
     *  will let the user pick an existing file, or type in a new
     *  filename.
     */
    public static final FileChooserAction SAVE = new FileChooserAction(1);
    
    /**
     * Indicates an Open mode for
     *  selecting folders.  The file chooser will let the user pick an
     *  existing folder.
     */
    public static final FileChooserAction SELECT_FOLDER = new FileChooserAction(2);
    
    private int value;
    
    public FileChooserAction(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FileChooserAction[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
