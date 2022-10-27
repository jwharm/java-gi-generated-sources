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
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("padding")
    ).withName("GdkContentProviderClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ContentProviderClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
