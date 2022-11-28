package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoFontMapClass} structure holds the virtual functions for
 * a particular {@code PangoFontMap} implementation.
 */
public class FontMapClass extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontMapClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("load_font"),
        Interop.valueLayout.ADDRESS.withName("list_families"),
        Interop.valueLayout.ADDRESS.withName("load_fontset"),
        Interop.valueLayout.ADDRESS.withName("shape_engine_type"),
        Interop.valueLayout.ADDRESS.withName("get_serial"),
        Interop.valueLayout.ADDRESS.withName("changed"),
        Interop.valueLayout.ADDRESS.withName("get_family"),
        Interop.valueLayout.ADDRESS.withName("get_face")
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
     * Allocate a new {@link FontMapClass}
     * @return A new, uninitialized @{link FontMapClass}
     */
    public static FontMapClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FontMapClass newInstance = new FontMapClass(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code shape_engine_type}
     * @return The value of the field {@code shape_engine_type}
     */
    public java.lang.String shapeEngineType$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("shape_engine_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code shape_engine_type}
     * @param shapeEngineType The new value of the field {@code shape_engine_type}
     */
    public void shapeEngineType$set(java.lang.String shapeEngineType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("shape_engine_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(shapeEngineType));
    }
    
    /**
     * Create a FontMapClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FontMapClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private FontMapClass struct;
        
         /**
         * A {@link FontMapClass.Build} object constructs a {@link FontMapClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = FontMapClass.allocate();
        }
        
         /**
         * Finish building the {@link FontMapClass} struct.
         * @return A new instance of {@code FontMapClass} with the fields 
         *         that were set in the Build object.
         */
        public FontMapClass construct() {
            return struct;
        }
        
        /**
         * parent {@code GObjectClass}
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setLoadFont(java.lang.foreign.MemoryAddress loadFont) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_font"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (loadFont == null ? MemoryAddress.NULL : loadFont));
            return this;
        }
        
        public Build setListFamilies(java.lang.foreign.MemoryAddress listFamilies) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("list_families"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (listFamilies == null ? MemoryAddress.NULL : listFamilies));
            return this;
        }
        
        public Build setLoadFontset(java.lang.foreign.MemoryAddress loadFontset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_fontset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (loadFontset == null ? MemoryAddress.NULL : loadFontset));
            return this;
        }
        
        /**
         * the type of rendering-system-dependent engines that
         * can handle fonts of this fonts loaded with this fontmap.
         * @param shapeEngineType The value for the {@code shapeEngineType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShapeEngineType(java.lang.String shapeEngineType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shape_engine_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shapeEngineType == null ? MemoryAddress.NULL : Interop.allocateNativeString(shapeEngineType)));
            return this;
        }
        
        public Build setGetSerial(java.lang.foreign.MemoryAddress getSerial) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_serial"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSerial == null ? MemoryAddress.NULL : getSerial));
            return this;
        }
        
        public Build setChanged(java.lang.foreign.MemoryAddress changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changed == null ? MemoryAddress.NULL : changed));
            return this;
        }
        
        public Build setGetFamily(java.lang.foreign.MemoryAddress getFamily) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_family"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFamily == null ? MemoryAddress.NULL : getFamily));
            return this;
        }
        
        public Build setGetFace(java.lang.foreign.MemoryAddress getFace) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_face"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFace == null ? MemoryAddress.NULL : getFace));
            return this;
        }
    }
}
