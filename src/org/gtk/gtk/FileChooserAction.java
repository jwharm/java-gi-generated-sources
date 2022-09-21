package org.gtk.gtk;

/**
 * Describes whether a {@code GtkFileChooser} is being used to open existing files
 * or to save to a possibly new file.
 */
public enum FileChooserAction {

    /**
     * Indicates open mode.  The file chooser
     *  will only let the user pick an existing file.
     */
    OPEN,
    
    /**
     * Indicates save mode.  The file chooser
     *  will let the user pick an existing file, or type in a new
     *  filename.
     */
    SAVE,
    
    /**
     * Indicates an Open mode for
     *  selecting folders.  The file chooser will let the user pick an
     *  existing folder.
     */
    SELECT_FOLDER;
    
    public static FileChooserAction fromValue(int value) {
        return switch(value) {
            case 0 -> OPEN;
            case 1 -> SAVE;
            case 2 -> SELECT_FOLDER;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case OPEN -> 0;
            case SAVE -> 1;
            case SELECT_FOLDER -> 2;
        };
    }

}
