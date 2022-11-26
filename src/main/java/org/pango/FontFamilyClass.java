package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FontFamilyClass extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontFamilyClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("list_faces"),
        Interop.valueLayout.ADDRESS.withName("get_name"),
        Interop.valueLayout.ADDRESS.withName("is_monospace"),
        Interop.valueLayout.ADDRESS.withName("is_variable"),
        Interop.valueLayout.ADDRESS.withName("get_face"),
        Interop.valueLayout.ADDRESS.withName("_pango_reserved2")
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
     * Allocate a new {@link FontFamilyClass}
     * @return A new, uninitialized @{link FontFamilyClass}
     */
    public static FontFamilyClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FontFamilyClass newInstance = new FontFamilyClass(segment.address(), Ownership.NONE);
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
     * Create a FontFamilyClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FontFamilyClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private FontFamilyClass struct;
        
         /**
         * A {@link FontFamilyClass.Build} object constructs a {@link FontFamilyClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = FontFamilyClass.allocate();
        }
        
         /**
         * Finish building the {@link FontFamilyClass} struct.
         * @return A new instance of {@code FontFamilyClass} with the fields 
         *         that were set in the Build object.
         */
        public FontFamilyClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setListFaces(java.lang.foreign.MemoryAddress list_faces) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("list_faces"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (list_faces == null ? MemoryAddress.NULL : list_faces));
            return this;
        }
        
        public Build setGetName(java.lang.foreign.MemoryAddress get_name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_name == null ? MemoryAddress.NULL : get_name));
            return this;
        }
        
        public Build setIsMonospace(java.lang.foreign.MemoryAddress is_monospace) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_monospace"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (is_monospace == null ? MemoryAddress.NULL : is_monospace));
            return this;
        }
        
        public Build setIsVariable(java.lang.foreign.MemoryAddress is_variable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_variable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (is_variable == null ? MemoryAddress.NULL : is_variable));
            return this;
        }
        
        public Build setGetFace(java.lang.foreign.MemoryAddress get_face) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_face"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_face == null ? MemoryAddress.NULL : get_face));
            return this;
        }
        
        public Build setPangoReserved2(java.lang.foreign.MemoryAddress _pango_reserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_pango_reserved2 == null ? MemoryAddress.NULL : _pango_reserved2));
            return this;
        }
    }
}
