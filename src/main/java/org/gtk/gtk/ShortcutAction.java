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
 * <p>
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
 */
public class ShortcutAction extends org.gtk.gobject.Object {

    public ShortcutAction(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ShortcutAction */
    public static ShortcutAction castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutAction(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_shortcut_action_parse_string = Interop.downcallHandle(
        "gtk_shortcut_action_parse_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructParseString(@NotNull java.lang.String string) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_shortcut_action_parse_string.invokeExact(Interop.allocateNativeString(string)), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
     */
    public static ShortcutAction parseString(@NotNull java.lang.String string) {
        return new ShortcutAction(constructParseString(string));
    }
    
    private static final MethodHandle gtk_shortcut_action_activate = Interop.downcallHandle(
        "gtk_shortcut_action_activate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Activates the action on the {@code widget} with the given {@code args}.
     * <p>
     * Note that some actions ignore the passed in {@code flags}, {@code widget} or {@code args}.
     * <p>
     * Activation of an action can fail for various reasons. If the action
     * is not supported by the {@code widget}, if the {@code args} don't match the action
     * or if the activation otherwise had no effect, {@code false} will be returned.
     */
    public boolean activate(@NotNull ShortcutActionFlags flags, @NotNull Widget widget, @Nullable org.gtk.glib.Variant args) {
        int RESULT;
        try {
            RESULT = (int) gtk_shortcut_action_activate.invokeExact(handle(), flags.getValue(), widget.handle(), args.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_shortcut_action_print = Interop.downcallHandle(
        "gtk_shortcut_action_print",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prints the given action into a string for the developer.
     * <p>
     * This is meant for debugging and logging.
     * <p>
     * The form of the representation may change at any time and is
     * not guaranteed to stay identical.
     */
    public @NotNull void print(@NotNull org.gtk.glib.String string) {
        try {
            gtk_shortcut_action_print.invokeExact(handle(), string.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_shortcut_action_to_string = Interop.downcallHandle(
        "gtk_shortcut_action_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prints the given action into a human-readable string.
     * <p>
     * This is a small wrapper around {@link ShortcutAction#print}
     * to help when debugging.
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_shortcut_action_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
}
