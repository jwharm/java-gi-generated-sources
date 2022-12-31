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
@FunctionalInterface
public interface WidgetActionActivateFunc {
    void run(org.gtk.gtk.Widget widget, java.lang.String actionName, org.gtk.glib.Variant parameter);

    @ApiStatus.Internal default void upcall(MemoryAddress widget, MemoryAddress actionName, MemoryAddress parameter) {
        run((org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), Marshal.addressToString.marshal(actionName, null), org.gtk.glib.Variant.fromAddress.marshal(parameter, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WidgetActionActivateFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
