package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkShortcut` describes a keyboard shortcut.
 * 
 * It contains a description of how to trigger the shortcut via a
 * [class@Gtk.ShortcutTrigger] and a way to activate the shortcut
 * on a widget via a [class@Gtk.ShortcutAction].
 * 
 * The actual work is usually done via [class@Gtk.ShortcutController],
 * which decides if and when to activate a shortcut. Using that controller
 * directly however is rarely necessary as various higher level
 * convenience APIs exist on `GtkWidget`s that make it easier to use
 * shortcuts in GTK.
 * 
 * `GtkShortcut` does provide functionality to make it easy for users
 * to work with shortcuts, either by providing informational strings
 * for display purposes or by allowing shortcuts to be configured.
 */
public class Shortcut extends org.gtk.gobject.Object {

    public Shortcut(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Shortcut */
    public static Shortcut castFrom(org.gtk.gobject.Object gobject) {
        return new Shortcut(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkShortcut` that is triggered by
     * @trigger and then activates @action.
     */
    public Shortcut(ShortcutTrigger trigger, ShortcutAction action) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_new(trigger.getReference().unowned().HANDLE(), action.getReference().unowned().HANDLE()), true));
    }
    
    /**
     * Gets the action that is activated by this shortcut.
     */
    public ShortcutAction getAction() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_get_action(HANDLE());
        return new ShortcutAction(References.get(RESULT, false));
    }
    
    /**
     * Gets the arguments that are passed when activating the shortcut.
     */
    public org.gtk.glib.Variant getArguments() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_get_arguments(HANDLE());
        return new org.gtk.glib.Variant(References.get(RESULT, false));
    }
    
    /**
     * Gets the trigger used to trigger @self.
     */
    public ShortcutTrigger getTrigger() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_get_trigger(HANDLE());
        return new ShortcutTrigger(References.get(RESULT, false));
    }
    
    /**
     * Sets the new action for @self to be @action.
     */
    public void setAction(ShortcutAction action) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_set_action(HANDLE(), action.getReference().unowned().HANDLE());
    }
    
    /**
     * Sets the arguments to pass when activating the shortcut.
     */
    public void setArguments(org.gtk.glib.Variant args) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_set_arguments(HANDLE(), args.HANDLE());
    }
    
    /**
     * Sets the new trigger for @self to be @trigger.
     */
    public void setTrigger(ShortcutTrigger trigger) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_shortcut_set_trigger(HANDLE(), trigger.getReference().unowned().HANDLE());
    }
    
}
