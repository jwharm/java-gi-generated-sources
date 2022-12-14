package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides an interface for implementing seekable functionality on I/O Streams.
 */
public class SeekableIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSeekableIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("tell"),
            Interop.valueLayout.ADDRESS.withName("can_seek"),
            Interop.valueLayout.ADDRESS.withName("seek"),
            Interop.valueLayout.ADDRESS.withName("can_truncate"),
            Interop.valueLayout.ADDRESS.withName("truncate_fn")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SeekableIface}
     * @return A new, uninitialized @{link SeekableIface}
     */
    public static SeekableIface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SeekableIface newInstance = new SeekableIface(segment.address());
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
     * Functional interface declaration of the {@code TellCallback} callback.
     */
    @FunctionalInterface
    public interface TellCallback {
    
        long run(org.gtk.gio.Seekable seekable);
        
        @ApiStatus.Internal default long upcall(MemoryAddress seekable) {
            var RESULT = run((org.gtk.gio.Seekable) Interop.register(seekable, org.gtk.gio.Seekable.fromAddress).marshal(seekable, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TellCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code tell}
     * @param tell The new value of the field {@code tell}
     */
    public void setTell(TellCallback tell) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tell"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tell == null ? MemoryAddress.NULL : tell.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CanSeekCallback} callback.
     */
    @FunctionalInterface
    public interface CanSeekCallback {
    
        boolean run(org.gtk.gio.Seekable seekable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress seekable) {
            var RESULT = run((org.gtk.gio.Seekable) Interop.register(seekable, org.gtk.gio.Seekable.fromAddress).marshal(seekable, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CanSeekCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_seek}
     * @param canSeek The new value of the field {@code can_seek}
     */
    public void setCanSeek(CanSeekCallback canSeek) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_seek"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canSeek == null ? MemoryAddress.NULL : canSeek.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SeekCallback} callback.
     */
    @FunctionalInterface
    public interface SeekCallback {
    
        boolean run(org.gtk.gio.Seekable seekable, long offset, org.gtk.glib.SeekType type, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress seekable, long offset, int type, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.Seekable) Interop.register(seekable, org.gtk.gio.Seekable.fromAddress).marshal(seekable, null), offset, org.gtk.glib.SeekType.of(type), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SeekCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code seek}
     * @param seek The new value of the field {@code seek}
     */
    public void setSeek(SeekCallback seek) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seek"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (seek == null ? MemoryAddress.NULL : seek.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CanTruncateCallback} callback.
     */
    @FunctionalInterface
    public interface CanTruncateCallback {
    
        boolean run(org.gtk.gio.Seekable seekable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress seekable) {
            var RESULT = run((org.gtk.gio.Seekable) Interop.register(seekable, org.gtk.gio.Seekable.fromAddress).marshal(seekable, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CanTruncateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_truncate}
     * @param canTruncate The new value of the field {@code can_truncate}
     */
    public void setCanTruncate(CanTruncateCallback canTruncate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_truncate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canTruncate == null ? MemoryAddress.NULL : canTruncate.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TruncateFnCallback} callback.
     */
    @FunctionalInterface
    public interface TruncateFnCallback {
    
        boolean run(org.gtk.gio.Seekable seekable, long offset, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress seekable, long offset, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.Seekable) Interop.register(seekable, org.gtk.gio.Seekable.fromAddress).marshal(seekable, null), offset, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TruncateFnCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code truncate_fn}
     * @param truncateFn The new value of the field {@code truncate_fn}
     */
    public void setTruncateFn(TruncateFnCallback truncateFn) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("truncate_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (truncateFn == null ? MemoryAddress.NULL : truncateFn.toCallback()));
        }
    }
    
    /**
     * Create a SeekableIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SeekableIface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SeekableIface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SeekableIface(input);
    
    /**
     * A {@link SeekableIface.Builder} object constructs a {@link SeekableIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SeekableIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SeekableIface struct;
        
        private Builder() {
            struct = SeekableIface.allocate();
        }
        
        /**
         * Finish building the {@link SeekableIface} struct.
         * @return A new instance of {@code SeekableIface} with the fields 
         *         that were set in the Builder object.
         */
        public SeekableIface build() {
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
        
        public Builder setTell(TellCallback tell) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tell"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tell == null ? MemoryAddress.NULL : tell.toCallback()));
                return this;
            }
        }
        
        public Builder setCanSeek(CanSeekCallback canSeek) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("can_seek"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canSeek == null ? MemoryAddress.NULL : canSeek.toCallback()));
                return this;
            }
        }
        
        public Builder setSeek(SeekCallback seek) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("seek"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (seek == null ? MemoryAddress.NULL : seek.toCallback()));
                return this;
            }
        }
        
        public Builder setCanTruncate(CanTruncateCallback canTruncate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("can_truncate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canTruncate == null ? MemoryAddress.NULL : canTruncate.toCallback()));
                return this;
            }
        }
        
        public Builder setTruncateFn(TruncateFnCallback truncateFn) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("truncate_fn"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (truncateFn == null ? MemoryAddress.NULL : truncateFn.toCallback()));
                return this;
            }
        }
    }
}
