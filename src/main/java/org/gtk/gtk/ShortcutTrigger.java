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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkShortcutTrigger";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ShortcutTrigger proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ShortcutTrigger(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ShortcutTrigger if its GType is a (or inherits from) "GtkShortcutTrigger".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ShortcutTrigger} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkShortcutTrigger", a ClassCastException will be thrown.
     */
    public static ShortcutTrigger castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkShortcutTrigger"))) {
            return new ShortcutTrigger(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkShortcutTrigger");
        }
    }
    
    private static Addressable constructParseString(@NotNull java.lang.String string) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_trigger_parse_string.invokeExact(
                    Interop.allocateNativeString(string));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Tries to parse the given string into a trigger.
     * <p>
     * On success, the parsed trigger is returned.
     * When parsing failed, {@code null} is returned.
     * <p>
     * The accepted strings are:
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
     * @param string the string to parse
     * @return a new {@code GtkShortcutTrigger}
     */
    public static ShortcutTrigger parseString(@NotNull java.lang.String string) {
        return new ShortcutTrigger(constructParseString(string), Ownership.FULL);
    }
    
    /**
     * The types of {@code trigger1} and {@code trigger2} are {@code gconstpointer} only to allow
     * use of this function as a {@code GCompareFunc}.
     * <p>
     * They must each be a {@code GtkShortcutTrigger}.
     * @param trigger2 a {@code GtkShortcutTrigger}
     * @return An integer less than, equal to, or greater than zero if
     *   {@code trigger1} is found, respectively, to be less than, to match,
     *   or be greater than {@code trigger2}.
     */
    public int compare(@NotNull org.gtk.gtk.ShortcutTrigger trigger2) {
        java.util.Objects.requireNonNull(trigger2, "Parameter 'trigger2' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_shortcut_trigger_compare.invokeExact(
                    handle(),
                    trigger2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks if {@code trigger1} and {@code trigger2} trigger under the same conditions.
     * <p>
     * The types of {@code one} and {@code two} are {@code gconstpointer} only to allow use of this
     * function with {@code GHashTable}. They must each be a {@code GtkShortcutTrigger}.
     * @param trigger2 a {@code GtkShortcutTrigger}
     * @return {@code true} if {@code trigger1} and {@code trigger2} are equal
     */
    public boolean equal(@NotNull org.gtk.gtk.ShortcutTrigger trigger2) {
        java.util.Objects.requireNonNull(trigger2, "Parameter 'trigger2' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_shortcut_trigger_equal.invokeExact(
                    handle(),
                    trigger2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
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
     * @return a hash value corresponding to {@code trigger}
     */
    public int hash() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_shortcut_trigger_hash.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Prints the given trigger into a string for the developer.
     * This is meant for debugging and logging.
     * <p>
     * The form of the representation may change at any time
     * and is not guaranteed to stay identical.
     * @param string a {@code GString} to print into
     */
    public void print(@NotNull org.gtk.glib.String string) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        try {
            DowncallHandles.gtk_shortcut_trigger_print.invokeExact(
                    handle(),
                    string.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param display {@code GdkDisplay} to print for
     * @param string a {@code GString} to print into
     * @return {@code true} if something was printed or {@code false} if the
     *   trigger did not have a textual representation suitable
     *   for end users.
     */
    public boolean printLabel(@NotNull org.gtk.gdk.Display display, @NotNull org.gtk.glib.String string) {
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_shortcut_trigger_print_label.invokeExact(
                    handle(),
                    display.handle(),
                    string.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
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
     * @param display {@code GdkDisplay} to print for
     * @return a new string
     */
    public @NotNull java.lang.String toLabel(@NotNull org.gtk.gdk.Display display) {
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_trigger_to_label.invokeExact(
                    handle(),
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Prints the given trigger into a human-readable string.
     * <p>
     * This is a small wrapper around {@link ShortcutTrigger#print}
     * to help when debugging.
     * @return a new string
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_trigger_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Checks if the given {@code event} triggers {@code self}.
     * @param event the event to check
     * @param enableMnemonics {@code true} if mnemonics should trigger. Usually the
     *   value of this property is determined by checking that the passed
     *   in {@code event} is a Key event and has the right modifiers set.
     * @return Whether the event triggered the shortcut
     */
    public @NotNull org.gtk.gdk.KeyMatch trigger(@NotNull org.gtk.gdk.Event event, boolean enableMnemonics) {
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_shortcut_trigger_trigger.invokeExact(
                    handle(),
                    event.handle(),
                    enableMnemonics ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.KeyMatch(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_shortcut_trigger_parse_string = Interop.downcallHandle(
            "gtk_shortcut_trigger_parse_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_trigger_compare = Interop.downcallHandle(
            "gtk_shortcut_trigger_compare",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_trigger_equal = Interop.downcallHandle(
            "gtk_shortcut_trigger_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_trigger_hash = Interop.downcallHandle(
            "gtk_shortcut_trigger_hash",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_trigger_print = Interop.downcallHandle(
            "gtk_shortcut_trigger_print",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_trigger_print_label = Interop.downcallHandle(
            "gtk_shortcut_trigger_print_label",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_trigger_to_label = Interop.downcallHandle(
            "gtk_shortcut_trigger_to_label",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_trigger_to_string = Interop.downcallHandle(
            "gtk_shortcut_trigger_to_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_trigger_trigger = Interop.downcallHandle(
            "gtk_shortcut_trigger_trigger",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
