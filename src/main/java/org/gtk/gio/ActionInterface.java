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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
    }
    
    @FunctionalInterface
    public interface GetNameCallback {
        java.lang.String run(org.gtk.gio.Action action);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress action) {
            var RESULT = run((org.gtk.gio.Action) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(action)), org.gtk.gio.Action.fromAddress).marshal(action, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetNameCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_name}
     * @param getName The new value of the field {@code get_name}
     */
    public void setGetName(GetNameCallback getName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getName == null ? MemoryAddress.NULL : getName.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetParameterTypeCallback {
        @Nullable org.gtk.glib.VariantType run(org.gtk.gio.Action action);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress action) {
            var RESULT = run((org.gtk.gio.Action) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(action)), org.gtk.gio.Action.fromAddress).marshal(action, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetParameterTypeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_parameter_type}
     * @param getParameterType The new value of the field {@code get_parameter_type}
     */
    public void setGetParameterType(GetParameterTypeCallback getParameterType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_parameter_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getParameterType == null ? MemoryAddress.NULL : getParameterType.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetStateTypeCallback {
        @Nullable org.gtk.glib.VariantType run(org.gtk.gio.Action action);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress action) {
            var RESULT = run((org.gtk.gio.Action) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(action)), org.gtk.gio.Action.fromAddress).marshal(action, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetStateTypeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_state_type}
     * @param getStateType The new value of the field {@code get_state_type}
     */
    public void setGetStateType(GetStateTypeCallback getStateType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_state_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getStateType == null ? MemoryAddress.NULL : getStateType.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetStateHintCallback {
        @Nullable org.gtk.glib.Variant run(org.gtk.gio.Action action);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress action) {
            var RESULT = run((org.gtk.gio.Action) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(action)), org.gtk.gio.Action.fromAddress).marshal(action, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetStateHintCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_state_hint}
     * @param getStateHint The new value of the field {@code get_state_hint}
     */
    public void setGetStateHint(GetStateHintCallback getStateHint) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_state_hint"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getStateHint == null ? MemoryAddress.NULL : getStateHint.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetEnabledCallback {
        boolean run(org.gtk.gio.Action action);

        @ApiStatus.Internal default int upcall(MemoryAddress action) {
            var RESULT = run((org.gtk.gio.Action) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(action)), org.gtk.gio.Action.fromAddress).marshal(action, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetEnabledCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_enabled}
     * @param getEnabled The new value of the field {@code get_enabled}
     */
    public void setGetEnabled(GetEnabledCallback getEnabled) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_enabled"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getEnabled == null ? MemoryAddress.NULL : getEnabled.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetStateCallback {
        @Nullable org.gtk.glib.Variant run(org.gtk.gio.Action action);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress action) {
            var RESULT = run((org.gtk.gio.Action) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(action)), org.gtk.gio.Action.fromAddress).marshal(action, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetStateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_state}
     * @param getState The new value of the field {@code get_state}
     */
    public void setGetState(GetStateCallback getState) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_state"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getState == null ? MemoryAddress.NULL : getState.toCallback()));
    }
    
    @FunctionalInterface
    public interface ChangeStateCallback {
        void run(org.gtk.gio.Action action, org.gtk.glib.Variant value);

        @ApiStatus.Internal default void upcall(MemoryAddress action, MemoryAddress value) {
            run((org.gtk.gio.Action) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(action)), org.gtk.gio.Action.fromAddress).marshal(action, Ownership.NONE), org.gtk.glib.Variant.fromAddress.marshal(value, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ChangeStateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code change_state}
     * @param changeState The new value of the field {@code change_state}
     */
    public void setChangeState(ChangeStateCallback changeState) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("change_state"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changeState == null ? MemoryAddress.NULL : changeState.toCallback()));
    }
    
    @FunctionalInterface
    public interface ActivateCallback {
        void run(org.gtk.gio.Action action, @Nullable org.gtk.glib.Variant parameter);

        @ApiStatus.Internal default void upcall(MemoryAddress action, MemoryAddress parameter) {
            run((org.gtk.gio.Action) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(action)), org.gtk.gio.Action.fromAddress).marshal(action, Ownership.NONE), org.gtk.glib.Variant.fromAddress.marshal(parameter, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ActivateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate}
     * @param activate The new value of the field {@code activate}
     */
    public void setActivate(ActivateCallback activate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("activate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
    }
    
    /**
     * Create a ActionInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ActionInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ActionInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ActionInterface(input, ownership);
    
    /**
     * A {@link ActionInterface.Builder} object constructs a {@link ActionInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ActionInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ActionInterface struct;
        
        private Builder() {
            struct = ActionInterface.allocate();
        }
        
         /**
         * Finish building the {@link ActionInterface} struct.
         * @return A new instance of {@code ActionInterface} with the fields 
         *         that were set in the Builder object.
         */
        public ActionInterface build() {
            return struct;
        }
        
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setGetName(GetNameCallback getName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getName == null ? MemoryAddress.NULL : getName.toCallback()));
            return this;
        }
        
        public Builder setGetParameterType(GetParameterTypeCallback getParameterType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_parameter_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getParameterType == null ? MemoryAddress.NULL : getParameterType.toCallback()));
            return this;
        }
        
        public Builder setGetStateType(GetStateTypeCallback getStateType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_state_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getStateType == null ? MemoryAddress.NULL : getStateType.toCallback()));
            return this;
        }
        
        public Builder setGetStateHint(GetStateHintCallback getStateHint) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_state_hint"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getStateHint == null ? MemoryAddress.NULL : getStateHint.toCallback()));
            return this;
        }
        
        public Builder setGetEnabled(GetEnabledCallback getEnabled) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_enabled"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getEnabled == null ? MemoryAddress.NULL : getEnabled.toCallback()));
            return this;
        }
        
        public Builder setGetState(GetStateCallback getState) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getState == null ? MemoryAddress.NULL : getState.toCallback()));
            return this;
        }
        
        public Builder setChangeState(ChangeStateCallback changeState) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("change_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changeState == null ? MemoryAddress.NULL : changeState.toCallback()));
            return this;
        }
        
        public Builder setActivate(ActivateCallback activate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
            return this;
        }
    }
}
