package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkKeymapKey} is a hardware key that can be mapped to a keyval.
 */
public class KeymapKey extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkKeymapKey";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("keycode"),
        ValueLayout.JAVA_INT.withName("group"),
        ValueLayout.JAVA_INT.withName("level")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static KeymapKey allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        KeymapKey newInstance = new KeymapKey(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code keycode}
     * @return The value of the field {@code keycode}
     */
    public int keycode$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("keycode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code keycode}
     * @param keycode The new value of the field {@code keycode}
     */
    public void keycode$set(int keycode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("keycode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), keycode);
    }
    
    /**
     * Get the value of the field {@code group}
     * @return The value of the field {@code group}
     */
    public int group$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("group"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code group}
     * @param group The new value of the field {@code group}
     */
    public void group$set(int group) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("group"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), group);
    }
    
    /**
     * Get the value of the field {@code level}
     * @return The value of the field {@code level}
     */
    public int level$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("level"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code level}
     * @param level The new value of the field {@code level}
     */
    public void level$set(int level) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("level"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), level);
    }
    
    @ApiStatus.Internal
    public KeymapKey(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
