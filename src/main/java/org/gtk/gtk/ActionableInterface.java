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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("get_action_name"),
            Interop.valueLayout.ADDRESS.withName("set_action_name"),
            Interop.valueLayout.ADDRESS.withName("get_action_target_value"),
            Interop.valueLayout.ADDRESS.withName("set_action_target_value")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ActionableInterface}
     * @return A new, uninitialized @{link ActionableInterface}
     */
    public static ActionableInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ActionableInterface newInstance = new ActionableInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code GetActionNameCallback} callback.
     */
    @FunctionalInterface
    public interface GetActionNameCallback {
    
        @Nullable java.lang.String run(org.gtk.gtk.Actionable actionable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress actionable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gtk.Actionable) Interop.register(actionable, org.gtk.gtk.Actionable.fromAddress).marshal(actionable, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetActionNameCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_action_name}
     * @param getActionName The new value of the field {@code get_action_name}
     */
    public void setGetActionName(GetActionNameCallback getActionName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_action_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getActionName == null ? MemoryAddress.NULL : getActionName.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetActionNameCallback} callback.
     */
    @FunctionalInterface
    public interface SetActionNameCallback {
    
        void run(org.gtk.gtk.Actionable actionable, @Nullable java.lang.String actionName);
        
        @ApiStatus.Internal default void upcall(MemoryAddress actionable, MemoryAddress actionName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gtk.Actionable) Interop.register(actionable, org.gtk.gtk.Actionable.fromAddress).marshal(actionable, null), Marshal.addressToString.marshal(actionName, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetActionNameCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_action_name}
     * @param setActionName The new value of the field {@code set_action_name}
     */
    public void setSetActionName(SetActionNameCallback setActionName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_action_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setActionName == null ? MemoryAddress.NULL : setActionName.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetActionTargetValueCallback} callback.
     */
    @FunctionalInterface
    public interface GetActionTargetValueCallback {
    
        @Nullable org.gtk.glib.Variant run(org.gtk.gtk.Actionable actionable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress actionable) {
            var RESULT = run((org.gtk.gtk.Actionable) Interop.register(actionable, org.gtk.gtk.Actionable.fromAddress).marshal(actionable, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetActionTargetValueCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_action_target_value}
     * @param getActionTargetValue The new value of the field {@code get_action_target_value}
     */
    public void setGetActionTargetValue(GetActionTargetValueCallback getActionTargetValue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_action_target_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getActionTargetValue == null ? MemoryAddress.NULL : getActionTargetValue.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetActionTargetValueCallback} callback.
     */
    @FunctionalInterface
    public interface SetActionTargetValueCallback {
    
        void run(org.gtk.gtk.Actionable actionable, @Nullable org.gtk.glib.Variant targetValue);
        
        @ApiStatus.Internal default void upcall(MemoryAddress actionable, MemoryAddress targetValue) {
            run((org.gtk.gtk.Actionable) Interop.register(actionable, org.gtk.gtk.Actionable.fromAddress).marshal(actionable, null), org.gtk.glib.Variant.fromAddress.marshal(targetValue, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetActionTargetValueCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_action_target_value}
     * @param setActionTargetValue The new value of the field {@code set_action_target_value}
     */
    public void setSetActionTargetValue(SetActionTargetValueCallback setActionTargetValue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_action_target_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setActionTargetValue == null ? MemoryAddress.NULL : setActionTargetValue.toCallback()));
        }
    }
    
    /**
     * Create a ActionableInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ActionableInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ActionableInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ActionableInterface(input);
    
    /**
     * A {@link ActionableInterface.Builder} object constructs a {@link ActionableInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ActionableInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ActionableInterface struct;
        
        private Builder() {
            struct = ActionableInterface.allocate();
        }
        
        /**
         * Finish building the {@link ActionableInterface} struct.
         * @return A new instance of {@code ActionableInterface} with the fields 
         *         that were set in the Builder object.
         */
        public ActionableInterface build() {
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
        
        public Builder setGetActionName(GetActionNameCallback getActionName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_action_name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getActionName == null ? MemoryAddress.NULL : getActionName.toCallback()));
                return this;
            }
        }
        
        public Builder setSetActionName(SetActionNameCallback setActionName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_action_name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setActionName == null ? MemoryAddress.NULL : setActionName.toCallback()));
                return this;
            }
        }
        
        public Builder setGetActionTargetValue(GetActionTargetValueCallback getActionTargetValue) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_action_target_value"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getActionTargetValue == null ? MemoryAddress.NULL : getActionTargetValue.toCallback()));
                return this;
            }
        }
        
        public Builder setSetActionTargetValue(SetActionTargetValueCallback setActionTargetValue) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_action_target_value"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setActionTargetValue == null ? MemoryAddress.NULL : setActionTargetValue.toCallback()));
                return this;
            }
        }
    }
}
