package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkShortcutAction} encodes an action that can be triggered by a
 * keyboard shortcut.
 * <p>
 * {@code GtkShortcutActions} contain functions that allow easy presentation
 * to end users as well as being printed for debugging.
 * <p>
 * All {@code GtkShortcutActions} are immutable, you can only specify their
 * properties during construction. If you want to change a action, you
 * have to replace it with a new one. If you need to pass arguments to
 * an action, these are specified by the higher-level {@code GtkShortcut} object.
 * <p>
 * To activate a {@code GtkShortcutAction} manually, {@link ShortcutAction#activate}
 * can be called.
 * <p>
 * GTK provides various actions:
 * <ul>
 * <li>{@link MnemonicAction}: a shortcut action that calls
 *    gtk_widget_mnemonic_activate()
 * <li>{@link CallbackAction}: a shortcut action that invokes
 *    a given callback
 * <li>{@link SignalAction}: a shortcut action that emits a
 *    given signal
 * <li>{@link ActivateAction}: a shortcut action that calls
 *    gtk_widget_activate()
 * <li>{@link NamedAction}: a shortcut action that calls
 *    gtk_widget_activate_action()
 * <li>{@link NothingAction}: a shortcut action that does nothing
 * </ul>
 */
public class ShortcutAction extends org.gtk.gobject.Object {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkShortcutAction";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ShortcutAction proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ShortcutAction(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ShortcutAction if its GType is a (or inherits from) "GtkShortcutAction".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ShortcutAction} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkShortcutAction", a ClassCastException will be thrown.
     */
    public static ShortcutAction castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ShortcutAction.getType())) {
            return new ShortcutAction(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkShortcutAction");
        }
    }
    
    private static Addressable constructParseString(@NotNull java.lang.String string) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_action_parse_string.invokeExact(
                    Interop.allocateNativeString(string));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Tries to parse the given string into an action.
     * <p>
     * On success, the parsed action is returned. When parsing
     * failed, {@code null} is returned.
     * <p>
     * The accepted strings are:
     * <ul>
     * <li>{@code nothing}, for {@code GtkNothingAction}
     * <li>{@code activate}, for {@code GtkActivateAction}
     * <li>{@code mnemonic-activate}, for {@code GtkMnemonicAction}
     * <li>{@code action(NAME)}, for a {@code GtkNamedAction} for the action named {@code NAME}
     * <li>{@code signal(NAME)}, for a {@code GtkSignalAction} for the signal {@code NAME}
     * </ul>
     * @param string the string to parse
     * @return a new {@code GtkShortcutAction}
     */
    public static ShortcutAction parseString(@NotNull java.lang.String string) {
        return new ShortcutAction(constructParseString(string), Ownership.FULL);
    }
    
    /**
     * Activates the action on the {@code widget} with the given {@code args}.
     * <p>
     * Note that some actions ignore the passed in {@code flags}, {@code widget} or {@code args}.
     * <p>
     * Activation of an action can fail for various reasons. If the action
     * is not supported by the {@code widget}, if the {@code args} don't match the action
     * or if the activation otherwise had no effect, {@code false} will be returned.
     * @param flags flags to activate with
     * @param widget Target of the activation
     * @param args arguments to pass
     * @return {@code true} if this action was activated successfully
     */
    public boolean activate(@NotNull org.gtk.gtk.ShortcutActionFlags flags, @NotNull org.gtk.gtk.Widget widget, @Nullable org.gtk.glib.Variant args) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_shortcut_action_activate.invokeExact(
                    handle(),
                    flags.getValue(),
                    widget.handle(),
                    (Addressable) (args == null ? MemoryAddress.NULL : args.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Prints the given action into a string for the developer.
     * <p>
     * This is meant for debugging and logging.
     * <p>
     * The form of the representation may change at any time and is
     * not guaranteed to stay identical.
     * @param string a {@code GString} to print into
     */
    public void print(@NotNull org.gtk.glib.String string) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        try {
            DowncallHandles.gtk_shortcut_action_print.invokeExact(
                    handle(),
                    string.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Prints the given action into a human-readable string.
     * <p>
     * This is a small wrapper around {@link ShortcutAction#print}
     * to help when debugging.
     * @return a new string
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_action_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_shortcut_action_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link ShortcutAction.Build} object constructs a {@link ShortcutAction} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ShortcutAction} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ShortcutAction} using {@link ShortcutAction#castFrom}.
         * @return A new instance of {@code ShortcutAction} with the properties 
         *         that were set in the Build object.
         */
        public ShortcutAction construct() {
            return ShortcutAction.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ShortcutAction.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_shortcut_action_parse_string = Interop.downcallHandle(
            "gtk_shortcut_action_parse_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_action_activate = Interop.downcallHandle(
            "gtk_shortcut_action_activate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_action_print = Interop.downcallHandle(
            "gtk_shortcut_action_print",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_action_to_string = Interop.downcallHandle(
            "gtk_shortcut_action_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_action_get_type = Interop.downcallHandle(
            "gtk_shortcut_action_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
