package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkMenuButton} widget is used to display a popup when clicked.
 * <p>
 * <img src="./doc-files/menu-button.png" alt="An example GtkMenuButton">
 * <p>
 * This popup can be provided either as a {@code GtkPopover} or as an abstract
 * {@code GMenuModel}.
 * <p>
 * The {@code GtkMenuButton} widget can show either an icon (set with the
 * {@code Gtk.MenuButton:icon-name} property) or a label (set with the
 * {@code Gtk.MenuButton:label} property). If neither is explicitly set,
 * a {@link Image} is automatically created, using an arrow image oriented
 * according to {@code Gtk.MenuButton:direction} or the generic
 * “open-menu-symbolic” icon if the direction is not set.
 * <p>
 * The positioning of the popup is determined by the
 * {@code Gtk.MenuButton:direction} property of the menu button.
 * <p>
 * For menus, the {@code Gtk.Widget:halign} and {@code Gtk.Widget:valign}
 * properties of the menu are also taken into account. For example, when the
 * direction is {@link ArrowType#DOWN} and the horizontal alignment is {@link Align#START},
 * the menu will be positioned below the button, with the starting edge
 * (depending on the text direction) of the menu aligned with the starting
 * edge of the button. If there is not enough space below the button, the
 * menu is popped up above the button instead. If the alignment would move
 * part of the menu offscreen, it is “pushed in”.
 * <p>
 * |           | start                | center                | end                |
 * | -         | ---                  | ---                   | ---                |
 * | <strong>down</strong>  | <img src="./doc-files/down-start.png" alt="">  | <img src="./doc-files/down-center.png" alt="">  | <img src="./doc-files/down-end.png" alt="">  |
 * | <strong>up</strong>    | <img src="./doc-files/up-start.png" alt="">    | <img src="./doc-files/up-center.png" alt="">    | <img src="./doc-files/up-end.png" alt="">    |
 * | <strong>left</strong>  | <img src="./doc-files/left-start.png" alt="">  | <img src="./doc-files/left-center.png" alt="">  | <img src="./doc-files/left-end.png" alt="">  |
 * | <strong>right</strong> | <img src="./doc-files/right-start.png" alt=""> | <img src="./doc-files/right-center.png" alt=""> | <img src="./doc-files/right-end.png" alt=""> |
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * menubutton
 * ╰── button.toggle
 *     ╰── <content>
 *          ╰── [arrow]
 * }</pre>
 * <p>
 * {@code GtkMenuButton} has a single CSS node with name {@code menubutton}
 * which contains a {@code button} node with a {@code .toggle} style class.
 * <p>
 * If the button contains an icon, it will have the {@code .image-button} style class,
 * if it contains text, it will have {@code .text-button} style class. If an arrow is
 * visible in addition to an icon, text or a custom child, it will also have
 * {@code .arrow-button} style class.
 * <p>
 * Inside the toggle button content, there is an {@code arrow} node for
 * the indicator, which will carry one of the {@code .none}, {@code .up}, {@code .down},
 * {@code .left} or {@code .right} style classes to indicate the direction that
 * the menu will appear in. The CSS is expected to provide a suitable
 * image for each of these cases using the {@code -gtk-icon-source} property.
 * <p>
 * Optionally, the {@code menubutton} node can carry the {@code .circular} style class
 * to request a round appearance.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkMenuButton} uses the {@link AccessibleRole#BUTTON} role.
 */
public class MenuButton extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkMenuButton";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a MenuButton proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MenuButton(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MenuButton> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MenuButton(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_menu_button_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkMenuButton} widget with downwards-pointing
     * arrow as the only child.
     * <p>
     * You can replace the child widget with another {@code GtkWidget}
     * should you wish to.
     */
    public MenuButton() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Gets whether to show a dropdown arrow even when using an icon.
     * @return whether to show a dropdown arrow even when using an icon
     */
    public boolean getAlwaysShowArrow() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_menu_button_get_always_show_arrow.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the child widget of {@code menu_button}.
     * @return the child widget of {@code menu_button}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_menu_button_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns the direction the popup will be pointing at when popped up.
     * @return a {@code GtkArrowType} value
     */
    public org.gtk.gtk.ArrowType getArrowDirection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_menu_button_get_direction.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.ArrowType.of(RESULT);
    }
    
    /**
     * Returns whether the button has a frame.
     * @return {@code true} if the button has a frame
     */
    public boolean getHasFrame() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_menu_button_get_has_frame.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the name of the icon shown in the button.
     * @return the name of the icon shown in the button
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_menu_button_get_icon_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the label shown in the button
     * @return the label shown in the button
     */
    public @Nullable java.lang.String getLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_menu_button_get_label.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the {@code GMenuModel} used to generate the popup.
     * @return a {@code GMenuModel}
     */
    public @Nullable org.gtk.gio.MenuModel getMenuModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_menu_button_get_menu_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.MenuModel) Interop.register(RESULT, org.gtk.gio.MenuModel.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns the {@code GtkPopover} that pops out of the button.
     * <p>
     * If the button is not using a {@code GtkPopover}, this function
     * returns {@code null}.
     * @return a {@code GtkPopover} or {@code null}
     */
    public @Nullable org.gtk.gtk.Popover getPopover() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_menu_button_get_popover.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Popover) Interop.register(RESULT, org.gtk.gtk.Popover.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns whether the menu button acts as a primary menu.
     * @return {@code true} if the button is a primary menu
     */
    public boolean getPrimary() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_menu_button_get_primary.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether an embedded underline in the text indicates a
     * mnemonic.
     * @return {@code true} whether an embedded underline in the text indicates
     *   the mnemonic accelerator keys.
     */
    public boolean getUseUnderline() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_menu_button_get_use_underline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Dismiss the menu.
     */
    public void popdown() {
        try {
            DowncallHandles.gtk_menu_button_popdown.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Pop up the menu.
     */
    public void popup() {
        try {
            DowncallHandles.gtk_menu_button_popup.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to show a dropdown arrow even when using an icon or a custom
     * child.
     * @param alwaysShowArrow hether to show a dropdown arrow even when using an icon
     */
    public void setAlwaysShowArrow(boolean alwaysShowArrow) {
        try {
            DowncallHandles.gtk_menu_button_set_always_show_arrow.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(alwaysShowArrow, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the child widget of {@code menu_button}.
     * <p>
     * Setting a child resets {@code Gtk.MenuButton:label} and
     * {@code Gtk.MenuButton:icon-name}.
     * <p>
     * If {@code Gtk.MenuButton:always-show-arrow} is set to {@code TRUE} and
     * {@code Gtk.MenuButton:direction} is not {@code GTK_ARROW_NONE}, a dropdown arrow
     * will be shown next to the child.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_menu_button_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code func} to be called when a popup is about to be shown.
     * <p>
     * {@code func} should use one of
     * <ul>
     * <li>{@link MenuButton#setPopover}
     * <li>{@link MenuButton#setMenuModel}
     * </ul>
     * <p>
     * to set a popup for {@code menu_button}.
     * If {@code func} is non-{@code null}, {@code menu_button} will always be sensitive.
     * <p>
     * Using this function will not reset the menu widget attached to
     * {@code menu_button}. Instead, this can be done manually in {@code func}.
     * @param func function to call when a popup is about to
     *   be shown, but none has been provided via other means, or {@code null}
     *   to reset to default behavior.
     * @param destroyNotify destroy notify for {@code user_data}
     */
    public void setCreatePopupFunc(@Nullable org.gtk.gtk.MenuButtonCreatePopupFunc func, @Nullable org.gtk.glib.DestroyNotify destroyNotify) {
        try {
            DowncallHandles.gtk_menu_button_set_create_popup_func.invokeExact(
                    handle(),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (destroyNotify == null ? MemoryAddress.NULL : (Addressable) destroyNotify.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the direction in which the popup will be popped up.
     * <p>
     * If the button is automatically populated with an arrow icon,
     * its direction will be changed to match.
     * <p>
     * If the does not fit in the available space in the given direction,
     * GTK will its best to keep it inside the screen and fully visible.
     * <p>
     * If you pass {@link ArrowType#NONE} for a {@code direction}, the popup will behave
     * as if you passed {@link ArrowType#DOWN} (although you won’t see any arrows).
     * @param direction a {@code GtkArrowType}
     */
    public void setDirection(org.gtk.gtk.ArrowType direction) {
        try {
            DowncallHandles.gtk_menu_button_set_direction.invokeExact(
                    handle(),
                    direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the style of the button.
     * @param hasFrame whether the button should have a visible frame
     */
    public void setHasFrame(boolean hasFrame) {
        try {
            DowncallHandles.gtk_menu_button_set_has_frame.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(hasFrame, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the name of an icon to show inside the menu button.
     * <p>
     * Setting icon name resets {@code Gtk.MenuButton:label} and
     * {@code Gtk.MenuButton:child}.
     * <p>
     * If {@code Gtk.MenuButton:always-show-arrow} is set to {@code TRUE} and
     * {@code Gtk.MenuButton:direction} is not {@code GTK_ARROW_NONE}, a dropdown arrow
     * will be shown next to the icon.
     * @param iconName the icon name
     */
    public void setIconName(java.lang.String iconName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_menu_button_set_icon_name.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(iconName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the label to show inside the menu button.
     * <p>
     * Setting a label resets {@code Gtk.MenuButton:icon-name} and
     * {@code Gtk.MenuButton:child}.
     * <p>
     * If {@code Gtk.MenuButton:direction} is not {@code GTK_ARROW_NONE}, a dropdown
     * arrow will be shown next to the label.
     * @param label the label
     */
    public void setLabel(java.lang.String label) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_menu_button_set_label.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(label, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the {@code GMenuModel} from which the popup will be constructed.
     * <p>
     * If {@code menu_model} is {@code null}, the button is disabled.
     * <p>
     * A {@link Popover} will be created from the menu model with
     * {@link PopoverMenu#newFromModel}. Actions will be connected
     * as documented for this function.
     * <p>
     * If {@code Gtk.MenuButton:popover} is already set, it will be
     * dissociated from the {@code menu_button}, and the property is set to {@code null}.
     * @param menuModel a {@code GMenuModel}, or {@code null} to unset and disable the
     *   button
     */
    public void setMenuModel(@Nullable org.gtk.gio.MenuModel menuModel) {
        try {
            DowncallHandles.gtk_menu_button_set_menu_model.invokeExact(
                    handle(),
                    (Addressable) (menuModel == null ? MemoryAddress.NULL : menuModel.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkPopover} that will be popped up when the {@code menu_button} is clicked.
     * <p>
     * If {@code popover} is {@code null}, the button is disabled.
     * <p>
     * If {@code Gtk.MenuButton:menu-model} is set, the menu model is dissociated
     * from the {@code menu_button}, and the property is set to {@code null}.
     * @param popover a {@code GtkPopover}, or {@code null} to unset and disable the button
     */
    public void setPopover(@Nullable org.gtk.gtk.Widget popover) {
        try {
            DowncallHandles.gtk_menu_button_set_popover.invokeExact(
                    handle(),
                    (Addressable) (popover == null ? MemoryAddress.NULL : popover.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether menu button acts as a primary menu.
     * <p>
     * Primary menus can be opened with the &lt;kbd&gt;F10&lt;/kbd&gt; key.
     * @param primary whether the menubutton should act as a primary menu
     */
    public void setPrimary(boolean primary) {
        try {
            DowncallHandles.gtk_menu_button_set_primary.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(primary, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If true, an underline in the text indicates a mnemonic.
     * @param useUnderline {@code true} if underlines in the text indicate mnemonics
     */
    public void setUseUnderline(boolean useUnderline) {
        try {
            DowncallHandles.gtk_menu_button_set_use_underline.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(useUnderline, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_menu_button_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Activate} callback.
     */
    @FunctionalInterface
    public interface Activate {
    
        /**
         * Emitted to when the menu button is activated.
         * <p>
         * The {@code ::activate} signal on {@code GtkMenuButton} is an action signal and
         * emitting it causes the button to pop up its menu.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceMenuButton) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Activate.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to when the menu button is activated.
     * <p>
     * The {@code ::activate} signal on {@code GtkMenuButton} is an action signal and
     * emitting it causes the button to pop up its menu.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<MenuButton.Activate> onActivate(MenuButton.Activate handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link MenuButton.Builder} object constructs a {@link MenuButton} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link MenuButton.Builder#build()}. 
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
         * Finish building the {@link MenuButton} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MenuButton}.
         * @return A new instance of {@code MenuButton} with the properties 
         *         that were set in the Builder object.
         */
        public MenuButton build() {
            return (MenuButton) org.gtk.gobject.GObject.newWithProperties(
                MenuButton.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether to show a dropdown arrow even when using an icon or a custom child.
         * @param alwaysShowArrow The value for the {@code always-show-arrow} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAlwaysShowArrow(boolean alwaysShowArrow) {
            names.add("always-show-arrow");
            values.add(org.gtk.gobject.Value.create(alwaysShowArrow));
            return this;
        }
        
        /**
         * The child widget.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * The {@code GtkArrowType} representing the direction in which the
         * menu or popover will be popped out.
         * @param direction The value for the {@code direction} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDirection(org.gtk.gtk.ArrowType direction) {
            names.add("direction");
            values.add(org.gtk.gobject.Value.create(direction));
            return this;
        }
        
        /**
         * Whether the button has a frame.
         * @param hasFrame The value for the {@code has-frame} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHasFrame(boolean hasFrame) {
            names.add("has-frame");
            values.add(org.gtk.gobject.Value.create(hasFrame));
            return this;
        }
        
        /**
         * The name of the icon used to automatically populate the button.
         * @param iconName The value for the {@code icon-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIconName(java.lang.String iconName) {
            names.add("icon-name");
            values.add(org.gtk.gobject.Value.create(iconName));
            return this;
        }
        
        /**
         * The label for the button.
         * @param label The value for the {@code label} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLabel(java.lang.String label) {
            names.add("label");
            values.add(org.gtk.gobject.Value.create(label));
            return this;
        }
        
        /**
         * The {@code GMenuModel} from which the popup will be created.
         * <p>
         * See {@link MenuButton#setMenuModel} for the interaction
         * with the {@code Gtk.MenuButton:popover} property.
         * @param menuModel The value for the {@code menu-model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMenuModel(org.gtk.gio.MenuModel menuModel) {
            names.add("menu-model");
            values.add(org.gtk.gobject.Value.create(menuModel));
            return this;
        }
        
        /**
         * The {@code GtkPopover} that will be popped up when the button is clicked.
         * @param popover The value for the {@code popover} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPopover(org.gtk.gtk.Popover popover) {
            names.add("popover");
            values.add(org.gtk.gobject.Value.create(popover));
            return this;
        }
        
        /**
         * Whether the menu button acts as a primary menu.
         * <p>
         * Primary menus can be opened using the &lt;kbd&gt;F10&lt;/kbd&gt; key
         * @param primary The value for the {@code primary} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPrimary(boolean primary) {
            names.add("primary");
            values.add(org.gtk.gobject.Value.create(primary));
            return this;
        }
        
        /**
         * If set an underscore in the text indicates a mnemonic.
         * @param useUnderline The value for the {@code use-underline} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUseUnderline(boolean useUnderline) {
            names.add("use-underline");
            values.add(org.gtk.gobject.Value.create(useUnderline));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_menu_button_new = Interop.downcallHandle(
                "gtk_menu_button_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_menu_button_get_always_show_arrow = Interop.downcallHandle(
                "gtk_menu_button_get_always_show_arrow",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_menu_button_get_child = Interop.downcallHandle(
                "gtk_menu_button_get_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_menu_button_get_direction = Interop.downcallHandle(
                "gtk_menu_button_get_direction",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_menu_button_get_has_frame = Interop.downcallHandle(
                "gtk_menu_button_get_has_frame",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_menu_button_get_icon_name = Interop.downcallHandle(
                "gtk_menu_button_get_icon_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_menu_button_get_label = Interop.downcallHandle(
                "gtk_menu_button_get_label",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_menu_button_get_menu_model = Interop.downcallHandle(
                "gtk_menu_button_get_menu_model",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_menu_button_get_popover = Interop.downcallHandle(
                "gtk_menu_button_get_popover",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_menu_button_get_primary = Interop.downcallHandle(
                "gtk_menu_button_get_primary",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_menu_button_get_use_underline = Interop.downcallHandle(
                "gtk_menu_button_get_use_underline",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_menu_button_popdown = Interop.downcallHandle(
                "gtk_menu_button_popdown",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_menu_button_popup = Interop.downcallHandle(
                "gtk_menu_button_popup",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_menu_button_set_always_show_arrow = Interop.downcallHandle(
                "gtk_menu_button_set_always_show_arrow",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_menu_button_set_child = Interop.downcallHandle(
                "gtk_menu_button_set_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_menu_button_set_create_popup_func = Interop.downcallHandle(
                "gtk_menu_button_set_create_popup_func",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_menu_button_set_direction = Interop.downcallHandle(
                "gtk_menu_button_set_direction",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_menu_button_set_has_frame = Interop.downcallHandle(
                "gtk_menu_button_set_has_frame",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_menu_button_set_icon_name = Interop.downcallHandle(
                "gtk_menu_button_set_icon_name",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_menu_button_set_label = Interop.downcallHandle(
                "gtk_menu_button_set_label",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_menu_button_set_menu_model = Interop.downcallHandle(
                "gtk_menu_button_set_menu_model",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_menu_button_set_popover = Interop.downcallHandle(
                "gtk_menu_button_set_popover",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_menu_button_set_primary = Interop.downcallHandle(
                "gtk_menu_button_set_primary",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_menu_button_set_use_underline = Interop.downcallHandle(
                "gtk_menu_button_set_use_underline",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_menu_button_get_type = Interop.downcallHandle(
                "gtk_menu_button_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_menu_button_get_type != null;
    }
}
