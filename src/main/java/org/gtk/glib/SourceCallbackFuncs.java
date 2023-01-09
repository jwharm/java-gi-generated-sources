package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GSourceCallbackFuncs} struct contains
 * functions for managing callback objects.
 */
public class SourceCallbackFuncs extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSourceCallbackFuncs";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("ref"),
            Interop.valueLayout.ADDRESS.withName("unref"),
            Interop.valueLayout.ADDRESS.withName("get")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SourceCallbackFuncs}
     * @return A new, uninitialized @{link SourceCallbackFuncs}
     */
    public static SourceCallbackFuncs allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SourceCallbackFuncs newInstance = new SourceCallbackFuncs(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code RefCallback} callback.
     */
    @FunctionalInterface
    public interface RefCallback {
    
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress cbData) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RefCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code ref}
     * @param ref The new value of the field {@code ref}
     */
    public void setRef(RefCallback ref) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ref == null ? MemoryAddress.NULL : ref.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnrefCallback} callback.
     */
    @FunctionalInterface
    public interface UnrefCallback {
    
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress cbData) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnrefCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unref}
     * @param unref The new value of the field {@code unref}
     */
    public void setUnref(UnrefCallback unref) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unref"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unref == null ? MemoryAddress.NULL : unref.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetCallback} callback.
     */
    @FunctionalInterface
    public interface GetCallback {
    
        void run(org.gtk.glib.Source source, org.gtk.glib.SourceFunc func, @Nullable java.lang.foreign.MemoryAddress data);
        
        @ApiStatus.Internal default void upcall(MemoryAddress cbData, MemoryAddress source, MemoryAddress func, MemoryAddress data) {
            run(org.gtk.glib.Source.fromAddress.marshal(source, null), null /* Unsupported parameter type */, data);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get}
     * @param get The new value of the field {@code get}
     */
    public void setGet(GetCallback get) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (get == null ? MemoryAddress.NULL : get.toCallback()));
        }
    }
    
    /**
     * Create a SourceCallbackFuncs proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SourceCallbackFuncs(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SourceCallbackFuncs> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SourceCallbackFuncs(input);
    
    /**
     * A {@link SourceCallbackFuncs.Builder} object constructs a {@link SourceCallbackFuncs} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SourceCallbackFuncs.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SourceCallbackFuncs struct;
        
        private Builder() {
            struct = SourceCallbackFuncs.allocate();
        }
        
        /**
         * Finish building the {@link SourceCallbackFuncs} struct.
         * @return A new instance of {@code SourceCallbackFuncs} with the fields 
         *         that were set in the Builder object.
         */
        public SourceCallbackFuncs build() {
            return struct;
        }
        
        public Builder setRef(RefCallback ref) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("ref"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ref == null ? MemoryAddress.NULL : ref.toCallback()));
                return this;
            }
        }
        
        public Builder setUnref(UnrefCallback unref) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unref"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unref == null ? MemoryAddress.NULL : unref.toCallback()));
                return this;
            }
        }
        
        public Builder setGet(GetCallback get) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (get == null ? MemoryAddress.NULL : get.toCallback()));
                return this;
            }
        }
    }
}
