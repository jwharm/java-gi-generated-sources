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
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
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
     * Create a Button proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Button(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Button if its GType is a (or inherits from) "GtkButton".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Button} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkButton", a ClassCastException will be thrown.
     */
    public static Button castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkButton"))) {
            return new Button(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkButton");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.NONE);
    }
    
    private static Addressable constructNewFromIconName(@Nullable java.lang.String iconName) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_button_new_from_icon_name.invokeExact(
                    (Addressable) (iconName == null ? MemoryAddress.NULL : Interop.allocateNativeString(iconName)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
        return new Button(constructNewFromIconName(iconName), Ownership.NONE);
    }
    
    private static Addressable constructNewWithLabel(@NotNull java.lang.String label) {
        java.util.Objects.requireNonNull(label, "Parameter 'label' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_button_new_with_label.invokeExact(
                    Interop.allocateNativeString(label));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkButton} widget with a {@code GtkLabel} child.
     * @param label The text you want the {@code GtkLabel} to hold
     * @return The newly created {@code GtkButton} widget
     */
    public static Button newWithLabel(@NotNull java.lang.String label) {
        return new Button(constructNewWithLabel(label), Ownership.NONE);
    }
    
    private static Addressable constructNewWithMnemonic(@NotNull java.lang.String label) {
        java.util.Objects.requireNonNull(label, "Parameter 'label' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_button_new_with_mnemonic.invokeExact(
                    Interop.allocateNativeString(label));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
    public static Button newWithMnemonic(@NotNull java.lang.String label) {
        return new Button(constructNewWithMnemonic(label), Ownership.NONE);
    }
    
    /**
     * Gets the child widget of {@code button}.
     * @return the child widget of {@code button}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_button_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether the button has a frame.
     * @return {@code true} if the button has a frame
     */
    public boolean getHasFrame() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_button_get_has_frame.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_button_get_icon_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_button_get_label.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
            RESULT = (int) DowncallHandles.gtk_button_get_use_underline.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
                    hasFrame ? 1 : 0);
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
    public void setIconName(@NotNull java.lang.String iconName) {
        java.util.Objects.requireNonNull(iconName, "Parameter 'iconName' must not be null");
        try {
            DowncallHandles.gtk_button_set_icon_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(iconName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the text of the label of the button to {@code label}.
     * <p>
     * This will also clear any previously set labels.
     * @param label a string
     */
    public void setLabel(@NotNull java.lang.String label) {
        java.util.Objects.requireNonNull(label, "Parameter 'label' must not be null");
        try {
            DowncallHandles.gtk_button_set_label.invokeExact(
                    handle(),
                    Interop.allocateNativeString(label));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
                    useUnderline ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Activate {
        void signalReceived(Button source);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Button.Callbacks.class, "signalButtonActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Button.Activate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Clicked {
        void signalReceived(Button source);
    }
    
    /**
     * Emitted when the button has been activated (pressed and released).
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Button.Clicked> onClicked(Button.Clicked handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("clicked"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Button.Callbacks.class, "signalButtonClicked",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Button.Clicked>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_button_new = Interop.downcallHandle(
            "gtk_button_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_button_new_from_icon_name = Interop.downcallHandle(
            "gtk_button_new_from_icon_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_button_new_with_label = Interop.downcallHandle(
            "gtk_button_new_with_label",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_button_new_with_mnemonic = Interop.downcallHandle(
            "gtk_button_new_with_mnemonic",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_button_get_child = Interop.downcallHandle(
            "gtk_button_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_button_get_has_frame = Interop.downcallHandle(
            "gtk_button_get_has_frame",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_button_get_icon_name = Interop.downcallHandle(
            "gtk_button_get_icon_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_button_get_label = Interop.downcallHandle(
            "gtk_button_get_label",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_button_get_use_underline = Interop.downcallHandle(
            "gtk_button_get_use_underline",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_button_set_child = Interop.downcallHandle(
            "gtk_button_set_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_button_set_has_frame = Interop.downcallHandle(
            "gtk_button_set_has_frame",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_button_set_icon_name = Interop.downcallHandle(
            "gtk_button_set_icon_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_button_set_label = Interop.downcallHandle(
            "gtk_button_set_label",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_button_set_use_underline = Interop.downcallHandle(
            "gtk_button_set_use_underline",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalButtonActivate(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Button.Activate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Button(source, Ownership.UNKNOWN));
        }
        
        public static void signalButtonClicked(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Button.Clicked) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Button(source, Ownership.UNKNOWN));
        }
    }
}
