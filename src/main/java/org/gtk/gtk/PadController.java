package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkPadController} is an event controller for the pads found in drawing
 * tablets.
 * <p>
 * Pads are the collection of buttons and tactile sensors often found around
 * the stylus-sensitive area.
 * <p>
 * These buttons and sensors have no implicit meaning, and by default they
 * perform no action. {@code GtkPadController} is provided to map those to
 * {@code Gio.Action} objects, thus letting the application give them a more
 * semantic meaning.
 * <p>
 * Buttons and sensors are not constrained to triggering a single action,
 * some {@link org.gtk.gdk.InputSource#TABLET_PAD} devices feature multiple "modes". All these
 * input elements have one current mode, which may determine the final action
 * being triggered.
 * <p>
 * Pad devices often divide buttons and sensors into groups. All elements
 * in a group share the same current mode, but different groups may have
 * different modes. See {@link org.gtk.gdk.DevicePad#getNGroups} and
 * {@link org.gtk.gdk.DevicePad#getGroupNModes}.
 * <p>
 * Each of the actions that a given button/strip/ring performs for a given mode
 * is defined by a {@code Gtk.PadActionEntry}. It contains an action name that
 * will be looked up in the given {@code Gio.ActionGroup} and activated whenever
 * the specified input element and mode are triggered.
 * <p>
 * A simple example of {@code GtkPadController} usage: Assigning button 1 in all
 * modes and pad devices to an "invert-selection" action:
 * <pre>{@code c
 * GtkPadActionEntry *pad_actions[] = {
 *   { GTK_PAD_ACTION_BUTTON, 1, -1, "Invert selection", "pad-actions.invert-selection" },
 *   …
 * };
 * 
 * …
 * action_group = g_simple_action_group_new ();
 * action = g_simple_action_new ("pad-actions.invert-selection", NULL);
 * g_signal_connect (action, "activate", on_invert_selection_activated, NULL);
 * g_action_map_add_action (G_ACTION_MAP (action_group), action);
 * …
 * pad_controller = gtk_pad_controller_new (action_group, NULL);
 * }</pre>
 * <p>
 * The actions belonging to rings/strips will be activated with a parameter
 * of type {@code G_VARIANT_TYPE_DOUBLE} bearing the value of the given axis, it
 * is required that those are made stateful and accepting this {@code GVariantType}.
 */
public class PadController extends org.gtk.gtk.EventController {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPadController";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public PadController(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to PadController if its GType is a (or inherits from) "GtkPadController".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "PadController" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkPadController", a ClassCastException will be thrown.
     */
    public static PadController castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkPadController"))) {
            return new PadController(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkPadController");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gio.ActionGroup group, @Nullable org.gtk.gdk.Device pad) {
        java.util.Objects.requireNonNull(group, "Parameter 'group' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_pad_controller_new.invokeExact(
                    group.handle(),
                    (Addressable) (pad == null ? MemoryAddress.NULL : pad.handle())), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkPadController} that will associate events from {@code pad} to
     * actions.
     * <p>
     * A {@code null} pad may be provided so the controller manages all pad devices
     * generically, it is discouraged to mix {@code GtkPadController} objects with
     * {@code null} and non-{@code null} {@code pad} argument on the same toplevel window, as execution
     * order is not guaranteed.
     * <p>
     * The {@code GtkPadController} is created with no mapped actions. In order to
     * map pad events to actions, use {@link PadController#setActionEntries}
     * or {@link PadController#setAction}.
     * <p>
     * Be aware that pad events will only be delivered to {@code GtkWindow}s, so adding
     * a pad controller to any other type of widget will not have an effect.
     * @param group {@code GActionGroup} to trigger actions from
     * @param pad A {@link org.gtk.gdk.InputSource#TABLET_PAD} device, or {@code null} to handle all pads
     */
    public PadController(@NotNull org.gtk.gio.ActionGroup group, @Nullable org.gtk.gdk.Device pad) {
        super(constructNew(group, pad));
    }
    
    /**
     * Adds an individual action to {@code controller}.
     * <p>
     * This action will only be activated if the given button/ring/strip number
     * in {@code index} is interacted while the current mode is {@code mode}. -1 may be used
     * for simple cases, so the action is triggered on all modes.
     * <p>
     * The given {@code label} should be considered user-visible, so internationalization
     * rules apply. Some windowing systems may be able to use those for user
     * feedback.
     * @param type the type of pad feature that will trigger this action
     * @param index the 0-indexed button/ring/strip number that will trigger this action
     * @param mode the mode that will trigger this action, or -1 for all modes.
     * @param label Human readable description of this action, this string should
     *   be deemed user-visible.
     * @param actionName action name that will be activated in the {@code GActionGroup}
     */
    public void setAction(@NotNull org.gtk.gtk.PadActionType type, int index, int mode, @NotNull java.lang.String label, @NotNull java.lang.String actionName) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(label, "Parameter 'label' must not be null");
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        try {
            DowncallHandles.gtk_pad_controller_set_action.invokeExact(
                    handle(),
                    type.getValue(),
                    index,
                    mode,
                    Interop.allocateNativeString(label),
                    Interop.allocateNativeString(actionName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A convenience function to add a group of action entries on
     * {@code controller}.
     * <p>
     * See {@code Gtk.PadActionEntry] and [method@Gtk.PadController.set_action}.
     * @param entries the action entries to set on {@code controller}
     * @param nEntries the number of elements in {@code entries}
     */
    public void setActionEntries(org.gtk.gtk.PadActionEntry[] entries, int nEntries) {
        java.util.Objects.requireNonNull(entries, "Parameter 'entries' must not be null");
        try {
            DowncallHandles.gtk_pad_controller_set_action_entries.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(entries, false),
                    nEntries);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_pad_controller_new = Interop.downcallHandle(
            "gtk_pad_controller_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_pad_controller_set_action = Interop.downcallHandle(
            "gtk_pad_controller_set_action",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_pad_controller_set_action_entries = Interop.downcallHandle(
            "gtk_pad_controller_set_action_entries",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
