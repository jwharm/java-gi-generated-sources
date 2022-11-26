package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table for {@link Action}.
 * @version 2.28
 */
public class ActionInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GActionInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("get_name"),
        Interop.valueLayout.ADDRESS.withName("get_parameter_type"),
        Interop.valueLayout.ADDRESS.withName("get_state_type"),
        Interop.valueLayout.ADDRESS.withName("get_state_hint"),
        Interop.valueLayout.ADDRESS.withName("get_enabled"),
        Interop.valueLayout.ADDRESS.withName("get_state"),
        Interop.valueLayout.ADDRESS.withName("change_state"),
        Interop.valueLayout.ADDRESS.withName("activate")
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
     * Allocate a new {@link ActionInterface}
     * @return A new, uninitialized @{link ActionInterface}
     */
    public static ActionInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ActionInterface newInstance = new ActionInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface g_iface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a ActionInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ActionInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ActionInterface struct;
        
         /**
         * A {@link ActionInterface.Build} object constructs a {@link ActionInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ActionInterface.allocate();
        }
        
         /**
         * Finish building the {@link ActionInterface} struct.
         * @return A new instance of {@code ActionInterface} with the fields 
         *         that were set in the Build object.
         */
        public ActionInterface construct() {
            return struct;
        }
        
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
            return this;
        }
        
        public Build setGetName(java.lang.foreign.MemoryAddress get_name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_name == null ? MemoryAddress.NULL : get_name));
            return this;
        }
        
        public Build setGetParameterType(java.lang.foreign.MemoryAddress get_parameter_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_parameter_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_parameter_type == null ? MemoryAddress.NULL : get_parameter_type));
            return this;
        }
        
        public Build setGetStateType(java.lang.foreign.MemoryAddress get_state_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_state_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_state_type == null ? MemoryAddress.NULL : get_state_type));
            return this;
        }
        
        public Build setGetStateHint(java.lang.foreign.MemoryAddress get_state_hint) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_state_hint"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_state_hint == null ? MemoryAddress.NULL : get_state_hint));
            return this;
        }
        
        public Build setGetEnabled(java.lang.foreign.MemoryAddress get_enabled) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_enabled"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_enabled == null ? MemoryAddress.NULL : get_enabled));
            return this;
        }
        
        public Build setGetState(java.lang.foreign.MemoryAddress get_state) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_state == null ? MemoryAddress.NULL : get_state));
            return this;
        }
        
        public Build setChangeState(java.lang.foreign.MemoryAddress change_state) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("change_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (change_state == null ? MemoryAddress.NULL : change_state));
            return this;
        }
        
        public Build setActivate(java.lang.foreign.MemoryAddress activate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate == null ? MemoryAddress.NULL : activate));
            return this;
        }
    }
}
