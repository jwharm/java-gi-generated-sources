package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutAction} that invokes a callback.
 */
public class CallbackAction extends org.gtk.gtk.ShortcutAction {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCallbackAction";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public CallbackAction(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to CallbackAction if its GType is a (or inherits from) "GtkCallbackAction".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "CallbackAction" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCallbackAction", a ClassCastException will be thrown.
     */
    public static CallbackAction castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkCallbackAction"))) {
            return new CallbackAction(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCallbackAction");
        }
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gtk.ShortcutFunc callback) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_callback_action_new.invokeExact(
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbShortcutFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)),
                    Interop.cbDestroyNotifySymbol()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a custom action that calls the given {@code callback} when
     * activated.
     * @param callback the callback to call
     */
    public CallbackAction(@Nullable org.gtk.gtk.ShortcutFunc callback) {
        super(constructNew(callback));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_callback_action_new = Interop.downcallHandle(
            "gtk_callback_action_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
