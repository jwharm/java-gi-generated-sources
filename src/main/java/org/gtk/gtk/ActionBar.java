package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkActionBar} is designed to present contextual actions.
 * <p>
 * <img src="./doc-files/action-bar.png" alt="An example GtkActionBar">
 * <p>
 * It is expected to be displayed below the content and expand
 * horizontally to fill the area.
 * <p>
 * It allows placing children at the start or the end. In addition, it
 * contains an internal centered box which is centered with respect to
 * the full width of the box, even if the children at either side take
 * up different amounts of space.
 * <p>
 * <strong>GtkActionBar as GtkBuildable</strong><br/>
 * The {@code GtkActionBar} implementation of the {@code GtkBuildable} interface supports
 * adding children at the start or end sides by specifying “start” or “end” as
 * the “type” attribute of a {@code <child>} element, or setting the center widget
 * by specifying “center” value.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * actionbar
 * ╰── revealer
 *     ╰── box
 *         ├── box.start
 *         │   ╰── [start children]
 *         ├── [center widget]
 *         ╰── box.end
 *             ╰── [end children]
 * }</pre>
 * <p>
 * A {@code GtkActionBar}'s CSS node is called {@code actionbar}. It contains a {@code revealer}
 * subnode, which contains a {@code box} subnode, which contains two {@code box} subnodes at
 * the start and end of the action bar, with {@code start} and `end style classes
 * respectively, as well as a center node that represents the center child.
 * <p>
 * Each of the boxes contains children packed for that side.
 */
public class ActionBar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkActionBar";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ActionBar proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ActionBar(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ActionBar> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ActionBar(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_action_bar_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkActionBar} widget.
     */
    public ActionBar() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Retrieves the center bar widget of the bar.
     * @return the center {@code GtkWidget}
     */
    public @Nullable org.gtk.gtk.Widget getCenterWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_action_bar_get_center_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets whether the contents of the action bar are revealed.
     * @return the current value of the {@code Gtk.ActionBar:revealed}
     *   property
     */
    public boolean getRevealed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_action_bar_get_revealed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Adds {@code child} to {@code action_bar}, packed with reference to the
     * end of the {@code action_bar}.
     * @param child the {@code GtkWidget} to be added to {@code action_bar}
     */
    public void packEnd(org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_action_bar_pack_end.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code child} to {@code action_bar}, packed with reference to the
     * start of the {@code action_bar}.
     * @param child the {@code GtkWidget} to be added to {@code action_bar}
     */
    public void packStart(org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_action_bar_pack_start.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a child from {@code action_bar}.
     * @param child the {@code GtkWidget} to be removed
     */
    public void remove(org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_action_bar_remove.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the center widget for the {@code GtkActionBar}.
     * @param centerWidget a widget to use for the center
     */
    public void setCenterWidget(@Nullable org.gtk.gtk.Widget centerWidget) {
        try {
            DowncallHandles.gtk_action_bar_set_center_widget.invokeExact(
                    handle(),
                    (Addressable) (centerWidget == null ? MemoryAddress.NULL : centerWidget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reveals or conceals the content of the action bar.
     * <p>
     * Note: this does not show or hide {@code action_bar} in the
     * {@code Gtk.Widget:visible} sense, so revealing has
     * no effect if the action bar is hidden.
     * @param revealed The new value of the property
     */
    public void setRevealed(boolean revealed) {
        try {
            DowncallHandles.gtk_action_bar_set_revealed.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(revealed, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_action_bar_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ActionBar.Builder} object constructs a {@link ActionBar} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ActionBar.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ActionBar} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ActionBar}.
         * @return A new instance of {@code ActionBar} with the properties 
         *         that were set in the Builder object.
         */
        public ActionBar build() {
            return (ActionBar) org.gtk.gobject.GObject.newWithProperties(
                ActionBar.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Controls whether the action bar shows its contents.
         * @param revealed The value for the {@code revealed} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRevealed(boolean revealed) {
            names.add("revealed");
            values.add(org.gtk.gobject.Value.create(revealed));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_action_bar_new = Interop.downcallHandle(
                "gtk_action_bar_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_action_bar_get_center_widget = Interop.downcallHandle(
                "gtk_action_bar_get_center_widget",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_action_bar_get_revealed = Interop.downcallHandle(
                "gtk_action_bar_get_revealed",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_action_bar_pack_end = Interop.downcallHandle(
                "gtk_action_bar_pack_end",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_action_bar_pack_start = Interop.downcallHandle(
                "gtk_action_bar_pack_start",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_action_bar_remove = Interop.downcallHandle(
                "gtk_action_bar_remove",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_action_bar_set_center_widget = Interop.downcallHandle(
                "gtk_action_bar_set_center_widget",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_action_bar_set_revealed = Interop.downcallHandle(
                "gtk_action_bar_set_revealed",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_action_bar_get_type = Interop.downcallHandle(
                "gtk_action_bar_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_action_bar_get_type != null;
    }
}
