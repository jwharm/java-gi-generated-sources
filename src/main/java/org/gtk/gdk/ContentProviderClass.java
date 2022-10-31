package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@code GdkContentProvider}.
 */
public class ContentProviderClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkContentProviderClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("content_changed"),
        Interop.valueLayout.ADDRESS.withName("attach_clipboard"),
        Interop.valueLayout.ADDRESS.withName("detach_clipboard"),
        Interop.valueLayout.ADDRESS.withName("ref_formats"),
        Interop.valueLayout.ADDRESS.withName("ref_storable_formats"),
        Interop.valueLayout.ADDRESS.withName("write_mime_type_async"),
        Interop.valueLayout.ADDRESS.withName("write_mime_type_finish"),
        Interop.valueLayout.ADDRESS.withName("get_value"),
        MemoryLayout.paddingLayout(448),
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static ContentProviderClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ContentProviderClass newInstance = new ContentProviderClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public ContentProviderClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
