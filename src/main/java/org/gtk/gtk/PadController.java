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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PadController proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PadController(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PadController> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PadController(input);
    
    private static MemoryAddress constructNew(org.gtk.gio.ActionGroup group, @Nullable org.gtk.gdk.Device pad) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_pad_controller_new.invokeExact(
                    group.handle(),
                    (Addressable) (pad == null ? MemoryAddress.NULL : pad.handle()));
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
    public PadController(org.gtk.gio.ActionGroup group, @Nullable org.gtk.gdk.Device pad) {
        super(constructNew(group, pad));
        this.takeOwnership();
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
    public void setAction(org.gtk.gtk.PadActionType type, int index, int mode, java.lang.String label, java.lang.String actionName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_pad_controller_set_action.invokeExact(
                        handle(),
                        type.getValue(),
                        index,
                        mode,
                        Marshal.stringToAddress.marshal(label, SCOPE),
                        Marshal.stringToAddress.marshal(actionName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_pad_controller_set_action_entries.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(entries, org.gtk.gtk.PadActionEntry.getMemoryLayout(), false, SCOPE),
                        nEntries);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_pad_controller_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link PadController.Builder} object constructs a {@link PadController} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PadController.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.EventController.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PadController} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PadController}.
         * @return A new instance of {@code PadController} with the properties 
         *         that were set in the Builder object.
         */
        public PadController build() {
            return (PadController) org.gtk.gobject.GObject.newWithProperties(
                PadController.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setActionGroup(org.gtk.gio.ActionGroup actionGroup) {
            names.add("action-group");
            values.add(org.gtk.gobject.Value.create(actionGroup));
            return this;
        }
        
        public Builder setPad(org.gtk.gdk.Device pad) {
            names.add("pad");
            values.add(org.gtk.gobject.Value.create(pad));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_pad_controller_new = Interop.downcallHandle(
                "gtk_pad_controller_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_pad_controller_set_action = Interop.downcallHandle(
                "gtk_pad_controller_set_action",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_pad_controller_set_action_entries = Interop.downcallHandle(
                "gtk_pad_controller_set_action_entries",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_pad_controller_get_type = Interop.downcallHandle(
                "gtk_pad_controller_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_pad_controller_get_type != null;
    }
}
