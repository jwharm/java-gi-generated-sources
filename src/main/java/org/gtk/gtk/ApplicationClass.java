package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ApplicationClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkApplicationClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.ApplicationClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("window_added"),
            Interop.valueLayout.ADDRESS.withName("window_removed"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ApplicationClass}
     * @return A new, uninitialized @{link ApplicationClass}
     */
    public static ApplicationClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ApplicationClass newInstance = new ApplicationClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gio.ApplicationClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gio.ApplicationClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gio.ApplicationClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code WindowAddedCallback} callback.
     */
    @FunctionalInterface
    public interface WindowAddedCallback {
    
        void run(org.gtk.gtk.Application application, org.gtk.gtk.Window window);
        
        @ApiStatus.Internal default void upcall(MemoryAddress application, MemoryAddress window) {
            run((org.gtk.gtk.Application) Interop.register(application, org.gtk.gtk.Application.fromAddress).marshal(application, null), (org.gtk.gtk.Window) Interop.register(window, org.gtk.gtk.Window.fromAddress).marshal(window, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WindowAddedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code window_added}
     * @param windowAdded The new value of the field {@code window_added}
     */
    public void setWindowAdded(WindowAddedCallback windowAdded) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("window_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (windowAdded == null ? MemoryAddress.NULL : windowAdded.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code WindowRemovedCallback} callback.
     */
    @FunctionalInterface
    public interface WindowRemovedCallback {
    
        void run(org.gtk.gtk.Application application, org.gtk.gtk.Window window);
        
        @ApiStatus.Internal default void upcall(MemoryAddress application, MemoryAddress window) {
            run((org.gtk.gtk.Application) Interop.register(application, org.gtk.gtk.Application.fromAddress).marshal(application, null), (org.gtk.gtk.Window) Interop.register(window, org.gtk.gtk.Window.fromAddress).marshal(window, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WindowRemovedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code window_removed}
     * @param windowRemoved The new value of the field {@code window_removed}
     */
    public void setWindowRemoved(WindowRemovedCallback windowRemoved) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("window_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (windowRemoved == null ? MemoryAddress.NULL : windowRemoved.toCallback()));
        }
    }
    
    /**
     * Create a ApplicationClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ApplicationClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ApplicationClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ApplicationClass(input);
    
    /**
     * A {@link ApplicationClass.Builder} object constructs a {@link ApplicationClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ApplicationClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ApplicationClass struct;
        
        private Builder() {
            struct = ApplicationClass.allocate();
        }
        
        /**
         * Finish building the {@link ApplicationClass} struct.
         * @return A new instance of {@code ApplicationClass} with the fields 
         *         that were set in the Builder object.
         */
        public ApplicationClass build() {
            return struct;
        }
        
        /**
         * The parent class.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gtk.gio.ApplicationClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setWindowAdded(WindowAddedCallback windowAdded) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("window_added"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (windowAdded == null ? MemoryAddress.NULL : windowAdded.toCallback()));
                return this;
            }
        }
        
        public Builder setWindowRemoved(WindowRemovedCallback windowRemoved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("window_removed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (windowRemoved == null ? MemoryAddress.NULL : windowRemoved.toCallback()));
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
