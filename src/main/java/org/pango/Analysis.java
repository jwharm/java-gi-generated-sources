package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAnalysis} structure stores information about
 * the properties of a segment of text.
 */
public class Analysis extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoAnalysis";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("shape_engine"),
            Interop.valueLayout.ADDRESS.withName("lang_engine"),
            Interop.valueLayout.ADDRESS.withName("font"),
            Interop.valueLayout.C_BYTE.withName("level"),
            Interop.valueLayout.C_BYTE.withName("gravity"),
            Interop.valueLayout.C_BYTE.withName("flags"),
            Interop.valueLayout.C_BYTE.withName("script"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("language"),
            Interop.valueLayout.ADDRESS.withName("extra_attrs")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Analysis}
     * @return A new, uninitialized @{link Analysis}
     */
    public static Analysis allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Analysis newInstance = new Analysis(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code shape_engine}
     * @return The value of the field {@code shape_engine}
     */
    public java.lang.foreign.MemoryAddress getShapeEngine() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("shape_engine"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code shape_engine}
     * @param shapeEngine The new value of the field {@code shape_engine}
     */
    public void setShapeEngine(java.lang.foreign.MemoryAddress shapeEngine) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("shape_engine"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shapeEngine == null ? MemoryAddress.NULL : (Addressable) shapeEngine));
    }
    
    /**
     * Get the value of the field {@code lang_engine}
     * @return The value of the field {@code lang_engine}
     */
    public java.lang.foreign.MemoryAddress getLangEngine() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lang_engine"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code lang_engine}
     * @param langEngine The new value of the field {@code lang_engine}
     */
    public void setLangEngine(java.lang.foreign.MemoryAddress langEngine) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lang_engine"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (langEngine == null ? MemoryAddress.NULL : (Addressable) langEngine));
    }
    
    /**
     * Get the value of the field {@code font}
     * @return The value of the field {@code font}
     */
    public org.pango.Font getFont() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("font"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return (org.pango.Font) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.pango.Font.fromAddress).marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code font}
     * @param font The new value of the field {@code font}
     */
    public void setFont(org.pango.Font font) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("font"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (font == null ? MemoryAddress.NULL : font.handle()));
    }
    
    /**
     * Get the value of the field {@code level}
     * @return The value of the field {@code level}
     */
    public byte getLevel() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("level"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code level}
     * @param level The new value of the field {@code level}
     */
    public void setLevel(byte level) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("level"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), level);
    }
    
    /**
     * Get the value of the field {@code gravity}
     * @return The value of the field {@code gravity}
     */
    public byte getGravity() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("gravity"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code gravity}
     * @param gravity The new value of the field {@code gravity}
     */
    public void setGravity(byte gravity) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("gravity"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), gravity);
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public byte getFlags() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(byte flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
    }
    
    /**
     * Get the value of the field {@code script}
     * @return The value of the field {@code script}
     */
    public byte getScript() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("script"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code script}
     * @param script The new value of the field {@code script}
     */
    public void setScript(byte script) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("script"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), script);
    }
    
    /**
     * Get the value of the field {@code language}
     * @return The value of the field {@code language}
     */
    public org.pango.Language getLanguage() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("language"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.pango.Language.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code language}
     * @param language The new value of the field {@code language}
     */
    public void setLanguage(org.pango.Language language) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("language"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (language == null ? MemoryAddress.NULL : language.handle()));
    }
    
    /**
     * Get the value of the field {@code extra_attrs}
     * @return The value of the field {@code extra_attrs}
     */
    public org.gtk.glib.SList getExtraAttrs() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("extra_attrs"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code extra_attrs}
     * @param extraAttrs The new value of the field {@code extra_attrs}
     */
    public void setExtraAttrs(org.gtk.glib.SList extraAttrs) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("extra_attrs"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (extraAttrs == null ? MemoryAddress.NULL : extraAttrs.handle()));
    }
    
    /**
     * Create a Analysis proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Analysis(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Analysis> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Analysis(input, ownership);
    
    /**
     * A {@link Analysis.Builder} object constructs a {@link Analysis} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Analysis.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Analysis struct;
        
        private Builder() {
            struct = Analysis.allocate();
        }
        
         /**
         * Finish building the {@link Analysis} struct.
         * @return A new instance of {@code Analysis} with the fields 
         *         that were set in the Builder object.
         */
        public Analysis build() {
            return struct;
        }
        
        /**
         * unused, reserved
         * @param shapeEngine The value for the {@code shapeEngine} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShapeEngine(java.lang.foreign.MemoryAddress shapeEngine) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shape_engine"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shapeEngine == null ? MemoryAddress.NULL : (Addressable) shapeEngine));
            return this;
        }
        
        /**
         * unused, reserved
         * @param langEngine The value for the {@code langEngine} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLangEngine(java.lang.foreign.MemoryAddress langEngine) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lang_engine"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (langEngine == null ? MemoryAddress.NULL : (Addressable) langEngine));
            return this;
        }
        
        /**
         * the font for this segment.
         * @param font The value for the {@code font} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFont(org.pango.Font font) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("font"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (font == null ? MemoryAddress.NULL : font.handle()));
            return this;
        }
        
        /**
         * the bidirectional level for this segment.
         * @param level The value for the {@code level} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLevel(byte level) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("level"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), level);
            return this;
        }
        
        /**
         * the glyph orientation for this segment (A {@code PangoGravity}).
         * @param gravity The value for the {@code gravity} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGravity(byte gravity) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gravity"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), gravity);
            return this;
        }
        
        /**
         * boolean flags for this segment (Since: 1.16).
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(byte flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
            return this;
        }
        
        /**
         * the detected script for this segment (A {@code PangoScript}) (Since: 1.18).
         * @param script The value for the {@code script} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScript(byte script) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("script"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), script);
            return this;
        }
        
        /**
         * the detected language for this segment.
         * @param language The value for the {@code language} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLanguage(org.pango.Language language) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("language"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (language == null ? MemoryAddress.NULL : language.handle()));
            return this;
        }
        
        /**
         * extra attributes for this segment.
         * @param extraAttrs The value for the {@code extraAttrs} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setExtraAttrs(org.gtk.glib.SList extraAttrs) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("extra_attrs"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (extraAttrs == null ? MemoryAddress.NULL : extraAttrs.handle()));
            return this;
        }
    }
}
