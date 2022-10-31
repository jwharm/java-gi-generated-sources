package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes whether a {@code GtkFileChooser} is being used to open existing files
 * or to save to a possibly new file.
 */
public class FileChooserAction extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkFileChooserAction";
    
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
    
    public FileChooserAction(int value) {
        super(value);
    }
}
