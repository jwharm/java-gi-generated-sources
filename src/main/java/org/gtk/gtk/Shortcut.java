package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gtk_shortcut_new = Interop.downcallHandle(
        "gtk_shortcut_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@Nullable ShortcutTrigger trigger, @Nullable ShortcutAction action) {
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
    public Shortcut(@Nullable ShortcutTrigger trigger, @Nullable ShortcutAction action) {
        super(constructNew(trigger, action));
    }
    
    private static final MethodHandle gtk_shortcut_get_action = Interop.downcallHandle(
        "gtk_shortcut_get_action",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the action that is activated by this shortcut.
     */
    public @Nullable ShortcutAction getAction() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_shortcut_get_action.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ShortcutAction(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_shortcut_get_arguments = Interop.downcallHandle(
        "gtk_shortcut_get_arguments",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the arguments that are passed when activating the shortcut.
     */
    public @Nullable org.gtk.glib.Variant getArguments() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_shortcut_get_arguments.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_shortcut_get_trigger = Interop.downcallHandle(
        "gtk_shortcut_get_trigger",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the trigger used to trigger {@code self}.
     */
    public @Nullable ShortcutTrigger getTrigger() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_shortcut_get_trigger.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ShortcutTrigger(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_shortcut_set_action = Interop.downcallHandle(
        "gtk_shortcut_set_action",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the new action for {@code self} to be {@code action}.
     */
    public @NotNull void setAction(@Nullable ShortcutAction action) {
        try {
            gtk_shortcut_set_action.invokeExact(handle(), action.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_shortcut_set_arguments = Interop.downcallHandle(
        "gtk_shortcut_set_arguments",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the arguments to pass when activating the shortcut.
     */
    public @NotNull void setArguments(@Nullable org.gtk.glib.Variant args) {
        try {
            gtk_shortcut_set_arguments.invokeExact(handle(), args.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_shortcut_set_trigger = Interop.downcallHandle(
        "gtk_shortcut_set_trigger",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the new trigger for {@code self} to be {@code trigger}.
     */
    public @NotNull void setTrigger(@Nullable ShortcutTrigger trigger) {
        try {
            gtk_shortcut_set_trigger.invokeExact(handle(), trigger.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
