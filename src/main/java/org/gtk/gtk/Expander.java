package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <h1>Special Usage</h1>
 * <p>
 * There are situations in which you may prefer to show and hide the
 * expanded widget yourself, such as when you want to actually create
 * the widget at expansion time. In this case, create a {@code GtkExpander}
 * but do not add a child to it. The expander widget has an
 * [property{@code Gtk}.Expander:expanded[ property which can be used to
 * monitor its expansion state. You should watch this property with
 * a signal connection as follows:
 * <p>
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
 * <h1>GtkExpander as GtkBuildable</h1>
 * <p>
 * The {@code GtkExpander} implementation of the {@code GtkBuildable} interface supports
 * placing a child in the label position by specifying “label” as the
 * “type” attribute of a &lt;child&gt; element. A normal content child can be
 * specified without specifying a &lt;child&gt; type attribute.
 * <p>
 * An example of a UI definition fragment with GtkExpander:
 * <p>
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
 * <h1>CSS nodes</h1>
 * <p>
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
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkExpander} uses the {@link AccessibleRole#BUTTON} role.
 */
public class Expander extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Expander(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Expander */
    public static Expander castFrom(org.gtk.gobject.Object gobject) {
        return new Expander(gobject.refcounted());
    }
    
    static final MethodHandle gtk_expander_new = Interop.downcallHandle(
        "gtk_expander_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(java.lang.String label) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_expander_new.invokeExact(Interop.allocateNativeString(label).handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new expander using {@code label} as the text of the label.
     */
    public Expander(java.lang.String label) {
        super(constructNew(label));
    }
    
    static final MethodHandle gtk_expander_new_with_mnemonic = Interop.downcallHandle(
        "gtk_expander_new_with_mnemonic",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithMnemonic(java.lang.String label) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_expander_new_with_mnemonic.invokeExact(Interop.allocateNativeString(label).handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public static Expander newWithMnemonic(java.lang.String label) {
        return new Expander(constructNewWithMnemonic(label));
    }
    
    static final MethodHandle gtk_expander_get_child = Interop.downcallHandle(
        "gtk_expander_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget of {@code expander}.
     */
    public Widget getChild() {
        try {
            var RESULT = (MemoryAddress) gtk_expander_get_child.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_expander_get_expanded = Interop.downcallHandle(
        "gtk_expander_get_expanded",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries a {@code GtkExpander} and returns its current state.
     * <p>
     * Returns {@code true} if the child widget is revealed.
     */
    public boolean getExpanded() {
        try {
            var RESULT = (int) gtk_expander_get_expanded.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_expander_get_label = Interop.downcallHandle(
        "gtk_expander_get_label",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the text from a label widget.
     * <p>
     * This is including any embedded underlines indicating mnemonics and
     * Pango markup, as set by {@link Expander#setLabel}. If the label
     * text has not been set the return value will be {@code null}. This will be the
     * case if you create an empty button with gtk_button_new() to use as a
     * container.
     */
    public java.lang.String getLabel() {
        try {
            var RESULT = (MemoryAddress) gtk_expander_get_label.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_expander_get_label_widget = Interop.downcallHandle(
        "gtk_expander_get_label_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the label widget for the frame.
     */
    public Widget getLabelWidget() {
        try {
            var RESULT = (MemoryAddress) gtk_expander_get_label_widget.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_expander_get_resize_toplevel = Interop.downcallHandle(
        "gtk_expander_get_resize_toplevel",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the expander will resize the toplevel widget
     * containing the expander upon resizing and collpasing.
     */
    public boolean getResizeToplevel() {
        try {
            var RESULT = (int) gtk_expander_get_resize_toplevel.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_expander_get_use_markup = Interop.downcallHandle(
        "gtk_expander_get_use_markup",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the label’s text is interpreted as Pango markup.
     */
    public boolean getUseMarkup() {
        try {
            var RESULT = (int) gtk_expander_get_use_markup.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_expander_get_use_underline = Interop.downcallHandle(
        "gtk_expander_get_use_underline",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether an underline in the text indicates a mnemonic.
     */
    public boolean getUseUnderline() {
        try {
            var RESULT = (int) gtk_expander_get_use_underline.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_expander_set_child = Interop.downcallHandle(
        "gtk_expander_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget of {@code expander}.
     */
    public void setChild(Widget child) {
        try {
            gtk_expander_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_expander_set_expanded = Interop.downcallHandle(
        "gtk_expander_set_expanded",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the state of the expander.
     * <p>
     * Set to {@code true}, if you want the child widget to be revealed,
     * and {@code false} if you want the child widget to be hidden.
     */
    public void setExpanded(boolean expanded) {
        try {
            gtk_expander_set_expanded.invokeExact(handle(), expanded ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_expander_set_label = Interop.downcallHandle(
        "gtk_expander_set_label",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the text of the label of the expander to {@code label}.
     * <p>
     * This will also clear any previously set labels.
     */
    public void setLabel(java.lang.String label) {
        try {
            gtk_expander_set_label.invokeExact(handle(), Interop.allocateNativeString(label).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_expander_set_label_widget = Interop.downcallHandle(
        "gtk_expander_set_label_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the label widget for the expander.
     * <p>
     * This is the widget that will appear embedded alongside
     * the expander arrow.
     */
    public void setLabelWidget(Widget labelWidget) {
        try {
            gtk_expander_set_label_widget.invokeExact(handle(), labelWidget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_expander_set_resize_toplevel = Interop.downcallHandle(
        "gtk_expander_set_resize_toplevel",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the expander will resize the toplevel widget
     * containing the expander upon resizing and collpasing.
     */
    public void setResizeToplevel(boolean resizeToplevel) {
        try {
            gtk_expander_set_resize_toplevel.invokeExact(handle(), resizeToplevel ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_expander_set_use_markup = Interop.downcallHandle(
        "gtk_expander_set_use_markup",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the text of the label contains Pango markup.
     */
    public void setUseMarkup(boolean useMarkup) {
        try {
            gtk_expander_set_use_markup.invokeExact(handle(), useMarkup ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_expander_set_use_underline = Interop.downcallHandle(
        "gtk_expander_set_use_underline",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If true, an underline in the text indicates a mnemonic.
     */
    public void setUseUnderline(boolean useUnderline) {
        try {
            gtk_expander_set_use_underline.invokeExact(handle(), useUnderline ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(Expander source);
    }
    
    /**
     * Activates the {@code GtkExpander}.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Expander.Callbacks.class, "signalExpanderActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalExpanderActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Expander.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Expander(Refcounted.get(source)));
        }
        
    }
}
