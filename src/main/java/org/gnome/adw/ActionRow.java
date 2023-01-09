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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gnome.adw.PreferencesRow.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ActionRow proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ActionRow(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ActionRow> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ActionRow(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Activates {@code self}.
     */
    public void activateRow() {
        try {
            DowncallHandles.adw_action_row_activate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a prefix widget to {@code self}.
     * @param widget a widget
     */
    public void addPrefix(org.gtk.gtk.Widget widget) {
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
    public void addSuffix(org.gtk.gtk.Widget widget) {
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
            RESULT = (MemoryAddress) DowncallHandles.adw_action_row_get_activatable_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the icon name for {@code self}.
     * @return the icon name for {@code self}
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_action_row_get_icon_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the subtitle for {@code self}.
     * @return the subtitle for {@code self}
     */
    public @Nullable java.lang.String getSubtitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_action_row_get_subtitle.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
            RESULT = (int) DowncallHandles.adw_action_row_get_subtitle_lines.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.adw_action_row_get_title_lines.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes a child from {@code self}.
     * @param widget the child to be removed
     */
    public void remove(org.gtk.gtk.Widget widget) {
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.adw_action_row_set_icon_name.invokeExact(
                        handle(),
                        (Addressable) (iconName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(iconName, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the subtitle for {@code self}.
     * <p>
     * The subtitle is interpreted as Pango markup unless
     * {@code PreferencesRow:use-markup} is set to {@code FALSE}.
     * @param subtitle the subtitle
     */
    public void setSubtitle(java.lang.String subtitle) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.adw_action_row_set_subtitle.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(subtitle, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_action_row_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Activated} callback.
     */
    @FunctionalInterface
    public interface Activated {
    
        /**
         * This signal is emitted after the row has been activated.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceActionRow) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Activated.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * This signal is emitted after the row has been activated.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ActionRow.Activated> onActivated(ActionRow.Activated handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activated", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link ActionRow.Builder} object constructs a {@link ActionRow} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ActionRow.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gnome.adw.PreferencesRow.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ActionRow} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ActionRow}.
         * @return A new instance of {@code ActionRow} with the properties 
         *         that were set in the Builder object.
         */
        public ActionRow build() {
            return (ActionRow) org.gtk.gobject.GObject.newWithProperties(
                ActionRow.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
        public Builder setActivatableWidget(org.gtk.gtk.Widget activatableWidget) {
            names.add("activatable-widget");
            values.add(org.gtk.gobject.Value.create(activatableWidget));
            return this;
        }
        
        /**
         * The icon name for this row.
         * @param iconName The value for the {@code icon-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIconName(java.lang.String iconName) {
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
        public Builder setSubtitle(java.lang.String subtitle) {
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
        public Builder setSubtitleLines(int subtitleLines) {
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
        public Builder setTitleLines(int titleLines) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.adw_action_row_get_type != null;
    }
}
