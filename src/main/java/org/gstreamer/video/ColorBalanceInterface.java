package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Color-balance interface.
 */
public class ColorBalanceInterface extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstColorBalanceInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("iface"),
        Interop.valueLayout.ADDRESS.withName("list_channels"),
        Interop.valueLayout.ADDRESS.withName("set_value"),
        Interop.valueLayout.ADDRESS.withName("get_value"),
        Interop.valueLayout.ADDRESS.withName("get_balance_type"),
        Interop.valueLayout.ADDRESS.withName("value_changed"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ColorBalanceInterface}
     * @return A new, uninitialized @{link ColorBalanceInterface}
     */
    public static ColorBalanceInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ColorBalanceInterface newInstance = new ColorBalanceInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code iface}
     * @return The value of the field {@code iface}
     */
    public org.gtk.gobject.TypeInterface iface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a ColorBalanceInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ColorBalanceInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ColorBalanceInterface struct;
        
         /**
         * A {@link ColorBalanceInterface.Build} object constructs a {@link ColorBalanceInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ColorBalanceInterface.allocate();
        }
        
         /**
         * Finish building the {@link ColorBalanceInterface} struct.
         * @return A new instance of {@code ColorBalanceInterface} with the fields 
         *         that were set in the Build object.
         */
        public ColorBalanceInterface construct() {
            return struct;
        }
        
        /**
         * the parent interface
         * @param iface The value for the {@code iface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIface(org.gtk.gobject.TypeInterface iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iface == null ? MemoryAddress.NULL : iface.handle()));
            return this;
        }
        
        public Build setListChannels(java.lang.foreign.MemoryAddress listChannels) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("list_channels"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (listChannels == null ? MemoryAddress.NULL : listChannels));
            return this;
        }
        
        public Build setSetValue(java.lang.foreign.MemoryAddress setValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setValue == null ? MemoryAddress.NULL : setValue));
            return this;
        }
        
        public Build setGetValue(java.lang.foreign.MemoryAddress getValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue));
            return this;
        }
        
        public Build setGetBalanceType(java.lang.foreign.MemoryAddress getBalanceType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_balance_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getBalanceType == null ? MemoryAddress.NULL : getBalanceType));
            return this;
        }
        
        public Build setValueChanged(java.lang.foreign.MemoryAddress valueChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueChanged == null ? MemoryAddress.NULL : valueChanged));
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
