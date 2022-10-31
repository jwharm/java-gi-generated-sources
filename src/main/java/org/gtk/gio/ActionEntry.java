package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This struct defines a single action.  It is for use with
 * g_action_map_add_action_entries().
 * <p>
 * The order of the items in the structure are intended to reflect
 * frequency of use.  It is permissible to use an incomplete initialiser
 * in order to leave some of the later values as {@code null}.  All values
 * after {@code name} are optional.  Additional optional fields may be added in
 * the future.
 * <p>
 * See g_action_map_add_action_entries() for an example.
 */
public class ActionEntry extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GActionEntry";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("name"),
        Interop.valueLayout.ADDRESS.withName("activate"),
        Interop.valueLayout.ADDRESS.withName("parameter_type"),
        Interop.valueLayout.ADDRESS.withName("state"),
        Interop.valueLayout.ADDRESS.withName("change_state"),
        MemoryLayout.paddingLayout(64),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_LONG).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static ActionEntry allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ActionEntry newInstance = new ActionEntry(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void name$set(java.lang.String name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(name));
    }
    
    /**
     * Get the value of the field {@code parameter_type}
     * @return The value of the field {@code parameter_type}
     */
    public java.lang.String parameter_type$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parameter_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code parameter_type}
     * @param parameter_type The new value of the field {@code parameter_type}
     */
    public void parameter_type$set(java.lang.String parameter_type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parameter_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(parameter_type));
    }
    
    /**
     * Get the value of the field {@code state}
     * @return The value of the field {@code state}
     */
    public java.lang.String state$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("state"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code state}
     * @param state The new value of the field {@code state}
     */
    public void state$set(java.lang.String state) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("state"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(state));
    }
    
    @ApiStatus.Internal
    public ActionEntry(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
