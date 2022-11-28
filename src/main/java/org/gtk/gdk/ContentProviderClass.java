package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@code GdkContentProvider}.
 */
public class ContentProviderClass extends Struct {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkContentProviderClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("content_changed"),
        Interop.valueLayout.ADDRESS.withName("attach_clipboard"),
        Interop.valueLayout.ADDRESS.withName("detach_clipboard"),
        Interop.valueLayout.ADDRESS.withName("ref_formats"),
        Interop.valueLayout.ADDRESS.withName("ref_storable_formats"),
        Interop.valueLayout.ADDRESS.withName("write_mime_type_async"),
        Interop.valueLayout.ADDRESS.withName("write_mime_type_finish"),
        Interop.valueLayout.ADDRESS.withName("get_value"),
        MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
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
     * Allocate a new {@link ContentProviderClass}
     * @return A new, uninitialized @{link ContentProviderClass}
     */
    public static ContentProviderClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ContentProviderClass newInstance = new ContentProviderClass(segment.address(), Ownership.NONE);
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
     * Create a ContentProviderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ContentProviderClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ContentProviderClass struct;
        
         /**
         * A {@link ContentProviderClass.Build} object constructs a {@link ContentProviderClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ContentProviderClass.allocate();
        }
        
         /**
         * Finish building the {@link ContentProviderClass} struct.
         * @return A new instance of {@code ContentProviderClass} with the fields 
         *         that were set in the Build object.
         */
        public ContentProviderClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setContentChanged(java.lang.foreign.MemoryAddress contentChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("content_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (contentChanged == null ? MemoryAddress.NULL : contentChanged));
            return this;
        }
        
        public Build setAttachClipboard(java.lang.foreign.MemoryAddress attachClipboard) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("attach_clipboard"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (attachClipboard == null ? MemoryAddress.NULL : attachClipboard));
            return this;
        }
        
        public Build setDetachClipboard(java.lang.foreign.MemoryAddress detachClipboard) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("detach_clipboard"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (detachClipboard == null ? MemoryAddress.NULL : detachClipboard));
            return this;
        }
        
        public Build setRefFormats(java.lang.foreign.MemoryAddress refFormats) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_formats"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (refFormats == null ? MemoryAddress.NULL : refFormats));
            return this;
        }
        
        public Build setRefStorableFormats(java.lang.foreign.MemoryAddress refStorableFormats) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_storable_formats"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (refStorableFormats == null ? MemoryAddress.NULL : refStorableFormats));
            return this;
        }
        
        public Build setWriteMimeTypeAsync(java.lang.foreign.MemoryAddress writeMimeTypeAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write_mime_type_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writeMimeTypeAsync == null ? MemoryAddress.NULL : writeMimeTypeAsync));
            return this;
        }
        
        public Build setWriteMimeTypeFinish(java.lang.foreign.MemoryAddress writeMimeTypeFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write_mime_type_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writeMimeTypeFinish == null ? MemoryAddress.NULL : writeMimeTypeFinish));
            return this;
        }
        
        public Build setGetValue(java.lang.foreign.MemoryAddress getValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue));
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
