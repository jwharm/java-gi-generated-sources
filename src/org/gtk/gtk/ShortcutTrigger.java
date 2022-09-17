package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkShortcutTrigger</code> tracks how a <code>GtkShortcut</code> should be activated.
 * <p>
 * To find out if a <code>GtkShortcutTrigger</code> triggers, you can call
 * {@link org.gtk.gtk.ShortcutTrigger#trigger} on a <code>GdkEvent</code>.
 * <p><code>GtkShortcutTriggers</code> contain functions that allow easy presentation
 * to end users as well as being printed for debugging.
 * <p>
 * All <code>GtkShortcutTriggers</code> are immutable, you can only specify their
 * properties during construction. If you want to change a trigger, you
 * have to replace it with a new one.
 */
public class ShortcutTrigger extends org.gtk.gobject.Object {

    public ShortcutTrigger(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ShortcutTrigger */
    public static ShortcutTrigger castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutTrigger(gobject.getReference());
    }
    
    private static Reference constructParseString(java.lang.String string) {
        Reference RESULT = References.get(gtk_h.gtk_shortcut_trigger_parse_string(Interop.allocateNativeString(string).handle()), true);
        return RESULT;
    }
    
    /**
     * Tries to parse the given string into a trigger.
     * <p>
     * On success, the parsed trigger is returned.
     * When parsing failed, <code>null</code> is returned.
     * <p>
     * The accepted strings are:
     * <p>
     *   - <code>never</code>, for <code>GtkNeverTrigger</code>
     *   - a string parsed by gtk_accelerator_parse(), for a <code>GtkKeyvalTrigger</code>, e.g. <code>&#60;Control&#62;C</code>
     *   - underscore, followed by a single character, for <code>GtkMnemonicTrigger</code>, e.g. <code>_l</code>
     *   - two valid trigger strings, separated by a <code>|</code> character, for a
     *     <code>GtkAlternativeTrigger</code>: <code>&#60;Control&#62;q|&#60;Control&#62;w</code>
     * <p>
     * Note that you will have to escape the <code>&#60;</code> and <code>&#62;</code> characters when specifying
     * triggers in XML files, such as GtkBuilder ui files. Use <code>&#38;lt;</code> instead of<code>&#60;</code> and <code>&#38;gt;</code> instead of <code>&#62;</code>.
     */
    public static ShortcutTrigger parseString(java.lang.String string) {
        return new ShortcutTrigger(constructParseString(string));
    }
    
    /**
     * The types of @trigger1 and @trigger2 are <code>gconstpointer</code> only to allow
     * use of this function as a <code>GCompareFunc</code>.
     * <p>
     * They must each be a <code>GtkShortcutTrigger</code>.
     */
    public int compare(ShortcutTrigger trigger2) {
        var RESULT = gtk_h.gtk_shortcut_trigger_compare(handle(), trigger2.handle());
        return RESULT;
    }
    
    /**
     * Checks if @trigger1 and @trigger2 trigger under the same conditions.
     * <p>
     * The types of @one and @two are <code>gconstpointer</code> only to allow use of this
     * function with <code>GHashTable</code>. They must each be a <code>GtkShortcutTrigger</code>.
     */
    public boolean equal(ShortcutTrigger trigger2) {
        var RESULT = gtk_h.gtk_shortcut_trigger_equal(handle(), trigger2.handle());
        return (RESULT != 0);
    }
    
    /**
     * Generates a hash value for a <code>GtkShortcutTrigger</code>.
     * <p>
     * The output of this function is guaranteed to be the same for a given
     * value only per-process. It may change between different processor
     * architectures or even different versions of GTK. Do not use this
     * function as a basis for building protocols or file formats.
     * <p>
     * The types of @trigger is <code>gconstpointer</code> only to allow use of this
     * function with <code>GHashTable</code>. They must each be a <code>GtkShortcutTrigger</code>.
     */
    public int hash() {
        var RESULT = gtk_h.gtk_shortcut_trigger_hash(handle());
        return RESULT;
    }
    
    /**
     * Prints the given trigger into a string for the developer.
     * This is meant for debugging and logging.
     * 
     * The form of the representation may change at any time
     * and is not guaranteed to stay identical.
     */
    public void print(org.gtk.glib.String string) {
        gtk_h.gtk_shortcut_trigger_print(handle(), string.handle());
    }
    
    /**
     * Prints the given trigger into a string.
     * 
     * This function is returning a translated string for presentation
     * to end users for example in menu items or in help texts.
     * 
     * The @display in use may influence the resulting string in
     * various forms, such as resolving hardware keycodes or by
     * causing display-specific modifier names.
     * 
     * The form of the representation may change at any time and is
     * not guaranteed to stay identical.
     */
    public boolean printLabel(org.gtk.gdk.Display display, org.gtk.glib.String string) {
        var RESULT = gtk_h.gtk_shortcut_trigger_print_label(handle(), display.handle(), string.handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets textual representation for the given trigger.
     * 
     * This function is returning a translated string for
     * presentation to end users for example in menu items
     * or in help texts.
     * 
     * The @display in use may influence the resulting string in
     * various forms, such as resolving hardware keycodes or by
     * causing display-specific modifier names.
     * 
     * The form of the representation may change at any time and is
     * not guaranteed to stay identical.
     */
    public java.lang.String toLabel(org.gtk.gdk.Display display) {
        var RESULT = gtk_h.gtk_shortcut_trigger_to_label(handle(), display.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Prints the given trigger into a human-readable string.
     * 
     * This is a small wrapper around {@link org.gtk.gtk.ShortcutTrigger#print}
     * to help when debugging.
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.gtk_shortcut_trigger_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Checks if the given @event triggers @self.
     */
    public org.gtk.gdk.KeyMatch trigger(org.gtk.gdk.Event event, boolean enableMnemonics) {
        var RESULT = gtk_h.gtk_shortcut_trigger_trigger(handle(), event.handle(), enableMnemonics ? 1 : 0);
        return org.gtk.gdk.KeyMatch.fromValue(RESULT);
    }
    
}
