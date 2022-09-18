package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkShortcutAction</code> encodes an action that can be triggered by a
 * keyboard shortcut.
 * <p><code>GtkShortcutActions</code> contain functions that allow easy presentation
 * to end users as well as being printed for debugging.
 * <p>
 * All <code>GtkShortcutActions</code> are immutable, you can only specify their
 * properties during construction. If you want to change a action, you
 * have to replace it with a new one. If you need to pass arguments to
 * an action, these are specified by the higher-level <code>GtkShortcut</code> object.
 * <p>
 * To activate a <code>GtkShortcutAction</code> manually, {@link org.gtk.gtk.ShortcutAction<code>#activate</code> 
 * can be called.
 * 
 * GTK provides various actions:
 * 
 *  - {@link org.gtk.gtk.MnemonicAction}: a shortcut action that calls
 *    gtk_widget_mnemonic_activate()
 *  - {@link org.gtk.gtk.CallbackAction}: a shortcut action that invokes
 *    a given callback
 *  - {@link org.gtk.gtk.SignalAction}: a shortcut action that emits a
 *    given signal
 *  - {@link org.gtk.gtk.ActivateAction}: a shortcut action that calls
 *    gtk_widget_activate()
 *  - {@link org.gtk.gtk.NamedAction}: a shortcut action that calls
 *    gtk_widget_activate_action()
 *  - {@link org.gtk.gtk.NothingAction}: a shortcut action that does nothing
 */
public class ShortcutAction extends org.gtk.gobject.Object {

    public ShortcutAction(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ShortcutAction */
    public static ShortcutAction castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutAction(gobject.getReference());
    }
    
    private static Reference constructParseString(java.lang.String string) {
        Reference RESULT = References.get(gtk_h.gtk_shortcut_action_parse_string(Interop.allocateNativeString(string).handle()), true);
        return RESULT;
    }
    
    /**
     * Tries to parse the given string into an action.
     * <p>
     * On success, the parsed action is returned. When parsing
     * failed, <code>null</code> is returned.
     * <p>
     * The accepted strings are:
     * <p>
     * <li><code>nothing</code>, for <code>GtkNothingAction</code>
     * <li><code>activate</code>, for <code>GtkActivateAction</code>
     * <li><code>mnemonic-activate</code>, for <code>GtkMnemonicAction</code>
     * <li><code>action(NAME)</code>, for a <code>GtkNamedAction</code> for the action named <code>NAME</code>
     * <li><code>signal(NAME)</code>, for a <code>GtkSignalAction</code> for the signal <code>NAME</code>
     */
    public static ShortcutAction parseString(java.lang.String string) {
        return new ShortcutAction(constructParseString(string));
    }
    
    /**
     * Activates the action on the @widget with the given @args.
     * 
     * Note that some actions ignore the passed in @flags, @widget or @args.
     * 
     * Activation of an action can fail for various reasons. If the action
     * is not supported by the @widget, if the @args don&<code>#39</code> t match the action
     * or if the activation otherwise had no effect, <code>false</code> will be returned.
     */
    public boolean activate(int flags, Widget widget, org.gtk.glib.Variant args) {
        var RESULT = gtk_h.gtk_shortcut_action_activate(handle(), flags, widget.handle(), args.handle());
        return (RESULT != 0);
    }
    
    /**
     * Prints the given action into a string for the developer.
     * 
     * This is meant for debugging and logging.
     * 
     * The form of the representation may change at any time and is
     * not guaranteed to stay identical.
     */
    public void print(org.gtk.glib.String string) {
        gtk_h.gtk_shortcut_action_print(handle(), string.handle());
    }
    
    /**
     * Prints the given action into a human-readable string.
     * 
     * This is a small wrapper around {@link org.gtk.gtk.ShortcutAction<code>#print</code> 
     * to help when debugging.
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.gtk_shortcut_action_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
}
