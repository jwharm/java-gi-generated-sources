package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Called for list boxes that are bound to a {@code GListModel} with
 * gtk_list_box_bind_model() for each item that gets added to the model.
 * <p>
 * If the widget returned is not a {@link ListBoxRow} widget, then the widget
 * will be inserted as the child of an intermediate {@link ListBoxRow}.
 */
@FunctionalInterface
public interface ListBoxCreateWidgetFunc {
    org.gtk.gtk.Widget run(org.gtk.gobject.GObject item);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress item, MemoryAddress userData) {
        var RESULT = run((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(item)), org.gtk.gobject.GObject.fromAddress).marshal(item, Ownership.NONE));
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ListBoxCreateWidgetFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
