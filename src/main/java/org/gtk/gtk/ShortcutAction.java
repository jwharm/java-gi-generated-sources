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
public class ShortcutAction extends org.gtk.gobject.GObject {
    
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
     */
    protected ShortcutAction(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ShortcutAction> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ShortcutAction(input);
    
    private static MemoryAddress constructParseString(java.lang.String string) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_action_parse_string.invokeExact(Marshal.stringToAddress.marshal(string, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
    public static ShortcutAction parseString(java.lang.String string) {
        var RESULT = constructParseString(string);
        var OBJECT = (org.gtk.gtk.ShortcutAction) Interop.register(RESULT, org.gtk.gtk.ShortcutAction.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public boolean activate(org.gtk.gtk.ShortcutActionFlags flags, org.gtk.gtk.Widget widget, @Nullable org.gtk.glib.Variant args) {
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public void print(org.gtk.glib.GString string) {
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
    public java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_action_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_shortcut_action_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ShortcutAction.Builder} object constructs a {@link ShortcutAction} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ShortcutAction.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ShortcutAction} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ShortcutAction}.
         * @return A new instance of {@code ShortcutAction} with the properties 
         *         that were set in the Builder object.
         */
        public ShortcutAction build() {
            return (ShortcutAction) org.gtk.gobject.GObject.newWithProperties(
                ShortcutAction.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_shortcut_action_get_type != null;
    }
}
