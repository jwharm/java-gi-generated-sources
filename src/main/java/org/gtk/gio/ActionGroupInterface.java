package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table for {@link ActionGroup}.
 * @version 2.28
 */
public class ActionGroupInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GActionGroupInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("has_action"),
        Interop.valueLayout.ADDRESS.withName("list_actions"),
        Interop.valueLayout.ADDRESS.withName("get_action_enabled"),
        Interop.valueLayout.ADDRESS.withName("get_action_parameter_type"),
        Interop.valueLayout.ADDRESS.withName("get_action_state_type"),
        Interop.valueLayout.ADDRESS.withName("get_action_state_hint"),
        Interop.valueLayout.ADDRESS.withName("get_action_state"),
        Interop.valueLayout.ADDRESS.withName("change_action_state"),
        Interop.valueLayout.ADDRESS.withName("activate_action"),
        Interop.valueLayout.ADDRESS.withName("action_added"),
        Interop.valueLayout.ADDRESS.withName("action_removed"),
        Interop.valueLayout.ADDRESS.withName("action_enabled_changed"),
        Interop.valueLayout.ADDRESS.withName("action_state_changed"),
        Interop.valueLayout.ADDRESS.withName("query_action")
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
     * Allocate a new {@link ActionGroupInterface}
     * @return A new, uninitialized @{link ActionGroupInterface}
     */
    public static ActionGroupInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ActionGroupInterface newInstance = new ActionGroupInterface(segment.address(), Ownership.NONE);
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
     * Create a ActionGroupInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ActionGroupInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ActionGroupInterface struct;
        
         /**
         * A {@link ActionGroupInterface.Build} object constructs a {@link ActionGroupInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ActionGroupInterface.allocate();
        }
        
         /**
         * Finish building the {@link ActionGroupInterface} struct.
         * @return A new instance of {@code ActionGroupInterface} with the fields 
         *         that were set in the Build object.
         */
        public ActionGroupInterface construct() {
            return struct;
        }
        
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
            return this;
        }
        
        public Build setHasAction(java.lang.foreign.MemoryAddress has_action) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("has_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (has_action == null ? MemoryAddress.NULL : has_action));
            return this;
        }
        
        public Build setListActions(java.lang.foreign.MemoryAddress list_actions) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("list_actions"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (list_actions == null ? MemoryAddress.NULL : list_actions));
            return this;
        }
        
        public Build setGetActionEnabled(java.lang.foreign.MemoryAddress get_action_enabled) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_action_enabled"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_action_enabled == null ? MemoryAddress.NULL : get_action_enabled));
            return this;
        }
        
        public Build setGetActionParameterType(java.lang.foreign.MemoryAddress get_action_parameter_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_action_parameter_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_action_parameter_type == null ? MemoryAddress.NULL : get_action_parameter_type));
            return this;
        }
        
        public Build setGetActionStateType(java.lang.foreign.MemoryAddress get_action_state_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_action_state_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_action_state_type == null ? MemoryAddress.NULL : get_action_state_type));
            return this;
        }
        
        public Build setGetActionStateHint(java.lang.foreign.MemoryAddress get_action_state_hint) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_action_state_hint"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_action_state_hint == null ? MemoryAddress.NULL : get_action_state_hint));
            return this;
        }
        
        public Build setGetActionState(java.lang.foreign.MemoryAddress get_action_state) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_action_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_action_state == null ? MemoryAddress.NULL : get_action_state));
            return this;
        }
        
        public Build setChangeActionState(java.lang.foreign.MemoryAddress change_action_state) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("change_action_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (change_action_state == null ? MemoryAddress.NULL : change_action_state));
            return this;
        }
        
        public Build setActivateAction(java.lang.foreign.MemoryAddress activate_action) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate_action == null ? MemoryAddress.NULL : activate_action));
            return this;
        }
        
        public Build setActionAdded(java.lang.foreign.MemoryAddress action_added) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("action_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (action_added == null ? MemoryAddress.NULL : action_added));
            return this;
        }
        
        public Build setActionRemoved(java.lang.foreign.MemoryAddress action_removed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("action_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (action_removed == null ? MemoryAddress.NULL : action_removed));
            return this;
        }
        
        public Build setActionEnabledChanged(java.lang.foreign.MemoryAddress action_enabled_changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("action_enabled_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (action_enabled_changed == null ? MemoryAddress.NULL : action_enabled_changed));
            return this;
        }
        
        public Build setActionStateChanged(java.lang.foreign.MemoryAddress action_state_changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("action_state_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (action_state_changed == null ? MemoryAddress.NULL : action_state_changed));
            return this;
        }
        
        public Build setQueryAction(java.lang.foreign.MemoryAddress query_action) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query_action == null ? MemoryAddress.NULL : query_action));
            return this;
        }
    }
}
