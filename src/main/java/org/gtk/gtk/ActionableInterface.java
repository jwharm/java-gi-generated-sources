package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The interface vtable for {@code GtkActionable}.
 */
public class ActionableInterface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkActionableInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("get_action_name"),
        Interop.valueLayout.ADDRESS.withName("set_action_name"),
        Interop.valueLayout.ADDRESS.withName("get_action_target_value"),
        Interop.valueLayout.ADDRESS.withName("set_action_target_value")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ActionableInterface}
     * @return A new, uninitialized @{link ActionableInterface}
     */
    public static ActionableInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ActionableInterface newInstance = new ActionableInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ActionableInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ActionableInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ActionableInterface struct;
        
         /**
         * A {@link ActionableInterface.Build} object constructs a {@link ActionableInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ActionableInterface.allocate();
        }
        
         /**
         * Finish building the {@link ActionableInterface} struct.
         * @return A new instance of {@code ActionableInterface} with the fields 
         *         that were set in the Build object.
         */
        public ActionableInterface construct() {
            return struct;
        }
        
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
            return this;
        }
        
        public Build setGetActionName(java.lang.foreign.MemoryAddress get_action_name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_action_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_action_name == null ? MemoryAddress.NULL : get_action_name));
            return this;
        }
        
        public Build setSetActionName(java.lang.foreign.MemoryAddress set_action_name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_action_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_action_name == null ? MemoryAddress.NULL : set_action_name));
            return this;
        }
        
        public Build setGetActionTargetValue(java.lang.foreign.MemoryAddress get_action_target_value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_action_target_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_action_target_value == null ? MemoryAddress.NULL : get_action_target_value));
            return this;
        }
        
        public Build setSetActionTargetValue(java.lang.foreign.MemoryAddress set_action_target_value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_action_target_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_action_target_value == null ? MemoryAddress.NULL : set_action_target_value));
            return this;
        }
    }
}
