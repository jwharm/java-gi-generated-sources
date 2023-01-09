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
/**
 * Functional interface declaration of the {@code ListBoxForeachFunc} callback.
 */
@FunctionalInterface
public interface ListBoxForeachFunc {

    /**
     * A function used by gtk_list_box_selected_foreach().
     * <p>
     * It will be called on every selected child of the {@code box}.
     */
    void run(org.gtk.gtk.ListBox box, org.gtk.gtk.ListBoxRow row);
    
    @ApiStatus.Internal default void upcall(MemoryAddress box, MemoryAddress row, MemoryAddress userData) {
        run((org.gtk.gtk.ListBox) Interop.register(box, org.gtk.gtk.ListBox.fromAddress).marshal(box, null), (org.gtk.gtk.ListBoxRow) Interop.register(row, org.gtk.gtk.ListBoxRow.fromAddress).marshal(row, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ListBoxForeachFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
