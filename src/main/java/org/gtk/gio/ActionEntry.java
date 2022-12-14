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
public class ActionEntry extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GActionEntry";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("name"),
            Interop.valueLayout.ADDRESS.withName("activate"),
            Interop.valueLayout.ADDRESS.withName("parameter_type"),
            Interop.valueLayout.ADDRESS.withName("state"),
            Interop.valueLayout.ADDRESS.withName("change_state"),
            MemoryLayout.sequenceLayout(3, Interop.valueLayout.C_LONG).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ActionEntry}
     * @return A new, uninitialized @{link ActionEntry}
     */
    public static ActionEntry allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ActionEntry newInstance = new ActionEntry(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String getName() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void setName(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ActivateCallback} callback.
     */
    @FunctionalInterface
    public interface ActivateCallback {
    
        void run(org.gtk.gio.SimpleAction action, org.gtk.glib.Variant parameter);
        
        @ApiStatus.Internal default void upcall(MemoryAddress action, MemoryAddress parameter, MemoryAddress userData) {
            run((org.gtk.gio.SimpleAction) Interop.register(action, org.gtk.gio.SimpleAction.fromAddress).marshal(action, null), org.gtk.glib.Variant.fromAddress.marshal(parameter, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActivateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate}
     * @param activate The new value of the field {@code activate}
     */
    public void setActivate(ActivateCallback activate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code parameter_type}
     * @return The value of the field {@code parameter_type}
     */
    public java.lang.String getParameterType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parameter_type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code parameter_type}
     * @param parameterType The new value of the field {@code parameter_type}
     */
    public void setParameterType(java.lang.String parameterType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parameter_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parameterType == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(parameterType, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code state}
     * @return The value of the field {@code state}
     */
    public java.lang.String getState() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("state"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code state}
     * @param state The new value of the field {@code state}
     */
    public void setState(java.lang.String state) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("state"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (state == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(state, SCOPE)));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ChangeStateCallback} callback.
     */
    @FunctionalInterface
    public interface ChangeStateCallback {
    
        void run(org.gtk.gio.SimpleAction action, org.gtk.glib.Variant value);
        
        @ApiStatus.Internal default void upcall(MemoryAddress action, MemoryAddress value, MemoryAddress userData) {
            run((org.gtk.gio.SimpleAction) Interop.register(action, org.gtk.gio.SimpleAction.fromAddress).marshal(action, null), org.gtk.glib.Variant.fromAddress.marshal(value, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ChangeStateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code change_state}
     * @param changeState The new value of the field {@code change_state}
     */
    public void setChangeState(ChangeStateCallback changeState) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("change_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changeState == null ? MemoryAddress.NULL : changeState.toCallback()));
        }
    }
    
    /**
     * Create a ActionEntry proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ActionEntry(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ActionEntry> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ActionEntry(input);
    
    /**
     * A {@link ActionEntry.Builder} object constructs a {@link ActionEntry} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ActionEntry.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ActionEntry struct;
        
        private Builder() {
            struct = ActionEntry.allocate();
        }
        
        /**
         * Finish building the {@link ActionEntry} struct.
         * @return A new instance of {@code ActionEntry} with the fields 
         *         that were set in the Builder object.
         */
        public ActionEntry build() {
            return struct;
        }
        
        /**
         * the name of the action
         * @param name The value for the {@code name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
                return this;
            }
        }
        
        public Builder setActivate(ActivateCallback activate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
                return this;
            }
        }
        
        /**
         * the type of the parameter that must be passed to the
         *                  activate function for this action, given as a single
         *                  GVariant type string (or {@code null} for no parameter)
         * @param parameterType The value for the {@code parameterType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParameterType(java.lang.String parameterType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parameter_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parameterType == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(parameterType, SCOPE)));
                return this;
            }
        }
        
        /**
         * the initial state for this action, given in
         *         [GVariant text format][gvariant-text].  The state is parsed
         *         with no extra type information, so type tags must be added to
         *         the string if they are necessary.  Stateless actions should
         *         give {@code null} here.
         * @param state The value for the {@code state} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setState(java.lang.String state) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("state"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (state == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(state, SCOPE)));
                return this;
            }
        }
        
        public Builder setChangeState(ChangeStateCallback changeState) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("change_state"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changeState == null ? MemoryAddress.NULL : changeState.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(long[] padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false, SCOPE)));
                return this;
            }
        }
    }
}
