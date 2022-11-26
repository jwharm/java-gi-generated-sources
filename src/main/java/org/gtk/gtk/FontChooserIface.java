package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FontChooserIface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFontChooserIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("base_iface"),
        Interop.valueLayout.ADDRESS.withName("get_font_family"),
        Interop.valueLayout.ADDRESS.withName("get_font_face"),
        Interop.valueLayout.ADDRESS.withName("get_font_size"),
        Interop.valueLayout.ADDRESS.withName("set_filter_func"),
        Interop.valueLayout.ADDRESS.withName("font_activated"),
        Interop.valueLayout.ADDRESS.withName("set_font_map"),
        Interop.valueLayout.ADDRESS.withName("get_font_map"),
        MemoryLayout.sequenceLayout(10, Interop.valueLayout.ADDRESS).withName("padding")
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
     * Allocate a new {@link FontChooserIface}
     * @return A new, uninitialized @{link FontChooserIface}
     */
    public static FontChooserIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FontChooserIface newInstance = new FontChooserIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code base_iface}
     * @return The value of the field {@code base_iface}
     */
    public org.gtk.gobject.TypeInterface base_iface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("base_iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a FontChooserIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FontChooserIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private FontChooserIface struct;
        
         /**
         * A {@link FontChooserIface.Build} object constructs a {@link FontChooserIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = FontChooserIface.allocate();
        }
        
         /**
         * Finish building the {@link FontChooserIface} struct.
         * @return A new instance of {@code FontChooserIface} with the fields 
         *         that were set in the Build object.
         */
        public FontChooserIface construct() {
            return struct;
        }
        
        public Build setBaseIface(org.gtk.gobject.TypeInterface base_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("base_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (base_iface == null ? MemoryAddress.NULL : base_iface.handle()));
            return this;
        }
        
        public Build setGetFontFamily(java.lang.foreign.MemoryAddress get_font_family) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_font_family"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_font_family == null ? MemoryAddress.NULL : get_font_family));
            return this;
        }
        
        public Build setGetFontFace(java.lang.foreign.MemoryAddress get_font_face) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_font_face"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_font_face == null ? MemoryAddress.NULL : get_font_face));
            return this;
        }
        
        public Build setGetFontSize(java.lang.foreign.MemoryAddress get_font_size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_font_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_font_size == null ? MemoryAddress.NULL : get_font_size));
            return this;
        }
        
        public Build setSetFilterFunc(java.lang.foreign.MemoryAddress set_filter_func) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_filter_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_filter_func == null ? MemoryAddress.NULL : set_filter_func));
            return this;
        }
        
        public Build setFontActivated(java.lang.foreign.MemoryAddress font_activated) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("font_activated"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (font_activated == null ? MemoryAddress.NULL : font_activated));
            return this;
        }
        
        public Build setSetFontMap(java.lang.foreign.MemoryAddress set_font_map) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_font_map"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_font_map == null ? MemoryAddress.NULL : set_font_map));
            return this;
        }
        
        public Build setGetFontMap(java.lang.foreign.MemoryAddress get_font_map) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_font_map"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_font_map == null ? MemoryAddress.NULL : get_font_map));
            return this;
        }
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
