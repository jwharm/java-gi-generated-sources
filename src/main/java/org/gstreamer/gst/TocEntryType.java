package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different types of TOC entries (see {@link TocEntry}).
 * <p>
 * There are two types of TOC entries: alternatives or parts in a sequence.
 */
public class TocEntryType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstTocEntryType";
    
    /**
     * entry is an angle (i.e. an alternative)
     */
    public static final TocEntryType ANGLE = new TocEntryType(0);
    
    /**
     * entry is a version (i.e. alternative)
     */
    public static final TocEntryType VERSION = new TocEntryType(0);
    
    /**
     * entry is an edition (i.e. alternative)
     */
    public static final TocEntryType EDITION = new TocEntryType(0);
    
    /**
     * invalid entry type value
     */
    public static final TocEntryType INVALID = new TocEntryType(0);
    
    /**
     * entry is a title (i.e. a part of a sequence)
     */
    public static final TocEntryType TITLE = new TocEntryType(1);
    
    /**
     * entry is a track (i.e. a part of a sequence)
     */
    public static final TocEntryType TRACK = new TocEntryType(2);
    
    /**
     * entry is a chapter (i.e. a part of a sequence)
     */
    public static final TocEntryType CHAPTER = new TocEntryType(3);
    
    public TocEntryType(int value) {
        super(value);
    }
    
    /**
     * Converts {@code type} to a string representation.
     * @param type a {@link TocEntryType}.
     * @return Returns a human-readable string for {@code type}. This string is
     *    only for debugging purpose and should not be displayed in a user
     *    interface.
     */
    public static @NotNull java.lang.String getNick(@NotNull org.gstreamer.gst.TocEntryType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_toc_entry_type_get_nick.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_toc_entry_type_get_nick = Interop.downcallHandle(
            "gst_toc_entry_type_get_nick",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
