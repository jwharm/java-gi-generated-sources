package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class MnemonicTriggerClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkMnemonicTriggerClass";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MnemonicTriggerClass}
     * @return A new, uninitialized @{link MnemonicTriggerClass}
     */
    public static MnemonicTriggerClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MnemonicTriggerClass newInstance = new MnemonicTriggerClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a MnemonicTriggerClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MnemonicTriggerClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
