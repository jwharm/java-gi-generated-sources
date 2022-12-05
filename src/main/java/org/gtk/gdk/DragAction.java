package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used in {@code GdkDrop} and {@code GdkDrag} to indicate the actions that the
 * destination can and should do with the dropped data.
 */
public class DragAction extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GdkDragAction";
    
    /**
     * Copy the data.
     */
    public static final DragAction COPY = new DragAction(1);
    
    /**
     * Move the data, i.e. first copy it, then delete
     *   it from the source using the DELETE target of the X selection protocol.
     */
    public static final DragAction MOVE = new DragAction(2);
    
    /**
     * Add a link to the data. Note that this is only
     *   useful if source and destination agree on what it means, and is not
     *   supported on all platforms.
     */
    public static final DragAction LINK = new DragAction(4);
    
    /**
     * Ask the user what to do with the data.
     */
    public static final DragAction ASK = new DragAction(8);
    
    public DragAction(int value) {
        super(value);
    }
    
    /**
     * Checks if {@code action} represents a single action or includes
     * multiple actions.
     * <p>
     * When {@code action} is 0 - ie no action was given, {@code true}
     * is returned.
     * @param action a {@code GdkDragAction}
     * @return {@code true} if exactly one action was given
     */
    public static boolean isUnique(@NotNull org.gtk.gdk.DragAction action) {
        java.util.Objects.requireNonNull(action, "Parameter 'action' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_drag_action_is_unique.invokeExact(
                    action.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public DragAction or(DragAction mask) {
        return new DragAction(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static DragAction combined(DragAction mask, DragAction... masks) {
        int value = mask.getValue();        for (DragAction arg : masks) {
            value |= arg.getValue();
        }
        return new DragAction(value);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_drag_action_is_unique = Interop.downcallHandle(
            "gdk_drag_action_is_unique",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }
}
