package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkShortcutAction` encodes an action that can be triggered by a
 * keyboard shortcut.
 * 
 * `GtkShortcutActions` contain functions that allow easy presentation
 * to end users as well as being printed for debugging.
 * 
 * All `GtkShortcutActions` are immutable, you can only specify their
 * properties during construction. If you want to change a action, you
 * have to replace it with a new one. If you need to pass arguments to
 * an action, these are specified by the higher-level `GtkShortcut` object.
 * 
 * To activate a `GtkShortcutAction` manually, [method@Gtk.ShortcutAction.activate]
 * can be called.
 * 
 * GTK provides various actions:
 * 
 *  - [class@Gtk.MnemonicAction]: a shortcut action that calls
 *    gtk_widget_mnemonic_activate()
 *  - [class@Gtk.CallbackAction]: a shortcut action that invokes
 *    a given callback
 *  - [class@Gtk.SignalAction]: a shortcut action that emits a
 *    given signal
 *  - [class@Gtk.ActivateAction]: a shortcut action that calls
 *    gtk_widget_activate()
 *  - [class@Gtk.NamedAction]: a shortcut action that calls
 *    gtk_widget_activate_action()
 *  - [class@Gtk.NothingAction]: a shortcut action that does nothing
 */
public class ShortcutAction extends org.gtk.gobject.Object {

    public ShortcutAction(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ShortcutAction */
    public static ShortcutAction castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutAction(gobject.getProxy());
    }
    
    /**
     * Tries to parse the given string into an action.
     * 
     * On success, the parsed action is returned. When parsing
     * failed, %NULL is returned.
     * 
     * The accepted strings are:
     * 
     * - `nothing`, for `GtkNothingAction`
     * - `activate`, for `GtkActivateAction`
     * - `mnemonic-activate`, for `GtkMnemonicAction`
     * - `action(NAME)`, for a `GtkNamedAction` for the action named `NAME`
     * - `signal(NAME)`, for a `GtkSignalAction` for the signal `NAME`
     */
    public ShortcutAction(java.lang.String string) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_action_parse_string(Interop.getAllocator().allocateUtf8String(string)), true));
    }
    
    /**
     * Activates the action on the @widget with the given @args.
     * 
     * Note that some actions ignore the passed in @flags, @widget or @args.
     * 
     * Activation of an action can fail for various reasons. If the action
     * is not supported by the @widget, if the @args don't match the action
     * or if the activation otherwise had no effect, %FALSE will be returned.
     */
    public boolean activate(int flags, Widget widget, org.gtk.glib.Variant args) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_action_activate(HANDLE(), flags, widget.HANDLE(), args.HANDLE());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_action_print(HANDLE(), string.HANDLE());
    }
    
    /**
     * Prints the given action into a human-readable string.
     * 
     * This is a small wrapper around [method@Gtk.ShortcutAction.print]
     * to help when debugging.
     */
    public java.lang.String toString() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_action_to_string(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
}
