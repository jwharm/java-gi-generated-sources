package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when querying a {@link FileInfo}.
 */
public class FileQueryInfoFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GFileQueryInfoFlags";
    
    /**
     * No flags set.
     */
    public static final FileQueryInfoFlags NONE = new FileQueryInfoFlags(0);
    
    /**
     * Don't follow symlinks.
     */
    public static final FileQueryInfoFlags NOFOLLOW_SYMLINKS = new FileQueryInfoFlags(1);
    
    public FileQueryInfoFlags(int value) {
        super(value);
    }
}
