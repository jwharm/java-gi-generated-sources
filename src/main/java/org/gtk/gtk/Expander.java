package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkExpander} allows the user to reveal its child by clicking
 * on an expander triangle.
 * <p>
 * <img src="./doc-files/expander.png" alt="An example GtkExpander">
 * <p>
 * This is similar to the triangles used in a {@code GtkTreeView}.
 * <p>
 * Normally you use an expander as you would use a frame; you create
 * the child widget and use {@link Expander#setChild} to add it
 * to the expander. When the expander is toggled, it will take care of
 * showing and hiding the child automatically.
 * <p>
 * <strong>Special Usage</strong><br/>
 * There are situations in which you may prefer to show and hide the
 * expanded widget yourself, such as when you want to actually create
 * the widget at expansion time. In this case, create a {@code GtkExpander}
 * but do not add a child to it. The expander widget has an
 * [property{@code Gtk}.Expander:expanded[ property which can be used to
 * monitor its expansion state. You should watch this property with
 * a signal connection as follows:
 * <pre>{@code c
 * static void
 * expander_callback (GObject    *object,
 *                    GParamSpec *param_spec,
 *                    gpointer    user_data)
 * {
 *   GtkExpander *expander;
 * 
 *   expander = GTK_EXPANDER (object);
 * 
 *   if (gtk_expander_get_expanded (expander))
 *     {
 *       // Show or create widgets
 *     }
 *   else
 *     {
 *       // Hide or destroy widgets
 *     }
 * }
 * 
 * static void
 * create_expander (void)
 * {
 *   GtkWidget *expander = gtk_expander_new_with_mnemonic ("_More Options");
 *   g_signal_connect (expander, "notify::expanded",
 *                     G_CALLBACK (expander_callback), NULL);
 * 
 *   // ...
 * }
 * }</pre>
 * <p>
 * <strong>GtkExpander as GtkBuildable</strong><br/>
 * The {@code GtkExpander} implementation of the {@code GtkBuildable} interface supports
 * placing a child in the label position by specifying “label” as the
 * “type” attribute of a &lt;child&gt; element. A normal content child can be
 * specified without specifying a &lt;child&gt; type attribute.
 * <p>
 * An example of a UI definition fragment with GtkExpander:
 * <pre>{@code xml
 * <object class="GtkExpander">
 *   <child type="label">
 *     <object class="GtkLabel" id="expander-label"/>
 *   </child>
 *   <child>
 *     <object class="GtkEntry" id="expander-content"/>
 *   </child>
 * </object>
 * }</pre>
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * expander
 * ╰── box
 *     ├── title
 *     │   ├── arrow
 *     │   ╰── <label widget>
 *     ╰── <child>
 * }</pre>
 * <p>
 * {@code GtkExpander} has three CSS nodes, the main node with the name expander,
 * a subnode with name title and node below it with name arrow. The arrow of an
 * expander that is showing its child gets the :checked pseudoclass added to it.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkExpander} uses the {@link AccessibleRole#BUTTON} role.
 */
public class Expander extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkExpander";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public Expander(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to Expander if its GType is a (or inherits from) "GtkExpander".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Expander" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkExpander", a ClassCastException will be thrown.
     */
    public static Expander castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkExpander"))) {
            return new Expander(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkExpander");
        }
    }
    
    private static Refcounted constructNew(@Nullable java.lang.String label) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_expander_new.invokeExact(
                    (Addressable) (label == null ? MemoryAddress.NULL : Interop.allocateNativeString(label))), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new expander using {@code label} as the text of the label.
     * @param label the text of the label
     */
    public Expander(@Nullable java.lang.String label) {
        super(constructNew(label));
    }
    
    private static Refcounted constructNewWithMnemonic(@Nullable java.lang.String label) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_expander_new_with_mnemonic.invokeExact(
                    (Addressable) (label == null ? MemoryAddress.NULL : Interop.allocateNativeString(label))), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new expander using {@code label} as the text of the label.
     * <p>
     * If characters in {@code label} are preceded by an underscore, they are
     * underlined. If you need a literal underscore character in a label,
     * use “__” (two underscores). The first underlined character represents
     * a keyboard accelerator called a mnemonic.
     * <p>
     * Pressing Alt and that key activates the button.
     * @param label the text of the label with an underscore
     *   in front of the mnemonic character
     * @return a new {@code GtkExpander} widget.
     */
    public static Expander newWithMnemonic(@Nullable java.lang.String label) {
        return new Expander(constructNewWithMnemonic(label));
    }
    
    /**
     * Gets the child widget of {@code expander}.
     * @return the child widget of {@code expander}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_expander_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Queries a {@code GtkExpander} and returns its current state.
     * <p>
     * Returns {@code true} if the child widget is revealed.
     * @return the current state of the expander
     */
    public boolean getExpanded() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_expander_get_expanded.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Fetches the text from a label widget.
     * <p>
     * This is including any embedded underlines indicating mnemonics and
     * Pango markup, as set by {@link Expander#setLabel}. If the label
     * text has not been set the return value will be {@code null}. This will be the
     * case if you create an empty button with gtk_button_new() to use as a
     * container.
     * @return The text of the label widget. This string is owned
     *   by the widget and must not be modified or freed.
     */
    public @Nullable java.lang.String getLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_expander_get_label.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieves the label widget for the frame.
     * @return the label widget
     */
    public @Nullable org.gtk.gtk.Widget getLabelWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_expander_get_label_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns whether the expander will resize the toplevel widget
     * containing the expander upon resizing and collpasing.
     * @return the “resize toplevel” setting.
     */
    public boolean getResizeToplevel() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_expander_get_resize_toplevel.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the label’s text is interpreted as Pango markup.
     * @return {@code true} if the label’s text will be parsed for markup
     */
    public boolean getUseMarkup() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_expander_get_use_markup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether an underline in the text indicates a mnemonic.
     * @return {@code true} if an embedded underline in the expander
     *   label indicates the mnemonic accelerator keys
     */
    public boolean getUseUnderline() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_expander_get_use_underline.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the child widget of {@code expander}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_expander_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the state of the expander.
     * <p>
     * Set to {@code true}, if you want the child widget to be revealed,
     * and {@code false} if you want the child widget to be hidden.
     * @param expanded whether the child widget is revealed
     */
    public void setExpanded(boolean expanded) {
        try {
            DowncallHandles.gtk_expander_set_expanded.invokeExact(
                    handle(),
                    expanded ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the text of the label of the expander to {@code label}.
     * <p>
     * This will also clear any previously set labels.
     * @param label a string
     */
    public void setLabel(@Nullable java.lang.String label) {
        try {
            DowncallHandles.gtk_expander_set_label.invokeExact(
                    handle(),
                    (Addressable) (label == null ? MemoryAddress.NULL : Interop.allocateNativeString(label)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the label widget for the expander.
     * <p>
     * This is the widget that will appear embedded alongside
     * the expander arrow.
     * @param labelWidget the new label widget
     */
    public void setLabelWidget(@Nullable org.gtk.gtk.Widget labelWidget) {
        try {
            DowncallHandles.gtk_expander_set_label_widget.invokeExact(
                    handle(),
                    (Addressable) (labelWidget == null ? MemoryAddress.NULL : labelWidget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the expander will resize the toplevel widget
     * containing the expander upon resizing and collpasing.
     * @param resizeToplevel whether to resize the toplevel
     */
    public void setResizeToplevel(boolean resizeToplevel) {
        try {
            DowncallHandles.gtk_expander_set_resize_toplevel.invokeExact(
                    handle(),
                    resizeToplevel ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the text of the label contains Pango markup.
     * @param useMarkup {@code true} if the label’s text should be parsed for markup
     */
    public void setUseMarkup(boolean useMarkup) {
        try {
            DowncallHandles.gtk_expander_set_use_markup.invokeExact(
                    handle(),
                    useMarkup ? 1 : 0);
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
            DowncallHandles.gtk_expander_set_use_underline.invokeExact(
                    handle(),
                    useUnderline ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Activate {
        void signalReceived(Expander source);
    }
    
    /**
     * Activates the {@code GtkExpander}.
     */
    public Signal<Expander.Activate> onActivate(Expander.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Expander.Callbacks.class, "signalExpanderActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Expander.Activate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_expander_new = Interop.downcallHandle(
            "gtk_expander_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_expander_new_with_mnemonic = Interop.downcallHandle(
            "gtk_expander_new_with_mnemonic",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_expander_get_child = Interop.downcallHandle(
            "gtk_expander_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_expander_get_expanded = Interop.downcallHandle(
            "gtk_expander_get_expanded",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_expander_get_label = Interop.downcallHandle(
            "gtk_expander_get_label",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_expander_get_label_widget = Interop.downcallHandle(
            "gtk_expander_get_label_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_expander_get_resize_toplevel = Interop.downcallHandle(
            "gtk_expander_get_resize_toplevel",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_expander_get_use_markup = Interop.downcallHandle(
            "gtk_expander_get_use_markup",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_expander_get_use_underline = Interop.downcallHandle(
            "gtk_expander_get_use_underline",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_expander_set_child = Interop.downcallHandle(
            "gtk_expander_set_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_expander_set_expanded = Interop.downcallHandle(
            "gtk_expander_set_expanded",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_expander_set_label = Interop.downcallHandle(
            "gtk_expander_set_label",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_expander_set_label_widget = Interop.downcallHandle(
            "gtk_expander_set_label_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_expander_set_resize_toplevel = Interop.downcallHandle(
            "gtk_expander_set_resize_toplevel",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_expander_set_use_markup = Interop.downcallHandle(
            "gtk_expander_set_use_markup",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_expander_set_use_underline = Interop.downcallHandle(
            "gtk_expander_set_use_underline",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    private static class Callbacks {
        
        public static void signalExpanderActivate(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Expander.Activate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Expander(Refcounted.get(source)));
        }
    }
}
