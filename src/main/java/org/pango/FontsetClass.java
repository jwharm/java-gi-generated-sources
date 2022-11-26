package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoFontsetClass} structure holds the virtual functions for
 * a particular {@code PangoFontset} implementation.
 */
public class FontsetClass extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontsetClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("get_font"),
        Interop.valueLayout.ADDRESS.withName("get_metrics"),
        Interop.valueLayout.ADDRESS.withName("get_language"),
        Interop.valueLayout.ADDRESS.withName("foreach"),
        Interop.valueLayout.ADDRESS.withName("_pango_reserved1"),
        Interop.valueLayout.ADDRESS.withName("_pango_reserved2"),
        Interop.valueLayout.ADDRESS.withName("_pango_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_pango_reserved4")
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
     * Allocate a new {@link FontsetClass}
     * @return A new, uninitialized @{link FontsetClass}
     */
    public static FontsetClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FontsetClass newInstance = new FontsetClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a FontsetClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FontsetClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private FontsetClass struct;
        
         /**
         * A {@link FontsetClass.Build} object constructs a {@link FontsetClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = FontsetClass.allocate();
        }
        
         /**
         * Finish building the {@link FontsetClass} struct.
         * @return A new instance of {@code FontsetClass} with the fields 
         *         that were set in the Build object.
         */
        public FontsetClass construct() {
            return struct;
        }
        
        /**
         * parent {@code GObjectClass}
         * @param parent_class The value for the {@code parent_class} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setGetFont(java.lang.foreign.MemoryAddress get_font) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_font"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_font == null ? MemoryAddress.NULL : get_font));
            return this;
        }
        
        public Build setGetMetrics(java.lang.foreign.MemoryAddress get_metrics) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_metrics"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_metrics == null ? MemoryAddress.NULL : get_metrics));
            return this;
        }
        
        public Build setGetLanguage(java.lang.foreign.MemoryAddress get_language) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_language"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_language == null ? MemoryAddress.NULL : get_language));
            return this;
        }
        
        public Build setForeach(java.lang.foreign.MemoryAddress foreach) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("foreach"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (foreach == null ? MemoryAddress.NULL : foreach));
            return this;
        }
        
        public Build setPangoReserved1(java.lang.foreign.MemoryAddress _pango_reserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_pango_reserved1 == null ? MemoryAddress.NULL : _pango_reserved1));
            return this;
        }
        
        public Build setPangoReserved2(java.lang.foreign.MemoryAddress _pango_reserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_pango_reserved2 == null ? MemoryAddress.NULL : _pango_reserved2));
            return this;
        }
        
        public Build setPangoReserved3(java.lang.foreign.MemoryAddress _pango_reserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_pango_reserved3 == null ? MemoryAddress.NULL : _pango_reserved3));
            return this;
        }
        
        public Build setPangoReserved4(java.lang.foreign.MemoryAddress _pango_reserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_pango_reserved4 == null ? MemoryAddress.NULL : _pango_reserved4));
            return this;
        }
    }
}
