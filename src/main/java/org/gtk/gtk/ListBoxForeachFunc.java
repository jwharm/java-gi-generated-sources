package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function used by gtk_list_box_selected_foreach().
 * <p>
 * It will be called on every selected child of the {@code box}.
 */
@FunctionalInterface
public interface ListBoxForeachFunc {
    void run(org.gtk.gtk.ListBox box, org.gtk.gtk.ListBoxRow row);

    @ApiStatus.Internal default void upcall(MemoryAddress box, MemoryAddress row, MemoryAddress userData) {
        run((org.gtk.gtk.ListBox) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(box)), org.gtk.gtk.ListBox.fromAddress).marshal(box, Ownership.NONE), (org.gtk.gtk.ListBoxRow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(row)), org.gtk.gtk.ListBoxRow.fromAddress).marshal(row, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ListBoxForeachFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
