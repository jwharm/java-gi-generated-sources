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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SourceCallbackFuncs newInstance = new SourceCallbackFuncs(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface RefCallback {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress cbData) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RefCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code ref}
     * @param ref The new value of the field {@code ref}
     */
    public void setRef(RefCallback ref) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ref"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ref == null ? MemoryAddress.NULL : ref.toCallback()));
    }
    
    @FunctionalInterface
    public interface UnrefCallback {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress cbData) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnrefCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unref}
     * @param unref The new value of the field {@code unref}
     */
    public void setUnref(UnrefCallback unref) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unref"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unref == null ? MemoryAddress.NULL : unref.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetCallback {
        void run(org.gtk.glib.Source source, org.gtk.glib.SourceFunc func, @Nullable java.lang.foreign.MemoryAddress data);

        @ApiStatus.Internal default void upcall(MemoryAddress cbData, MemoryAddress source, MemoryAddress func, MemoryAddress data) {
            run(org.gtk.glib.Source.fromAddress.marshal(source, Ownership.NONE), null /* Unsupported parameter type */, data);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get}
     * @param get The new value of the field {@code get}
     */
    public void setGet(GetCallback get) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get == null ? MemoryAddress.NULL : get.toCallback()));
    }
    
    /**
     * Create a SourceCallbackFuncs proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SourceCallbackFuncs(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SourceCallbackFuncs> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SourceCallbackFuncs(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ref == null ? MemoryAddress.NULL : ref.toCallback()));
            return this;
        }
        
        public Builder setUnref(UnrefCallback unref) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unref"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unref == null ? MemoryAddress.NULL : unref.toCallback()));
            return this;
        }
        
        public Builder setGet(GetCallback get) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get == null ? MemoryAddress.NULL : get.toCallback()));
            return this;
        }
    }
}
