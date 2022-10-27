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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public Shortcut(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Shortcut */
    public static Shortcut castFrom(org.gtk.gobject.Object gobject) {
        return new Shortcut(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gtk.ShortcutTrigger trigger, @Nullable org.gtk.gtk.ShortcutAction action) {
        java.util.Objects.requireNonNullElse(trigger, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(action, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_shortcut_new.invokeExact(trigger.refcounted().unowned().handle(), action.refcounted().unowned().handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkShortcut} that is triggered by
     * {@code trigger} and then activates {@code action}.
     * @param trigger The trigger that will trigger the shortcut
     * @param action The action that will be activated upon
     *    triggering
     */
    public Shortcut(@Nullable org.gtk.gtk.ShortcutTrigger trigger, @Nullable org.gtk.gtk.ShortcutAction action) {
        super(constructNew(trigger, action));
    }
    
    private static Refcounted constructNewWithArguments(@Nullable org.gtk.gtk.ShortcutTrigger trigger, @Nullable org.gtk.gtk.ShortcutAction action, @Nullable java.lang.String formatString) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Creates a new {@code GtkShortcut} that is triggered by {@code trigger} and then activates
     * {@code action} with arguments given by {@code format_string}.
     * @param trigger The trigger that will trigger the shortcut
     * @param action The action that will be activated upon
     *   triggering
     * @param formatString GVariant format string for arguments or {@code null} for
     *   no arguments
     * @return a new {@code GtkShortcut}
     */
    public static Shortcut newWithArguments(@Nullable org.gtk.gtk.ShortcutTrigger trigger, @Nullable org.gtk.gtk.ShortcutAction action, @Nullable java.lang.String formatString) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Gets the action that is activated by this shortcut.
     * @return the action
     */
    public @Nullable org.gtk.gtk.ShortcutAction getAction() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_get_action.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ShortcutAction(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the arguments that are passed when activating the shortcut.
     * @return the arguments
     */
    public @Nullable org.gtk.glib.Variant getArguments() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_get_arguments.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the trigger used to trigger {@code self}.
     * @return the trigger used
     */
    public @Nullable org.gtk.gtk.ShortcutTrigger getTrigger() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_get_trigger.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ShortcutTrigger(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the new action for {@code self} to be {@code action}.
     * @param action The new action.
     *   If the {@code action} is {@code null}, the nothing action will be used.
     */
    public void setAction(@Nullable org.gtk.gtk.ShortcutAction action) {
        java.util.Objects.requireNonNullElse(action, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_shortcut_set_action.invokeExact(handle(), action.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the arguments to pass when activating the shortcut.
     * @param args arguments to pass when activating {@code self}
     */
    public void setArguments(@Nullable org.gtk.glib.Variant args) {
        java.util.Objects.requireNonNullElse(args, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_shortcut_set_arguments.invokeExact(handle(), args.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the new trigger for {@code self} to be {@code trigger}.
     * @param trigger The new trigger.
     *   If the {@code trigger} is {@code null}, the never trigger will be used.
     */
    public void setTrigger(@Nullable org.gtk.gtk.ShortcutTrigger trigger) {
        java.util.Objects.requireNonNullElse(trigger, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_shortcut_set_trigger.invokeExact(handle(), trigger.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_shortcut_new = Interop.downcallHandle(
            "gtk_shortcut_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_shortcut_new_with_arguments = Interop.downcallHandle(
            "gtk_shortcut_new_with_arguments",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_shortcut_get_action = Interop.downcallHandle(
            "gtk_shortcut_get_action",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_shortcut_get_arguments = Interop.downcallHandle(
            "gtk_shortcut_get_arguments",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_shortcut_get_trigger = Interop.downcallHandle(
            "gtk_shortcut_get_trigger",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_shortcut_set_action = Interop.downcallHandle(
            "gtk_shortcut_set_action",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_shortcut_set_arguments = Interop.downcallHandle(
            "gtk_shortcut_set_arguments",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_shortcut_set_trigger = Interop.downcallHandle(
            "gtk_shortcut_set_trigger",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
