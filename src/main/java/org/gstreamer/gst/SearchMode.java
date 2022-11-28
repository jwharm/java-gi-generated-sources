package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different search modes.
 */
public class SearchMode extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstSearchMode";
    
    /**
     * Only search for exact matches.
     */
    public static final SearchMode EXACT = new SearchMode(0);
    
    /**
     * Search for an exact match or the element just before.
     */
    public static final SearchMode BEFORE = new SearchMode(1);
    
    /**
     * Search for an exact match or the element just after.
     */
    public static final SearchMode AFTER = new SearchMode(2);
    
    public SearchMode(int value) {
        super(value);
    }
}
