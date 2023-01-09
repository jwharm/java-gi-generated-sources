package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The scope of a TOC.
 */
public enum TocScope implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * global TOC representing all selectable options
     *     (this is what applications are usually interested in)
     */
    GLOBAL(1),
    
    /**
     * TOC for the currently active/selected stream
     *     (this is a TOC representing the current stream from start to EOS,
     *     and is what a TOC writer / muxer is usually interested in; it will
     *     usually be a subset of the global TOC, e.g. just the chapters of
     *     the current title, or the chapters selected for playback from the
     *     current title)
     */
    CURRENT(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstTocScope";
    
    private final int value;
    
    /**
     * Create a new TocScope for the provided value
     * @param numeric value the enum value
     */
    TocScope(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new TocScope for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TocScope of(int value) {
        return switch (value) {
            case 1 -> GLOBAL;
            case 2 -> CURRENT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
