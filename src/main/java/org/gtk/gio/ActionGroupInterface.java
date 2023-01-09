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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ActionGroupInterface}
     * @return A new, uninitialized @{link ActionGroupInterface}
     */
    public static ActionGroupInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ActionGroupInterface newInstance = new ActionGroupInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code HasActionCallback} callback.
     */
    @FunctionalInterface
    public interface HasActionCallback {
    
        boolean run(org.gtk.gio.ActionGroup actionGroup, java.lang.String actionName);
        
        @ApiStatus.Internal default int upcall(MemoryAddress actionGroup, MemoryAddress actionName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.ActionGroup) Interop.register(actionGroup, org.gtk.gio.ActionGroup.fromAddress).marshal(actionGroup, null), Marshal.addressToString.marshal(actionName, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HasActionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code has_action}
     * @param hasAction The new value of the field {@code has_action}
     */
    public void setHasAction(HasActionCallback hasAction) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("has_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hasAction == null ? MemoryAddress.NULL : hasAction.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ListActionsCallback} callback.
     */
    @FunctionalInterface
    public interface ListActionsCallback {
    
        java.lang.String[] run(org.gtk.gio.ActionGroup actionGroup);
        
        @ApiStatus.Internal default void upcall(MemoryAddress actionGroup) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.ActionGroup) Interop.register(actionGroup, org.gtk.gio.ActionGroup.fromAddress).marshal(actionGroup, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ListActionsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code list_actions}
     * @param listActions The new value of the field {@code list_actions}
     */
    public void setListActions(ListActionsCallback listActions) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("list_actions"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (listActions == null ? MemoryAddress.NULL : listActions.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetActionEnabledCallback} callback.
     */
    @FunctionalInterface
    public interface GetActionEnabledCallback {
    
        boolean run(org.gtk.gio.ActionGroup actionGroup, java.lang.String actionName);
        
        @ApiStatus.Internal default int upcall(MemoryAddress actionGroup, MemoryAddress actionName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.ActionGroup) Interop.register(actionGroup, org.gtk.gio.ActionGroup.fromAddress).marshal(actionGroup, null), Marshal.addressToString.marshal(actionName, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetActionEnabledCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_action_enabled}
     * @param getActionEnabled The new value of the field {@code get_action_enabled}
     */
    public void setGetActionEnabled(GetActionEnabledCallback getActionEnabled) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_action_enabled"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getActionEnabled == null ? MemoryAddress.NULL : getActionEnabled.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetActionParameterTypeCallback} callback.
     */
    @FunctionalInterface
    public interface GetActionParameterTypeCallback {
    
        @Nullable org.gtk.glib.VariantType run(org.gtk.gio.ActionGroup actionGroup, java.lang.String actionName);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress actionGroup, MemoryAddress actionName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.ActionGroup) Interop.register(actionGroup, org.gtk.gio.ActionGroup.fromAddress).marshal(actionGroup, null), Marshal.addressToString.marshal(actionName, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetActionParameterTypeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_action_parameter_type}
     * @param getActionParameterType The new value of the field {@code get_action_parameter_type}
     */
    public void setGetActionParameterType(GetActionParameterTypeCallback getActionParameterType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_action_parameter_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getActionParameterType == null ? MemoryAddress.NULL : getActionParameterType.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetActionStateTypeCallback} callback.
     */
    @FunctionalInterface
    public interface GetActionStateTypeCallback {
    
        @Nullable org.gtk.glib.VariantType run(org.gtk.gio.ActionGroup actionGroup, java.lang.String actionName);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress actionGroup, MemoryAddress actionName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.ActionGroup) Interop.register(actionGroup, org.gtk.gio.ActionGroup.fromAddress).marshal(actionGroup, null), Marshal.addressToString.marshal(actionName, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetActionStateTypeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_action_state_type}
     * @param getActionStateType The new value of the field {@code get_action_state_type}
     */
    public void setGetActionStateType(GetActionStateTypeCallback getActionStateType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_action_state_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getActionStateType == null ? MemoryAddress.NULL : getActionStateType.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetActionStateHintCallback} callback.
     */
    @FunctionalInterface
    public interface GetActionStateHintCallback {
    
        @Nullable org.gtk.glib.Variant run(org.gtk.gio.ActionGroup actionGroup, java.lang.String actionName);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress actionGroup, MemoryAddress actionName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.ActionGroup) Interop.register(actionGroup, org.gtk.gio.ActionGroup.fromAddress).marshal(actionGroup, null), Marshal.addressToString.marshal(actionName, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetActionStateHintCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_action_state_hint}
     * @param getActionStateHint The new value of the field {@code get_action_state_hint}
     */
    public void setGetActionStateHint(GetActionStateHintCallback getActionStateHint) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_action_state_hint"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getActionStateHint == null ? MemoryAddress.NULL : getActionStateHint.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetActionStateCallback} callback.
     */
    @FunctionalInterface
    public interface GetActionStateCallback {
    
        @Nullable org.gtk.glib.Variant run(org.gtk.gio.ActionGroup actionGroup, java.lang.String actionName);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress actionGroup, MemoryAddress actionName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.ActionGroup) Interop.register(actionGroup, org.gtk.gio.ActionGroup.fromAddress).marshal(actionGroup, null), Marshal.addressToString.marshal(actionName, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetActionStateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_action_state}
     * @param getActionState The new value of the field {@code get_action_state}
     */
    public void setGetActionState(GetActionStateCallback getActionState) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_action_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getActionState == null ? MemoryAddress.NULL : getActionState.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ChangeActionStateCallback} callback.
     */
    @FunctionalInterface
    public interface ChangeActionStateCallback {
    
        void run(org.gtk.gio.ActionGroup actionGroup, java.lang.String actionName, org.gtk.glib.Variant value);
        
        @ApiStatus.Internal default void upcall(MemoryAddress actionGroup, MemoryAddress actionName, MemoryAddress value) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.ActionGroup) Interop.register(actionGroup, org.gtk.gio.ActionGroup.fromAddress).marshal(actionGroup, null), Marshal.addressToString.marshal(actionName, null), org.gtk.glib.Variant.fromAddress.marshal(value, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ChangeActionStateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code change_action_state}
     * @param changeActionState The new value of the field {@code change_action_state}
     */
    public void setChangeActionState(ChangeActionStateCallback changeActionState) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("change_action_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changeActionState == null ? MemoryAddress.NULL : changeActionState.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ActivateActionCallback} callback.
     */
    @FunctionalInterface
    public interface ActivateActionCallback {
    
        void run(org.gtk.gio.ActionGroup actionGroup, java.lang.String actionName, @Nullable org.gtk.glib.Variant parameter);
        
        @ApiStatus.Internal default void upcall(MemoryAddress actionGroup, MemoryAddress actionName, MemoryAddress parameter) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.ActionGroup) Interop.register(actionGroup, org.gtk.gio.ActionGroup.fromAddress).marshal(actionGroup, null), Marshal.addressToString.marshal(actionName, null), org.gtk.glib.Variant.fromAddress.marshal(parameter, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActivateActionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate_action}
     * @param activateAction The new value of the field {@code activate_action}
     */
    public void setActivateAction(ActivateActionCallback activateAction) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activateAction == null ? MemoryAddress.NULL : activateAction.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ActionAddedCallback} callback.
     */
    @FunctionalInterface
    public interface ActionAddedCallback {
    
        void run(org.gtk.gio.ActionGroup actionGroup, java.lang.String actionName);
        
        @ApiStatus.Internal default void upcall(MemoryAddress actionGroup, MemoryAddress actionName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.ActionGroup) Interop.register(actionGroup, org.gtk.gio.ActionGroup.fromAddress).marshal(actionGroup, null), Marshal.addressToString.marshal(actionName, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActionAddedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code action_added}
     * @param actionAdded The new value of the field {@code action_added}
     */
    public void setActionAdded(ActionAddedCallback actionAdded) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("action_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (actionAdded == null ? MemoryAddress.NULL : actionAdded.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ActionRemovedCallback} callback.
     */
    @FunctionalInterface
    public interface ActionRemovedCallback {
    
        void run(org.gtk.gio.ActionGroup actionGroup, java.lang.String actionName);
        
        @ApiStatus.Internal default void upcall(MemoryAddress actionGroup, MemoryAddress actionName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.ActionGroup) Interop.register(actionGroup, org.gtk.gio.ActionGroup.fromAddress).marshal(actionGroup, null), Marshal.addressToString.marshal(actionName, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActionRemovedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code action_removed}
     * @param actionRemoved The new value of the field {@code action_removed}
     */
    public void setActionRemoved(ActionRemovedCallback actionRemoved) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("action_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (actionRemoved == null ? MemoryAddress.NULL : actionRemoved.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ActionEnabledChangedCallback} callback.
     */
    @FunctionalInterface
    public interface ActionEnabledChangedCallback {
    
        void run(org.gtk.gio.ActionGroup actionGroup, java.lang.String actionName, boolean enabled);
        
        @ApiStatus.Internal default void upcall(MemoryAddress actionGroup, MemoryAddress actionName, int enabled) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.ActionGroup) Interop.register(actionGroup, org.gtk.gio.ActionGroup.fromAddress).marshal(actionGroup, null), Marshal.addressToString.marshal(actionName, null), Marshal.integerToBoolean.marshal(enabled, null).booleanValue());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActionEnabledChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code action_enabled_changed}
     * @param actionEnabledChanged The new value of the field {@code action_enabled_changed}
     */
    public void setActionEnabledChanged(ActionEnabledChangedCallback actionEnabledChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("action_enabled_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (actionEnabledChanged == null ? MemoryAddress.NULL : actionEnabledChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ActionStateChangedCallback} callback.
     */
    @FunctionalInterface
    public interface ActionStateChangedCallback {
    
        void run(org.gtk.gio.ActionGroup actionGroup, java.lang.String actionName, org.gtk.glib.Variant state);
        
        @ApiStatus.Internal default void upcall(MemoryAddress actionGroup, MemoryAddress actionName, MemoryAddress state) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.ActionGroup) Interop.register(actionGroup, org.gtk.gio.ActionGroup.fromAddress).marshal(actionGroup, null), Marshal.addressToString.marshal(actionName, null), org.gtk.glib.Variant.fromAddress.marshal(state, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActionStateChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code action_state_changed}
     * @param actionStateChanged The new value of the field {@code action_state_changed}
     */
    public void setActionStateChanged(ActionStateChangedCallback actionStateChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("action_state_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (actionStateChanged == null ? MemoryAddress.NULL : actionStateChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QueryActionCallback} callback.
     */
    @FunctionalInterface
    public interface QueryActionCallback {
    
        boolean run(org.gtk.gio.ActionGroup actionGroup, java.lang.String actionName, Out<Boolean> enabled, @Nullable Out<org.gtk.glib.VariantType> parameterType, @Nullable Out<org.gtk.glib.VariantType> stateType, @Nullable Out<org.gtk.glib.Variant> stateHint, @Nullable Out<org.gtk.glib.Variant> state);
        
        @ApiStatus.Internal default int upcall(MemoryAddress actionGroup, MemoryAddress actionName, MemoryAddress enabled, MemoryAddress parameterType, MemoryAddress stateType, MemoryAddress stateHint, MemoryAddress state) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Boolean> enabledOUT = new Out<>(enabled.get(Interop.valueLayout.C_INT, 0) != 0);
                Out<org.gtk.glib.VariantType> parameterTypeOUT = new Out<>(org.gtk.glib.VariantType.fromAddress.marshal(parameterType, null));
                Out<org.gtk.glib.VariantType> stateTypeOUT = new Out<>(org.gtk.glib.VariantType.fromAddress.marshal(stateType, null));
                Out<org.gtk.glib.Variant> stateHintOUT = new Out<>(org.gtk.glib.Variant.fromAddress.marshal(stateHint, null));
                Out<org.gtk.glib.Variant> stateOUT = new Out<>(org.gtk.glib.Variant.fromAddress.marshal(state, null));
                var RESULT = run((org.gtk.gio.ActionGroup) Interop.register(actionGroup, org.gtk.gio.ActionGroup.fromAddress).marshal(actionGroup, null), Marshal.addressToString.marshal(actionName, null), enabledOUT, parameterTypeOUT, stateTypeOUT, stateHintOUT, stateOUT);
                enabled.set(Interop.valueLayout.C_INT, 0, enabledOUT.get() ? 1 : 0);
                parameterType.set(Interop.valueLayout.ADDRESS, 0, parameterTypeOUT.get().handle());
                stateType.set(Interop.valueLayout.ADDRESS, 0, stateTypeOUT.get().handle());
                stateHint.set(Interop.valueLayout.ADDRESS, 0, stateHintOUT.get().handle());
                state.set(Interop.valueLayout.ADDRESS, 0, stateOUT.get().handle());
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueryActionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query_action}
     * @param queryAction The new value of the field {@code query_action}
     */
    public void setQueryAction(QueryActionCallback queryAction) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryAction == null ? MemoryAddress.NULL : queryAction.toCallback()));
        }
    }
    
    /**
     * Create a ActionGroupInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ActionGroupInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ActionGroupInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ActionGroupInterface(input);
    
    /**
     * A {@link ActionGroupInterface.Builder} object constructs a {@link ActionGroupInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ActionGroupInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ActionGroupInterface struct;
        
        private Builder() {
            struct = ActionGroupInterface.allocate();
        }
        
        /**
         * Finish building the {@link ActionGroupInterface} struct.
         * @return A new instance of {@code ActionGroupInterface} with the fields 
         *         that were set in the Builder object.
         */
        public ActionGroupInterface build() {
            return struct;
        }
        
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
        
        public Builder setHasAction(HasActionCallback hasAction) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("has_action"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hasAction == null ? MemoryAddress.NULL : hasAction.toCallback()));
                return this;
            }
        }
        
        public Builder setListActions(ListActionsCallback listActions) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("list_actions"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (listActions == null ? MemoryAddress.NULL : listActions.toCallback()));
                return this;
            }
        }
        
        public Builder setGetActionEnabled(GetActionEnabledCallback getActionEnabled) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_action_enabled"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getActionEnabled == null ? MemoryAddress.NULL : getActionEnabled.toCallback()));
                return this;
            }
        }
        
        public Builder setGetActionParameterType(GetActionParameterTypeCallback getActionParameterType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_action_parameter_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getActionParameterType == null ? MemoryAddress.NULL : getActionParameterType.toCallback()));
                return this;
            }
        }
        
        public Builder setGetActionStateType(GetActionStateTypeCallback getActionStateType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_action_state_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getActionStateType == null ? MemoryAddress.NULL : getActionStateType.toCallback()));
                return this;
            }
        }
        
        public Builder setGetActionStateHint(GetActionStateHintCallback getActionStateHint) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_action_state_hint"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getActionStateHint == null ? MemoryAddress.NULL : getActionStateHint.toCallback()));
                return this;
            }
        }
        
        public Builder setGetActionState(GetActionStateCallback getActionState) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_action_state"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getActionState == null ? MemoryAddress.NULL : getActionState.toCallback()));
                return this;
            }
        }
        
        public Builder setChangeActionState(ChangeActionStateCallback changeActionState) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("change_action_state"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changeActionState == null ? MemoryAddress.NULL : changeActionState.toCallback()));
                return this;
            }
        }
        
        public Builder setActivateAction(ActivateActionCallback activateAction) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("activate_action"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activateAction == null ? MemoryAddress.NULL : activateAction.toCallback()));
                return this;
            }
        }
        
        public Builder setActionAdded(ActionAddedCallback actionAdded) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("action_added"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (actionAdded == null ? MemoryAddress.NULL : actionAdded.toCallback()));
                return this;
            }
        }
        
        public Builder setActionRemoved(ActionRemovedCallback actionRemoved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("action_removed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (actionRemoved == null ? MemoryAddress.NULL : actionRemoved.toCallback()));
                return this;
            }
        }
        
        public Builder setActionEnabledChanged(ActionEnabledChangedCallback actionEnabledChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("action_enabled_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (actionEnabledChanged == null ? MemoryAddress.NULL : actionEnabledChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setActionStateChanged(ActionStateChangedCallback actionStateChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("action_state_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (actionStateChanged == null ? MemoryAddress.NULL : actionStateChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setQueryAction(QueryActionCallback queryAction) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("query_action"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (queryAction == null ? MemoryAddress.NULL : queryAction.toCallback()));
                return this;
            }
        }
    }
}
