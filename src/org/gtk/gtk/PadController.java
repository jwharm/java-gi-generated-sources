package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkPadController` is an event controller for the pads found in drawing
 * tablets.
 * 
 * Pads are the collection of buttons and tactile sensors often found around
 * the stylus-sensitive area.
 * 
 * These buttons and sensors have no implicit meaning, and by default they
 * perform no action. `GtkPadController` is provided to map those to
 * [iface@Gio.Action] objects, thus letting the application give them a more
 * semantic meaning.
 * 
 * Buttons and sensors are not constrained to triggering a single action,
 * some %GDK_SOURCE_TABLET_PAD devices feature multiple "modes". All these
 * input elements have one current mode, which may determine the final action
 * being triggered.
 * 
 * Pad devices often divide buttons and sensors into groups. All elements
 * in a group share the same current mode, but different groups may have
 * different modes. See [method@Gdk.DevicePad.get_n_groups] and
 * [method@Gdk.DevicePad.get_group_n_modes].
 * 
 * Each of the actions that a given button/strip/ring performs for a given mode
 * is defined by a [struct@Gtk.PadActionEntry]. It contains an action name that
 * will be looked up in the given [iface@Gio.ActionGroup] and activated whenever
 * the specified input element and mode are triggered.
 * 
 * A simple example of `GtkPadController` usage: Assigning button 1 in all
 * modes and pad devices to an "invert-selection" action:
 * 
 * ```c
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
 * ```
 * 
 * The actions belonging to rings/strips will be activated with a parameter
 * of type %G_VARIANT_TYPE_DOUBLE bearing the value of the given axis, it
 * is required that those are made stateful and accepting this `GVariantType`.
 */
public class PadController extends EventController {

    public PadController(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to PadController */
    public static PadController castFrom(org.gtk.gobject.Object gobject) {
        return new PadController(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkPadController` that will associate events from @pad to
     * actions.
     * 
     * A %NULL pad may be provided so the controller manages all pad devices
     * generically, it is discouraged to mix `GtkPadController` objects with
     * %NULL and non-%NULL @pad argument on the same toplevel window, as execution
     * order is not guaranteed.
     * 
     * The `GtkPadController` is created with no mapped actions. In order to
     * map pad events to actions, use [method@Gtk.PadController.set_action_entries]
     * or [method@Gtk.PadController.set_action].
     * 
     * Be aware that pad events will only be delivered to `GtkWindow`s, so adding
     * a pad controller to any other type of widget will not have an effect.
     */
    public PadController(org.gtk.gio.ActionGroup group, org.gtk.gdk.Device pad) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_pad_controller_new(group.HANDLE(), pad.HANDLE()), true));
    }
    
    /**
     * Adds an individual action to @controller.
     * 
     * This action will only be activated if the given button/ring/strip number
     * in @index is interacted while the current mode is @mode. -1 may be used
     * for simple cases, so the action is triggered on all modes.
     * 
     * The given @label should be considered user-visible, so internationalization
     * rules apply. Some windowing systems may be able to use those for user
     * feedback.
     */
    public void setAction(PadActionType type, int index, int mode, java.lang.String label, java.lang.String actionName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_pad_controller_set_action(HANDLE(), type.getValue(), index, mode, Interop.getAllocator().allocateUtf8String(label), Interop.getAllocator().allocateUtf8String(actionName));
    }
    
    /**
     * A convenience function to add a group of action entries on
     * @controller.
     * 
     * See [struct@Gtk.PadActionEntry] and [method@Gtk.PadController.set_action].
     */
    public void setActionEntries(PadActionEntry[] entries, int nEntries) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_pad_controller_set_action_entries(HANDLE(), Interop.allocateNativeArray(entries), nEntries);
    }
    
}
