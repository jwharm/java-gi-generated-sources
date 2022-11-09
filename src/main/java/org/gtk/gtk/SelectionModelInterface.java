package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The list of virtual functions for the {@code GtkSelectionModel} interface.
 * No function must be implemented, but unless {@code GtkSelectionModel::is_selected()}
 * is implemented, it will not be possible to select items in the set.
 * <p>
 * The model does not need to implement any functions to support either
 * selecting or unselecting items. Of course, if the model does not do that,
 * it means that users cannot select or unselect items in a list widget
 * using the model.
 * <p>
 * All selection functions fall back to {@code GtkSelectionModel::set_selection()}
 * so it is sufficient to implement just that function for full selection
 * support.
 */
public class SelectionModelInterface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSelectionModelInterface";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("is_selected"),
        Interop.valueLayout.ADDRESS.withName("get_selection_in_range"),
        Interop.valueLayout.ADDRESS.withName("select_item"),
        Interop.valueLayout.ADDRESS.withName("unselect_item"),
        Interop.valueLayout.ADDRESS.withName("select_range"),
        Interop.valueLayout.ADDRESS.withName("unselect_range"),
        Interop.valueLayout.ADDRESS.withName("select_all"),
        Interop.valueLayout.ADDRESS.withName("unselect_all"),
        Interop.valueLayout.ADDRESS.withName("set_selection")
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
    
    public static SelectionModelInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SelectionModelInterface newInstance = new SelectionModelInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SelectionModelInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SelectionModelInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
