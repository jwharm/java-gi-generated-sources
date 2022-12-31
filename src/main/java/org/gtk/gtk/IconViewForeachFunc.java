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
@FunctionalInterface
public interface IconViewForeachFunc {
    void run(org.gtk.gtk.IconView iconView, org.gtk.gtk.TreePath path);

    @ApiStatus.Internal default void upcall(MemoryAddress iconView, MemoryAddress path, MemoryAddress data) {
        run((org.gtk.gtk.IconView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(iconView)), org.gtk.gtk.IconView.fromAddress).marshal(iconView, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IconViewForeachFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
