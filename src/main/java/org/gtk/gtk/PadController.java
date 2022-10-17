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
 * 
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
public class PadController extends EventController {

    public PadController(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PadController */
    public static PadController castFrom(org.gtk.gobject.Object gobject) {
        return new PadController(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_pad_controller_new = Interop.downcallHandle(
        "gtk_pad_controller_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull org.gtk.gio.ActionGroup group, @Nullable org.gtk.gdk.Device pad) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_pad_controller_new.invokeExact(group.handle(), pad.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public PadController(@NotNull org.gtk.gio.ActionGroup group, @Nullable org.gtk.gdk.Device pad) {
        super(constructNew(group, pad));
    }
    
    private static final MethodHandle gtk_pad_controller_set_action = Interop.downcallHandle(
        "gtk_pad_controller_set_action",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull void setAction(@NotNull PadActionType type, @NotNull int index, @NotNull int mode, @NotNull java.lang.String label, @NotNull java.lang.String actionName) {
        try {
            gtk_pad_controller_set_action.invokeExact(handle(), type.getValue(), index, mode, Interop.allocateNativeString(label), Interop.allocateNativeString(actionName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_pad_controller_set_action_entries = Interop.downcallHandle(
        "gtk_pad_controller_set_action_entries",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * A convenience function to add a group of action entries on
     * {@code controller}.
     * <p>
     * See {@code Gtk.PadController.set_action}.
     */
    public @NotNull void setActionEntries(@NotNull PadActionEntry[] entries, @NotNull int nEntries) {
        try {
            gtk_pad_controller_set_action_entries.invokeExact(handle(), Interop.allocateNativeArray(entries), nEntries);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
