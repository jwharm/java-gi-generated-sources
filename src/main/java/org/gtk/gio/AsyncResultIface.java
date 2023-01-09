package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Interface definition for {@link AsyncResult}.
 */
public class AsyncResultIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GAsyncResultIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("get_user_data"),
            Interop.valueLayout.ADDRESS.withName("get_source_object"),
            Interop.valueLayout.ADDRESS.withName("is_tagged")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AsyncResultIface}
     * @return A new, uninitialized @{link AsyncResultIface}
     */
    public static AsyncResultIface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AsyncResultIface newInstance = new AsyncResultIface(segment.address());
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
     * Functional interface declaration of the {@code GetUserDataCallback} callback.
     */
    @FunctionalInterface
    public interface GetUserDataCallback {
    
        @Nullable java.lang.foreign.MemoryAddress run(org.gtk.gio.AsyncResult res);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress res) {
            var RESULT = run((org.gtk.gio.AsyncResult) Interop.register(res, org.gtk.gio.AsyncResult.fromAddress).marshal(res, null));
            return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetUserDataCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_user_data}
     * @param getUserData The new value of the field {@code get_user_data}
     */
    public void setGetUserData(GetUserDataCallback getUserData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getUserData == null ? MemoryAddress.NULL : getUserData.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetSourceObjectCallback} callback.
     */
    @FunctionalInterface
    public interface GetSourceObjectCallback {
    
        @Nullable org.gtk.gobject.GObject run(org.gtk.gio.AsyncResult res);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress res) {
            var RESULT = run((org.gtk.gio.AsyncResult) Interop.register(res, org.gtk.gio.AsyncResult.fromAddress).marshal(res, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetSourceObjectCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_source_object}
     * @param getSourceObject The new value of the field {@code get_source_object}
     */
    public void setGetSourceObject(GetSourceObjectCallback getSourceObject) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_source_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSourceObject == null ? MemoryAddress.NULL : getSourceObject.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IsTaggedCallback} callback.
     */
    @FunctionalInterface
    public interface IsTaggedCallback {
    
        boolean run(org.gtk.gio.AsyncResult res, @Nullable java.lang.foreign.MemoryAddress sourceTag);
        
        @ApiStatus.Internal default int upcall(MemoryAddress res, MemoryAddress sourceTag) {
            var RESULT = run((org.gtk.gio.AsyncResult) Interop.register(res, org.gtk.gio.AsyncResult.fromAddress).marshal(res, null), sourceTag);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IsTaggedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_tagged}
     * @param isTagged The new value of the field {@code is_tagged}
     */
    public void setIsTagged(IsTaggedCallback isTagged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_tagged"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isTagged == null ? MemoryAddress.NULL : isTagged.toCallback()));
        }
    }
    
    /**
     * Create a AsyncResultIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AsyncResultIface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AsyncResultIface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AsyncResultIface(input);
    
    /**
     * A {@link AsyncResultIface.Builder} object constructs a {@link AsyncResultIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AsyncResultIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AsyncResultIface struct;
        
        private Builder() {
            struct = AsyncResultIface.allocate();
        }
        
        /**
         * Finish building the {@link AsyncResultIface} struct.
         * @return A new instance of {@code AsyncResultIface} with the fields 
         *         that were set in the Builder object.
         */
        public AsyncResultIface build() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param gIface The value for the {@code gIface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
        
        public Builder setGetUserData(GetUserDataCallback getUserData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_user_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getUserData == null ? MemoryAddress.NULL : getUserData.toCallback()));
                return this;
            }
        }
        
        public Builder setGetSourceObject(GetSourceObjectCallback getSourceObject) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_source_object"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSourceObject == null ? MemoryAddress.NULL : getSourceObject.toCallback()));
                return this;
            }
        }
        
        public Builder setIsTagged(IsTaggedCallback isTagged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_tagged"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isTagged == null ? MemoryAddress.NULL : isTagged.toCallback()));
                return this;
            }
        }
    }
}
