package org.gtk.gtk;

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
    
    static final MethodHandle gtk_shortcut_new = Interop.downcallHandle(
        "gtk_shortcut_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(ShortcutTrigger trigger, ShortcutAction action) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_shortcut_new.invokeExact(trigger.refcounted().unowned().handle(), action.refcounted().unowned().handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkShortcut} that is triggered by
     * {@code trigger} and then activates {@code action}.
     */
    public Shortcut(ShortcutTrigger trigger, ShortcutAction action) {
        super(constructNew(trigger, action));
    }
    
    static final MethodHandle gtk_shortcut_get_action = Interop.downcallHandle(
        "gtk_shortcut_get_action",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the action that is activated by this shortcut.
     */
    public ShortcutAction getAction() {
        try {
            var RESULT = (MemoryAddress) gtk_shortcut_get_action.invokeExact(handle());
            return new ShortcutAction(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_shortcut_get_arguments = Interop.downcallHandle(
        "gtk_shortcut_get_arguments",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the arguments that are passed when activating the shortcut.
     */
    public org.gtk.glib.Variant getArguments() {
        try {
            var RESULT = (MemoryAddress) gtk_shortcut_get_arguments.invokeExact(handle());
            return new org.gtk.glib.Variant(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_shortcut_get_trigger = Interop.downcallHandle(
        "gtk_shortcut_get_trigger",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the trigger used to trigger {@code self}.
     */
    public ShortcutTrigger getTrigger() {
        try {
            var RESULT = (MemoryAddress) gtk_shortcut_get_trigger.invokeExact(handle());
            return new ShortcutTrigger(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_shortcut_set_action = Interop.downcallHandle(
        "gtk_shortcut_set_action",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the new action for {@code self} to be {@code action}.
     */
    public void setAction(ShortcutAction action) {
        try {
            gtk_shortcut_set_action.invokeExact(handle(), action.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_shortcut_set_arguments = Interop.downcallHandle(
        "gtk_shortcut_set_arguments",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the arguments to pass when activating the shortcut.
     */
    public void setArguments(org.gtk.glib.Variant args) {
        try {
            gtk_shortcut_set_arguments.invokeExact(handle(), args.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_shortcut_set_trigger = Interop.downcallHandle(
        "gtk_shortcut_set_trigger",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the new trigger for {@code self} to be {@code trigger}.
     */
    public void setTrigger(ShortcutTrigger trigger) {
        try {
            gtk_shortcut_set_trigger.invokeExact(handle(), trigger.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
