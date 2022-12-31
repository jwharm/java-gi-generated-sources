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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AsyncResultIface newInstance = new AsyncResultIface(segment.address(), Ownership.NONE);
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
    public interface GetUserDataCallback {
        @Nullable java.lang.foreign.MemoryAddress run(org.gtk.gio.AsyncResult res);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress res) {
            var RESULT = run((org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(res)), org.gtk.gio.AsyncResult.fromAddress).marshal(res, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetUserDataCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_user_data}
     * @param getUserData The new value of the field {@code get_user_data}
     */
    public void setGetUserData(GetUserDataCallback getUserData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_user_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getUserData == null ? MemoryAddress.NULL : getUserData.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetSourceObjectCallback {
        @Nullable org.gtk.gobject.GObject run(org.gtk.gio.AsyncResult res);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress res) {
            var RESULT = run((org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(res)), org.gtk.gio.AsyncResult.fromAddress).marshal(res, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetSourceObjectCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_source_object}
     * @param getSourceObject The new value of the field {@code get_source_object}
     */
    public void setGetSourceObject(GetSourceObjectCallback getSourceObject) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_source_object"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSourceObject == null ? MemoryAddress.NULL : getSourceObject.toCallback()));
    }
    
    @FunctionalInterface
    public interface IsTaggedCallback {
        boolean run(org.gtk.gio.AsyncResult res, @Nullable java.lang.foreign.MemoryAddress sourceTag);

        @ApiStatus.Internal default int upcall(MemoryAddress res, MemoryAddress sourceTag) {
            var RESULT = run((org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(res)), org.gtk.gio.AsyncResult.fromAddress).marshal(res, Ownership.NONE), sourceTag);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IsTaggedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_tagged}
     * @param isTagged The new value of the field {@code is_tagged}
     */
    public void setIsTagged(IsTaggedCallback isTagged) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_tagged"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isTagged == null ? MemoryAddress.NULL : isTagged.toCallback()));
    }
    
    /**
     * Create a AsyncResultIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AsyncResultIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AsyncResultIface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AsyncResultIface(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setGetUserData(GetUserDataCallback getUserData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getUserData == null ? MemoryAddress.NULL : getUserData.toCallback()));
            return this;
        }
        
        public Builder setGetSourceObject(GetSourceObjectCallback getSourceObject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_source_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSourceObject == null ? MemoryAddress.NULL : getSourceObject.toCallback()));
            return this;
        }
        
        public Builder setIsTagged(IsTaggedCallback isTagged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_tagged"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isTagged == null ? MemoryAddress.NULL : isTagged.toCallback()));
            return this;
        }
    }
}
