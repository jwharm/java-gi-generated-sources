package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the callback functions used for activating
 * actions installed with gtk_widget_class_install_action().
 * <p>
 * The {@code parameter} must match the {@code parameter_type} of the action.
 */
/**
 * Functional interface declaration of the {@code WidgetActionActivateFunc} callback.
 */
@FunctionalInterface
public interface WidgetActionActivateFunc {

    /**
     * The type of the callback functions used for activating
     * actions installed with gtk_widget_class_install_action().
     * <p>
     * The {@code parameter} must match the {@code parameter_type} of the action.
     */
    void run(org.gtk.gtk.Widget widget, java.lang.String actionName, org.gtk.glib.Variant parameter);
    
    @ApiStatus.Internal default void upcall(MemoryAddress widget, MemoryAddress actionName, MemoryAddress parameter) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), Marshal.addressToString.marshal(actionName, null), org.gtk.glib.Variant.fromAddress.marshal(parameter, null));
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WidgetActionActivateFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
