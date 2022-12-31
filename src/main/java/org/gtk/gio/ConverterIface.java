package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides an interface for converting data from one type
 * to another type. The conversion can be stateful
 * and may fail at any place.
 * @version 2.24
 */
public class ConverterIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GConverterIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("convert"),
            Interop.valueLayout.ADDRESS.withName("reset")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ConverterIface}
     * @return A new, uninitialized @{link ConverterIface}
     */
    public static ConverterIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ConverterIface newInstance = new ConverterIface(segment.address(), Ownership.NONE);
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
    public interface ConvertCallback {
        org.gtk.gio.ConverterResult run(org.gtk.gio.Converter converter, byte[] inbuf, long inbufSize, byte[] outbuf, long outbufSize, org.gtk.gio.ConverterFlags flags, Out<Long> bytesRead, Out<Long> bytesWritten);

        @ApiStatus.Internal default int upcall(MemoryAddress converter, MemoryAddress inbuf, long inbufSize, MemoryAddress outbuf, long outbufSize, int flags, MemoryAddress bytesRead, MemoryAddress bytesWritten) {
            Out<Long> bytesReadOUT = new Out<>(bytesRead.get(Interop.valueLayout.C_LONG, 0));
            Out<Long> bytesWrittenOUT = new Out<>(bytesWritten.get(Interop.valueLayout.C_LONG, 0));
            var RESULT = run((org.gtk.gio.Converter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(converter)), org.gtk.gio.Converter.fromAddress).marshal(converter, Ownership.NONE), MemorySegment.ofAddress(inbuf, inbufSize, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE), inbufSize, MemorySegment.ofAddress(outbuf, outbufSize, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE), outbufSize, new org.gtk.gio.ConverterFlags(flags), bytesReadOUT, bytesWrittenOUT);
            bytesRead.set(Interop.valueLayout.C_LONG, 0, bytesReadOUT.get());
            bytesWritten.set(Interop.valueLayout.C_LONG, 0, bytesWrittenOUT.get());
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ConvertCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code convert}
     * @param convert The new value of the field {@code convert}
     */
    public void setConvert(ConvertCallback convert) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("convert"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (convert == null ? MemoryAddress.NULL : convert.toCallback()));
    }
    
    @FunctionalInterface
    public interface ResetCallback {
        void run(org.gtk.gio.Converter converter);

        @ApiStatus.Internal default void upcall(MemoryAddress converter) {
            run((org.gtk.gio.Converter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(converter)), org.gtk.gio.Converter.fromAddress).marshal(converter, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ResetCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reset}
     * @param reset The new value of the field {@code reset}
     */
    public void setReset(ResetCallback reset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reset == null ? MemoryAddress.NULL : reset.toCallback()));
    }
    
    /**
     * Create a ConverterIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ConverterIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ConverterIface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ConverterIface(input, ownership);
    
    /**
     * A {@link ConverterIface.Builder} object constructs a {@link ConverterIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ConverterIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ConverterIface struct;
        
        private Builder() {
            struct = ConverterIface.allocate();
        }
        
         /**
         * Finish building the {@link ConverterIface} struct.
         * @return A new instance of {@code ConverterIface} with the fields 
         *         that were set in the Builder object.
         */
        public ConverterIface build() {
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
        
        public Builder setConvert(ConvertCallback convert) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("convert"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (convert == null ? MemoryAddress.NULL : convert.toCallback()));
            return this;
        }
        
        public Builder setReset(ResetCallback reset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reset == null ? MemoryAddress.NULL : reset.toCallback()));
            return this;
        }
    }
}
