package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used by g_file_set_attributes_from_info() when setting file attributes.
 */
public class FileAttributeStatus extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Attribute value is unset (empty).
     */
    public static final FileAttributeStatus UNSET = new FileAttributeStatus(0);
    
    /**
     * Attribute value is set.
     */
    public static final FileAttributeStatus SET = new FileAttributeStatus(1);
    
    /**
     * Indicates an error in setting the value.
     */
    public static final FileAttributeStatus ERROR_SETTING = new FileAttributeStatus(2);
    
    public FileAttributeStatus(int value) {
        super(value);
    }
}
