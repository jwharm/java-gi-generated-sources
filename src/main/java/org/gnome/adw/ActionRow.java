package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link org.gtk.gtk.ListBoxRow} used to present actions.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="action-row-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="action-row.png" alt="action-row"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwActionRow} widget can have a title, a subtitle and an icon. The row
 * can receive additional widgets at its end, or prefix widgets at its start.
 * <p>
 * It is convenient to present a preference and its related actions.
 * <p>
 * {@code AdwActionRow} is unactivatable by default, giving it an activatable widget
 * will automatically make it activatable, but unsetting it won't change the
 * row's activatability.
 * <p>
 * <strong>AdwActionRow as GtkBuildable</strong><br/>
 * The {@code AdwActionRow} implementation of the {@code Gtk.Buildable} interface
 * supports adding a child at its end by specifying “suffix” or omitting the
 * “type” attribute of a &lt;child&gt; element.
 * <p>
 * It also supports adding a child as a prefix widget by specifying “prefix” as
 * the “type” attribute of a &lt;child&gt; element.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwActionRow} has a main CSS node with name {@code row}.
 * <p>
 * It contains the subnode {@code box.header} for its main horizontal box, and
 * {@code box.title} for the vertical box containing the title and subtitle labels.
 * <p>
 * It contains subnodes {@code label.title} and {@code label.subtitle} representing
 * respectively the title label and subtitle label.
 * @version 1.0
 */
public class ActionRow extends org.gnome.adw.PreferencesRow implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwActionRow";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gnome.adw.PreferencesRow.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gnome.adw.PreferencesRow parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gnome.adw.PreferencesRow(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a ActionRow proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ActionRow(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ActionRow if its GType is a (or inherits from) "AdwActionRow".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ActionRow} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwActionRow", a ClassCastException will be thrown.
     */
    public static ActionRow castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ActionRow.getType())) {
            return new ActionRow(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwActionRow");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_action_row_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwActionRow}.
     */
    public ActionRow() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Activates {@code self}.
     */
    public void activateRow() {
        try {
            DowncallHandles.adw_action_row_activate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a prefix widget to {@code self}.
     * @param widget a widget
     */
    public void addPrefix(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.adw_action_row_add_prefix.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a suffix widget to {@code self}.
     * @param widget a widget
     */
    public void addSuffix(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.adw_action_row_add_suffix.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the widget activated when {@code self} is activated.
     * @return the activatable widget for {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getActivatableWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_action_row_get_activatable_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the icon name for {@code self}.
     * @return the icon name for {@code self}
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_action_row_get_icon_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the subtitle for {@code self}.
     * @return the subtitle for {@code self}
     */
    public @Nullable java.lang.String getSubtitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_action_row_get_subtitle.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the number of lines at the end of which the subtitle label will be
     * ellipsized.
     * @return the number of lines at the end of which the subtitle label will be
     *   ellipsized
     */
    public int getSubtitleLines() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_action_row_get_subtitle_lines.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the number of lines at the end of which the title label will be
     * ellipsized.
     * @return the number of lines at the end of which the title label will be
     *   ellipsized
     */
    public int getTitleLines() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_action_row_get_title_lines.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes a child from {@code self}.
     * @param widget the child to be removed
     */
    public void remove(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.adw_action_row_remove.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the widget to activate when {@code self} is activated.
     * <p>
     * The row can be activated either by clicking on it, calling
     * {@code ActionRow#activate}, or via mnemonics in the title or the subtitle.
     * See the {@code PreferencesRow:use-underline} property to enable mnemonics.
     * <p>
     * The target widget will be activated by emitting the
     * {@code Gtk.Widget::mnemonic-activate} signal on it.
     * @param widget the target widget
     */
    public void setActivatableWidget(@Nullable org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.adw_action_row_set_activatable_widget.invokeExact(
                    handle(),
                    (Addressable) (widget == null ? MemoryAddress.NULL : widget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the icon name for {@code self}.
     * @param iconName the icon name
     */
    public void setIconName(@Nullable java.lang.String iconName) {
        try {
            DowncallHandles.adw_action_row_set_icon_name.invokeExact(
                    handle(),
                    (Addressable) (iconName == null ? MemoryAddress.NULL : Interop.allocateNativeString(iconName)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the subtitle for {@code self}.
     * <p>
     * The subtitle is interpreted as Pango markup unless
     * {@code PreferencesRow:use-markup} is set to {@code FALSE}.
     * @param subtitle the subtitle
     */
    public void setSubtitle(@NotNull java.lang.String subtitle) {
        java.util.Objects.requireNonNull(subtitle, "Parameter 'subtitle' must not be null");
        try {
            DowncallHandles.adw_action_row_set_subtitle.invokeExact(
                    handle(),
                    Interop.allocateNativeString(subtitle));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the number of lines at the end of which the subtitle label will be
     * ellipsized.
     * <p>
     * If the value is 0, the number of lines won't be limited.
     * @param subtitleLines the number of lines at the end of which the subtitle label will be ellipsized
     */
    public void setSubtitleLines(int subtitleLines) {
        try {
            DowncallHandles.adw_action_row_set_subtitle_lines.invokeExact(
                    handle(),
                    subtitleLines);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the number of lines at the end of which the title label will be
     * ellipsized.
     * <p>
     * If the value is 0, the number of lines won't be limited.
     * @param titleLines the number of lines at the end of which the title label will be ellipsized
     */
    public void setTitleLines(int titleLines) {
        try {
            DowncallHandles.adw_action_row_set_title_lines.invokeExact(
                    handle(),
                    titleLines);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_action_row_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Activated {
        void signalReceived(ActionRow source);
    }
    
    /**
     * This signal is emitted after the row has been activated.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ActionRow.Activated> onActivated(ActionRow.Activated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ActionRow.Callbacks.class, "signalActionRowActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ActionRow.Activated>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gnome.adw.PreferencesRow.Build {
        
         /**
         * A {@link ActionRow.Build} object constructs a {@link ActionRow} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ActionRow} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ActionRow} using {@link ActionRow#castFrom}.
         * @return A new instance of {@code ActionRow} with the properties 
         *         that were set in the Build object.
         */
        public ActionRow construct() {
            return ActionRow.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ActionRow.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The widget to activate when the row is activated.
         * <p>
         * The row can be activated either by clicking on it, calling
         * {@code ActionRow#activate}, or via mnemonics in the title or the subtitle.
         * See the {@code PreferencesRow:use-underline} property to enable
         * mnemonics.
         * <p>
         * The target widget will be activated by emitting the
         * {@code Gtk.Widget::mnemonic-activate} signal on it.
         * @param activatableWidget The value for the {@code activatable-widget} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setActivatableWidget(org.gtk.gtk.Widget activatableWidget) {
            names.add("activatable-widget");
            values.add(org.gtk.gobject.Value.create(activatableWidget));
            return this;
        }
        
        /**
         * The icon name for this row.
         * @param iconName The value for the {@code icon-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIconName(java.lang.String iconName) {
            names.add("icon-name");
            values.add(org.gtk.gobject.Value.create(iconName));
            return this;
        }
        
        /**
         * The subtitle for this row.
         * <p>
         * The subtitle is interpreted as Pango markup unless
         * {@code PreferencesRow:use-markup} is set to {@code FALSE}.
         * @param subtitle The value for the {@code subtitle} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSubtitle(java.lang.String subtitle) {
            names.add("subtitle");
            values.add(org.gtk.gobject.Value.create(subtitle));
            return this;
        }
        
        /**
         * The number of lines at the end of which the subtitle label will be
         * ellipsized.
         * <p>
         * If the value is 0, the number of lines won't be limited.
         * @param subtitleLines The value for the {@code subtitle-lines} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSubtitleLines(int subtitleLines) {
            names.add("subtitle-lines");
            values.add(org.gtk.gobject.Value.create(subtitleLines));
            return this;
        }
        
        /**
         * The number of lines at the end of which the title label will be ellipsized.
         * <p>
         * If the value is 0, the number of lines won't be limited.
         * @param titleLines The value for the {@code title-lines} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTitleLines(int titleLines) {
            names.add("title-lines");
            values.add(org.gtk.gobject.Value.create(titleLines));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_action_row_new = Interop.downcallHandle(
            "adw_action_row_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_action_row_activate = Interop.downcallHandle(
            "adw_action_row_activate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_action_row_add_prefix = Interop.downcallHandle(
            "adw_action_row_add_prefix",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_action_row_add_suffix = Interop.downcallHandle(
            "adw_action_row_add_suffix",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_action_row_get_activatable_widget = Interop.downcallHandle(
            "adw_action_row_get_activatable_widget",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_action_row_get_icon_name = Interop.downcallHandle(
            "adw_action_row_get_icon_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_action_row_get_subtitle = Interop.downcallHandle(
            "adw_action_row_get_subtitle",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_action_row_get_subtitle_lines = Interop.downcallHandle(
            "adw_action_row_get_subtitle_lines",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_action_row_get_title_lines = Interop.downcallHandle(
            "adw_action_row_get_title_lines",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_action_row_remove = Interop.downcallHandle(
            "adw_action_row_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_action_row_set_activatable_widget = Interop.downcallHandle(
            "adw_action_row_set_activatable_widget",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_action_row_set_icon_name = Interop.downcallHandle(
            "adw_action_row_set_icon_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_action_row_set_subtitle = Interop.downcallHandle(
            "adw_action_row_set_subtitle",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_action_row_set_subtitle_lines = Interop.downcallHandle(
            "adw_action_row_set_subtitle_lines",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_action_row_set_title_lines = Interop.downcallHandle(
            "adw_action_row_set_title_lines",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_action_row_get_type = Interop.downcallHandle(
            "adw_action_row_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalActionRowActivated(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ActionRow.Activated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ActionRow(source, Ownership.NONE));
        }
    }
}
