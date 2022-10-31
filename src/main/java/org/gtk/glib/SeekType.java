package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enumeration specifying the base position for a
 * g_io_channel_seek_position() operation.
 */
public class SeekType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GSeekType";
    
    /**
     * the current position in the file.
     */
    public static final SeekType CUR = new SeekType(0);
    
    /**
     * the start of the file.
     */
    public static final SeekType SET = new SeekType(1);
    
    /**
     * the end of the file.
     */
    public static final SeekType END = new SeekType(2);
    
    public SeekType(int value) {
        super(value);
    }
}
