package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkShortcut} describes a keyboard shortcut.
 * <p>
 * It contains a description of how to trigger the shortcut via a
 * {@link ShortcutTrigger} and a way to activate the shortcut
 * on a widget via a {@link ShortcutAction}.
 * <p>
 * The actual work is usually done via {@link ShortcutController},
 * which decides if and when to activate a shortcut. Using that controller
 * directly however is rarely necessary as various higher level
 * convenience APIs exist on {@code GtkWidget}s that make it easier to use
 * shortcuts in GTK.
 * <p>
 * {@code GtkShortcut} does provide functionality to make it easy for users
 * to work with shortcuts, either by providing informational strings
 * for display purposes or by allowing shortcuts to be configured.
 */
public class Shortcut extends org.gtk.gobject.Object {

    public Shortcut(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Shortcut */
    public static Shortcut castFrom(org.gtk.gobject.Object gobject) {
        return new Shortcut(gobject.refcounted());
    }
    
    private static Refcounted constructNew(ShortcutTrigger trigger, ShortcutAction action) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_shortcut_new(trigger.refcounted().unowned().handle(), action.refcounted().unowned().handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkShortcut} that is triggered by
     * {@code trigger} and then activates {@code action}.
     */
    public Shortcut(ShortcutTrigger trigger, ShortcutAction action) {
        super(constructNew(trigger, action));
    }
    
    /**
     * Gets the action that is activated by this shortcut.
     */
    public ShortcutAction getAction() {
        var RESULT = gtk_h.gtk_shortcut_get_action(handle());
        return new ShortcutAction(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the arguments that are passed when activating the shortcut.
     */
    public org.gtk.glib.Variant getArguments() {
        var RESULT = gtk_h.gtk_shortcut_get_arguments(handle());
        return new org.gtk.glib.Variant(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the trigger used to trigger {@code self}.
     */
    public ShortcutTrigger getTrigger() {
        var RESULT = gtk_h.gtk_shortcut_get_trigger(handle());
        return new ShortcutTrigger(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the new action for {@code self} to be {@code action}.
     */
    public void setAction(ShortcutAction action) {
        gtk_h.gtk_shortcut_set_action(handle(), action.refcounted().unowned().handle());
    }
    
    /**
     * Sets the arguments to pass when activating the shortcut.
     */
    public void setArguments(org.gtk.glib.Variant args) {
        gtk_h.gtk_shortcut_set_arguments(handle(), args.handle());
    }
    
    /**
     * Sets the new trigger for {@code self} to be {@code trigger}.
     */
    public void setTrigger(ShortcutTrigger trigger) {
        gtk_h.gtk_shortcut_set_trigger(handle(), trigger.refcounted().unowned().handle());
    }
    
}
