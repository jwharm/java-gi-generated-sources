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
/**
 * Functional interface declaration of the {@code ListBoxCreateWidgetFunc} callback.
 */
@FunctionalInterface
public interface ListBoxCreateWidgetFunc {

    /**
     * Called for list boxes that are bound to a {@code GListModel} with
     * gtk_list_box_bind_model() for each item that gets added to the model.
     * <p>
     * If the widget returned is not a {@link ListBoxRow} widget, then the widget
     * will be inserted as the child of an intermediate {@link ListBoxRow}.
     */
    org.gtk.gtk.Widget run(org.gtk.gobject.GObject item);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress item, MemoryAddress userData) {
        var RESULT = run((org.gtk.gobject.GObject) Interop.register(item, org.gtk.gobject.GObject.fromAddress).marshal(item, null));
        RESULT.yieldOwnership();
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ListBoxCreateWidgetFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
