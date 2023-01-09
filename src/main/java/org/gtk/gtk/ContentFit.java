package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Controls how a content should be made to fit inside an allocation.
 * @version 4.8
 */
public enum ContentFit implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Make the content fill the entire allocation,
     *   without taking its aspect ratio in consideration. The resulting
     *   content will appear as stretched if its aspect ratio is different
     *   from the allocation aspect ratio.
     */
    FILL(0),
    
    /**
     * Scale the content to fit the allocation,
     *   while taking its aspect ratio in consideration. The resulting
     *   content will appear as letterboxed if its aspect ratio is different
     *   from the allocation aspect ratio.
     */
    CONTAIN(1),
    
    /**
     * Cover the entire allocation, while taking
     *   the content aspect ratio in consideration. The resulting content
     *   will appear as clipped if its aspect ratio is different from the
     *   allocation aspect ratio.
     */
    COVER(2),
    
    /**
     * The content is scaled down to fit the
     *   allocation, if needed, otherwise its original size is used.
     */
    SCALE_DOWN(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkContentFit";
    
    private final int value;
    
    /**
     * Create a new ContentFit for the provided value
     * @param numeric value the enum value
     */
    ContentFit(int value) {
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
     * Create a new ContentFit for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ContentFit of(int value) {
        return switch (value) {
            case 0 -> FILL;
            case 1 -> CONTAIN;
            case 2 -> COVER;
            case 3 -> SCALE_DOWN;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
