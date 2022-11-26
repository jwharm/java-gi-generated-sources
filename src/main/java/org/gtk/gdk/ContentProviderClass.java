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
    public org.gtk.gobject.ObjectClass parent_class$get() {
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
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setContentChanged(java.lang.foreign.MemoryAddress content_changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("content_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (content_changed == null ? MemoryAddress.NULL : content_changed));
            return this;
        }
        
        public Build setAttachClipboard(java.lang.foreign.MemoryAddress attach_clipboard) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("attach_clipboard"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (attach_clipboard == null ? MemoryAddress.NULL : attach_clipboard));
            return this;
        }
        
        public Build setDetachClipboard(java.lang.foreign.MemoryAddress detach_clipboard) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("detach_clipboard"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (detach_clipboard == null ? MemoryAddress.NULL : detach_clipboard));
            return this;
        }
        
        public Build setRefFormats(java.lang.foreign.MemoryAddress ref_formats) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_formats"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ref_formats == null ? MemoryAddress.NULL : ref_formats));
            return this;
        }
        
        public Build setRefStorableFormats(java.lang.foreign.MemoryAddress ref_storable_formats) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_storable_formats"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ref_storable_formats == null ? MemoryAddress.NULL : ref_storable_formats));
            return this;
        }
        
        public Build setWriteMimeTypeAsync(java.lang.foreign.MemoryAddress write_mime_type_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write_mime_type_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (write_mime_type_async == null ? MemoryAddress.NULL : write_mime_type_async));
            return this;
        }
        
        public Build setWriteMimeTypeFinish(java.lang.foreign.MemoryAddress write_mime_type_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write_mime_type_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (write_mime_type_finish == null ? MemoryAddress.NULL : write_mime_type_finish));
            return this;
        }
        
        public Build setGetValue(java.lang.foreign.MemoryAddress get_value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_value == null ? MemoryAddress.NULL : get_value));
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
