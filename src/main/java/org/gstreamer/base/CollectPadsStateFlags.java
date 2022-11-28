package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CollectPadsStateFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstCollectPadsStateFlags";
    
    /**
     * Set if collectdata's pad is EOS.
     */
    public static final CollectPadsStateFlags EOS = new CollectPadsStateFlags(1);
    
    /**
     * Set if collectdata's pad is flushing.
     */
    public static final CollectPadsStateFlags FLUSHING = new CollectPadsStateFlags(2);
    
    /**
     * Set if collectdata's pad received a
     *                                      new_segment event.
     */
    public static final CollectPadsStateFlags NEW_SEGMENT = new CollectPadsStateFlags(4);
    
    /**
     * Set if collectdata's pad must be waited
     *                                      for when collecting.
     */
    public static final CollectPadsStateFlags WAITING = new CollectPadsStateFlags(8);
    
    /**
     * Set collectdata's pad WAITING state must
     *                                      not be changed.
     * {@link CollectPadsStateFlags} indicate private state of a collectdata('s pad).
     */
    public static final CollectPadsStateFlags LOCKED = new CollectPadsStateFlags(16);
    
    public CollectPadsStateFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public CollectPadsStateFlags combined(CollectPadsStateFlags mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static CollectPadsStateFlags combined(CollectPadsStateFlags mask, CollectPadsStateFlags... masks) {
        for (CollectPadsStateFlags arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
