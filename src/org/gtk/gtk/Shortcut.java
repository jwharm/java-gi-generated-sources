package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
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

    public Shortcut(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Shortcut */
    public static Shortcut castFrom(org.gtk.gobject.Object gobject) {
        return new Shortcut(gobject.getReference());
    }
    
    private static Reference constructNew(ShortcutTrigger trigger, ShortcutAction action) {
        Reference RESULT = References.get(gtk_h.gtk_shortcut_new(trigger.getReference().unowned().handle(), action.getReference().unowned().handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new `GtkShortcut` that is triggered by
     * @trigger and then activates @action.
     */
    public Shortcut(ShortcutTrigger trigger, ShortcutAction action) {
        super(constructNew(trigger, action));
    }
    
    /**
     * Gets the action that is activated by this shortcut.
     */
    public ShortcutAction getAction() {
        var RESULT = gtk_h.gtk_shortcut_get_action(handle());
        return new ShortcutAction(References.get(RESULT, false));
    }
    
    /**
     * Gets the arguments that are passed when activating the shortcut.
     */
    public org.gtk.glib.Variant getArguments() {
        var RESULT = gtk_h.gtk_shortcut_get_arguments(handle());
        return new org.gtk.glib.Variant(References.get(RESULT, false));
    }
    
    /**
     * Gets the trigger used to trigger @self.
     */
    public ShortcutTrigger getTrigger() {
        var RESULT = gtk_h.gtk_shortcut_get_trigger(handle());
        return new ShortcutTrigger(References.get(RESULT, false));
    }
    
    /**
     * Sets the new action for @self to be @action.
     */
    public void setAction(ShortcutAction action) {
        gtk_h.gtk_shortcut_set_action(handle(), action.getReference().unowned().handle());
    }
    
    /**
     * Sets the arguments to pass when activating the shortcut.
     */
    public void setArguments(org.gtk.glib.Variant args) {
        gtk_h.gtk_shortcut_set_arguments(handle(), args.handle());
    }
    
    /**
     * Sets the new trigger for @self to be @trigger.
     */
    public void setTrigger(ShortcutTrigger trigger) {
        gtk_h.gtk_shortcut_set_trigger(handle(), trigger.getReference().unowned().handle());
    }
    
}
