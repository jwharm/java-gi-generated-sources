package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function used by gtk_tree_selection_selected_foreach() to map all
 * selected rows.  It will be called on every selected row in the view.
 */
/**
 * Functional interface declaration of the {@code TreeSelectionForeachFunc} callback.
 */
@FunctionalInterface
public interface TreeSelectionForeachFunc {

    /**
     * A function used by gtk_tree_selection_selected_foreach() to map all
     * selected rows.  It will be called on every selected row in the view.
     */
    void run(org.gtk.gtk.TreeModel model, org.gtk.gtk.TreePath path, org.gtk.gtk.TreeIter iter);
    
    @ApiStatus.Internal default void upcall(MemoryAddress model, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
        run((org.gtk.gtk.TreeModel) Interop.register(model, org.gtk.gtk.TreeModel.fromAddress).marshal(model, null), org.gtk.gtk.TreePath.fromAddress.marshal(path, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TreeSelectionForeachFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
