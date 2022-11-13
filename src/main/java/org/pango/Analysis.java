package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAnalysis} structure stores information about
 * the properties of a segment of text.
 */
public class Analysis extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoAnalysis";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("shape_engine"),
        Interop.valueLayout.ADDRESS.withName("lang_engine"),
        Interop.valueLayout.ADDRESS.withName("font"),
        ValueLayout.JAVA_BYTE.withName("level"),
        ValueLayout.JAVA_BYTE.withName("gravity"),
        ValueLayout.JAVA_BYTE.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("script"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("language"),
        Interop.valueLayout.ADDRESS.withName("extra_attrs")
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
    public java.lang.foreign.MemoryAddress shape_engine$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("shape_engine"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code shape_engine}
     * @param shape_engine The new value of the field {@code shape_engine}
     */
    public void shape_engine$set(java.lang.foreign.MemoryAddress shape_engine) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("shape_engine"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), shape_engine);
    }
    
    /**
     * Get the value of the field {@code lang_engine}
     * @return The value of the field {@code lang_engine}
     */
    public java.lang.foreign.MemoryAddress lang_engine$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lang_engine"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code lang_engine}
     * @param lang_engine The new value of the field {@code lang_engine}
     */
    public void lang_engine$set(java.lang.foreign.MemoryAddress lang_engine) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lang_engine"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), lang_engine);
    }
    
    /**
     * Get the value of the field {@code font}
     * @return The value of the field {@code font}
     */
    public org.pango.Font font$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("font"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.pango.Font(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code font}
     * @param font The new value of the field {@code font}
     */
    public void font$set(org.pango.Font font) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("font"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), font.handle());
    }
    
    /**
     * Get the value of the field {@code level}
     * @return The value of the field {@code level}
     */
    public byte level$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("level"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code level}
     * @param level The new value of the field {@code level}
     */
    public void level$set(byte level) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("level"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), level);
    }
    
    /**
     * Get the value of the field {@code gravity}
     * @return The value of the field {@code gravity}
     */
    public byte gravity$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("gravity"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code gravity}
     * @param gravity The new value of the field {@code gravity}
     */
    public void gravity$set(byte gravity) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("gravity"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), gravity);
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public byte flags$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void flags$set(byte flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
    }
    
    /**
     * Get the value of the field {@code script}
     * @return The value of the field {@code script}
     */
    public byte script$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("script"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code script}
     * @param script The new value of the field {@code script}
     */
    public void script$set(byte script) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("script"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), script);
    }
    
    /**
     * Get the value of the field {@code language}
     * @return The value of the field {@code language}
     */
    public org.pango.Language language$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("language"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.pango.Language(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code language}
     * @param language The new value of the field {@code language}
     */
    public void language$set(org.pango.Language language) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("language"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), language.handle());
    }
    
    /**
     * Get the value of the field {@code extra_attrs}
     * @return The value of the field {@code extra_attrs}
     */
    public org.gtk.glib.SList extra_attrs$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("extra_attrs"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.SList(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code extra_attrs}
     * @param extra_attrs The new value of the field {@code extra_attrs}
     */
    public void extra_attrs$set(org.gtk.glib.SList extra_attrs) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("extra_attrs"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), extra_attrs.handle());
    }
    
    /**
     * Create a Analysis proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Analysis(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
