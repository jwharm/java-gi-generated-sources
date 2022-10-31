package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags specifying the behaviour of an attribute.
 */
public class FileAttributeInfoFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GFileAttributeInfoFlags";
    
    /**
     * no flags set.
     */
    public static final FileAttributeInfoFlags NONE = new FileAttributeInfoFlags(0);
    
    /**
     * copy the attribute values when the file is copied.
     */
    public static final FileAttributeInfoFlags COPY_WITH_FILE = new FileAttributeInfoFlags(1);
    
    /**
     * copy the attribute values when the file is moved.
     */
    public static final FileAttributeInfoFlags COPY_WHEN_MOVED = new FileAttributeInfoFlags(2);
    
    public FileAttributeInfoFlags(int value) {
        super(value);
    }
}
