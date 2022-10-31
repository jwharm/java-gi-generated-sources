package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutAction} that activates an action by name.
 */
public class NamedAction extends org.gtk.gtk.ShortcutAction {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkNamedAction";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public NamedAction(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to NamedAction if its GType is a (or inherits from) "GtkNamedAction".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "NamedAction" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkNamedAction", a ClassCastException will be thrown.
     */
    public static NamedAction castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkNamedAction"))) {
            return new NamedAction(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkNamedAction");
        }
    }
    
    private static Refcounted constructNew(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_named_action_new.invokeExact(
                    Interop.allocateNativeString(name)), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates an action that when activated, activates
     * the named action on the widget.
     * <p>
     * It also passes the given arguments to it.
     * <p>
     * See {@link Widget#insertActionGroup} for
     * how to add actions to widgets.
     * @param name the detailed name of the action
     */
    public NamedAction(@NotNull java.lang.String name) {
        super(constructNew(name));
    }
    
    /**
     * Returns the name of the action that will be activated.
     * @return the name of the action to activate
     */
    public @NotNull java.lang.String getActionName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_named_action_get_action_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_named_action_new = Interop.downcallHandle(
            "gtk_named_action_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_named_action_get_action_name = Interop.downcallHandle(
            "gtk_named_action_get_action_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
