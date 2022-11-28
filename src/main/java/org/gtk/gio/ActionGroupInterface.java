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
    public org.gtk.gobject.TypeInterface gIface$get() {
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
        
        public Build setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Build setHasAction(java.lang.foreign.MemoryAddress hasAction) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("has_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hasAction == null ? MemoryAddress.NULL : hasAction));
            return this;
        }
        
        public Build setListActions(java.lang.foreign.MemoryAddress listActions) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("list_actions"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (listActions == null ? MemoryAddress.NULL : listActions));
            return this;
        }
        
        public Build setGetActionEnabled(java.lang.foreign.MemoryAddress getActionEnabled) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_action_enabled"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getActionEnabled == null ? MemoryAddress.NULL : getActionEnabled));
            return this;
        }
        
        public Build setGetActionParameterType(java.lang.foreign.MemoryAddress getActionParameterType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_action_parameter_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getActionParameterType == null ? MemoryAddress.NULL : getActionParameterType));
            return this;
        }
        
        public Build setGetActionStateType(java.lang.foreign.MemoryAddress getActionStateType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_action_state_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getActionStateType == null ? MemoryAddress.NULL : getActionStateType));
            return this;
        }
        
        public Build setGetActionStateHint(java.lang.foreign.MemoryAddress getActionStateHint) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_action_state_hint"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getActionStateHint == null ? MemoryAddress.NULL : getActionStateHint));
            return this;
        }
        
        public Build setGetActionState(java.lang.foreign.MemoryAddress getActionState) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_action_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getActionState == null ? MemoryAddress.NULL : getActionState));
            return this;
        }
        
        public Build setChangeActionState(java.lang.foreign.MemoryAddress changeActionState) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("change_action_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changeActionState == null ? MemoryAddress.NULL : changeActionState));
            return this;
        }
        
        public Build setActivateAction(java.lang.foreign.MemoryAddress activateAction) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activateAction == null ? MemoryAddress.NULL : activateAction));
            return this;
        }
        
        public Build setActionAdded(java.lang.foreign.MemoryAddress actionAdded) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("action_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (actionAdded == null ? MemoryAddress.NULL : actionAdded));
            return this;
        }
        
        public Build setActionRemoved(java.lang.foreign.MemoryAddress actionRemoved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("action_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (actionRemoved == null ? MemoryAddress.NULL : actionRemoved));
            return this;
        }
        
        public Build setActionEnabledChanged(java.lang.foreign.MemoryAddress actionEnabledChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("action_enabled_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (actionEnabledChanged == null ? MemoryAddress.NULL : actionEnabledChanged));
            return this;
        }
        
        public Build setActionStateChanged(java.lang.foreign.MemoryAddress actionStateChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("action_state_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (actionStateChanged == null ? MemoryAddress.NULL : actionStateChanged));
            return this;
        }
        
        public Build setQueryAction(java.lang.foreign.MemoryAddress queryAction) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryAction == null ? MemoryAddress.NULL : queryAction));
            return this;
        }
    }
}
