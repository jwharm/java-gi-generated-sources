package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PopupInterface extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPopupInterface";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static PopupInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PopupInterface newInstance = new PopupInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PopupInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PopupInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
