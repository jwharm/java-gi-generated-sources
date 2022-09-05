package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkShortcutTrigger` tracks how a `GtkShortcut` should be activated.
 * 
 * To find out if a `GtkShortcutTrigger` triggers, you can call
 * [method@Gtk.ShortcutTrigger.trigger] on a `GdkEvent`.
 * 
 * `GtkShortcutTriggers` contain functions that allow easy presentation
 * to end users as well as being printed for debugging.
 * 
 * All `GtkShortcutTriggers` are immutable, you can only specify their
 * properties during construction. If you want to change a trigger, you
 * have to replace it with a new one.
 */
public class ShortcutTrigger extends org.gtk.gobject.Object {

    public ShortcutTrigger(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ShortcutTrigger */
    public static ShortcutTrigger castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutTrigger(gobject.getProxy());
    }
    
    /**
     * Tries to parse the given string into a trigger.
     * 
     * On success, the parsed trigger is returned.
     * When parsing failed, %NULL is returned.
     * 
     * The accepted strings are:
     * 
     *   - `never`, for `GtkNeverTrigger`
     *   - a string parsed by gtk_accelerator_parse(), for a `GtkKeyvalTrigger`, e.g. `<Control>C`
     *   - underscore, followed by a single character, for `GtkMnemonicTrigger`, e.g. `_l`
     *   - two valid trigger strings, separated by a `|` character, for a
     *     `GtkAlternativeTrigger`: `<Control>q|<Control>w`
     * 
     * Note that you will have to escape the `<` and `>` characters when specifying
     * triggers in XML files, such as GtkBuilder ui files. Use `&lt;` instead of
     * `<` and `&gt;` instead of `>`.
     */
    public ShortcutTrigger(java.lang.String string) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_trigger_parse_string(Interop.getAllocator().allocateUtf8String(string)), true));
    }
    
    /**
     * The types of @trigger1 and @trigger2 are `gconstpointer` only to allow
     * use of this function as a `GCompareFunc`.
     * 
     * They must each be a `GtkShortcutTrigger`.
     */
    public int compare(ShortcutTrigger trigger2) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_trigger_compare(HANDLE(), trigger2.HANDLE());
        return RESULT;
    }
    
    /**
     * Checks if @trigger1 and @trigger2 trigger under the same conditions.
     * 
     * The types of @one and @two are `gconstpointer` only to allow use of this
     * function with `GHashTable`. They must each be a `GtkShortcutTrigger`.
     */
    public boolean equal(ShortcutTrigger trigger2) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_trigger_equal(HANDLE(), trigger2.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Generates a hash value for a `GtkShortcutTrigger`.
     * 
     * The output of this function is guaranteed to be the same for a given
     * value only per-process. It may change between different processor
     * architectures or even different versions of GTK. Do not use this
     * function as a basis for building protocols or file formats.
     * 
     * The types of @trigger is `gconstpointer` only to allow use of this
     * function with `GHashTable`. They must each be a `GtkShortcutTrigger`.
     */
    public int hash() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_trigger_hash(HANDLE());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_trigger_print(HANDLE(), string.HANDLE());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_trigger_print_label(HANDLE(), display.HANDLE(), string.HANDLE());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_trigger_to_label(HANDLE(), display.HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Prints the given trigger into a human-readable string.
     * 
     * This is a small wrapper around [method@Gtk.ShortcutTrigger.print]
     * to help when debugging.
     */
    public java.lang.String toString() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_trigger_to_string(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Checks if the given @event triggers @self.
     */
    public org.gtk.gdk.KeyMatch trigger(org.gtk.gdk.Event event, boolean enableMnemonics) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_trigger_trigger(HANDLE(), event.HANDLE(), enableMnemonics ? 1 : 0);
        return org.gtk.gdk.KeyMatch.fromValue(RESULT);
    }
    
}