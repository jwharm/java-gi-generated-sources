package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function used by gtk_icon_view_selected_foreach() to map all
 * selected rows.
 * <p>
 * It will be called on every selected row in the view.
 */
/**
 * Functional interface declaration of the {@code IconViewForeachFunc} callback.
 */
@FunctionalInterface
public interface IconViewForeachFunc {

    /**
     * A function used by gtk_icon_view_selected_foreach() to map all
     * selected rows.
     * <p>
     * It will be called on every selected row in the view.
     */
    void run(org.gtk.gtk.IconView iconView, org.gtk.gtk.TreePath path);
    
    @ApiStatus.Internal default void upcall(MemoryAddress iconView, MemoryAddress path, MemoryAddress data) {
        run((org.gtk.gtk.IconView) Interop.register(iconView, org.gtk.gtk.IconView.fromAddress).marshal(iconView, null), org.gtk.gtk.TreePath.fromAddress.marshal(path, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IconViewForeachFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
