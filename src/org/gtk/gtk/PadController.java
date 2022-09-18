package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkPadController</code> is an event controller for the pads found in drawing
 * tablets.
 * <p>
 * Pads are the collection of buttons and tactile sensors often found around
 * the stylus-sensitive area.
 * <p>
 * These buttons and sensors have no implicit meaning, and by default they
 * perform no action. <code>GtkPadController</code> is provided to map those to
 * {@link [iface@Gio.Action] (ref=iface)} objects, thus letting the application give them a more
 * semantic meaning.
 * <p>
 * Buttons and sensors are not constrained to triggering a single action,
 * some {@link org.gtk.gdk.InputSource<code>#TABLET_PAD</code>  devices feature multiple &<code>#34</code> modes&<code>#34</code> . All these
 * input elements have one current mode, which may determine the final action
 * being triggered.
 * <p>
 * Pad devices often divide buttons and sensors into groups. All elements
 * in a group share the same current mode, but different groups may have
 * different modes. See {@link org.gtk.gdk.DevicePad<code>#getNGroups</code>  and
 * {@link org.gtk.gdk.DevicePad<code>#getGroupNModes</code> .
 * <p>
 * Each of the actions that a given button/strip/ring performs for a given mode
 * is defined by a {@link [struct@Gtk.PadActionEntry] (ref=struct)}. It contains an action name that
 * will be looked up in the given {@link [iface@Gio.ActionGroup] (ref=iface)} and activated whenever
 * the specified input element and mode are triggered.
 * <p>
 * A simple example of <code>GtkPadController</code> usage: Assigning button 1 in all
 * modes and pad devices to an &<code>#34</code> invert-selection&<code>#34</code>  action:
 * <p><pre>c
 * GtkPadActionEntry *pad_actions{@link []} = {
 *   { GTK_PAD_ACTION_BUTTON, 1, -1, &<code>#34</code> Invert selection&<code>#34</code> , &<code>#34</code> pad-actions.invert-selection&<code>#34</code>  },
 *   &<code>#8230</code> 
 * };
 * <p>
 * &<code>#8230</code> 
 * action_group = g_simple_action_group_new ();
 * action = g_simple_action_new (&<code>#34</code> pad-actions.invert-selection&<code>#34</code> , NULL);
 * g_signal_connect (action, &<code>#34</code> activate&<code>#34</code> , on_invert_selection_activated, NULL);
 * g_action_map_add_action (G_ACTION_MAP (action_group), action);
 * &<code>#8230</code> 
 * pad_controller = gtk_pad_controller_new (action_group, NULL);
 * </pre>
 * <p>
 * The actions belonging to rings/strips will be activated with a parameter
 * of type <code>G_VARIANT_TYPE_DOUBLE</code> bearing the value of the given axis, it
 * is required that those are made stateful and accepting this <code>GVariantType</code>.
 */
public class PadController extends EventController {

    public PadController(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PadController */
    public static PadController castFrom(org.gtk.gobject.Object gobject) {
        return new PadController(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.gio.ActionGroup group, org.gtk.gdk.Device pad) {
        Reference RESULT = References.get(gtk_h.gtk_pad_controller_new(group.handle(), pad.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkPadController</code> that will associate events from @pad to
     * actions.
     * <p>
     * A <code>null</code> pad may be provided so the controller manages all pad devices
     * generically, it is discouraged to mix <code>GtkPadController</code> objects with
     * <code>null</code> and non-<code>null</code> @pad argument on the same toplevel window, as execution
     * order is not guaranteed.
     * <p>
     * The <code>GtkPadController</code> is created with no mapped actions. In order to
     * map pad events to actions, use {@link org.gtk.gtk.PadController<code>#setActionEntries</code> 
     * or {@link org.gtk.gtk.PadController<code>#setAction</code> .
     * <p>
     * Be aware that pad events will only be delivered to <code>GtkWindow</code>s, so adding
     * a pad controller to any other type of widget will not have an effect.
     */
    public PadController(org.gtk.gio.ActionGroup group, org.gtk.gdk.Device pad) {
        super(constructNew(group, pad));
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
        gtk_h.gtk_pad_controller_set_action(handle(), type.getValue(), index, mode, Interop.allocateNativeString(label).handle(), Interop.allocateNativeString(actionName).handle());
    }
    
    /**
     * A convenience function to add a group of action entries on
     * @controller.
     * 
     * See {@link [struct@Gtk.PadActionEntry] (ref=struct)} and {@link org.gtk.gtk.PadController<code>#setAction</code> .
     */
    public void setActionEntries(PadActionEntry[] entries, int nEntries) {
        gtk_h.gtk_pad_controller_set_action_entries(handle(), Interop.allocateNativeArray(entries).handle(), nEntries);
    }
    
}
