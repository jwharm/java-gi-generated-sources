package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes whether a {@code GtkFileChooser} is being used to open existing files
 * or to save to a possibly new file.
 */
public enum FileChooserAction implements io.github.jwharm.javagi.Enumeration {
    /**
     * Indicates open mode.  The file chooser
     *  will only let the user pick an existing file.
     */
    OPEN(0),
    /**
     * Indicates save mode.  The file chooser
     *  will let the user pick an existing file, or type in a new
     *  filename.
     */
    SAVE(1),
    /**
     * Indicates an Open mode for
     *  selecting folders.  The file chooser will let the user pick an
     *  existing folder.
     */
    SELECT_FOLDER(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkFileChooserAction";
    
    private final int value;
    FileChooserAction(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static FileChooserAction of(int value) {
        return switch (value) {
            case 0 -> OPEN;
            case 1 -> SAVE;
            case 2 -> SELECT_FOLDER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
