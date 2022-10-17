package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkShortcutTrigger} tracks how a {@code GtkShortcut} should be activated.
 * <p>
 * To find out if a {@code GtkShortcutTrigger} triggers, you can call
 * {@link ShortcutTrigger#trigger} on a {@code GdkEvent}.
 * <p>
 * {@code GtkShortcutTriggers} contain functions that allow easy presentation
 * to end users as well as being printed for debugging.
 * <p>
 * All {@code GtkShortcutTriggers} are immutable, you can only specify their
 * properties during construction. If you want to change a trigger, you
 * have to replace it with a new one.
 */
public class ShortcutTrigger extends org.gtk.gobject.Object {

    public ShortcutTrigger(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ShortcutTrigger */
    public static ShortcutTrigger castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutTrigger(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_shortcut_trigger_parse_string = Interop.downcallHandle(
        "gtk_shortcut_trigger_parse_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructParseString(@NotNull java.lang.String string) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_shortcut_trigger_parse_string.invokeExact(Interop.allocateNativeString(string)), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Tries to parse the given string into a trigger.
     * <p>
     * On success, the parsed trigger is returned.
     * When parsing failed, {@code null} is returned.
     * <p>
     * The accepted strings are:
     * <p>
     * <ul>
     * <li>{@code never}, for {@code GtkNeverTrigger}
     * <li>a string parsed by gtk_accelerator_parse(), for a {@code GtkKeyvalTrigger}, e.g. {@code <Control>C}
     * <li>underscore, followed by a single character, for {@code GtkMnemonicTrigger}, e.g. {@code _l}
     * <li>two valid trigger strings, separated by a {@code |} character, for a
     *     {@code GtkAlternativeTrigger}: {@code <Control>q|<Control>w}
     * </ul>
     * <p>
     * Note that you will have to escape the {@code <} and {@code >} characters when specifying
     * triggers in XML files, such as GtkBuilder ui files. Use {@code &lt;} instead of
     * {@code <} and {@code &gt;} instead of {@code >}.
     */
    public static ShortcutTrigger parseString(@NotNull java.lang.String string) {
        return new ShortcutTrigger(constructParseString(string));
    }
    
    private static final MethodHandle gtk_shortcut_trigger_compare = Interop.downcallHandle(
        "gtk_shortcut_trigger_compare",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * The types of {@code trigger1} and {@code trigger2} are {@code gconstpointer} only to allow
     * use of this function as a {@code GCompareFunc}.
     * <p>
     * They must each be a {@code GtkShortcutTrigger}.
     */
    public int compare(@NotNull ShortcutTrigger trigger2) {
        int RESULT;
        try {
            RESULT = (int) gtk_shortcut_trigger_compare.invokeExact(handle(), trigger2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_shortcut_trigger_equal = Interop.downcallHandle(
        "gtk_shortcut_trigger_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code trigger1} and {@code trigger2} trigger under the same conditions.
     * <p>
     * The types of {@code one} and {@code two} are {@code gconstpointer} only to allow use of this
     * function with {@code GHashTable}. They must each be a {@code GtkShortcutTrigger}.
     */
    public boolean equal(@NotNull ShortcutTrigger trigger2) {
        int RESULT;
        try {
            RESULT = (int) gtk_shortcut_trigger_equal.invokeExact(handle(), trigger2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_shortcut_trigger_hash = Interop.downcallHandle(
        "gtk_shortcut_trigger_hash",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Generates a hash value for a {@code GtkShortcutTrigger}.
     * <p>
     * The output of this function is guaranteed to be the same for a given
     * value only per-process. It may change between different processor
     * architectures or even different versions of GTK. Do not use this
     * function as a basis for building protocols or file formats.
     * <p>
     * The types of {@code trigger} is {@code gconstpointer} only to allow use of this
     * function with {@code GHashTable}. They must each be a {@code GtkShortcutTrigger}.
     */
    public int hash() {
        int RESULT;
        try {
            RESULT = (int) gtk_shortcut_trigger_hash.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_shortcut_trigger_print = Interop.downcallHandle(
        "gtk_shortcut_trigger_print",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prints the given trigger into a string for the developer.
     * This is meant for debugging and logging.
     * <p>
     * The form of the representation may change at any time
     * and is not guaranteed to stay identical.
     */
    public @NotNull void print(@NotNull org.gtk.glib.String string) {
        try {
            gtk_shortcut_trigger_print.invokeExact(handle(), string.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_shortcut_trigger_print_label = Interop.downcallHandle(
        "gtk_shortcut_trigger_print_label",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prints the given trigger into a string.
     * <p>
     * This function is returning a translated string for presentation
     * to end users for example in menu items or in help texts.
     * <p>
     * The {@code display} in use may influence the resulting string in
     * various forms, such as resolving hardware keycodes or by
     * causing display-specific modifier names.
     * <p>
     * The form of the representation may change at any time and is
     * not guaranteed to stay identical.
     */
    public boolean printLabel(@NotNull org.gtk.gdk.Display display, @NotNull org.gtk.glib.String string) {
        int RESULT;
        try {
            RESULT = (int) gtk_shortcut_trigger_print_label.invokeExact(handle(), display.handle(), string.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_shortcut_trigger_to_label = Interop.downcallHandle(
        "gtk_shortcut_trigger_to_label",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets textual representation for the given trigger.
     * <p>
     * This function is returning a translated string for
     * presentation to end users for example in menu items
     * or in help texts.
     * <p>
     * The {@code display} in use may influence the resulting string in
     * various forms, such as resolving hardware keycodes or by
     * causing display-specific modifier names.
     * <p>
     * The form of the representation may change at any time and is
     * not guaranteed to stay identical.
     */
    public @NotNull java.lang.String toLabel(@NotNull org.gtk.gdk.Display display) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_shortcut_trigger_to_label.invokeExact(handle(), display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_shortcut_trigger_to_string = Interop.downcallHandle(
        "gtk_shortcut_trigger_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prints the given trigger into a human-readable string.
     * <p>
     * This is a small wrapper around {@link ShortcutTrigger#print}
     * to help when debugging.
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_shortcut_trigger_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_shortcut_trigger_trigger = Interop.downcallHandle(
        "gtk_shortcut_trigger_trigger",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Checks if the given {@code event} triggers {@code self}.
     */
    public @NotNull org.gtk.gdk.KeyMatch trigger(@NotNull org.gtk.gdk.Event event, @NotNull boolean enableMnemonics) {
        int RESULT;
        try {
            RESULT = (int) gtk_shortcut_trigger_trigger.invokeExact(handle(), event.handle(), enableMnemonics ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.KeyMatch(RESULT);
    }
    
}
