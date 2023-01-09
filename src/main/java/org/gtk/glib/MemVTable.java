package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A set of functions used to perform memory allocation. The same {@link MemVTable} must
 * be used for all allocations in the same program; a call to g_mem_set_vtable(),
 * if it exists, should be prior to any use of GLib.
 * <p>
 * This functions related to this has been deprecated in 2.46, and no longer work.
 */
public class MemVTable extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMemVTable";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("malloc"),
            Interop.valueLayout.ADDRESS.withName("realloc"),
            Interop.valueLayout.ADDRESS.withName("free"),
            Interop.valueLayout.ADDRESS.withName("calloc"),
            Interop.valueLayout.ADDRESS.withName("try_malloc"),
            Interop.valueLayout.ADDRESS.withName("try_realloc")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MemVTable}
     * @return A new, uninitialized @{link MemVTable}
     */
    public static MemVTable allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        MemVTable newInstance = new MemVTable(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code MallocCallback} callback.
     */
    @FunctionalInterface
    public interface MallocCallback {
    
        java.lang.foreign.MemoryAddress run(long nBytes);
        
        @ApiStatus.Internal default Addressable upcall(long nBytes) {
            var RESULT = run(nBytes);
            return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MallocCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code malloc}
     * @param malloc The new value of the field {@code malloc}
     */
    public void setMalloc(MallocCallback malloc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("malloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (malloc == null ? MemoryAddress.NULL : malloc.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReallocCallback} callback.
     */
    @FunctionalInterface
    public interface ReallocCallback {
    
        java.lang.foreign.MemoryAddress run(java.lang.foreign.MemoryAddress mem, long nBytes);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress mem, long nBytes) {
            var RESULT = run(mem, nBytes);
            return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReallocCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code realloc}
     * @param realloc The new value of the field {@code realloc}
     */
    public void setRealloc(ReallocCallback realloc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("realloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (realloc == null ? MemoryAddress.NULL : realloc.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FreeCallback} callback.
     */
    @FunctionalInterface
    public interface FreeCallback {
    
        void run(java.lang.foreign.MemoryAddress mem);
        
        @ApiStatus.Internal default void upcall(MemoryAddress mem) {
            run(mem);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FreeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code free}
     * @param free The new value of the field {@code free}
     */
    public void setFree(FreeCallback free) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (free == null ? MemoryAddress.NULL : free.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CallocCallback} callback.
     */
    @FunctionalInterface
    public interface CallocCallback {
    
        java.lang.foreign.MemoryAddress run(long nBlocks, long nBlockBytes);
        
        @ApiStatus.Internal default Addressable upcall(long nBlocks, long nBlockBytes) {
            var RESULT = run(nBlocks, nBlockBytes);
            return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CallocCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code calloc}
     * @param calloc The new value of the field {@code calloc}
     */
    public void setCalloc(CallocCallback calloc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("calloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (calloc == null ? MemoryAddress.NULL : calloc.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TryMallocCallback} callback.
     */
    @FunctionalInterface
    public interface TryMallocCallback {
    
        java.lang.foreign.MemoryAddress run(long nBytes);
        
        @ApiStatus.Internal default Addressable upcall(long nBytes) {
            var RESULT = run(nBytes);
            return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TryMallocCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code try_malloc}
     * @param tryMalloc The new value of the field {@code try_malloc}
     */
    public void setTryMalloc(TryMallocCallback tryMalloc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("try_malloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tryMalloc == null ? MemoryAddress.NULL : tryMalloc.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TryReallocCallback} callback.
     */
    @FunctionalInterface
    public interface TryReallocCallback {
    
        java.lang.foreign.MemoryAddress run(java.lang.foreign.MemoryAddress mem, long nBytes);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress mem, long nBytes) {
            var RESULT = run(mem, nBytes);
            return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TryReallocCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code try_realloc}
     * @param tryRealloc The new value of the field {@code try_realloc}
     */
    public void setTryRealloc(TryReallocCallback tryRealloc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("try_realloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tryRealloc == null ? MemoryAddress.NULL : tryRealloc.toCallback()));
        }
    }
    
    /**
     * Create a MemVTable proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MemVTable(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MemVTable> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MemVTable(input);
    
    /**
     * A {@link MemVTable.Builder} object constructs a {@link MemVTable} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MemVTable.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MemVTable struct;
        
        private Builder() {
            struct = MemVTable.allocate();
        }
        
        /**
         * Finish building the {@link MemVTable} struct.
         * @return A new instance of {@code MemVTable} with the fields 
         *         that were set in the Builder object.
         */
        public MemVTable build() {
            return struct;
        }
        
        public Builder setMalloc(MallocCallback malloc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("malloc"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (malloc == null ? MemoryAddress.NULL : malloc.toCallback()));
                return this;
            }
        }
        
        public Builder setRealloc(ReallocCallback realloc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("realloc"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (realloc == null ? MemoryAddress.NULL : realloc.toCallback()));
                return this;
            }
        }
        
        public Builder setFree(FreeCallback free) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("free"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (free == null ? MemoryAddress.NULL : free.toCallback()));
                return this;
            }
        }
        
        public Builder setCalloc(CallocCallback calloc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("calloc"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (calloc == null ? MemoryAddress.NULL : calloc.toCallback()));
                return this;
            }
        }
        
        public Builder setTryMalloc(TryMallocCallback tryMalloc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("try_malloc"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tryMalloc == null ? MemoryAddress.NULL : tryMalloc.toCallback()));
                return this;
            }
        }
        
        public Builder setTryRealloc(TryReallocCallback tryRealloc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("try_realloc"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tryRealloc == null ? MemoryAddress.NULL : tryRealloc.toCallback()));
                return this;
            }
        }
    }
}
