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
public class ShortcutTrigger extends org.gtk.gobject.GObject {
    
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
    protected ShortcutTrigger(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ShortcutTrigger> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ShortcutTrigger(input, ownership);
    
    private static MemoryAddress constructParseString(java.lang.String string) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_trigger_parse_string.invokeExact(
                    Marshal.stringToAddress.marshal(string, null));
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
    public static ShortcutTrigger parseString(java.lang.String string) {
        var RESULT = constructParseString(string);
        return (org.gtk.gtk.ShortcutTrigger) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.ShortcutTrigger.fromAddress).marshal(RESULT, Ownership.FULL);
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
    public int compare(org.gtk.gtk.ShortcutTrigger trigger2) {
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
    public boolean equal(org.gtk.gtk.ShortcutTrigger trigger2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_shortcut_trigger_equal.invokeExact(
                    handle(),
                    trigger2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public void print(org.gtk.glib.GString string) {
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
    public boolean printLabel(org.gtk.gdk.Display display, org.gtk.glib.GString string) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_shortcut_trigger_print_label.invokeExact(
                    handle(),
                    display.handle(),
                    string.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public java.lang.String toLabel(org.gtk.gdk.Display display) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_trigger_to_label.invokeExact(
                    handle(),
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Prints the given trigger into a human-readable string.
     * <p>
     * This is a small wrapper around {@link ShortcutTrigger#print}
     * to help when debugging.
     * @return a new string
     */
    public java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_trigger_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Checks if the given {@code event} triggers {@code self}.
     * @param event the event to check
     * @param enableMnemonics {@code true} if mnemonics should trigger. Usually the
     *   value of this property is determined by checking that the passed
     *   in {@code event} is a Key event and has the right modifiers set.
     * @return Whether the event triggered the shortcut
     */
    public org.gtk.gdk.KeyMatch trigger(org.gtk.gdk.Event event, boolean enableMnemonics) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_shortcut_trigger_trigger.invokeExact(
                    handle(),
                    event.handle(),
                    Marshal.booleanToInteger.marshal(enableMnemonics, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.KeyMatch.of(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_shortcut_trigger_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ShortcutTrigger.Builder} object constructs a {@link ShortcutTrigger} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ShortcutTrigger.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ShortcutTrigger} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ShortcutTrigger}.
         * @return A new instance of {@code ShortcutTrigger} with the properties 
         *         that were set in the Builder object.
         */
        public ShortcutTrigger build() {
            return (ShortcutTrigger) org.gtk.gobject.GObject.newWithProperties(
                ShortcutTrigger.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_shortcut_trigger_parse_string = Interop.downcallHandle(
            "gtk_shortcut_trigger_parse_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_trigger_compare = Interop.downcallHandle(
            "gtk_shortcut_trigger_compare",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_trigger_equal = Interop.downcallHandle(
            "gtk_shortcut_trigger_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_trigger_hash = Interop.downcallHandle(
            "gtk_shortcut_trigger_hash",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_trigger_print = Interop.downcallHandle(
            "gtk_shortcut_trigger_print",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_trigger_print_label = Interop.downcallHandle(
            "gtk_shortcut_trigger_print_label",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_trigger_to_label = Interop.downcallHandle(
            "gtk_shortcut_trigger_to_label",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_trigger_to_string = Interop.downcallHandle(
            "gtk_shortcut_trigger_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_trigger_trigger = Interop.downcallHandle(
            "gtk_shortcut_trigger_trigger",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_shortcut_trigger_get_type = Interop.downcallHandle(
            "gtk_shortcut_trigger_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
