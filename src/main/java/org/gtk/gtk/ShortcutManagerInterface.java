package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The list of functions that can be implemented for the {@code GtkShortcutManager}
 * interface.
 * <p>
 * Note that no function is mandatory to implement, the default implementation
 * will work fine.
 */
public class ShortcutManagerInterface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkShortcutManagerInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("add_controller"),
        Interop.valueLayout.ADDRESS.withName("remove_controller")
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
     * Allocate a new {@link ShortcutManagerInterface}
     * @return A new, uninitialized @{link ShortcutManagerInterface}
     */
    public static ShortcutManagerInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ShortcutManagerInterface newInstance = new ShortcutManagerInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ShortcutManagerInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ShortcutManagerInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ShortcutManagerInterface struct;
        
         /**
         * A {@link ShortcutManagerInterface.Build} object constructs a {@link ShortcutManagerInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ShortcutManagerInterface.allocate();
        }
        
         /**
         * Finish building the {@link ShortcutManagerInterface} struct.
         * @return A new instance of {@code ShortcutManagerInterface} with the fields 
         *         that were set in the Build object.
         */
        public ShortcutManagerInterface construct() {
            return struct;
        }
        
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
            return this;
        }
        
        public Build setAddController(java.lang.foreign.MemoryAddress add_controller) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_controller"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (add_controller == null ? MemoryAddress.NULL : add_controller));
            return this;
        }
        
        public Build setRemoveController(java.lang.foreign.MemoryAddress remove_controller) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remove_controller"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (remove_controller == null ? MemoryAddress.NULL : remove_controller));
            return this;
        }
    }
}
