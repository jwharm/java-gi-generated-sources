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
public enum TocEntryType implements io.github.jwharm.javagi.Enumeration {
    /**
     * entry is an angle (i.e. an alternative)
     */
    ANGLE(-3),
    /**
     * entry is a version (i.e. alternative)
     */
    VERSION(-2),
    /**
     * entry is an edition (i.e. alternative)
     */
    EDITION(-1),
    /**
     * invalid entry type value
     */
    INVALID(0),
    /**
     * entry is a title (i.e. a part of a sequence)
     */
    TITLE(1),
    /**
     * entry is a track (i.e. a part of a sequence)
     */
    TRACK(2),
    /**
     * entry is a chapter (i.e. a part of a sequence)
     */
    CHAPTER(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstTocEntryType";
    
    private final int value;
    TocEntryType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TocEntryType of(int value) {
        return switch (value) {
            case -3 -> ANGLE;
            case -2 -> VERSION;
            case -1 -> EDITION;
            case 0 -> INVALID;
            case 1 -> TITLE;
            case 2 -> TRACK;
            case 3 -> CHAPTER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
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
