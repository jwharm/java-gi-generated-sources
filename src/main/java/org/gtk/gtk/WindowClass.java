package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WindowClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkWindowClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("activate_focus"),
            Interop.valueLayout.ADDRESS.withName("activate_default"),
            Interop.valueLayout.ADDRESS.withName("keys_changed"),
            Interop.valueLayout.ADDRESS.withName("enable_debugging"),
            Interop.valueLayout.ADDRESS.withName("close_request"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link WindowClass}
     * @return A new, uninitialized @{link WindowClass}
     */
    public static WindowClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        WindowClass newInstance = new WindowClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.WidgetClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gtk.WidgetClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gtk.WidgetClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ActivateFocusCallback} callback.
     */
    @FunctionalInterface
    public interface ActivateFocusCallback {
    
        void run(org.gtk.gtk.Window window);
        
        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gtk.gtk.Window) Interop.register(window, org.gtk.gtk.Window.fromAddress).marshal(window, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActivateFocusCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate_focus}
     * @param activateFocus The new value of the field {@code activate_focus}
     */
    public void setActivateFocus(ActivateFocusCallback activateFocus) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate_focus"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activateFocus == null ? MemoryAddress.NULL : activateFocus.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ActivateDefaultCallback} callback.
     */
    @FunctionalInterface
    public interface ActivateDefaultCallback {
    
        void run(org.gtk.gtk.Window window);
        
        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gtk.gtk.Window) Interop.register(window, org.gtk.gtk.Window.fromAddress).marshal(window, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActivateDefaultCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate_default}
     * @param activateDefault The new value of the field {@code activate_default}
     */
    public void setActivateDefault(ActivateDefaultCallback activateDefault) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate_default"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activateDefault == null ? MemoryAddress.NULL : activateDefault.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code KeysChangedCallback} callback.
     */
    @FunctionalInterface
    public interface KeysChangedCallback {
    
        void run(org.gtk.gtk.Window window);
        
        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gtk.gtk.Window) Interop.register(window, org.gtk.gtk.Window.fromAddress).marshal(window, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), KeysChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code keys_changed}
     * @param keysChanged The new value of the field {@code keys_changed}
     */
    public void setKeysChanged(KeysChangedCallback keysChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("keys_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (keysChanged == null ? MemoryAddress.NULL : keysChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EnableDebuggingCallback} callback.
     */
    @FunctionalInterface
    public interface EnableDebuggingCallback {
    
        boolean run(org.gtk.gtk.Window window, boolean toggle);
        
        @ApiStatus.Internal default int upcall(MemoryAddress window, int toggle) {
            var RESULT = run((org.gtk.gtk.Window) Interop.register(window, org.gtk.gtk.Window.fromAddress).marshal(window, null), Marshal.integerToBoolean.marshal(toggle, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EnableDebuggingCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code enable_debugging}
     * @param enableDebugging The new value of the field {@code enable_debugging}
     */
    public void setEnableDebugging(EnableDebuggingCallback enableDebugging) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enable_debugging"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (enableDebugging == null ? MemoryAddress.NULL : enableDebugging.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CloseRequestCallback} callback.
     */
    @FunctionalInterface
    public interface CloseRequestCallback {
    
        boolean run(org.gtk.gtk.Window window);
        
        @ApiStatus.Internal default int upcall(MemoryAddress window) {
            var RESULT = run((org.gtk.gtk.Window) Interop.register(window, org.gtk.gtk.Window.fromAddress).marshal(window, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CloseRequestCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code close_request}
     * @param closeRequest The new value of the field {@code close_request}
     */
    public void setCloseRequest(CloseRequestCallback closeRequest) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close_request"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (closeRequest == null ? MemoryAddress.NULL : closeRequest.toCallback()));
        }
    }
    
    /**
     * Create a WindowClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected WindowClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, WindowClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new WindowClass(input);
    
    /**
     * A {@link WindowClass.Builder} object constructs a {@link WindowClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link WindowClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final WindowClass struct;
        
        private Builder() {
            struct = WindowClass.allocate();
        }
        
        /**
         * Finish building the {@link WindowClass} struct.
         * @return A new instance of {@code WindowClass} with the fields 
         *         that were set in the Builder object.
         */
        public WindowClass build() {
            return struct;
        }
        
        /**
         * The parent class.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gtk.gtk.WidgetClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setActivateFocus(ActivateFocusCallback activateFocus) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("activate_focus"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activateFocus == null ? MemoryAddress.NULL : activateFocus.toCallback()));
                return this;
            }
        }
        
        public Builder setActivateDefault(ActivateDefaultCallback activateDefault) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("activate_default"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activateDefault == null ? MemoryAddress.NULL : activateDefault.toCallback()));
                return this;
            }
        }
        
        public Builder setKeysChanged(KeysChangedCallback keysChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("keys_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (keysChanged == null ? MemoryAddress.NULL : keysChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setEnableDebugging(EnableDebuggingCallback enableDebugging) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("enable_debugging"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (enableDebugging == null ? MemoryAddress.NULL : enableDebugging.toCallback()));
                return this;
            }
        }
        
        public Builder setCloseRequest(CloseRequestCallback closeRequest) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("close_request"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (closeRequest == null ? MemoryAddress.NULL : closeRequest.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false, SCOPE)));
                return this;
            }
        }
    }
}
