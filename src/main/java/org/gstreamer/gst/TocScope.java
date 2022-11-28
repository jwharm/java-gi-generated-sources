package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The scope of a TOC.
 */
public class TocScope extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstTocScope";
    
    /**
     * global TOC representing all selectable options
     *     (this is what applications are usually interested in)
     */
    public static final TocScope GLOBAL = new TocScope(1);
    
    /**
     * TOC for the currently active/selected stream
     *     (this is a TOC representing the current stream from start to EOS,
     *     and is what a TOC writer / muxer is usually interested in; it will
     *     usually be a subset of the global TOC, e.g. just the chapters of
     *     the current title, or the chapters selected for playback from the
     *     current title)
     */
    public static final TocScope CURRENT = new TocScope(2);
    
    public TocScope(int value) {
        super(value);
    }
}
