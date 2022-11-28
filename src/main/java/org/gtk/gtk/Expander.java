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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Expander proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Expander(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Expander if its GType is a (or inherits from) "GtkExpander".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Expander} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkExpander", a ClassCastException will be thrown.
     */
    public static Expander castFrom(org.gtk.gobject.Object gobject) {
            return new Expander(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@Nullable java.lang.String label) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_expander_new.invokeExact(
                    (Addressable) (label == null ? MemoryAddress.NULL : Interop.allocateNativeString(label)));
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
        super(constructNew(label), Ownership.NONE);
    }
    
    private static Addressable constructNewWithMnemonic(@Nullable java.lang.String label) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_expander_new_with_mnemonic.invokeExact(
                    (Addressable) (label == null ? MemoryAddress.NULL : Interop.allocateNativeString(label)));
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
        return new Expander(constructNewWithMnemonic(label), Ownership.NONE);
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
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
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
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_expander_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Activate {
        void signalReceived(Expander source);
    }
    
    /**
     * Activates the {@code GtkExpander}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Expander.Activate> onActivate(Expander.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Expander.Callbacks.class, "signalExpanderActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Expander.Activate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link Expander.Build} object constructs a {@link Expander} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Expander} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Expander} using {@link Expander#castFrom}.
         * @return A new instance of {@code Expander} with the properties 
         *         that were set in the Build object.
         */
        public Expander construct() {
            return Expander.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Expander.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The child widget.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * Whether the expander has been opened to reveal the child.
         * @param expanded The value for the {@code expanded} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setExpanded(boolean expanded) {
            names.add("expanded");
            values.add(org.gtk.gobject.Value.create(expanded));
            return this;
        }
        
        /**
         * The text of the expanders label.
         * @param label The value for the {@code label} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLabel(java.lang.String label) {
            names.add("label");
            values.add(org.gtk.gobject.Value.create(label));
            return this;
        }
        
        /**
         * A widget to display instead of the usual expander label.
         * @param labelWidget The value for the {@code label-widget} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLabelWidget(org.gtk.gtk.Widget labelWidget) {
            names.add("label-widget");
            values.add(org.gtk.gobject.Value.create(labelWidget));
            return this;
        }
        
        /**
         * When this property is {@code true}, the expander will resize the toplevel
         * widget containing the expander upon expanding and collapsing.
         * @param resizeToplevel The value for the {@code resize-toplevel} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setResizeToplevel(boolean resizeToplevel) {
            names.add("resize-toplevel");
            values.add(org.gtk.gobject.Value.create(resizeToplevel));
            return this;
        }
        
        /**
         * Whether the text in the label is Pango markup.
         * @param useMarkup The value for the {@code use-markup} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUseMarkup(boolean useMarkup) {
            names.add("use-markup");
            values.add(org.gtk.gobject.Value.create(useMarkup));
            return this;
        }
        
        /**
         * Whether an underline in the text indicates a mnemonic.
         * @param useUnderline The value for the {@code use-underline} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUseUnderline(boolean useUnderline) {
            names.add("use-underline");
            values.add(org.gtk.gobject.Value.create(useUnderline));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_expander_new = Interop.downcallHandle(
            "gtk_expander_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expander_new_with_mnemonic = Interop.downcallHandle(
            "gtk_expander_new_with_mnemonic",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expander_get_child = Interop.downcallHandle(
            "gtk_expander_get_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expander_get_expanded = Interop.downcallHandle(
            "gtk_expander_get_expanded",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expander_get_label = Interop.downcallHandle(
            "gtk_expander_get_label",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expander_get_label_widget = Interop.downcallHandle(
            "gtk_expander_get_label_widget",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expander_get_resize_toplevel = Interop.downcallHandle(
            "gtk_expander_get_resize_toplevel",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expander_get_use_markup = Interop.downcallHandle(
            "gtk_expander_get_use_markup",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expander_get_use_underline = Interop.downcallHandle(
            "gtk_expander_get_use_underline",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expander_set_child = Interop.downcallHandle(
            "gtk_expander_set_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expander_set_expanded = Interop.downcallHandle(
            "gtk_expander_set_expanded",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_expander_set_label = Interop.downcallHandle(
            "gtk_expander_set_label",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expander_set_label_widget = Interop.downcallHandle(
            "gtk_expander_set_label_widget",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expander_set_resize_toplevel = Interop.downcallHandle(
            "gtk_expander_set_resize_toplevel",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_expander_set_use_markup = Interop.downcallHandle(
            "gtk_expander_set_use_markup",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_expander_set_use_underline = Interop.downcallHandle(
            "gtk_expander_set_use_underline",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_expander_get_type = Interop.downcallHandle(
            "gtk_expander_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalExpanderActivate(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Expander.Activate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Expander(source, Ownership.NONE));
        }
    }
}
