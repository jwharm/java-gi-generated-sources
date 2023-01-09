package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkButton} widget is generally used to trigger a callback function that is
 * called when the button is pressed.
 * <p>
 * <img src="./doc-files/button.png" alt="An example GtkButton">
 * <p>
 * The {@code GtkButton} widget can hold any valid child widget. That is, it can hold
 * almost any other standard {@code GtkWidget}. The most commonly used child is the
 * {@code GtkLabel}.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkButton} has a single CSS node with name button. The node will get the
 * style classes .image-button or .text-button, if the content is just an
 * image or label, respectively. It may also receive the .flat style class.
 * When activating a button via the keyboard, the button will temporarily
 * gain the .keyboard-activating style class.
 * <p>
 * Other style classes that are commonly used with {@code GtkButton} include
 * .suggested-action and .destructive-action. In special cases, buttons
 * can be made round by adding the .circular style class.
 * <p>
 * Button-like widgets like {@link ToggleButton},
 * {@link VolumeButton}, {@link ColorButton}
 * or {@link FontButton} use style classes such as .toggle, .popup, .scale,
 * .lock, .color on the button node to differentiate themselves from a plain
 * {@code GtkButton}.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkButton} uses the {@link AccessibleRole#BUTTON} role.
 */
public class Button extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkButton";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Button proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Button(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Button> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Button(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_button_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkButton} widget.
     * <p>
     * To add a child widget to the button, use {@link Button#setChild}.
     */
    public Button() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewFromIconName(@Nullable java.lang.String iconName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_button_new_from_icon_name.invokeExact((Addressable) (iconName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(iconName, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new button containing an icon from the current icon theme.
     * <p>
     * If the icon name isn’t known, a “broken image” icon will be
     * displayed instead. If the current icon theme is changed, the icon
     * will be updated appropriately.
     * @param iconName an icon name
     * @return a new {@code GtkButton} displaying the themed icon
     */
    public static Button newFromIconName(@Nullable java.lang.String iconName) {
        var RESULT = constructNewFromIconName(iconName);
        var OBJECT = (org.gtk.gtk.Button) Interop.register(RESULT, org.gtk.gtk.Button.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWithLabel(java.lang.String label) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_button_new_with_label.invokeExact(Marshal.stringToAddress.marshal(label, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a {@code GtkButton} widget with a {@code GtkLabel} child.
     * @param label The text you want the {@code GtkLabel} to hold
     * @return The newly created {@code GtkButton} widget
     */
    public static Button newWithLabel(java.lang.String label) {
        var RESULT = constructNewWithLabel(label);
        var OBJECT = (org.gtk.gtk.Button) Interop.register(RESULT, org.gtk.gtk.Button.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWithMnemonic(java.lang.String label) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_button_new_with_mnemonic.invokeExact(Marshal.stringToAddress.marshal(label, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new {@code GtkButton} containing a label.
     * <p>
     * If characters in {@code label} are preceded by an underscore, they are underlined.
     * If you need a literal underscore character in a label, use “__” (two
     * underscores). The first underlined character represents a keyboard
     * accelerator called a mnemonic. Pressing Alt and that key activates the button.
     * @param label The text of the button, with an underscore in front of the
     *   mnemonic character
     * @return a new {@code GtkButton}
     */
    public static Button newWithMnemonic(java.lang.String label) {
        var RESULT = constructNewWithMnemonic(label);
        var OBJECT = (org.gtk.gtk.Button) Interop.register(RESULT, org.gtk.gtk.Button.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the child widget of {@code button}.
     * @return the child widget of {@code button}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_button_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns whether the button has a frame.
     * @return {@code true} if the button has a frame
     */
    public boolean getHasFrame() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_button_get_has_frame.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the icon name of the button.
     * <p>
     * If the icon name has not been set with {@link Button#setIconName}
     * the return value will be {@code null}. This will be the case if you create
     * an empty button with {@link Button#Button} to use as a container.
     * @return The icon name set via {@link Button#setIconName}
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_button_get_icon_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Fetches the text from the label of the button.
     * <p>
     * If the label text has not been set with {@link Button#setLabel}
     * the return value will be {@code null}. This will be the case if you create
     * an empty button with {@link Button#Button} to use as a container.
     * @return The text of the label widget. This string is owned
     * by the widget and must not be modified or freed.
     */
    public @Nullable java.lang.String getLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_button_get_label.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * gets whether underlines are interpreted as mnemonics.
     * <p>
     * See {@link Button#setUseUnderline}.
     * @return {@code true} if an embedded underline in the button label
     *   indicates the mnemonic accelerator keys.
     */
    public boolean getUseUnderline() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_button_get_use_underline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the child widget of {@code button}.
     * <p>
     * Note that by using this API, you take full responsibility for setting
     * up the proper accessibility label and description information for {@code button}.
     * Most likely, you'll either set the accessibility label or description
     * for {@code button} explicitly, or you'll set a labelled-by or described-by
     * relations from {@code child} to {@code button}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_button_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the style of the button.
     * <p>
     * Buttons can has a flat appearance or have a frame drawn around them.
     * @param hasFrame whether the button should have a visible frame
     */
    public void setHasFrame(boolean hasFrame) {
        try {
            DowncallHandles.gtk_button_set_has_frame.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(hasFrame, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a {@code GtkImage} with the given icon name as a child.
     * <p>
     * If {@code button} already contains a child widget, that child widget will
     * be removed and replaced with the image.
     * @param iconName An icon name
     */
    public void setIconName(java.lang.String iconName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_button_set_icon_name.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(iconName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the text of the label of the button to {@code label}.
     * <p>
     * This will also clear any previously set labels.
     * @param label a string
     */
    public void setLabel(java.lang.String label) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_button_set_label.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(label, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets whether to use underlines as mnemonics.
     * <p>
     * If true, an underline in the text of the button label indicates
     * the next character should be used for the mnemonic accelerator key.
     * @param useUnderline {@code true} if underlines in the text indicate mnemonics
     */
    public void setUseUnderline(boolean useUnderline) {
        try {
            DowncallHandles.gtk_button_set_use_underline.invokeExact(
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
            RESULT = (long) DowncallHandles.gtk_button_get_type.invokeExact();
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
         * Emitted to animate press then release.
         * <p>
         * This is an action signal. Applications should never connect
         * to this signal, but use the {@code Gtk.Button::clicked} signal.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceButton) {
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
     * Emitted to animate press then release.
     * <p>
     * This is an action signal. Applications should never connect
     * to this signal, but use the {@code Gtk.Button::clicked} signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Button.Activate> onActivate(Button.Activate handler) {
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
     * Functional interface declaration of the {@code Clicked} callback.
     */
    @FunctionalInterface
    public interface Clicked {
    
        /**
         * Emitted when the button has been activated (pressed and released).
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceButton) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Clicked.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the button has been activated (pressed and released).
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Button.Clicked> onClicked(Button.Clicked handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("clicked", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Button.Builder} object constructs a {@link Button} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Button.Builder#build()}. 
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
         * Finish building the {@link Button} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Button}.
         * @return A new instance of {@code Button} with the properties 
         *         that were set in the Builder object.
         */
        public Button build() {
            return (Button) org.gtk.gobject.GObject.newWithProperties(
                Button.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
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
         * Text of the label inside the button, if the button contains a label widget.
         * @param label The value for the {@code label} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLabel(java.lang.String label) {
            names.add("label");
            values.add(org.gtk.gobject.Value.create(label));
            return this;
        }
        
        /**
         * If set, an underline in the text indicates that the following character is
         * to be used as mnemonic.
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
        
        private static final MethodHandle gtk_button_new = Interop.downcallHandle(
                "gtk_button_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_button_new_from_icon_name = Interop.downcallHandle(
                "gtk_button_new_from_icon_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_button_new_with_label = Interop.downcallHandle(
                "gtk_button_new_with_label",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_button_new_with_mnemonic = Interop.downcallHandle(
                "gtk_button_new_with_mnemonic",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_button_get_child = Interop.downcallHandle(
                "gtk_button_get_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_button_get_has_frame = Interop.downcallHandle(
                "gtk_button_get_has_frame",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_button_get_icon_name = Interop.downcallHandle(
                "gtk_button_get_icon_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_button_get_label = Interop.downcallHandle(
                "gtk_button_get_label",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_button_get_use_underline = Interop.downcallHandle(
                "gtk_button_get_use_underline",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_button_set_child = Interop.downcallHandle(
                "gtk_button_set_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_button_set_has_frame = Interop.downcallHandle(
                "gtk_button_set_has_frame",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_button_set_icon_name = Interop.downcallHandle(
                "gtk_button_set_icon_name",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_button_set_label = Interop.downcallHandle(
                "gtk_button_set_label",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_button_set_use_underline = Interop.downcallHandle(
                "gtk_button_set_use_underline",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_button_get_type = Interop.downcallHandle(
                "gtk_button_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_button_get_type != null;
    }
}
