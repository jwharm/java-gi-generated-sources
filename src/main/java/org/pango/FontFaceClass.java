package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FontFaceClass extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontFaceClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("get_face_name"),
        Interop.valueLayout.ADDRESS.withName("describe"),
        Interop.valueLayout.ADDRESS.withName("list_sizes"),
        Interop.valueLayout.ADDRESS.withName("is_synthesized"),
        Interop.valueLayout.ADDRESS.withName("get_family"),
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
     * Allocate a new {@link FontFaceClass}
     * @return A new, uninitialized @{link FontFaceClass}
     */
    public static FontFaceClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FontFaceClass newInstance = new FontFaceClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a FontFaceClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FontFaceClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private FontFaceClass struct;
        
         /**
         * A {@link FontFaceClass.Build} object constructs a {@link FontFaceClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = FontFaceClass.allocate();
        }
        
         /**
         * Finish building the {@link FontFaceClass} struct.
         * @return A new instance of {@code FontFaceClass} with the fields 
         *         that were set in the Build object.
         */
        public FontFaceClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setGetFaceName(java.lang.foreign.MemoryAddress getFaceName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_face_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFaceName == null ? MemoryAddress.NULL : getFaceName));
            return this;
        }
        
        public Build setDescribe(java.lang.foreign.MemoryAddress describe) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("describe"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (describe == null ? MemoryAddress.NULL : describe));
            return this;
        }
        
        public Build setListSizes(java.lang.foreign.MemoryAddress listSizes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("list_sizes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (listSizes == null ? MemoryAddress.NULL : listSizes));
            return this;
        }
        
        public Build setIsSynthesized(java.lang.foreign.MemoryAddress isSynthesized) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_synthesized"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isSynthesized == null ? MemoryAddress.NULL : isSynthesized));
            return this;
        }
        
        public Build setGetFamily(java.lang.foreign.MemoryAddress getFamily) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_family"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFamily == null ? MemoryAddress.NULL : getFamily));
            return this;
        }
        
        public Build setPangoReserved3(java.lang.foreign.MemoryAddress PangoReserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (PangoReserved3 == null ? MemoryAddress.NULL : PangoReserved3));
            return this;
        }
        
        public Build setPangoReserved4(java.lang.foreign.MemoryAddress PangoReserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (PangoReserved4 == null ? MemoryAddress.NULL : PangoReserved4));
            return this;
        }
    }
}
