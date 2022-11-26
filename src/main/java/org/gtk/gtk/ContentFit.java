package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Controls how a content should be made to fit inside an allocation.
 * @version 4.8
 */
public class ContentFit extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkContentFit";
    
    /**
     * Make the content fill the entire allocation,
     *   without taking its aspect ratio in consideration. The resulting
     *   content will appear as stretched if its aspect ratio is different
     *   from the allocation aspect ratio.
     */
    public static final ContentFit FILL = new ContentFit(0);
    
    /**
     * Scale the content to fit the allocation,
     *   while taking its aspect ratio in consideration. The resulting
     *   content will appear as letterboxed if its aspect ratio is different
     *   from the allocation aspect ratio.
     */
    public static final ContentFit CONTAIN = new ContentFit(1);
    
    /**
     * Cover the entire allocation, while taking
     *   the content aspect ratio in consideration. The resulting content
     *   will appear as clipped if its aspect ratio is different from the
     *   allocation aspect ratio.
     */
    public static final ContentFit COVER = new ContentFit(2);
    
    /**
     * The content is scaled down to fit the
     *   allocation, if needed, otherwise its original size is used.
     */
    public static final ContentFit SCALE_DOWN = new ContentFit(3);
    
    public ContentFit(int value) {
        super(value);
    }
}
