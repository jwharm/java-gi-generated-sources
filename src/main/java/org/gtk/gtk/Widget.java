package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The base class for all widgets.
 * <p>
 * {@code GtkWidget} is the base class all widgets in GTK derive from. It manages the
 * widget lifecycle, layout, states and style.
 * <p>
 * <strong>Height-for-width Geometry Management</strong><br/>
 * GTK uses a height-for-width (and width-for-height) geometry management
 * system. Height-for-width means that a widget can change how much
 * vertical space it needs, depending on the amount of horizontal space
 * that it is given (and similar for width-for-height). The most common
 * example is a label that reflows to fill up the available width, wraps
 * to fewer lines, and therefore needs less height.
 * <p>
 * Height-for-width geometry management is implemented in GTK by way
 * of two virtual methods:
 * <ul>
 * <li>{@link Widget#getRequestMode}
 * <li>{@link Widget#measure}
 * </ul>
 * <p>
 * There are some important things to keep in mind when implementing
 * height-for-width and when using it in widget implementations.
 * <p>
 * If you implement a direct {@code GtkWidget} subclass that supports
 * height-for-width or width-for-height geometry management for itself
 * or its child widgets, the {@link Widget#getRequestMode} virtual
 * function must be implemented as well and return the widget's preferred
 * request mode. The default implementation of this virtual function
 * returns {@link SizeRequestMode#CONSTANT_SIZE}, which means that the widget will
 * only ever get -1 passed as the for_size value to its
 * {@link Widget#measure} implementation.
 * <p>
 * The geometry management system will query a widget hierarchy in
 * only one orientation at a time. When widgets are initially queried
 * for their minimum sizes it is generally done in two initial passes
 * in the {@code Gtk.SizeRequestMode} chosen by the toplevel.
 * <p>
 * For example, when queried in the normal {@link SizeRequestMode#HEIGHT_FOR_WIDTH} mode:
 * <p>
 * First, the default minimum and natural width for each widget
 * in the interface will be computed using {@link Widget#measure} with an
 * orientation of {@link Orientation#HORIZONTAL} and a for_size of -1.
 * Because the preferred widths for each widget depend on the preferred
 * widths of their children, this information propagates up the hierarchy,
 * and finally a minimum and natural width is determined for the entire
 * toplevel. Next, the toplevel will use the minimum width to query for the
 * minimum height contextual to that width using {@link Widget#measure} with an
 * orientation of {@link Orientation#VERTICAL} and a for_size of the just computed
 * width. This will also be a highly recursive operation. The minimum height
 * for the minimum width is normally used to set the minimum size constraint
 * on the toplevel.
 * <p>
 * After the toplevel window has initially requested its size in both
 * dimensions it can go on to allocate itself a reasonable size (or a size
 * previously specified with {@link Window#setDefaultSize}). During the
 * recursive allocation process it’s important to note that request cycles
 * will be recursively executed while widgets allocate their children.
 * Each widget, once allocated a size, will go on to first share the
 * space in one orientation among its children and then request each child's
 * height for its target allocated width or its width for allocated height,
 * depending. In this way a {@code GtkWidget} will typically be requested its size
 * a number of times before actually being allocated a size. The size a
 * widget is finally allocated can of course differ from the size it has
 * requested. For this reason, {@code GtkWidget} caches a  small number of results
 * to avoid re-querying for the same sizes in one allocation cycle.
 * <p>
 * If a widget does move content around to intelligently use up the
 * allocated size then it must support the request in both
 * {@code GtkSizeRequestMode}s even if the widget in question only
 * trades sizes in a single orientation.
 * <p>
 * For instance, a {@link Label} that does height-for-width word wrapping
 * will not expect to have {@link Widget#measure} with an orientation of
 * {@link Orientation#VERTICAL} called because that call is specific to a
 * width-for-height request. In this case the label must return the height
 * required for its own minimum possible width. By following this rule any
 * widget that handles height-for-width or width-for-height requests will
 * always be allocated at least enough space to fit its own content.
 * <p>
 * Here are some examples of how a {@link SizeRequestMode#HEIGHT_FOR_WIDTH} widget
 * generally deals with width-for-height requests:
 * <pre>{@code c
 * static void
 * foo_widget_measure (GtkWidget      *widget,
 *                     GtkOrientation  orientation,
 *                     int             for_size,
 *                     int            *minimum_size,
 *                     int            *natural_size,
 *                     int            *minimum_baseline,
 *                     int            *natural_baseline)
 * {
 *   if (orientation == GTK_ORIENTATION_HORIZONTAL)
 *     {
 *       // Calculate minimum and natural width
 *     }
 *   else // VERTICAL
 *     {
 *       if (i_am_in_height_for_width_mode)
 *         {
 *           int min_width, dummy;
 * 
 *           // First, get the minimum width of our widget
 *           GTK_WIDGET_GET_CLASS (widget)->measure (widget, GTK_ORIENTATION_HORIZONTAL, -1,
 *                                                   &min_width, &dummy, &dummy, &dummy);
 * 
 *           // Now use the minimum width to retrieve the minimum and natural height to display
 *           // that width.
 *           GTK_WIDGET_GET_CLASS (widget)->measure (widget, GTK_ORIENTATION_VERTICAL, min_width,
 *                                                   minimum_size, natural_size, &dummy, &dummy);
 *         }
 *       else
 *         {
 *           // ... some widgets do both.
 *         }
 *     }
 * }
 * }</pre>
 * <p>
 * Often a widget needs to get its own request during size request or
 * allocation. For example, when computing height it may need to also
 * compute width. Or when deciding how to use an allocation, the widget
 * may need to know its natural size. In these cases, the widget should
 * be careful to call its virtual methods directly, like in the code
 * example above.
 * <p>
 * It will not work to use the wrapper function {@link Widget#measure}
 * inside your own {@link Widget#sizeAllocate} implementation.
 * These return a request adjusted by {@link SizeGroup}, the widget's
 * align and expand flags, as well as its CSS style.
 * <p>
 * If a widget used the wrappers inside its virtual method implementations,
 * then the adjustments (such as widget margins) would be applied
 * twice. GTK therefore does not allow this and will warn if you try
 * to do it.
 * <p>
 * Of course if you are getting the size request for another widget, such
 * as a child widget, you must use {@link Widget#measure}; otherwise, you
 * would not properly consider widget margins, {@link SizeGroup}, and
 * so forth.
 * <p>
 * GTK also supports baseline vertical alignment of widgets. This
 * means that widgets are positioned such that the typographical baseline of
 * widgets in the same row are aligned. This happens if a widget supports
 * baselines, has a vertical alignment of {@link Align#BASELINE}, and is inside
 * a widget that supports baselines and has a natural “row” that it aligns to
 * the baseline, or a baseline assigned to it by the grandparent.
 * <p>
 * Baseline alignment support for a widget is also done by the
 * {@link Widget#measure} virtual function. It allows you to report
 * both a minimum and natural size.
 * <p>
 * If a widget ends up baseline aligned it will be allocated all the space in
 * the parent as if it was {@link Align#FILL}, but the selected baseline can be
 * found via {@link Widget#getAllocatedBaseline}. If the baseline has a
 * value other than -1 you need to align the widget such that the baseline
 * appears at the position.
 * <p>
 * <strong>GtkWidget as GtkBuildable</strong><br/>
 * The {@code GtkWidget} implementation of the {@code GtkBuildable} interface
 * supports various custom elements to specify additional aspects of widgets
 * that are not directly expressed as properties.
 * <p>
 * If the widget uses a {@link LayoutManager}, {@code GtkWidget} supports
 * a custom {@code <layout>} element, used to define layout properties:
 * <pre>{@code xml
 * <object class="GtkGrid" id="my_grid">
 *   <child>
 *     <object class="GtkLabel" id="label1">
 *       <property name="label">Description</property>
 *       <layout>
 *         <property name="column">0</property>
 *         <property name="row">0</property>
 *         <property name="row-span">1</property>
 *         <property name="column-span">1</property>
 *       </layout>
 *     </object>
 *   </child>
 *   <child>
 *     <object class="GtkEntry" id="description_entry">
 *       <layout>
 *         <property name="column">1</property>
 *         <property name="row">0</property>
 *         <property name="row-span">1</property>
 *         <property name="column-span">1</property>
 *       </layout>
 *     </object>
 *   </child>
 * </object>
 * }</pre>
 * <p>
 * {@code GtkWidget} allows style information such as style classes to
 * be associated with widgets, using the custom {@code <style>} element:
 * <pre>{@code xml
 * <object class="GtkButton" id="button1">
 *   <style>
 *     <class name="my-special-button-class"/>
 *     <class name="dark-button"/>
 *   </style>
 * </object>
 * }</pre>
 * <p>
 * {@code GtkWidget} allows defining accessibility information, such as properties,
 * relations, and states, using the custom {@code <accessibility>} element:
 * <pre>{@code xml
 * <object class="GtkButton" id="button1">
 *   <accessibility>
 *     <property name="label">Download</property>
 *     <relation name="labelled-by">label1</relation>
 *   </accessibility>
 * </object>
 * }</pre>
 * <p>
 * <strong>Building composite widgets from template XML</strong><br/>
 * {@code GtkWidget }exposes some facilities to automate the procedure
 * of creating composite widgets using "templates".
 * <p>
 * To create composite widgets with {@code GtkBuilder} XML, one must associate
 * the interface description with the widget class at class initialization
 * time using {@link WidgetClass#setTemplate}.
 * <p>
 * The interface description semantics expected in composite template descriptions
 * is slightly different from regular {@link GtkBuilder} XML.
 * <p>
 * Unlike regular interface descriptions, {@link WidgetClass#setTemplate} will
 * expect a {@code <template>} tag as a direct child of the toplevel {@code <interface>}
 * tag. The {@code <template>} tag must specify the “class” attribute which must be
 * the type name of the widget. Optionally, the “parent” attribute may be
 * specified to specify the direct parent type of the widget type, this is
 * ignored by {@code GtkBuilder} but required for UI design tools like
 * <a href="https://glade.gnome.org/">Glade</a> to introspect what kind of properties and
 * internal children exist for a given type when the actual type does not exist.
 * <p>
 * The XML which is contained inside the {@code <template>} tag behaves as if it were
 * added to the {@code <object>} tag defining the widget itself. You may set properties
 * on a widget by inserting {@code <property>} tags into the {@code <template>} tag, and also
 * add {@code <child>} tags to add children and extend a widget in the normal way you
 * would with {@code <object>} tags.
 * <p>
 * Additionally, {@code <object>} tags can also be added before and after the initial
 * {@code <template>} tag in the normal way, allowing one to define auxiliary objects
 * which might be referenced by other widgets declared as children of the
 * {@code <template>} tag.
 * <p>
 * An example of a template definition:
 * <pre>{@code xml
 * <interface>
 *   <template class="FooWidget" parent="GtkBox">
 *     <property name="orientation">horizontal</property>
 *     <property name="spacing">4</property>
 *     <child>
 *       <object class="GtkButton" id="hello_button">
 *         <property name="label">Hello World</property>
 *         <signal name="clicked" handler="hello_button_clicked" object="FooWidget" swapped="yes"/>
 *       </object>
 *     </child>
 *     <child>
 *       <object class="GtkButton" id="goodbye_button">
 *         <property name="label">Goodbye World</property>
 *       </object>
 *     </child>
 *   </template>
 * </interface>
 * }</pre>
 * <p>
 * Typically, you'll place the template fragment into a file that is
 * bundled with your project, using {@code GResource}. In order to load the
 * template, you need to call {@link WidgetClass#setTemplateFromResource}
 * from the class initialization of your {@code GtkWidget} type:
 * <pre>{@code c
 * static void
 * foo_widget_class_init (FooWidgetClass *klass)
 * {
 *   // ...
 * 
 *   gtk_widget_class_set_template_from_resource (GTK_WIDGET_CLASS (klass),
 *                                                "/com/example/ui/foowidget.ui");
 * }
 * }</pre>
 * <p>
 * You will also need to call {@link Widget#initTemplate} from the
 * instance initialization function:
 * <pre>{@code c
 * static void
 * foo_widget_init (FooWidget *self)
 * {
 *   gtk_widget_init_template (GTK_WIDGET (self));
 * 
 *   // Initialize the rest of the widget...
 * }
 * }</pre>
 * <p>
 * as well as calling {@link Widget#disposeTemplate} from the dispose
 * function:
 * <pre>{@code c
 * static void
 * foo_widget_dispose (GObject *gobject)
 * {
 *   FooWidget *self = FOO_WIDGET (gobject);
 * 
 *   // Dispose objects for which you have a reference...
 * 
 *   // Clear the template children for this widget type
 *   gtk_widget_dispose_template (GTK_WIDGET (self), FOO_TYPE_WIDGET);
 * 
 *   G_OBJECT_CLASS (foo_widget_parent_class)->dispose (gobject);
 * }
 * }</pre>
 * <p>
 * You can access widgets defined in the template using the
 * {@link Widget#getTemplateChild} function, but you will typically declare
 * a pointer in the instance private data structure of your type using the same
 * name as the widget in the template definition, and call
 * {@link WidgetClass#bindTemplateChildFull} (or one of its wrapper macros
 * {@code widget_class_bind_template_child#] and [func@Gtk.widgetClassBindTemplateChildPrivate})
 * with that name, e.g.
 * <pre>{@code c
 * typedef struct {
 *   GtkWidget *hello_button;
 *   GtkWidget *goodbye_button;
 * } FooWidgetPrivate;
 * 
 * G_DEFINE_TYPE_WITH_PRIVATE (FooWidget, foo_widget, GTK_TYPE_BOX)
 * 
 * static void
 * foo_widget_dispose (GObject *gobject)
 * {
 *   gtk_widget_dispose_template (GTK_WIDGET (gobject), FOO_TYPE_WIDGET);
 * 
 *   G_OBJECT_CLASS (foo_widget_parent_class)->dispose (gobject);
 * }
 * 
 * static void
 * foo_widget_class_init (FooWidgetClass *klass)
 * {
 *   // ...
 *   G_OBJECT_CLASS (klass)->dispose = foo_widget_dispose;
 * 
 *   gtk_widget_class_set_template_from_resource (GTK_WIDGET_CLASS (klass),
 *                                                "/com/example/ui/foowidget.ui");
 *   gtk_widget_class_bind_template_child_private (GTK_WIDGET_CLASS (klass),
 *                                                 FooWidget, hello_button);
 *   gtk_widget_class_bind_template_child_private (GTK_WIDGET_CLASS (klass),
 *                                                 FooWidget, goodbye_button);
 * }
 * 
 * static void
 * foo_widget_init (FooWidget *widget)
 * {
 *   gtk_widget_init_template (GTK_WIDGET (widget));
 * }
 * }</pre>
 * <p>
 * You can also use {@link WidgetClass#bindTemplateCallbackFull} (or
 * is wrapper macro {@code Gtk#widgetClassBindTemplateCallback}) to connect
 * a signal callback defined in the template with a function visible in the
 * scope of the class, e.g.
 * <pre>{@code c
 * // the signal handler has the instance and user data swapped
 * // because of the swapped="yes" attribute in the template XML
 * static void
 * hello_button_clicked (FooWidget *self,
 *                       GtkButton *button)
 * {
 *   g_print ("Hello, world!\\n");
 * }
 * 
 * static void
 * foo_widget_class_init (FooWidgetClass *klass)
 * {
 *   // ...
 *   gtk_widget_class_set_template_from_resource (GTK_WIDGET_CLASS (klass),
 *                                                "/com/example/ui/foowidget.ui");
 *   gtk_widget_class_bind_template_callback (GTK_WIDGET_CLASS (klass), hello_button_clicked);
 * }
 * }</pre>
 */
public class Widget extends org.gtk.gobject.InitiallyUnowned implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkWidget";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.InitiallyUnowned.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Widget proxy instance for the provided memory address.
     * <p>
     * Because Widget is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Widget(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Widget> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Widget(input, ownership);
    
    /**
     * Enable or disable an action installed with
     * gtk_widget_class_install_action().
     * @param actionName action name, such as "clipboard.paste"
     * @param enabled whether the action is now enabled
     */
    public void actionSetEnabled(java.lang.String actionName, boolean enabled) {
        try {
            DowncallHandles.gtk_widget_action_set_enabled.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(actionName, null),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * For widgets that can be “activated” (buttons, menu items, etc.),
     * this function activates them.
     * <p>
     * The activation will emit the signal set using
     * {@link WidgetClass#setActivateSignal} during class initialization.
     * <p>
     * Activation is what happens when you press &lt;kbd&gt;Enter&lt;/kbd&gt;
     * on a widget during key navigation.
     * <p>
     * If you wish to handle the activation keybinding yourself, it is
     * recommended to use {@link WidgetClass#addShortcut} with an action
     * created with {@link SignalAction#SignalAction}.
     * <p>
     * If {@code widget} isn't activatable, the function returns {@code false}.
     * @return {@code true} if the widget was activatable
     */
    public boolean activate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_activate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Looks up the action in the action groups associated with
     * {@code widget} and its ancestors, and activates it.
     * <p>
     * If the action is in an action group added with
     * {@link Widget#insertActionGroup}, the {@code name} is expected
     * to be prefixed with the prefix that was used when the group was
     * inserted.
     * <p>
     * The arguments must match the actions expected parameter type,
     * as returned by {@code g_action_get_parameter_type()}.
     * @param name the name of the action to activate
     * @param args parameters to use
     */
    public void activateAction(java.lang.String name, @Nullable org.gtk.glib.Variant args) {
        try {
            DowncallHandles.gtk_widget_activate_action_variant.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null),
                    (Addressable) (args == null ? MemoryAddress.NULL : args.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Activates the {@code default.activate} action from {@code widget}.
     */
    public void activateDefault() {
        try {
            DowncallHandles.gtk_widget_activate_default.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code controller} to {@code widget} so that it will receive events.
     * <p>
     * You will usually want to call this function right after
     * creating any kind of {@link EventController}.
     * @param controller a {@code GtkEventController} that hasn't been
     *   added to a widget yet
     */
    public void addController(org.gtk.gtk.EventController controller) {
        try {
            DowncallHandles.gtk_widget_add_controller.invokeExact(
                    handle(),
                    controller.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        controller.yieldOwnership();
    }
    
    /**
     * Adds a style class to {@code widget}.
     * <p>
     * After calling this function, the widgets style will match
     * for {@code css_class}, according to CSS matching rules.
     * <p>
     * Use {@link Widget#removeCssClass} to remove the
     * style again.
     * @param cssClass The style class to add to {@code widget}, without
     *   the leading '.' used for notation of style classes
     */
    public void addCssClass(java.lang.String cssClass) {
        try {
            DowncallHandles.gtk_widget_add_css_class.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(cssClass, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a widget to the list of mnemonic labels for this widget.
     * <p>
     * See {@link Widget#listMnemonicLabels}. Note the
     * list of mnemonic labels for the widget is cleared when the
     * widget is destroyed, so the caller must make sure to update
     * its internal state at this point as well.
     * @param label a {@code GtkWidget} that acts as a mnemonic label for {@code widget}
     */
    public void addMnemonicLabel(org.gtk.gtk.Widget label) {
        try {
            DowncallHandles.gtk_widget_add_mnemonic_label.invokeExact(
                    handle(),
                    label.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Queues an animation frame update and adds a callback to be called
     * before each frame.
     * <p>
     * Until the tick callback is removed, it will be called frequently
     * (usually at the frame rate of the output device or as quickly as
     * the application can be repainted, whichever is slower). For this
     * reason, is most suitable for handling graphics that change every
     * frame or every few frames. The tick callback does not automatically
     * imply a relayout or repaint. If you want a repaint or relayout, and
     * aren’t changing widget properties that would trigger that (for example,
     * changing the text of a {@code GtkLabel}), then you will have to call
     * {@link Widget#queueResize} or {@link Widget#queueDraw}
     * yourself.
     * <p>
     * {@link org.gtk.gdk.FrameClock#getFrameTime} should generally be used
     * for timing continuous animations and
     * {@link org.gtk.gdk.FrameTimings#getPredictedPresentationTime} if you are
     * trying to display isolated frames at particular times.
     * <p>
     * This is a more convenient alternative to connecting directly to the
     * {@code Gdk.FrameClock::update} signal of {@code GdkFrameClock}, since you
     * don't have to worry about when a {@code GdkFrameClock} is assigned to a widget.
     * @param callback function to call for updating animations
     * @param notify function to call to free {@code user_data} when the callback is removed.
     * @return an id for the connection of this callback. Remove the callback
     *   by passing the id returned from this function to
     *   {@link Widget#removeTickCallback}
     */
    public int addTickCallback(org.gtk.gtk.TickCallback callback, org.gtk.glib.DestroyNotify notify) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_add_tick_callback.invokeExact(
                    handle(),
                    (Addressable) callback.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This function is only used by {@code GtkWidget} subclasses, to
     * assign a size, position and (optionally) baseline to their
     * child widgets.
     * <p>
     * In this function, the allocation and baseline may be adjusted.
     * The given allocation will be forced to be bigger than the
     * widget's minimum size, as well as at least 0×0 in size.
     * <p>
     * For a version that does not take a transform, see
     * {@link Widget#sizeAllocate}.
     * @param width New width of {@code widget}
     * @param height New height of {@code widget}
     * @param baseline New baseline of {@code widget}, or -1
     * @param transform Transformation to be applied to {@code widget}
     */
    public void allocate(int width, int height, int baseline, @Nullable org.gtk.gsk.Transform transform) {
        try {
            DowncallHandles.gtk_widget_allocate.invokeExact(
                    handle(),
                    width,
                    height,
                    baseline,
                    (Addressable) (transform == null ? MemoryAddress.NULL : transform.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        transform.yieldOwnership();
    }
    
    /**
     * Called by widgets as the user moves around the window using
     * keyboard shortcuts.
     * <p>
     * The {@code direction} argument indicates what kind of motion is taking place (up,
     * down, left, right, tab forward, tab backward).
     * <p>
     * This function calls the {@code Widget#focus} virtual function; widgets
     * can override the virtual function in order to implement appropriate focus
     * behavior.
     * <p>
     * The default {@code focus()} virtual function for a widget should return {@code TRUE} if
     * moving in {@code direction} left the focus on a focusable location inside that
     * widget, and {@code FALSE} if moving in {@code direction} moved the focus outside the
     * widget. When returning {@code TRUE}, widgets normally call {@link Widget#grabFocus}
     * to place the focus accordingly; when returning {@code FALSE}, they don’t modify
     * the current focus location.
     * <p>
     * This function is used by custom widget implementations; if you're
     * writing an app, you’d use {@link Widget#grabFocus} to move
     * the focus to a particular widget.
     * @param direction direction of focus movement
     * @return {@code true} if focus ended up inside {@code widget}
     */
    public boolean childFocus(org.gtk.gtk.DirectionType direction) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_child_focus.invokeExact(
                    handle(),
                    direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Computes the bounds for {@code widget} in the coordinate space of {@code target}.
     * <p>
     * FIXME: Explain what "bounds" are.
     * <p>
     * If the operation is successful, {@code true} is returned. If {@code widget} has no
     * bounds or the bounds cannot be expressed in {@code target}'s coordinate space
     * (for example if both widgets are in different windows), {@code false} is
     * returned and {@code bounds} is set to the zero rectangle.
     * <p>
     * It is valid for {@code widget} and {@code target} to be the same widget.
     * @param target the {@code GtkWidget}
     * @param outBounds the rectangle taking the bounds
     * @return {@code true} if the bounds could be computed
     */
    public boolean computeBounds(org.gtk.gtk.Widget target, org.gtk.graphene.Rect outBounds) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_compute_bounds.invokeExact(
                    handle(),
                    target.handle(),
                    outBounds.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Computes whether a container should give this widget
     * extra space when possible.
     * <p>
     * Containers should check this, rather than looking at
     * {@link Widget#getHexpand} or {@link Widget#getVexpand}.
     * <p>
     * This function already checks whether the widget is visible, so
     * visibility does not need to be checked separately. Non-visible
     * widgets are not expanded.
     * <p>
     * The computed expand value uses either the expand setting explicitly
     * set on the widget itself, or, if none has been explicitly set,
     * the widget may expand if some of its children do.
     * @param orientation expand direction
     * @return whether widget tree rooted here should be expanded
     */
    public boolean computeExpand(org.gtk.gtk.Orientation orientation) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_compute_expand.invokeExact(
                    handle(),
                    orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Translates the given {@code point} in {@code widget}'s coordinates to coordinates
     * relative to {@code target}’s coordinate system.
     * <p>
     * In order to perform this operation, both widgets must share a
     * common ancestor.
     * @param target the {@code GtkWidget} to transform into
     * @param point a point in {@code widget}'s coordinate system
     * @param outPoint Set to the corresponding coordinates in
     *   {@code target}'s coordinate system
     * @return {@code true} if the point could be determined, {@code false} on failure.
     *   In this case, 0 is stored in {@code out_point}.
     */
    public boolean computePoint(org.gtk.gtk.Widget target, org.gtk.graphene.Point point, org.gtk.graphene.Point outPoint) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_compute_point.invokeExact(
                    handle(),
                    target.handle(),
                    point.handle(),
                    outPoint.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Computes a matrix suitable to describe a transformation from
     * {@code widget}'s coordinate system into {@code target}'s coordinate system.
     * <p>
     * The transform can not be computed in certain cases, for example
     * when {@code widget} and {@code target} do not share a common ancestor. In that
     * case {@code out_transform} gets set to the identity matrix.
     * @param target the target widget that the matrix will transform to
     * @param outTransform location to
     *   store the final transformation
     * @return {@code true} if the transform could be computed, {@code false} otherwise
     */
    public boolean computeTransform(org.gtk.gtk.Widget target, org.gtk.graphene.Matrix outTransform) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_compute_transform.invokeExact(
                    handle(),
                    target.handle(),
                    outTransform.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Tests if the point at ({@code x}, {@code y}) is contained in {@code widget}.
     * <p>
     * The coordinates for ({@code x}, {@code y}) must be in widget coordinates, so
     * (0, 0) is assumed to be the top left of {@code widget}'s content area.
     * @param x X coordinate to test, relative to {@code widget}'s origin
     * @param y Y coordinate to test, relative to {@code widget}'s origin
     * @return {@code true} if {@code widget} contains ({@code x}, {@code y}).
     */
    public boolean contains(double x, double y) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_contains.invokeExact(
                    handle(),
                    x,
                    y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Creates a new {@code PangoContext} with the appropriate font map,
     * font options, font description, and base direction for drawing
     * text for this widget.
     * <p>
     * See also {@link Widget#getPangoContext}.
     * @return the new {@code PangoContext}
     */
    public org.pango.Context createPangoContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_create_pango_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.Context) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.pango.Context.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@code PangoLayout} with the appropriate font map,
     * font description, and base direction for drawing text for
     * this widget.
     * <p>
     * If you keep a {@code PangoLayout} created in this way around,
     * you need to re-create it when the widget {@code PangoContext}
     * is replaced. This can be tracked by listening to changes
     * of the {@code Gtk.Widget:root} property on the widget.
     * @param text text to set on the layout
     * @return the new {@code PangoLayout}
     */
    public org.pango.Layout createPangoLayout(@Nullable java.lang.String text) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_create_pango_layout.invokeExact(
                    handle(),
                    (Addressable) (text == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(text, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.Layout) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.pango.Layout.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Clears the template children for the given widget.
     * <p>
     * This function is the opposite of {@link Widget#initTemplate}, and
     * it is used to clear all the template children from a widget instance.
     * If you bound a template child to a field in the instance structure, or
     * in the instance private data structure, the field will be set to {@code NULL}
     * after this function returns.
     * <p>
     * You should call this function inside the {@code GObjectClass.dispose()}
     * implementation of any widget that called {@code gtk_widget_init_template()}.
     * Typically, you will want to call this function last, right before
     * chaining up to the parent type's dispose implementation, e.g.
     * <pre>{@code c
     * static void
     * some_widget_dispose (GObject *gobject)
     * {
     *   SomeWidget *self = SOME_WIDGET (gobject);
     * 
     *   // Clear the template data for SomeWidget
     *   gtk_widget_dispose_template (GTK_WIDGET (self), SOME_TYPE_WIDGET);
     * 
     *   G_OBJECT_CLASS (some_widget_parent_class)->dispose (gobject);
     * }
     * }</pre>
     * @param widgetType the type of the widget to finalize the template for
     */
    public void disposeTemplate(org.gtk.glib.Type widgetType) {
        try {
            DowncallHandles.gtk_widget_dispose_template.invokeExact(
                    handle(),
                    widgetType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks to see if a drag movement has passed the GTK drag threshold.
     * @param startX X coordinate of start of drag
     * @param startY Y coordinate of start of drag
     * @param currentX current X coordinate
     * @param currentY current Y coordinate
     * @return {@code true} if the drag threshold has been passed.
     */
    public boolean dragCheckThreshold(int startX, int startY, int currentX, int currentY) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_drag_check_threshold.invokeExact(
                    handle(),
                    startX,
                    startY,
                    currentX,
                    currentY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Notifies the user about an input-related error on this widget.
     * <p>
     * If the {@code Gtk.Settings:gtk-error-bell} setting is {@code true},
     * it calls {@link org.gtk.gdk.Surface#beep}, otherwise it does nothing.
     * <p>
     * Note that the effect of {@link org.gtk.gdk.Surface#beep} can be configured
     * in many ways, depending on the windowing backend and the desktop
     * environment or window manager that is used.
     */
    public void errorBell() {
        try {
            DowncallHandles.gtk_widget_error_bell.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the baseline that has currently been allocated to {@code widget}.
     * <p>
     * This function is intended to be used when implementing handlers
     * for the {@code GtkWidget}Class.snapshot() function, and when allocating
     * child widgets in {@code GtkWidget}Class.size_allocate().
     * @return the baseline of the {@code widget}, or -1 if none
     */
    public int getAllocatedBaseline() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_allocated_baseline.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the height that has currently been allocated to {@code widget}.
     * @return the height of the {@code widget}
     */
    public int getAllocatedHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_allocated_height.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the width that has currently been allocated to {@code widget}.
     * @return the width of the {@code widget}
     */
    public int getAllocatedWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_allocated_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the widget’s allocation.
     * <p>
     * Note, when implementing a layout container: a widget’s allocation
     * will be its “adjusted” allocation, that is, the widget’s parent
     * typically calls {@link Widget#sizeAllocate} with an allocation,
     * and that allocation is then adjusted (to handle margin
     * and alignment for example) before assignment to the widget.
     * {@link Widget#getAllocation} returns the adjusted allocation that
     * was actually assigned to the widget. The adjusted allocation is
     * guaranteed to be completely contained within the
     * {@link Widget#sizeAllocate} allocation, however.
     * <p>
     * So a layout container is guaranteed that its children stay inside
     * the assigned bounds, but not that they have exactly the bounds the
     * container assigned.
     * @param allocation a pointer to a {@code GtkAllocation} to copy to
     */
    public void getAllocation(Out<org.gtk.gtk.Allocation> allocation) {
        MemorySegment allocationPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gtk_widget_get_allocation.invokeExact(
                    handle(),
                    (Addressable) allocationPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        allocation.set((org.gtk.gtk.Allocation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(allocationPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gtk.gtk.Allocation.fromAddress).marshal(allocationPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
    }
    
    /**
     * Gets the first ancestor of {@code widget} with type {@code widget_type}.
     * <p>
     * For example, {@code gtk_widget_get_ancestor (widget, GTK_TYPE_BOX)}
     * gets the first {@code GtkBox} that’s an ancestor of {@code widget}. No
     * reference will be added to the returned widget; it should
     * not be unreferenced.
     * <p>
     * Note that unlike {@link Widget#isAncestor}, this function
     * considers {@code widget} to be an ancestor of itself.
     * @param widgetType ancestor type
     * @return the ancestor widget
     */
    public @Nullable org.gtk.gtk.Widget getAncestor(org.gtk.glib.Type widgetType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_ancestor.invokeExact(
                    handle(),
                    widgetType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Determines whether the input focus can enter {@code widget} or any
     * of its children.
     * <p>
     * See {@link Widget#setFocusable}.
     * @return {@code true} if the input focus can enter {@code widget}, {@code false} otherwise
     */
    public boolean getCanFocus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_can_focus.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Queries whether {@code widget} can be the target of pointer events.
     * @return {@code true} if {@code widget} can receive pointer events
     */
    public boolean getCanTarget() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_can_target.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the value set with gtk_widget_set_child_visible().
     * <p>
     * If you feel a need to use this function, your code probably
     * needs reorganization.
     * <p>
     * This function is only useful for container implementations
     * and should never be called by an application.
     * @return {@code true} if the widget is mapped with the parent.
     */
    public boolean getChildVisible() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_child_visible.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the clipboard object for {@code widget}.
     * <p>
     * This is a utility function to get the clipboard object for the
     * {@code GdkDisplay} that {@code widget} is using.
     * <p>
     * Note that this function always works, even when {@code widget} is not
     * realized yet.
     * @return the appropriate clipboard object
     */
    public org.gtk.gdk.Clipboard getClipboard() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_clipboard.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Clipboard) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Clipboard.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the list of style classes applied to {@code widget}.
     * @return a {@code null}-terminated list of
     *   css classes currently applied to {@code widget}. The returned
     *   list must freed using g_strfreev().
     */
    public PointerString getCssClasses() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_css_classes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Returns the CSS name that is used for {@code self}.
     * @return the CSS name
     */
    public java.lang.String getCssName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_css_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Queries the cursor set on {@code widget}.
     * <p>
     * See {@link Widget#setCursor} for details.
     * @return the cursor
     *   currently in use or {@code null} if the cursor is inherited
     */
    public @Nullable org.gtk.gdk.Cursor getCursor() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_cursor.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Cursor) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Cursor.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the reading direction for a particular widget.
     * <p>
     * See {@link Widget#setDirection}.
     * @return the reading direction for the widget.
     */
    public org.gtk.gtk.TextDirection getDirection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_direction.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.TextDirection.of(RESULT);
    }
    
    /**
     * Get the {@code GdkDisplay} for the toplevel window associated with
     * this widget.
     * <p>
     * This function can only be called after the widget has been
     * added to a widget hierarchy with a {@code GtkWindow} at the top.
     * <p>
     * In general, you should only create display specific
     * resources when a widget has been realized, and you should
     * free those resources when the widget is unrealized.
     * @return the {@code GdkDisplay} for the toplevel
     *   for this widget.
     */
    public org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Display) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Display.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the widgets first child.
     * <p>
     * This API is primarily meant for widget implementations.
     * @return The widget's first child
     */
    public @Nullable org.gtk.gtk.Widget getFirstChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_first_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the current focus child of {@code widget}.
     * @return The current focus
     *   child of {@code widget}
     */
    public @Nullable org.gtk.gtk.Widget getFocusChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_focus_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether the widget should grab focus when it is clicked
     * with the mouse.
     * <p>
     * See {@link Widget#setFocusOnClick}.
     * @return {@code true} if the widget should grab focus when it is
     *   clicked with the mouse
     */
    public boolean getFocusOnClick() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_focus_on_click.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Determines whether {@code widget} can own the input focus.
     * <p>
     * See {@link Widget#setFocusable}.
     * @return {@code true} if {@code widget} can own the input focus, {@code false} otherwise
     */
    public boolean getFocusable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_focusable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the font map of {@code widget}.
     * <p>
     * See {@link Widget#setFontMap}.
     * @return A {@code PangoFontMap}
     */
    public @Nullable org.pango.FontMap getFontMap() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_font_map.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.FontMap) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.pango.FontMap.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the {@code cairo_font_options_t} of widget.
     * <p>
     * Seee {@link Widget#setFontOptions}.
     * @return the {@code cairo_font_options_t}
     *   of widget
     */
    public @Nullable org.cairographics.FontOptions getFontOptions() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_font_options.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.cairographics.FontOptions.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Obtains the frame clock for a widget.
     * <p>
     * The frame clock is a global “ticker” that can be used to drive
     * animations and repaints. The most common reason to get the frame
     * clock is to call {@link org.gtk.gdk.FrameClock#getFrameTime}, in order
     * to get a time to use for animating. For example you might record
     * the start of the animation with an initial value from
     * {@link org.gtk.gdk.FrameClock#getFrameTime}, and then update the animation
     * by calling {@link org.gtk.gdk.FrameClock#getFrameTime} again during each repaint.
     * <p>
     * {@link org.gtk.gdk.FrameClock#requestPhase} will result in a new frame on the
     * clock, but won’t necessarily repaint any widgets. To repaint a
     * widget, you have to use {@link Widget#queueDraw} which invalidates
     * the widget (thus scheduling it to receive a draw on the next
     * frame). gtk_widget_queue_draw() will also end up requesting a frame
     * on the appropriate frame clock.
     * <p>
     * A widget’s frame clock will not change while the widget is
     * mapped. Reparenting a widget (which implies a temporary unmap) can
     * change the widget’s frame clock.
     * <p>
     * Unrealized widgets do not have a frame clock.
     * @return a {@code GdkFrameClock}
     */
    public @Nullable org.gtk.gdk.FrameClock getFrameClock() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_frame_clock.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.FrameClock) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.FrameClock.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the horizontal alignment of {@code widget}.
     * <p>
     * For backwards compatibility reasons this method will never return
     * {@link Align#BASELINE}, but instead it will convert it to
     * {@link Align#FILL}. Baselines are not supported for horizontal
     * alignment.
     * @return the horizontal alignment of {@code widget}
     */
    public org.gtk.gtk.Align getHalign() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_halign.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.Align.of(RESULT);
    }
    
    /**
     * Returns the current value of the {@code has-tooltip} property.
     * @return current value of {@code has-tooltip} on {@code widget}.
     */
    public boolean getHasTooltip() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_has_tooltip.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the content height of the widget.
     * <p>
     * This function returns the height passed to its
     * size-allocate implementation, which is the height you
     * should be using in {@code Widget#snapshot}.
     * <p>
     * For pointer events, see {@link Widget#contains}.
     * @return The height of {@code widget}
     */
    public int getHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_height.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets whether the widget would like any available extra horizontal
     * space.
     * <p>
     * When a user resizes a {@code GtkWindow}, widgets with expand=TRUE
     * generally receive the extra space. For example, a list or
     * scrollable area or document in your window would often be set to
     * expand.
     * <p>
     * Containers should use {@link Widget#computeExpand} rather
     * than this function, to see whether a widget, or any of its children,
     * has the expand flag set. If any child of a widget wants to
     * expand, the parent may ask to expand also.
     * <p>
     * This function only looks at the widget’s own hexpand flag, rather
     * than computing whether the entire widget tree rooted at this widget
     * wants to expand.
     * @return whether hexpand flag is set
     */
    public boolean getHexpand() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_hexpand.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets whether gtk_widget_set_hexpand() has been used
     * to explicitly set the expand flag on this widget.
     * <p>
     * If {@code Gtk.Widget:hexpand} property is set, then it
     * overrides any computed expand value based on child widgets.
     * If {@code hexpand} is not set, then the expand value depends on
     * whether any children of the widget would like to expand.
     * <p>
     * There are few reasons to use this function, but it’s here
     * for completeness and consistency.
     * @return whether hexpand has been explicitly set
     */
    public boolean getHexpandSet() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_hexpand_set.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the widgets last child.
     * <p>
     * This API is primarily meant for widget implementations.
     * @return The widget's last child
     */
    public @Nullable org.gtk.gtk.Widget getLastChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_last_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the layout manager used by {@code widget}.
     * <p>
     * See {@link Widget#setLayoutManager}.
     * @return a {@code GtkLayoutManager}
     */
    public @Nullable org.gtk.gtk.LayoutManager getLayoutManager() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_layout_manager.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.LayoutManager) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.LayoutManager.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Whether the widget is mapped.
     * @return {@code true} if the widget is mapped, {@code false} otherwise.
     */
    public boolean getMapped() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_mapped.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the bottom margin of {@code widget}.
     * @return The bottom margin of {@code widget}
     */
    public int getMarginBottom() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_margin_bottom.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the end margin of {@code widget}.
     * @return The end margin of {@code widget}
     */
    public int getMarginEnd() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_margin_end.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the start margin of {@code widget}.
     * @return The start margin of {@code widget}
     */
    public int getMarginStart() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_margin_start.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the top margin of {@code widget}.
     * @return The top margin of {@code widget}
     */
    public int getMarginTop() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_margin_top.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the name of a widget.
     * <p>
     * See {@link Widget#setName} for the significance of widget names.
     * @return name of the widget. This string is owned by GTK and
     *   should not be modified or freed
     */
    public java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the nearest {@code GtkNative} ancestor of {@code widget}.
     * <p>
     * This function will return {@code null} if the widget is not
     * contained inside a widget tree with a native ancestor.
     * <p>
     * {@code GtkNative} widgets will return themselves here.
     * @return the {@code GtkNative} ancestor of {@code widget}
     */
    public @Nullable org.gtk.gtk.Native getNative() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_native.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Native) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Native.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the widgets next sibling.
     * <p>
     * This API is primarily meant for widget implementations.
     * @return The widget's next sibling
     */
    public @Nullable org.gtk.gtk.Widget getNextSibling() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_next_sibling.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * {@code Fetches} the requested opacity for this widget.
     * <p>
     * See {@link Widget#setOpacity}.
     * @return the requested opacity for this widget.
     */
    public double getOpacity() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_widget_get_opacity.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the widgets overflow value.
     * @return The widget's overflow.
     */
    public org.gtk.gtk.Overflow getOverflow() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_overflow.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.Overflow.of(RESULT);
    }
    
    /**
     * Gets a {@code PangoContext} with the appropriate font map, font description,
     * and base direction for this widget.
     * <p>
     * Unlike the context returned by {@link Widget#createPangoContext},
     * this context is owned by the widget (it can be used until the screen
     * for the widget changes or the widget is removed from its toplevel),
     * and will be updated to match any changes to the widget’s attributes.
     * This can be tracked by listening to changes of the
     * {@code Gtk.Widget:root} property on the widget.
     * @return the {@code PangoContext} for the widget.
     */
    public org.pango.Context getPangoContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_pango_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.Context) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.pango.Context.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the parent widget of {@code widget}.
     * @return the parent widget of {@code widget}
     */
    public @Nullable org.gtk.gtk.Widget getParent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_parent.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the minimum and natural size of a widget, taking
     * into account the widget’s preference for height-for-width management.
     * <p>
     * This is used to retrieve a suitable size by container widgets which do
     * not impose any restrictions on the child placement. It can be used
     * to deduce toplevel window and menu sizes as well as child widgets in
     * free-form containers such as {@code GtkFixed}.
     * <p>
     * Handle with care. Note that the natural height of a height-for-width
     * widget will generally be a smaller size than the minimum height, since
     * the required height for the natural width is generally smaller than the
     * required height for the minimum width.
     * <p>
     * Use {@link Widget#measure} if you want to support baseline alignment.
     * @param minimumSize location for storing the minimum size
     * @param naturalSize location for storing the natural size
     */
    public void getPreferredSize(@Nullable org.gtk.gtk.Requisition minimumSize, @Nullable org.gtk.gtk.Requisition naturalSize) {
        try {
            DowncallHandles.gtk_widget_get_preferred_size.invokeExact(
                    handle(),
                    (Addressable) (minimumSize == null ? MemoryAddress.NULL : minimumSize.handle()),
                    (Addressable) (naturalSize == null ? MemoryAddress.NULL : naturalSize.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the widgets previous sibling.
     * <p>
     * This API is primarily meant for widget implementations.
     * @return The widget's previous sibling
     */
    public @Nullable org.gtk.gtk.Widget getPrevSibling() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_prev_sibling.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the primary clipboard of {@code widget}.
     * <p>
     * This is a utility function to get the primary clipboard object
     * for the {@code GdkDisplay} that {@code widget} is using.
     * <p>
     * Note that this function always works, even when {@code widget} is not
     * realized yet.
     * @return the appropriate clipboard object
     */
    public org.gtk.gdk.Clipboard getPrimaryClipboard() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_primary_clipboard.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Clipboard) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Clipboard.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Determines whether {@code widget} is realized.
     * @return {@code true} if {@code widget} is realized, {@code false} otherwise
     */
    public boolean getRealized() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_realized.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Determines whether {@code widget} is always treated as the default widget
     * within its toplevel when it has the focus, even if another widget
     * is the default.
     * <p>
     * See {@link Widget#setReceivesDefault}.
     * @return {@code true} if {@code widget} acts as the default widget when focused,
     *   {@code false} otherwise
     */
    public boolean getReceivesDefault() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_receives_default.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets whether the widget prefers a height-for-width layout
     * or a width-for-height layout.
     * <p>
     * Single-child widgets generally propagate the preference of
     * their child, more complex widgets need to request something
     * either in context of their children or in context of their
     * allocation capabilities.
     * @return The {@code GtkSizeRequestMode} preferred by {@code widget}.
     */
    public org.gtk.gtk.SizeRequestMode getRequestMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_request_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.SizeRequestMode.of(RESULT);
    }
    
    /**
     * Returns the {@code GtkRoot} widget of {@code widget}.
     * <p>
     * This function will return {@code null} if the widget is not contained
     * inside a widget tree with a root widget.
     * <p>
     * {@code GtkRoot} widgets will return themselves here.
     * @return the root widget of {@code widget}
     */
    public @Nullable org.gtk.gtk.Root getRoot() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_root.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Root) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Root.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the internal scale factor that maps from window
     * coordinates to the actual device pixels.
     * <p>
     * On traditional systems this is 1, on high density outputs,
     * it can be a higher value (typically 2).
     * <p>
     * See {@link org.gtk.gdk.Surface#getScaleFactor}.
     * @return the scale factor for {@code widget}
     */
    public int getScaleFactor() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_scale_factor.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the widget’s sensitivity.
     * <p>
     * This function returns the value that has been set using
     * {@link Widget#setSensitive}).
     * <p>
     * The effective sensitivity of a widget is however determined
     * by both its own and its parent widget’s sensitivity.
     * See {@link Widget#isSensitive}.
     * @return {@code true} if the widget is sensitive
     */
    public boolean getSensitive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_sensitive.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the settings object holding the settings used for this widget.
     * <p>
     * Note that this function can only be called when the {@code GtkWidget}
     * is attached to a toplevel, since the settings object is specific
     * to a particular {@code GdkDisplay}. If you want to monitor the widget for
     * changes in its settings, connect to the {@code notify::display} signal.
     * @return the relevant {@code GtkSettings} object
     */
    public org.gtk.gtk.Settings getSettings() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_settings.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Settings) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Settings.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the content width or height of the widget.
     * <p>
     * Which dimension is returned depends on {@code orientation}.
     * <p>
     * This is equivalent to calling {@link Widget#getWidth}
     * for {@link Orientation#HORIZONTAL} or {@link Widget#getHeight}
     * for {@link Orientation#VERTICAL}, but can be used when
     * writing orientation-independent code, such as when
     * implementing {@code Gtk.Orientable} widgets.
     * @param orientation the orientation to query
     * @return The size of {@code widget} in {@code orientation}.
     */
    public int getSize(org.gtk.gtk.Orientation orientation) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_size.invokeExact(
                    handle(),
                    orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the size request that was explicitly set for the widget using
     * gtk_widget_set_size_request().
     * <p>
     * A value of -1 stored in {@code width} or {@code height} indicates that that
     * dimension has not been set explicitly and the natural requisition
     * of the widget will be used instead. See
     * {@link Widget#setSizeRequest}. To get the size a widget will
     * actually request, call {@link Widget#measure} instead of
     * this function.
     * @param width return location for width
     * @param height return location for height
     */
    public void getSizeRequest(Out<Integer> width, Out<Integer> height) {
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_widget_get_size_request.invokeExact(
                    handle(),
                    (Addressable) (width == null ? MemoryAddress.NULL : (Addressable) widthPOINTER.address()),
                    (Addressable) (height == null ? MemoryAddress.NULL : (Addressable) heightPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (width != null) width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (height != null) height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Returns the widget state as a flag set.
     * <p>
     * It is worth mentioning that the effective {@link StateFlags#INSENSITIVE}
     * state will be returned, that is, also based on parent insensitivity,
     * even if {@code widget} itself is sensitive.
     * <p>
     * Also note that if you are looking for a way to obtain the
     * {@code Gtk.StateFlags] to pass to a [class@Gtk.StyleContext}
     * method, you should look at {@link StyleContext#getState}.
     * @return The state flags for widget
     */
    public org.gtk.gtk.StateFlags getStateFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_state_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.StateFlags(RESULT);
    }
    
    /**
     * Returns the style context associated to {@code widget}.
     * <p>
     * The returned object is guaranteed to be the same
     * for the lifetime of {@code widget}.
     * @return the widgets {@code GtkStyleContext}
     */
    public org.gtk.gtk.StyleContext getStyleContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_style_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.StyleContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.StyleContext.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Fetch an object build from the template XML for {@code widget_type} in
     * this {@code widget} instance.
     * <p>
     * This will only report children which were previously declared
     * with {@link WidgetClass#bindTemplateChildFull} or one of its
     * variants.
     * <p>
     * This function is only meant to be called for code which is private
     * to the {@code widget_type} which declared the child and is meant for language
     * bindings which cannot easily make use of the GObject structure offsets.
     * @param widgetType The {@code GType} to get a template child for
     * @param name The “id” of the child defined in the template XML
     * @return The object built in the template XML with
     *   the id {@code name}
     */
    public org.gtk.gobject.GObject getTemplateChild(org.gtk.glib.Type widgetType, java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_template_child.invokeExact(
                    handle(),
                    widgetType.getValue().longValue(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gobject.GObject.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the contents of the tooltip for {@code widget}.
     * <p>
     * If the tooltip has not been set using
     * {@link Widget#setTooltipMarkup}, this
     * function returns {@code null}.
     * @return the tooltip text
     */
    public @Nullable java.lang.String getTooltipMarkup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_tooltip_markup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the contents of the tooltip for {@code widget}.
     * <p>
     * If the {@code widget}'s tooltip was set using
     * {@link Widget#setTooltipMarkup},
     * this function will return the escaped text.
     * @return the tooltip text
     */
    public @Nullable java.lang.String getTooltipText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_get_tooltip_text.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the vertical alignment of {@code widget}.
     * @return the vertical alignment of {@code widget}
     */
    public org.gtk.gtk.Align getValign() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_valign.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.Align.of(RESULT);
    }
    
    /**
     * Gets whether the widget would like any available extra vertical
     * space.
     * <p>
     * See {@link Widget#getHexpand} for more detail.
     * @return whether vexpand flag is set
     */
    public boolean getVexpand() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_vexpand.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets whether gtk_widget_set_vexpand() has been used to
     * explicitly set the expand flag on this widget.
     * <p>
     * See {@link Widget#getHexpandSet} for more detail.
     * @return whether vexpand has been explicitly set
     */
    public boolean getVexpandSet() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_vexpand_set.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Determines whether the widget is visible.
     * <p>
     * If you want to take into account whether the widget’s
     * parent is also marked as visible, use
     * {@link Widget#isVisible} instead.
     * <p>
     * This function does not check if the widget is
     * obscured in any way.
     * <p>
     * See {@link Widget#setVisible}.
     * @return {@code true} if the widget is visible
     */
    public boolean getVisible() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_visible.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the content width of the widget.
     * <p>
     * This function returns the width passed to its
     * size-allocate implementation, which is the width you
     * should be using in {@code Widget#snapshot}.
     * <p>
     * For pointer events, see {@link Widget#contains}.
     * @return The width of {@code widget}
     */
    public int getWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Causes {@code widget} to have the keyboard focus for the {@code GtkWindow} it's inside.
     * <p>
     * If {@code widget} is not focusable, or its {@link Widget#grabFocus}
     * implementation cannot transfer the focus to a descendant of {@code widget}
     * that is focusable, it will not take focus and {@code false} will be returned.
     * <p>
     * Calling {@link Widget#grabFocus} on an already focused widget
     * is allowed, should not have an effect, and return {@code true}.
     * @return {@code true} if focus is now inside {@code widget}.
     */
    public boolean grabFocus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_grab_focus.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether {@code css_class} is currently applied to {@code widget}.
     * @param cssClass A style class, without the leading '.'
     *   used for notation of style classes
     * @return {@code true} if {@code css_class} is currently applied to {@code widget},
     *   {@code false} otherwise.
     */
    public boolean hasCssClass(java.lang.String cssClass) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_has_css_class.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(cssClass, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Determines whether {@code widget} is the current default widget
     * within its toplevel.
     * @return {@code true} if {@code widget} is the current default widget
     *   within its toplevel, {@code false} otherwise
     */
    public boolean hasDefault() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_has_default.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Determines if the widget has the global input focus.
     * <p>
     * See {@link Widget#isFocus} for the difference between
     * having the global input focus, and only having the focus
     * within a toplevel.
     * @return {@code true} if the widget has the global input focus.
     */
    public boolean hasFocus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_has_focus.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Determines if the widget should show a visible indication that
     * it has the global input focus.
     * <p>
     * This is a convenience function that takes into account whether
     * focus indication should currently be shown in the toplevel window
     * of {@code widget}. See {@link Window#getFocusVisible} for more
     * information about focus indication.
     * <p>
     * To find out if the widget has the global input focus, use
     * {@link Widget#hasFocus}.
     * @return {@code true} if the widget should display a “focus rectangle”
     */
    public boolean hasVisibleFocus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_has_visible_focus.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Reverses the effects of gtk_widget_show().
     * <p>
     * This is causing the widget to be hidden (invisible to the user).
     */
    public void hide() {
        try {
            DowncallHandles.gtk_widget_hide.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns whether the widget is currently being destroyed.
     * <p>
     * This information can sometimes be used to avoid doing
     * unnecessary work.
     * @return {@code true} if {@code widget} is being destroyed
     */
    public boolean inDestruction() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_in_destruction.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Creates and initializes child widgets defined in templates.
     * <p>
     * This function must be called in the instance initializer
     * for any class which assigned itself a template using
     * {@link WidgetClass#setTemplate}.
     * <p>
     * It is important to call this function in the instance initializer
     * of a {@code GtkWidget} subclass and not in {@code GObject.constructed()} or
     * {@code GObject.constructor()} for two reasons:
     * <ul>
     * <li>derived widgets will assume that the composite widgets
     *    defined by its parent classes have been created in their
     *    relative instance initializers
     * <li>when calling {@code g_object_new()} on a widget with composite templates,
     *    it’s important to build the composite widgets before the construct
     *    properties are set. Properties passed to {@code g_object_new()} should
     *    take precedence over properties set in the private template XML
     * </ul>
     * <p>
     * A good rule of thumb is to call this function as the first thing in
     * an instance initialization function.
     */
    public void initTemplate() {
        try {
            DowncallHandles.gtk_widget_init_template.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts {@code group} into {@code widget}.
     * <p>
     * Children of {@code widget} that implement {@code Gtk.Actionable} can
     * then be associated with actions in {@code group} by setting their
     * “action-name” to {@code prefix}.{@code action-name}.
     * <p>
     * Note that inheritance is defined for individual actions. I.e.
     * even if you insert a group with prefix {@code prefix}, actions with
     * the same prefix will still be inherited from the parent, unless
     * the group contains an action with the same name.
     * <p>
     * If {@code group} is {@code null}, a previously inserted group for {@code name} is
     * removed from {@code widget}.
     * @param name the prefix for actions in {@code group}
     * @param group a {@code GActionGroup}, or {@code null} to remove
     *   the previously inserted group for {@code name}
     */
    public void insertActionGroup(java.lang.String name, @Nullable org.gtk.gio.ActionGroup group) {
        try {
            DowncallHandles.gtk_widget_insert_action_group.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null),
                    (Addressable) (group == null ? MemoryAddress.NULL : group.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts {@code widget} into the child widget list of {@code parent}.
     * <p>
     * It will be placed after {@code previous_sibling}, or at the beginning if
     * {@code previous_sibling} is {@code null}.
     * <p>
     * After calling this function, {@code gtk_widget_get_prev_sibling(widget)}
     * will return {@code previous_sibling}.
     * <p>
     * If {@code parent} is already set as the parent widget of {@code widget}, this
     * function can also be used to reorder {@code widget} in the child widget
     * list of {@code parent}.
     * <p>
     * This API is primarily meant for widget implementations; if you are
     * just using a widget, you <em>must</em> use its own API for adding children.
     * @param parent the parent {@code GtkWidget} to insert {@code widget} into
     * @param previousSibling the new previous sibling of {@code widget}
     */
    public void insertAfter(org.gtk.gtk.Widget parent, @Nullable org.gtk.gtk.Widget previousSibling) {
        try {
            DowncallHandles.gtk_widget_insert_after.invokeExact(
                    handle(),
                    parent.handle(),
                    (Addressable) (previousSibling == null ? MemoryAddress.NULL : previousSibling.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts {@code widget} into the child widget list of {@code parent}.
     * <p>
     * It will be placed before {@code next_sibling}, or at the end if
     * {@code next_sibling} is {@code null}.
     * <p>
     * After calling this function, {@code gtk_widget_get_next_sibling(widget)}
     * will return {@code next_sibling}.
     * <p>
     * If {@code parent} is already set as the parent widget of {@code widget}, this function
     * can also be used to reorder {@code widget} in the child widget list of {@code parent}.
     * <p>
     * This API is primarily meant for widget implementations; if you are
     * just using a widget, you <em>must</em> use its own API for adding children.
     * @param parent the parent {@code GtkWidget} to insert {@code widget} into
     * @param nextSibling the new next sibling of {@code widget}
     */
    public void insertBefore(org.gtk.gtk.Widget parent, @Nullable org.gtk.gtk.Widget nextSibling) {
        try {
            DowncallHandles.gtk_widget_insert_before.invokeExact(
                    handle(),
                    parent.handle(),
                    (Addressable) (nextSibling == null ? MemoryAddress.NULL : nextSibling.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Determines whether {@code widget} is somewhere inside {@code ancestor},
     * possibly with intermediate containers.
     * @param ancestor another {@code GtkWidget}
     * @return {@code true} if {@code ancestor} contains {@code widget} as a child,
     *   grandchild, great grandchild, etc.
     */
    public boolean isAncestor(org.gtk.gtk.Widget ancestor) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_is_ancestor.invokeExact(
                    handle(),
                    ancestor.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Determines whether {@code widget} can be drawn to.
     * <p>
     * A widget can be drawn if it is mapped and visible.
     * @return {@code true} if {@code widget} is drawable, {@code false} otherwise
     */
    public boolean isDrawable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_is_drawable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Determines if the widget is the focus widget within its
     * toplevel.
     * <p>
     * This does not mean that the {@code Gtk.Widget:has-focus}
     * property is necessarily set; {@code Gtk.Widget:has-focus}
     * will only be set if the toplevel widget additionally has the
     * global input focus.
     * @return {@code true} if the widget is the focus widget.
     */
    public boolean isFocus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_is_focus.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the widget’s effective sensitivity.
     * <p>
     * This means it is sensitive itself and also its
     * parent widget is sensitive.
     * @return {@code true} if the widget is effectively sensitive
     */
    public boolean isSensitive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_is_sensitive.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Determines whether the widget and all its parents are marked as
     * visible.
     * <p>
     * This function does not check if the widget is obscured in any way.
     * <p>
     * See also {@link Widget#getVisible} and
     * {@link Widget#setVisible}.
     * @return {@code true} if the widget and all its parents are visible
     */
    public boolean isVisible() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_is_visible.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Emits the {@code ::keynav-failed} signal on the widget.
     * <p>
     * This function should be called whenever keyboard navigation
     * within a single widget hits a boundary.
     * <p>
     * The return value of this function should be interpreted
     * in a way similar to the return value of
     * {@link Widget#childFocus}. When {@code true} is returned,
     * stay in the widget, the failed keyboard  navigation is OK
     * and/or there is nowhere we can/should move the focus to.
     * When {@code false} is returned, the caller should continue with
     * keyboard navigation outside the widget, e.g. by calling
     * {@link Widget#childFocus} on the widget’s toplevel.
     * <p>
     * The default {@code Gtk.Widget::keynav-failed} handler returns
     * {@code false} for {@link DirectionType#TAB_FORWARD} and {@link DirectionType#TAB_BACKWARD}.
     * For the other values of {@code GtkDirectionType} it returns {@code true}.
     * <p>
     * Whenever the default handler returns {@code true}, it also calls
     * {@link Widget#errorBell} to notify the user of the
     * failed keyboard navigation.
     * <p>
     * A use case for providing an own implementation of ::keynav-failed
     * (either by connecting to it or by overriding it) would be a row of
     * {@link Entry} widgets where the user should be able to navigate
     * the entire row with the cursor keys, as e.g. known from user
     * interfaces that require entering license keys.
     * @param direction direction of focus movement
     * @return {@code true} if stopping keyboard navigation is fine, {@code false}
     *   if the emitting widget should try to handle the keyboard
     *   navigation attempt in its parent container(s).
     */
    public boolean keynavFailed(org.gtk.gtk.DirectionType direction) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_keynav_failed.invokeExact(
                    handle(),
                    direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the widgets for which this widget is the target of a
     * mnemonic.
     * <p>
     * Typically, these widgets will be labels. See, for example,
     * {@link Label#setMnemonicWidget}.
     * <p>
     * The widgets in the list are not individually referenced.
     * If you want to iterate through the list and perform actions
     * involving callbacks that might destroy the widgets, you
     * must call {@code g_list_foreach (result, (GFunc)g_object_ref, NULL)}
     * first, and then unref all the widgets afterwards.
     * @return the list
     *   of mnemonic labels; free this list with g_list_free() when you
     *   are done with it.
     */
    public org.gtk.glib.List listMnemonicLabels() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_list_mnemonic_labels.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.CONTAINER);
    }
    
    /**
     * Causes a widget to be mapped if it isn’t already.
     * <p>
     * This function is only for use in widget implementations.
     */
    public void map() {
        try {
            DowncallHandles.gtk_widget_map.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Measures {@code widget} in the orientation {@code orientation} and for the given {@code for_size}.
     * <p>
     * As an example, if {@code orientation} is {@link Orientation#HORIZONTAL} and {@code for_size}
     * is 300, this functions will compute the minimum and natural width of {@code widget}
     * if it is allocated at a height of 300 pixels.
     * <p>
     * See <a href="class.Widget.html#height-for-width-geometry-management">GtkWidget’s geometry management section</a> for
     * a more details on implementing {@code GtkWidgetClass.measure()}.
     * @param orientation the orientation to measure
     * @param forSize Size for the opposite of {@code orientation}, i.e.
     *   if {@code orientation} is {@link Orientation#HORIZONTAL}, this is
     *   the height the widget should be measured with. The {@link Orientation#VERTICAL}
     *   case is analogous. This way, both height-for-width and width-for-height
     *   requests can be implemented. If no size is known, -1 can be passed.
     * @param minimum location to store the minimum size
     * @param natural location to store the natural size
     * @param minimumBaseline location to store the baseline
     *   position for the minimum size, or -1 to report no baseline
     * @param naturalBaseline location to store the baseline
     *   position for the natural size, or -1 to report no baseline
     */
    public void measure(org.gtk.gtk.Orientation orientation, int forSize, Out<Integer> minimum, Out<Integer> natural, Out<Integer> minimumBaseline, Out<Integer> naturalBaseline) {
        MemorySegment minimumPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment naturalPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment minimumBaselinePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment naturalBaselinePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_widget_measure.invokeExact(
                    handle(),
                    orientation.getValue(),
                    forSize,
                    (Addressable) (minimum == null ? MemoryAddress.NULL : (Addressable) minimumPOINTER.address()),
                    (Addressable) (natural == null ? MemoryAddress.NULL : (Addressable) naturalPOINTER.address()),
                    (Addressable) (minimumBaseline == null ? MemoryAddress.NULL : (Addressable) minimumBaselinePOINTER.address()),
                    (Addressable) (naturalBaseline == null ? MemoryAddress.NULL : (Addressable) naturalBaselinePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (minimum != null) minimum.set(minimumPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (natural != null) natural.set(naturalPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (minimumBaseline != null) minimumBaseline.set(minimumBaselinePOINTER.get(Interop.valueLayout.C_INT, 0));
        if (naturalBaseline != null) naturalBaseline.set(naturalBaselinePOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Emits the ::mnemonic-activate signal.
     * <p>
     * See {@code Gtk.Widget::mnemonic-activate}.
     * @param groupCycling {@code true} if there are other widgets with the same mnemonic
     * @return {@code true} if the signal has been handled
     */
    public boolean mnemonicActivate(boolean groupCycling) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_mnemonic_activate.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(groupCycling, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns a {@code GListModel} to track the children of {@code widget}.
     * <p>
     * Calling this function will enable extra internal bookkeeping
     * to track children and emit signals on the returned listmodel.
     * It may slow down operations a lot.
     * <p>
     * Applications should try hard to avoid calling this function
     * because of the slowdowns.
     * @return a {@code GListModel} tracking {@code widget}'s children
     */
    public org.gtk.gio.ListModel observeChildren() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_observe_children.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.ListModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.ListModel.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns a {@code GListModel} to track the {@link EventController}s
     * of {@code widget}.
     * <p>
     * Calling this function will enable extra internal bookkeeping
     * to track controllers and emit signals on the returned listmodel.
     * It may slow down operations a lot.
     * <p>
     * Applications should try hard to avoid calling this function
     * because of the slowdowns.
     * @return a {@code GListModel} tracking {@code widget}'s controllers
     */
    public org.gtk.gio.ListModel observeControllers() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_observe_controllers.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.ListModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.ListModel.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Finds the descendant of {@code widget} closest to the point ({@code x}, {@code y}).
     * <p>
     * The point must be given in widget coordinates, so (0, 0) is assumed
     * to be the top left of {@code widget}'s content area.
     * <p>
     * Usually widgets will return {@code null} if the given coordinate is not
     * contained in {@code widget} checked via {@link Widget#contains}.
     * Otherwise they will recursively try to find a child that does
     * not return {@code null}. Widgets are however free to customize their
     * picking algorithm.
     * <p>
     * This function is used on the toplevel to determine the widget
     * below the mouse cursor for purposes of hover highlighting and
     * delivering events.
     * @param x X coordinate to test, relative to {@code widget}'s origin
     * @param y Y coordinate to test, relative to {@code widget}'s origin
     * @param flags Flags to influence what is picked
     * @return The widget descendant at
     *   the given point
     */
    public @Nullable org.gtk.gtk.Widget pick(double x, double y, org.gtk.gtk.PickFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_pick.invokeExact(
                    handle(),
                    x,
                    y,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Flags the widget for a rerun of the {@link Widget#sizeAllocate}
     * function.
     * <p>
     * Use this function instead of {@link Widget#queueResize}
     * when the {@code widget}'s size request didn't change but it wants to
     * reposition its contents.
     * <p>
     * An example user of this function is {@link Widget#setHalign}.
     * <p>
     * This function is only for use in widget implementations.
     */
    public void queueAllocate() {
        try {
            DowncallHandles.gtk_widget_queue_allocate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Schedules this widget to be redrawn in the paint phase
     * of the current or the next frame.
     * <p>
     * This means {@code widget}'s {@code Widget#snapshot}
     * implementation will be called.
     */
    public void queueDraw() {
        try {
            DowncallHandles.gtk_widget_queue_draw.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Flags a widget to have its size renegotiated.
     * <p>
     * This should be called when a widget for some reason has a new
     * size request. For example, when you change the text in a
     * {@link Label}, the label queues a resize to ensure there’s
     * enough space for the new text.
     * <p>
     * Note that you cannot call gtk_widget_queue_resize() on a widget
     * from inside its implementation of the {@link Widget#sizeAllocate}
     * virtual method. Calls to gtk_widget_queue_resize() from inside
     * {@link Widget#sizeAllocate} will be silently ignored.
     * <p>
     * This function is only for use in widget implementations.
     */
    public void queueResize() {
        try {
            DowncallHandles.gtk_widget_queue_resize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates the GDK resources associated with a widget.
     * <p>
     * Normally realization happens implicitly; if you show a widget
     * and all its parent containers, then the widget will be realized
     * and mapped automatically.
     * <p>
     * Realizing a widget requires all the widget’s parent widgets to be
     * realized; calling this function realizes the widget’s parents
     * in addition to {@code widget} itself. If a widget is not yet inside a
     * toplevel window when you realize it, bad things will happen.
     * <p>
     * This function is primarily used in widget implementations, and
     * isn’t very useful otherwise. Many times when you think you might
     * need it, a better approach is to connect to a signal that will be
     * called after the widget is realized automatically, such as
     * {@code Gtk.Widget::realize}.
     */
    public void realize() {
        try {
            DowncallHandles.gtk_widget_realize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes {@code controller} from {@code widget}, so that it doesn't process
     * events anymore.
     * <p>
     * It should not be used again.
     * <p>
     * Widgets will remove all event controllers automatically when they
     * are destroyed, there is normally no need to call this function.
     * @param controller a {@code GtkEventController}
     */
    public void removeController(org.gtk.gtk.EventController controller) {
        try {
            DowncallHandles.gtk_widget_remove_controller.invokeExact(
                    handle(),
                    controller.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a style from {@code widget}.
     * <p>
     * After this, the style of {@code widget} will stop matching for {@code css_class}.
     * @param cssClass The style class to remove from {@code widget}, without
     *   the leading '.' used for notation of style classes
     */
    public void removeCssClass(java.lang.String cssClass) {
        try {
            DowncallHandles.gtk_widget_remove_css_class.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(cssClass, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a widget from the list of mnemonic labels for this widget.
     * <p>
     * See {@link Widget#listMnemonicLabels}. The widget must
     * have previously been added to the list with
     * {@link Widget#addMnemonicLabel}.
     * @param label a {@code GtkWidget} that was previously set as a mnemonic
     *   label for {@code widget} with {@link Widget#addMnemonicLabel}
     */
    public void removeMnemonicLabel(org.gtk.gtk.Widget label) {
        try {
            DowncallHandles.gtk_widget_remove_mnemonic_label.invokeExact(
                    handle(),
                    label.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a tick callback previously registered with
     * gtk_widget_add_tick_callback().
     * @param id an id returned by {@link Widget#addTickCallback}
     */
    public void removeTickCallback(int id) {
        try {
            DowncallHandles.gtk_widget_remove_tick_callback.invokeExact(
                    handle(),
                    id);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Specifies whether the input focus can enter the widget
     * or any of its children.
     * <p>
     * Applications should set {@code can_focus} to {@code false} to mark a
     * widget as for pointer/touch use only.
     * <p>
     * Note that having {@code can_focus} be {@code true} is only one of the
     * necessary conditions for being focusable. A widget must
     * also be sensitive and focusable and not have an ancestor
     * that is marked as not can-focus in order to receive input
     * focus.
     * <p>
     * See {@link Widget#grabFocus} for actually setting
     * the input focus on a widget.
     * @param canFocus whether or not the input focus can enter
     *   the widget or any of its children
     */
    public void setCanFocus(boolean canFocus) {
        try {
            DowncallHandles.gtk_widget_set_can_focus.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(canFocus, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code widget} can be the target of pointer events.
     * @param canTarget whether this widget should be able to
     *   receive pointer events
     */
    public void setCanTarget(boolean canTarget) {
        try {
            DowncallHandles.gtk_widget_set_can_target.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(canTarget, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code widget} should be mapped along with its parent.
     * <p>
     * The child visibility can be set for widget before it is added
     * to a container with {@link Widget#setParent}, to avoid
     * mapping children unnecessary before immediately unmapping them.
     * However it will be reset to its default state of {@code true} when the
     * widget is removed from a container.
     * <p>
     * Note that changing the child visibility of a widget does not
     * queue a resize on the widget. Most of the time, the size of
     * a widget is computed from all visible children, whether or
     * not they are mapped. If this is not the case, the container
     * can queue a resize itself.
     * <p>
     * This function is only useful for container implementations
     * and should never be called by an application.
     * @param childVisible if {@code true}, {@code widget} should be mapped along
     *   with its parent.
     */
    public void setChildVisible(boolean childVisible) {
        try {
            DowncallHandles.gtk_widget_set_child_visible.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(childVisible, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Clear all style classes applied to {@code widget}
     * and replace them with {@code classes}.
     * @param classes {@code null}-terminated list of style classes to apply to {@code widget}.
     */
    public void setCssClasses(java.lang.String[] classes) {
        try {
            DowncallHandles.gtk_widget_set_css_classes.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(classes, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the cursor to be shown when pointer devices point
     * towards {@code widget}.
     * <p>
     * If the {@code cursor} is NULL, {@code widget} will use the cursor
     * inherited from the parent widget.
     * @param cursor the new cursor
     */
    public void setCursor(@Nullable org.gtk.gdk.Cursor cursor) {
        try {
            DowncallHandles.gtk_widget_set_cursor.invokeExact(
                    handle(),
                    (Addressable) (cursor == null ? MemoryAddress.NULL : cursor.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a named cursor to be shown when pointer devices point
     * towards {@code widget}.
     * <p>
     * This is a utility function that creates a cursor via
     * {@link org.gtk.gdk.Cursor#newFromName} and then sets it on {@code widget}
     * with {@link Widget#setCursor}. See those functions for
     * details.
     * <p>
     * On top of that, this function allows {@code name} to be {@code null}, which
     * will do the same as calling {@link Widget#setCursor}
     * with a {@code null} cursor.
     * @param name The name of the cursor
     */
    public void setCursorFromName(@Nullable java.lang.String name) {
        try {
            DowncallHandles.gtk_widget_set_cursor_from_name.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the reading direction on a particular widget.
     * <p>
     * This direction controls the primary direction for widgets
     * containing text, and also the direction in which the children
     * of a container are packed. The ability to set the direction is
     * present in order so that correct localization into languages with
     * right-to-left reading directions can be done. Generally, applications
     * will let the default reading direction present, except for containers
     * where the containers are arranged in an order that is explicitly
     * visual rather than logical (such as buttons for text justification).
     * <p>
     * If the direction is set to {@link TextDirection#NONE}, then the value
     * set by {@link Widget#setDefaultDirection} will be used.
     * @param dir the new direction
     */
    public void setDirection(org.gtk.gtk.TextDirection dir) {
        try {
            DowncallHandles.gtk_widget_set_direction.invokeExact(
                    handle(),
                    dir.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set {@code child} as the current focus child of {@code widget}.
     * <p>
     * This function is only suitable for widget implementations.
     * If you want a certain widget to get the input focus, call
     * {@link Widget#grabFocus} on it.
     * @param child a direct child widget of {@code widget} or {@code null}
     *   to unset the focus child of {@code widget}
     */
    public void setFocusChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_widget_set_focus_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the widget should grab focus when it is clicked
     * with the mouse.
     * <p>
     * Making mouse clicks not grab focus is useful in places like
     * toolbars where you don’t want the keyboard focus removed from
     * the main area of the application.
     * @param focusOnClick whether the widget should grab focus when clicked
     *   with the mouse
     */
    public void setFocusOnClick(boolean focusOnClick) {
        try {
            DowncallHandles.gtk_widget_set_focus_on_click.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(focusOnClick, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Specifies whether {@code widget} can own the input focus.
     * <p>
     * Widget implementations should set {@code focusable} to {@code true} in
     * their init() function if they want to receive keyboard input.
     * <p>
     * Note that having {@code focusable} be {@code true} is only one of the
     * necessary conditions for being focusable. A widget must
     * also be sensitive and can-focus and not have an ancestor
     * that is marked as not can-focus in order to receive input
     * focus.
     * <p>
     * See {@link Widget#grabFocus} for actually setting
     * the input focus on a widget.
     * @param focusable whether or not {@code widget} can own the input focus
     */
    public void setFocusable(boolean focusable) {
        try {
            DowncallHandles.gtk_widget_set_focusable.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(focusable, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the font map to use for Pango rendering.
     * <p>
     * The font map is the object that is used to look up fonts.
     * Setting a custom font map can be useful in special situations,
     * e.g. when you need to add application-specific fonts to the set
     * of available fonts.
     * <p>
     * When not set, the widget will inherit the font map from its parent.
     * @param fontMap a {@code PangoFontMap}, or {@code null} to unset any
     *   previously set font map
     */
    public void setFontMap(@Nullable org.pango.FontMap fontMap) {
        try {
            DowncallHandles.gtk_widget_set_font_map.invokeExact(
                    handle(),
                    (Addressable) (fontMap == null ? MemoryAddress.NULL : fontMap.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code cairo_font_options_t} used for Pango rendering
     * in this widget.
     * <p>
     * When not set, the default font options for the {@code GdkDisplay}
     * will be used.
     * @param options a {@code cairo_font_options_t}
     *   to unset any previously set default font options
     */
    public void setFontOptions(@Nullable org.cairographics.FontOptions options) {
        try {
            DowncallHandles.gtk_widget_set_font_options.invokeExact(
                    handle(),
                    (Addressable) (options == null ? MemoryAddress.NULL : options.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the horizontal alignment of {@code widget}.
     * @param align the horizontal alignment
     */
    public void setHalign(org.gtk.gtk.Align align) {
        try {
            DowncallHandles.gtk_widget_set_halign.invokeExact(
                    handle(),
                    align.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code has-tooltip} property on {@code widget} to {@code has_tooltip}.
     * @param hasTooltip whether or not {@code widget} has a tooltip.
     */
    public void setHasTooltip(boolean hasTooltip) {
        try {
            DowncallHandles.gtk_widget_set_has_tooltip.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(hasTooltip, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the widget would like any available extra horizontal
     * space.
     * <p>
     * When a user resizes a {@code GtkWindow}, widgets with expand=TRUE
     * generally receive the extra space. For example, a list or
     * scrollable area or document in your window would often be set to
     * expand.
     * <p>
     * Call this function to set the expand flag if you would like your
     * widget to become larger horizontally when the window has extra
     * room.
     * <p>
     * By default, widgets automatically expand if any of their children
     * want to expand. (To see if a widget will automatically expand given
     * its current children and state, call {@link Widget#computeExpand}.
     * A container can decide how the expandability of children affects the
     * expansion of the container by overriding the compute_expand virtual
     * method on {@code GtkWidget}.).
     * <p>
     * Setting hexpand explicitly with this function will override the
     * automatic expand behavior.
     * <p>
     * This function forces the widget to expand or not to expand,
     * regardless of children.  The override occurs because
     * {@link Widget#setHexpand} sets the hexpand-set property (see
     * {@link Widget#setHexpandSet}) which causes the widget’s hexpand
     * value to be used, rather than looking at children and widget state.
     * @param expand whether to expand
     */
    public void setHexpand(boolean expand) {
        try {
            DowncallHandles.gtk_widget_set_hexpand.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(expand, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the hexpand flag will be used.
     * <p>
     * The {@code Gtk.Widget:hexpand-set} property will be set
     * automatically when you call {@link Widget#setHexpand}
     * to set hexpand, so the most likely reason to use this function
     * would be to unset an explicit expand flag.
     * <p>
     * If hexpand is set, then it overrides any computed
     * expand value based on child widgets. If hexpand is not
     * set, then the expand value depends on whether any
     * children of the widget would like to expand.
     * <p>
     * There are few reasons to use this function, but it’s here
     * for completeness and consistency.
     * @param set value for hexpand-set property
     */
    public void setHexpandSet(boolean set) {
        try {
            DowncallHandles.gtk_widget_set_hexpand_set.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(set, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the layout manager delegate instance that provides an
     * implementation for measuring and allocating the children of {@code widget}.
     * @param layoutManager a {@code GtkLayoutManager}
     */
    public void setLayoutManager(@Nullable org.gtk.gtk.LayoutManager layoutManager) {
        try {
            DowncallHandles.gtk_widget_set_layout_manager.invokeExact(
                    handle(),
                    (Addressable) (layoutManager == null ? MemoryAddress.NULL : layoutManager.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        layoutManager.yieldOwnership();
    }
    
    /**
     * Sets the bottom margin of {@code widget}.
     * @param margin the bottom margin
     */
    public void setMarginBottom(int margin) {
        try {
            DowncallHandles.gtk_widget_set_margin_bottom.invokeExact(
                    handle(),
                    margin);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the end margin of {@code widget}.
     * @param margin the end margin
     */
    public void setMarginEnd(int margin) {
        try {
            DowncallHandles.gtk_widget_set_margin_end.invokeExact(
                    handle(),
                    margin);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the start margin of {@code widget}.
     * @param margin the start margin
     */
    public void setMarginStart(int margin) {
        try {
            DowncallHandles.gtk_widget_set_margin_start.invokeExact(
                    handle(),
                    margin);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the top margin of {@code widget}.
     * @param margin the top margin
     */
    public void setMarginTop(int margin) {
        try {
            DowncallHandles.gtk_widget_set_margin_top.invokeExact(
                    handle(),
                    margin);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a widgets name.
     * <p>
     * Setting a name allows you to refer to the widget from a
     * CSS file. You can apply a style to widgets with a particular name
     * in the CSS file. See the documentation for the CSS syntax (on the
     * same page as the docs for {@link StyleContext}.
     * <p>
     * Note that the CSS syntax has certain special characters to delimit
     * and represent elements in a selector (period, {@code ,} &gt;, *...), so using
     * these will make your widget impossible to match by name. Any combination
     * of alphanumeric symbols, dashes and underscores will suffice.
     * @param name name for the widget
     */
    public void setName(java.lang.String name) {
        try {
            DowncallHandles.gtk_widget_set_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Request the {@code widget} to be rendered partially transparent.
     * <p>
     * An opacity of 0 is fully transparent and an opacity of 1
     * is fully opaque.
     * <p>
     * Opacity works on both toplevel widgets and child widgets, although
     * there are some limitations: For toplevel widgets, applying opacity
     * depends on the capabilities of the windowing system. On X11, this
     * has any effect only on X displays with a compositing manager,
     * see gdk_display_is_composited(). On Windows and Wayland it should
     * always work, although setting a window’s opacity after the window
     * has been shown may cause some flicker.
     * <p>
     * Note that the opacity is inherited through inclusion — if you set
     * a toplevel to be partially translucent, all of its content will
     * appear translucent, since it is ultimatively rendered on that
     * toplevel. The opacity value itself is not inherited by child
     * widgets (since that would make widgets deeper in the hierarchy
     * progressively more translucent). As a consequence, {@link Popover}s
     * and other {@code Gtk.Native} widgets with their own surface will use their
     * own opacity value, and thus by default appear non-translucent,
     * even if they are attached to a toplevel that is translucent.
     * @param opacity desired opacity, between 0 and 1
     */
    public void setOpacity(double opacity) {
        try {
            DowncallHandles.gtk_widget_set_opacity.invokeExact(
                    handle(),
                    opacity);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets how {@code widget} treats content that is drawn outside the
     * widget's content area.
     * <p>
     * See the definition of {@code Gtk.Overflow} for details.
     * <p>
     * This setting is provided for widget implementations and
     * should not be used by application code.
     * <p>
     * The default value is {@link Overflow#VISIBLE}.
     * @param overflow desired overflow
     */
    public void setOverflow(org.gtk.gtk.Overflow overflow) {
        try {
            DowncallHandles.gtk_widget_set_overflow.invokeExact(
                    handle(),
                    overflow.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code parent} as the parent widget of {@code widget}.
     * <p>
     * This takes care of details such as updating the state and style
     * of the child to reflect its new location and resizing the parent.
     * The opposite function is {@link Widget#unparent}.
     * <p>
     * This function is useful only when implementing subclasses of
     * {@code GtkWidget}.
     * @param parent parent widget
     */
    public void setParent(org.gtk.gtk.Widget parent) {
        try {
            DowncallHandles.gtk_widget_set_parent.invokeExact(
                    handle(),
                    parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Specifies whether {@code widget} will be treated as the default
     * widget within its toplevel when it has the focus, even if
     * another widget is the default.
     * @param receivesDefault whether or not {@code widget} can be a default widget.
     */
    public void setReceivesDefault(boolean receivesDefault) {
        try {
            DowncallHandles.gtk_widget_set_receives_default.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(receivesDefault, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the sensitivity of a widget.
     * <p>
     * A widget is sensitive if the user can interact with it.
     * Insensitive widgets are “grayed out” and the user can’t
     * interact with them. Insensitive widgets are known as
     * “inactive”, “disabled”, or “ghosted” in some other toolkits.
     * @param sensitive {@code true} to make the widget sensitive
     */
    public void setSensitive(boolean sensitive) {
        try {
            DowncallHandles.gtk_widget_set_sensitive.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(sensitive, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the minimum size of a widget.
     * <p>
     * That is, the widget’s size request will be at least {@code width}
     * by {@code height}. You can use this function to force a widget to
     * be larger than it normally would be.
     * <p>
     * In most cases, {@link Window#setDefaultSize} is a better
     * choice for toplevel windows than this function; setting the default
     * size will still allow users to shrink the window. Setting the size
     * request will force them to leave the window at least as large as
     * the size request.
     * <p>
     * Note the inherent danger of setting any fixed size - themes,
     * translations into other languages, different fonts, and user action
     * can all change the appropriate size for a given widget. So, it's
     * basically impossible to hardcode a size that will always be
     * correct.
     * <p>
     * The size request of a widget is the smallest size a widget can
     * accept while still functioning well and drawing itself correctly.
     * However in some strange cases a widget may be allocated less than
     * its requested size, and in many cases a widget may be allocated more
     * space than it requested.
     * <p>
     * If the size request in a given direction is -1 (unset), then
     * the “natural” size request of the widget will be used instead.
     * <p>
     * The size request set here does not include any margin from the
     * properties
     * {@code Gtk.Widget:margin-start},
     * {@code Gtk.Widget:margin-end},
     * {@code Gtk.Widget:margin-top}, and
     * {@code Gtk.Widget:margin-bottom}, but it does include pretty
     * much all other padding or border properties set by any subclass
     * of {@code GtkWidget}.
     * @param width width {@code widget} should request, or -1 to unset
     * @param height height {@code widget} should request, or -1 to unset
     */
    public void setSizeRequest(int width, int height) {
        try {
            DowncallHandles.gtk_widget_set_size_request.invokeExact(
                    handle(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Turns on flag values in the current widget state.
     * <p>
     * Typical widget states are insensitive, prelighted, etc.
     * <p>
     * This function accepts the values {@link StateFlags#DIR_LTR} and
     * {@link StateFlags#DIR_RTL} but ignores them. If you want to set
     * the widget's direction, use {@link Widget#setDirection}.
     * <p>
     * This function is for use in widget implementations.
     * @param flags State flags to turn on
     * @param clear Whether to clear state before turning on {@code flags}
     */
    public void setStateFlags(org.gtk.gtk.StateFlags flags, boolean clear) {
        try {
            DowncallHandles.gtk_widget_set_state_flags.invokeExact(
                    handle(),
                    flags.getValue(),
                    Marshal.booleanToInteger.marshal(clear, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code markup} as the contents of the tooltip, which is marked
     * up with Pango markup.
     * <p>
     * This function will take care of setting the
     * {@code Gtk.Widget:has-tooltip} as a side effect, and of the
     * default handler for the {@code Gtk.Widget::query-tooltip} signal.
     * <p>
     * See also {@link Tooltip#setMarkup}.
     * @param markup the contents of the tooltip for {@code widget}
     */
    public void setTooltipMarkup(@Nullable java.lang.String markup) {
        try {
            DowncallHandles.gtk_widget_set_tooltip_markup.invokeExact(
                    handle(),
                    (Addressable) (markup == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(markup, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code text} as the contents of the tooltip.
     * <p>
     * If {@code text} contains any markup, it will be escaped.
     * <p>
     * This function will take care of setting
     * {@code Gtk.Widget:has-tooltip} as a side effect,
     * and of the default handler for the
     * {@code Gtk.Widget::query-tooltip} signal.
     * <p>
     * See also {@link Tooltip#setText}.
     * @param text the contents of the tooltip for {@code widget}
     */
    public void setTooltipText(@Nullable java.lang.String text) {
        try {
            DowncallHandles.gtk_widget_set_tooltip_text.invokeExact(
                    handle(),
                    (Addressable) (text == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(text, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the vertical alignment of {@code widget}.
     * @param align the vertical alignment
     */
    public void setValign(org.gtk.gtk.Align align) {
        try {
            DowncallHandles.gtk_widget_set_valign.invokeExact(
                    handle(),
                    align.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the widget would like any available extra vertical
     * space.
     * <p>
     * See {@link Widget#setHexpand} for more detail.
     * @param expand whether to expand
     */
    public void setVexpand(boolean expand) {
        try {
            DowncallHandles.gtk_widget_set_vexpand.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(expand, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the vexpand flag will be used.
     * <p>
     * See {@link Widget#setHexpandSet} for more detail.
     * @param set value for vexpand-set property
     */
    public void setVexpandSet(boolean set) {
        try {
            DowncallHandles.gtk_widget_set_vexpand_set.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(set, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the visibility state of {@code widget}.
     * <p>
     * Note that setting this to {@code true} doesn’t mean the widget is
     * actually viewable, see {@link Widget#getVisible}.
     * <p>
     * This function simply calls {@link Widget#show} or
     * {@link Widget#hide} but is nicer to use when the
     * visibility of the widget depends on some condition.
     * @param visible whether the widget should be shown or not
     */
    public void setVisible(boolean visible) {
        try {
            DowncallHandles.gtk_widget_set_visible.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(visible, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns whether {@code widget} should contribute to
     * the measuring and allocation of its parent.
     * <p>
     * This is {@code false} for invisible children, but also
     * for children that have their own surface.
     * @return {@code true} if child should be included in
     *   measuring and allocating
     */
    public boolean shouldLayout() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_should_layout.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Flags a widget to be displayed.
     * <p>
     * Any widget that isn’t shown will not appear on the screen.
     * <p>
     * Remember that you have to show the containers containing a widget,
     * in addition to the widget itself, before it will appear onscreen.
     * <p>
     * When a toplevel container is shown, it is immediately realized and
     * mapped; other shown widgets are realized and mapped when their
     * toplevel container is realized and mapped.
     */
    public void show() {
        try {
            DowncallHandles.gtk_widget_show.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates widget with a transformation that translates
     * the origin to the position in {@code allocation}.
     * <p>
     * This is a simple form of {@link Widget#allocate}.
     * @param allocation position and size to be allocated to {@code widget}
     * @param baseline The baseline of the child, or -1
     */
    public void sizeAllocate(org.gtk.gtk.Allocation allocation, int baseline) {
        try {
            DowncallHandles.gtk_widget_size_allocate.invokeExact(
                    handle(),
                    allocation.handle(),
                    baseline);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Snapshot the a child of {@code widget}.
     * <p>
     * When a widget receives a call to the snapshot function,
     * it must send synthetic {@code Widget#snapshot} calls
     * to all children. This function provides a convenient way
     * of doing this. A widget, when it receives a call to its
     * {@code Widget#snapshot} function, calls
     * gtk_widget_snapshot_child() once for each child, passing in
     * the {@code snapshot} the widget received.
     * <p>
     * gtk_widget_snapshot_child() takes care of translating the origin of
     * {@code snapshot}, and deciding whether the child needs to be snapshot.
     * <p>
     * This function does nothing for children that implement {@code GtkNative}.
     * @param child a child of {@code widget}
     * @param snapshot {@code GtkSnapshot} as passed to the widget. In particular, no
     *   calls to gtk_snapshot_translate() or other transform calls should
     *   have been made.
     */
    public void snapshotChild(org.gtk.gtk.Widget child, org.gtk.gtk.Snapshot snapshot) {
        try {
            DowncallHandles.gtk_widget_snapshot_child.invokeExact(
                    handle(),
                    child.handle(),
                    snapshot.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Translate coordinates relative to {@code src_widget}’s allocation
     * to coordinates relative to {@code dest_widget}’s allocations.
     * <p>
     * In order to perform this operation, both widget must share
     * a common ancestor.
     * @param destWidget a {@code GtkWidget}
     * @param srcX X position relative to {@code src_widget}
     * @param srcY Y position relative to {@code src_widget}
     * @param destX location to store X position relative to {@code dest_widget}
     * @param destY location to store Y position relative to {@code dest_widget}
     * @return {@code false} if {@code src_widget} and {@code dest_widget} have no common
     *   ancestor. In this case, 0 is stored in *{@code dest_x} and *{@code dest_y}.
     *   Otherwise {@code true}.
     */
    public boolean translateCoordinates(org.gtk.gtk.Widget destWidget, double srcX, double srcY, Out<Double> destX, Out<Double> destY) {
        MemorySegment destXPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment destYPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_translate_coordinates.invokeExact(
                    handle(),
                    destWidget.handle(),
                    srcX,
                    srcY,
                    (Addressable) (destX == null ? MemoryAddress.NULL : (Addressable) destXPOINTER.address()),
                    (Addressable) (destY == null ? MemoryAddress.NULL : (Addressable) destYPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (destX != null) destX.set(destXPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        if (destY != null) destY.set(destYPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Triggers a tooltip query on the display where the toplevel
     * of {@code widget} is located.
     */
    public void triggerTooltipQuery() {
        try {
            DowncallHandles.gtk_widget_trigger_tooltip_query.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Causes a widget to be unmapped if it’s currently mapped.
     * <p>
     * This function is only for use in widget implementations.
     */
    public void unmap() {
        try {
            DowncallHandles.gtk_widget_unmap.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Dissociate {@code widget} from its parent.
     * <p>
     * This function is only for use in widget implementations,
     * typically in dispose.
     */
    public void unparent() {
        try {
            DowncallHandles.gtk_widget_unparent.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Causes a widget to be unrealized (frees all GDK resources
     * associated with the widget).
     * <p>
     * This function is only useful in widget implementations.
     */
    public void unrealize() {
        try {
            DowncallHandles.gtk_widget_unrealize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Turns off flag values for the current widget state.
     * <p>
     * See {@link Widget#setStateFlags}.
     * <p>
     * This function is for use in widget implementations.
     * @param flags State flags to turn off
     */
    public void unsetStateFlags(org.gtk.gtk.StateFlags flags) {
        try {
            DowncallHandles.gtk_widget_unset_state_flags.invokeExact(
                    handle(),
                    flags.getValue());
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
            RESULT = (long) DowncallHandles.gtk_widget_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Obtains the current default reading direction.
     * <p>
     * See {@link Widget#setDefaultDirection}.
     * @return the current default direction.
     */
    public static org.gtk.gtk.TextDirection getDefaultDirection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_get_default_direction.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.TextDirection.of(RESULT);
    }
    
    /**
     * Sets the default reading direction for widgets.
     * <p>
     * See {@link Widget#setDirection}.
     * @param dir the new default direction. This cannot be {@link TextDirection#NONE}.
     */
    public static void setDefaultDirection(org.gtk.gtk.TextDirection dir) {
        try {
            DowncallHandles.gtk_widget_set_default_direction.invokeExact(
                    dir.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Destroy {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWidget) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Destroy.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Signals that all holders of a reference to the widget should release
     * the reference that they hold.
     * <p>
     * May result in finalization of the widget if all references are released.
     * <p>
     * This signal is not suitable for saving widget state.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Widget.Destroy> onDestroy(Widget.Destroy handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("destroy"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DirectionChanged {
        void run(org.gtk.gtk.TextDirection previousDirection);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWidget, int previousDirection) {
            run(org.gtk.gtk.TextDirection.of(previousDirection));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DirectionChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the text direction of a widget changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Widget.DirectionChanged> onDirectionChanged(Widget.DirectionChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("direction-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Hide {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWidget) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Hide.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when {@code widget} is hidden.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Widget.Hide> onHide(Widget.Hide handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("hide"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface KeynavFailed {
        boolean run(org.gtk.gtk.DirectionType direction);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceWidget, int direction) {
            var RESULT = run(org.gtk.gtk.DirectionType.of(direction));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(KeynavFailed.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted if keyboard navigation fails.
     * <p>
     * See {@link Widget#keynavFailed} for details.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Widget.KeynavFailed> onKeynavFailed(Widget.KeynavFailed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("keynav-failed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Map {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWidget) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Map.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when {@code widget} is going to be mapped.
     * <p>
     * A widget is mapped when the widget is visible (which is controlled with
     * {@code Gtk.Widget:visible}) and all its parents up to the toplevel widget
     * are also visible.
     * <p>
     * The ::map signal can be used to determine whether a widget will be drawn,
     * for instance it can resume an animation that was stopped during the
     * emission of {@code Gtk.Widget::unmap}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Widget.Map> onMap(Widget.Map handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("map"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MnemonicActivate {
        boolean run(boolean groupCycling);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceWidget, int groupCycling) {
            var RESULT = run(Marshal.integerToBoolean.marshal(groupCycling, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MnemonicActivate.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when a widget is activated via a mnemonic.
     * <p>
     * The default handler for this signal activates {@code widget} if {@code group_cycling}
     * is {@code false}, or just makes {@code widget} grab focus if {@code group_cycling} is {@code true}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Widget.MnemonicActivate> onMnemonicActivate(Widget.MnemonicActivate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("mnemonic-activate"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveFocus {
        void run(org.gtk.gtk.DirectionType direction);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWidget, int direction) {
            run(org.gtk.gtk.DirectionType.of(direction));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MoveFocus.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the focus is moved.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Widget.MoveFocus> onMoveFocus(Widget.MoveFocus handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("move-focus"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface QueryTooltip {
        boolean run(int x, int y, boolean keyboardMode, org.gtk.gtk.Tooltip tooltip);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceWidget, int x, int y, int keyboardMode, MemoryAddress tooltip) {
            var RESULT = run(x, y, Marshal.integerToBoolean.marshal(keyboardMode, null).booleanValue(), (org.gtk.gtk.Tooltip) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(tooltip)), org.gtk.gtk.Tooltip.fromAddress).marshal(tooltip, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QueryTooltip.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the widgets tooltip is about to be shown.
     * <p>
     * This happens when the {@code Gtk.Widget:has-tooltip} property
     * is {@code true} and the hover timeout has expired with the cursor hovering
     * "above" {@code widget}; or emitted when {@code widget} got focus in keyboard mode.
     * <p>
     * Using the given coordinates, the signal handler should determine
     * whether a tooltip should be shown for {@code widget}. If this is the case
     * {@code true} should be returned, {@code false} otherwise.  Note that if
     * {@code keyboard_mode} is {@code true}, the values of {@code x} and {@code y} are undefined and
     * should not be used.
     * <p>
     * The signal handler is free to manipulate {@code tooltip} with the therefore
     * destined function calls.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Widget.QueryTooltip> onQueryTooltip(Widget.QueryTooltip handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("query-tooltip"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Realize {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWidget) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Realize.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when {@code widget} is associated with a {@code GdkSurface}.
     * <p>
     * This means that {@link Widget#realize} has been called
     * or the widget has been mapped (that is, it is going to be drawn).
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Widget.Realize> onRealize(Widget.Realize handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("realize"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Show {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWidget) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Show.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when {@code widget} is shown.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Widget.Show> onShow(Widget.Show handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("show"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface StateFlagsChanged {
        void run(org.gtk.gtk.StateFlags flags);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWidget, int flags) {
            run(new org.gtk.gtk.StateFlags(flags));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StateFlagsChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the widget state changes.
     * <p>
     * See {@link Widget#getStateFlags}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Widget.StateFlagsChanged> onStateFlagsChanged(Widget.StateFlagsChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("state-flags-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Unmap {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWidget) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Unmap.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when {@code widget} is going to be unmapped.
     * <p>
     * A widget is unmapped when either it or any of its parents up to the
     * toplevel widget have been set as hidden.
     * <p>
     * As ::unmap indicates that a widget will not be shown any longer,
     * it can be used to, for example, stop an animation on the widget.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Widget.Unmap> onUnmap(Widget.Unmap handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("unmap"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Unrealize {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWidget) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Unrealize.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the {@code GdkSurface} associated with {@code widget} is destroyed.
     * <p>
     * This means that {@link Widget#unrealize} has been called
     * or the widget has been unmapped (that is, it is going to be hidden).
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Widget.Unrealize> onUnrealize(Widget.Unrealize handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("unrealize"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Widget.Builder} object constructs a {@link Widget} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Widget.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.InitiallyUnowned.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Widget} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Widget}.
         * @return A new instance of {@code Widget} with the properties 
         *         that were set in the Builder object.
         */
        public Widget build() {
            return (Widget) org.gtk.gobject.GObject.newWithProperties(
                Widget.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether the widget or any of its descendents can accept
         * the input focus.
         * <p>
         * This property is meant to be set by widget implementations,
         * typically in their instance init function.
         * @param canFocus The value for the {@code can-focus} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCanFocus(boolean canFocus) {
            names.add("can-focus");
            values.add(org.gtk.gobject.Value.create(canFocus));
            return this;
        }
        
        /**
         * Whether the widget can receive pointer events.
         * @param canTarget The value for the {@code can-target} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCanTarget(boolean canTarget) {
            names.add("can-target");
            values.add(org.gtk.gobject.Value.create(canTarget));
            return this;
        }
        
        /**
         * The name of this widget in the CSS tree.
         * <p>
         * This property is meant to be set by widget implementations,
         * typically in their instance init function.
         * @param cssName The value for the {@code css-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCssName(java.lang.String cssName) {
            names.add("css-name");
            values.add(org.gtk.gobject.Value.create(cssName));
            return this;
        }
        
        /**
         * The cursor used by {@code widget}.
         * @param cursor The value for the {@code cursor} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCursor(org.gtk.gdk.Cursor cursor) {
            names.add("cursor");
            values.add(org.gtk.gobject.Value.create(cursor));
            return this;
        }
        
        /**
         * Whether the widget should grab focus when it is clicked with the mouse.
         * <p>
         * This property is only relevant for widgets that can take focus.
         * @param focusOnClick The value for the {@code focus-on-click} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFocusOnClick(boolean focusOnClick) {
            names.add("focus-on-click");
            values.add(org.gtk.gobject.Value.create(focusOnClick));
            return this;
        }
        
        /**
         * Whether this widget itself will accept the input focus.
         * @param focusable The value for the {@code focusable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFocusable(boolean focusable) {
            names.add("focusable");
            values.add(org.gtk.gobject.Value.create(focusable));
            return this;
        }
        
        /**
         * How to distribute horizontal space if widget gets extra space.
         * @param halign The value for the {@code halign} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHalign(org.gtk.gtk.Align halign) {
            names.add("halign");
            values.add(org.gtk.gobject.Value.create(halign));
            return this;
        }
        
        /**
         * Whether the widget is the default widget.
         * @param hasDefault The value for the {@code has-default} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHasDefault(boolean hasDefault) {
            names.add("has-default");
            values.add(org.gtk.gobject.Value.create(hasDefault));
            return this;
        }
        
        /**
         * Whether the widget has the input focus.
         * @param hasFocus The value for the {@code has-focus} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHasFocus(boolean hasFocus) {
            names.add("has-focus");
            values.add(org.gtk.gobject.Value.create(hasFocus));
            return this;
        }
        
        /**
         * Enables or disables the emission of the ::query-tooltip signal on {@code widget}.
         * <p>
         * A value of {@code true} indicates that {@code widget} can have a tooltip, in this case
         * the widget will be queried using {@code Gtk.Widget::query-tooltip} to
         * determine whether it will provide a tooltip or not.
         * @param hasTooltip The value for the {@code has-tooltip} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHasTooltip(boolean hasTooltip) {
            names.add("has-tooltip");
            values.add(org.gtk.gobject.Value.create(hasTooltip));
            return this;
        }
        
        /**
         * Override for height request of the widget.
         * <p>
         * If this is -1, the natural request will be used.
         * @param heightRequest The value for the {@code height-request} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHeightRequest(int heightRequest) {
            names.add("height-request");
            values.add(org.gtk.gobject.Value.create(heightRequest));
            return this;
        }
        
        /**
         * Whether to expand horizontally.
         * @param hexpand The value for the {@code hexpand} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHexpand(boolean hexpand) {
            names.add("hexpand");
            values.add(org.gtk.gobject.Value.create(hexpand));
            return this;
        }
        
        /**
         * Whether to use the {@code hexpand} property.
         * @param hexpandSet The value for the {@code hexpand-set} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHexpandSet(boolean hexpandSet) {
            names.add("hexpand-set");
            values.add(org.gtk.gobject.Value.create(hexpandSet));
            return this;
        }
        
        /**
         * The {@code GtkLayoutManager} instance to use to compute the preferred size
         * of the widget, and allocate its children.
         * <p>
         * This property is meant to be set by widget implementations,
         * typically in their instance init function.
         * @param layoutManager The value for the {@code layout-manager} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLayoutManager(org.gtk.gtk.LayoutManager layoutManager) {
            names.add("layout-manager");
            values.add(org.gtk.gobject.Value.create(layoutManager));
            return this;
        }
        
        /**
         * Margin on bottom side of widget.
         * <p>
         * This property adds margin outside of the widget's normal size
         * request, the margin will be added in addition to the size from
         * {@link Widget#setSizeRequest} for example.
         * @param marginBottom The value for the {@code margin-bottom} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMarginBottom(int marginBottom) {
            names.add("margin-bottom");
            values.add(org.gtk.gobject.Value.create(marginBottom));
            return this;
        }
        
        /**
         * Margin on end of widget, horizontally.
         * <p>
         * This property supports left-to-right and right-to-left text
         * directions.
         * <p>
         * This property adds margin outside of the widget's normal size
         * request, the margin will be added in addition to the size from
         * {@link Widget#setSizeRequest} for example.
         * @param marginEnd The value for the {@code margin-end} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMarginEnd(int marginEnd) {
            names.add("margin-end");
            values.add(org.gtk.gobject.Value.create(marginEnd));
            return this;
        }
        
        /**
         * Margin on start of widget, horizontally.
         * <p>
         * This property supports left-to-right and right-to-left text
         * directions.
         * <p>
         * This property adds margin outside of the widget's normal size
         * request, the margin will be added in addition to the size from
         * {@link Widget#setSizeRequest} for example.
         * @param marginStart The value for the {@code margin-start} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMarginStart(int marginStart) {
            names.add("margin-start");
            values.add(org.gtk.gobject.Value.create(marginStart));
            return this;
        }
        
        /**
         * Margin on top side of widget.
         * <p>
         * This property adds margin outside of the widget's normal size
         * request, the margin will be added in addition to the size from
         * {@link Widget#setSizeRequest} for example.
         * @param marginTop The value for the {@code margin-top} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMarginTop(int marginTop) {
            names.add("margin-top");
            values.add(org.gtk.gobject.Value.create(marginTop));
            return this;
        }
        
        /**
         * The name of the widget.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
        
        /**
         * The requested opacity of the widget.
         * @param opacity The value for the {@code opacity} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOpacity(double opacity) {
            names.add("opacity");
            values.add(org.gtk.gobject.Value.create(opacity));
            return this;
        }
        
        /**
         * How content outside the widget's content area is treated.
         * <p>
         * This property is meant to be set by widget implementations,
         * typically in their instance init function.
         * @param overflow The value for the {@code overflow} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOverflow(org.gtk.gtk.Overflow overflow) {
            names.add("overflow");
            values.add(org.gtk.gobject.Value.create(overflow));
            return this;
        }
        
        /**
         * The parent widget of this widget.
         * @param parent The value for the {@code parent} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParent(org.gtk.gtk.Widget parent) {
            names.add("parent");
            values.add(org.gtk.gobject.Value.create(parent));
            return this;
        }
        
        /**
         * Whether the widget will receive the default action when it is focused.
         * @param receivesDefault The value for the {@code receives-default} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setReceivesDefault(boolean receivesDefault) {
            names.add("receives-default");
            values.add(org.gtk.gobject.Value.create(receivesDefault));
            return this;
        }
        
        /**
         * The {@code GtkRoot} widget of the widget tree containing this widget.
         * <p>
         * This will be {@code null} if the widget is not contained in a root widget.
         * @param root The value for the {@code root} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRoot(org.gtk.gtk.Root root) {
            names.add("root");
            values.add(org.gtk.gobject.Value.create(root));
            return this;
        }
        
        /**
         * The scale factor of the widget.
         * @param scaleFactor The value for the {@code scale-factor} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScaleFactor(int scaleFactor) {
            names.add("scale-factor");
            values.add(org.gtk.gobject.Value.create(scaleFactor));
            return this;
        }
        
        /**
         * Whether the widget responds to input.
         * @param sensitive The value for the {@code sensitive} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSensitive(boolean sensitive) {
            names.add("sensitive");
            values.add(org.gtk.gobject.Value.create(sensitive));
            return this;
        }
        
        /**
         * Sets the text of tooltip to be the given string, which is marked up
         * with Pango markup.
         * <p>
         * Also see {@link Tooltip#setMarkup}.
         * <p>
         * This is a convenience property which will take care of getting the
         * tooltip shown if the given string is not {@code null}:
         * {@code Gtk.Widget:has-tooltip} will automatically be set to {@code true}
         * and there will be taken care of {@code Gtk.Widget::query-tooltip} in
         * the default signal handler.
         * <p>
         * Note that if both {@code Gtk.Widget:tooltip-text} and
         * {@code Gtk.Widget:tooltip-markup} are set, the last one wins.
         * @param tooltipMarkup The value for the {@code tooltip-markup} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTooltipMarkup(java.lang.String tooltipMarkup) {
            names.add("tooltip-markup");
            values.add(org.gtk.gobject.Value.create(tooltipMarkup));
            return this;
        }
        
        /**
         * Sets the text of tooltip to be the given string.
         * <p>
         * Also see {@link Tooltip#setText}.
         * <p>
         * This is a convenience property which will take care of getting the
         * tooltip shown if the given string is not {@code null}:
         * {@code Gtk.Widget:has-tooltip} will automatically be set to {@code true}
         * and there will be taken care of {@code Gtk.Widget::query-tooltip} in
         * the default signal handler.
         * <p>
         * Note that if both {@code Gtk.Widget:tooltip-text} and
         * {@code Gtk.Widget:tooltip-markup} are set, the last one wins.
         * @param tooltipText The value for the {@code tooltip-text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTooltipText(java.lang.String tooltipText) {
            names.add("tooltip-text");
            values.add(org.gtk.gobject.Value.create(tooltipText));
            return this;
        }
        
        /**
         * How to distribute vertical space if widget gets extra space.
         * @param valign The value for the {@code valign} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValign(org.gtk.gtk.Align valign) {
            names.add("valign");
            values.add(org.gtk.gobject.Value.create(valign));
            return this;
        }
        
        /**
         * Whether to expand vertically.
         * @param vexpand The value for the {@code vexpand} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVexpand(boolean vexpand) {
            names.add("vexpand");
            values.add(org.gtk.gobject.Value.create(vexpand));
            return this;
        }
        
        /**
         * Whether to use the {@code vexpand} property.
         * @param vexpandSet The value for the {@code vexpand-set} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVexpandSet(boolean vexpandSet) {
            names.add("vexpand-set");
            values.add(org.gtk.gobject.Value.create(vexpandSet));
            return this;
        }
        
        /**
         * Whether the widget is visible.
         * @param visible The value for the {@code visible} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVisible(boolean visible) {
            names.add("visible");
            values.add(org.gtk.gobject.Value.create(visible));
            return this;
        }
        
        /**
         * Override for width request of the widget.
         * <p>
         * If this is -1, the natural request will be used.
         * @param widthRequest The value for the {@code width-request} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWidthRequest(int widthRequest) {
            names.add("width-request");
            values.add(org.gtk.gobject.Value.create(widthRequest));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_widget_action_set_enabled = Interop.downcallHandle(
            "gtk_widget_action_set_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_activate = Interop.downcallHandle(
            "gtk_widget_activate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_activate_action_variant = Interop.downcallHandle(
            "gtk_widget_activate_action_variant",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_activate_default = Interop.downcallHandle(
            "gtk_widget_activate_default",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_add_controller = Interop.downcallHandle(
            "gtk_widget_add_controller",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_add_css_class = Interop.downcallHandle(
            "gtk_widget_add_css_class",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_add_mnemonic_label = Interop.downcallHandle(
            "gtk_widget_add_mnemonic_label",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_add_tick_callback = Interop.downcallHandle(
            "gtk_widget_add_tick_callback",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_allocate = Interop.downcallHandle(
            "gtk_widget_allocate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_child_focus = Interop.downcallHandle(
            "gtk_widget_child_focus",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_compute_bounds = Interop.downcallHandle(
            "gtk_widget_compute_bounds",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_compute_expand = Interop.downcallHandle(
            "gtk_widget_compute_expand",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_compute_point = Interop.downcallHandle(
            "gtk_widget_compute_point",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_compute_transform = Interop.downcallHandle(
            "gtk_widget_compute_transform",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_contains = Interop.downcallHandle(
            "gtk_widget_contains",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_widget_create_pango_context = Interop.downcallHandle(
            "gtk_widget_create_pango_context",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_create_pango_layout = Interop.downcallHandle(
            "gtk_widget_create_pango_layout",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_dispose_template = Interop.downcallHandle(
            "gtk_widget_dispose_template",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gtk_drag_check_threshold = Interop.downcallHandle(
            "gtk_drag_check_threshold",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_error_bell = Interop.downcallHandle(
            "gtk_widget_error_bell",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_allocated_baseline = Interop.downcallHandle(
            "gtk_widget_get_allocated_baseline",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_allocated_height = Interop.downcallHandle(
            "gtk_widget_get_allocated_height",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_allocated_width = Interop.downcallHandle(
            "gtk_widget_get_allocated_width",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_allocation = Interop.downcallHandle(
            "gtk_widget_get_allocation",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_ancestor = Interop.downcallHandle(
            "gtk_widget_get_ancestor",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gtk_widget_get_can_focus = Interop.downcallHandle(
            "gtk_widget_get_can_focus",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_can_target = Interop.downcallHandle(
            "gtk_widget_get_can_target",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_child_visible = Interop.downcallHandle(
            "gtk_widget_get_child_visible",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_clipboard = Interop.downcallHandle(
            "gtk_widget_get_clipboard",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_css_classes = Interop.downcallHandle(
            "gtk_widget_get_css_classes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_css_name = Interop.downcallHandle(
            "gtk_widget_get_css_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_cursor = Interop.downcallHandle(
            "gtk_widget_get_cursor",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_direction = Interop.downcallHandle(
            "gtk_widget_get_direction",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_display = Interop.downcallHandle(
            "gtk_widget_get_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_first_child = Interop.downcallHandle(
            "gtk_widget_get_first_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_focus_child = Interop.downcallHandle(
            "gtk_widget_get_focus_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_focus_on_click = Interop.downcallHandle(
            "gtk_widget_get_focus_on_click",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_focusable = Interop.downcallHandle(
            "gtk_widget_get_focusable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_font_map = Interop.downcallHandle(
            "gtk_widget_get_font_map",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_font_options = Interop.downcallHandle(
            "gtk_widget_get_font_options",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_frame_clock = Interop.downcallHandle(
            "gtk_widget_get_frame_clock",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_halign = Interop.downcallHandle(
            "gtk_widget_get_halign",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_has_tooltip = Interop.downcallHandle(
            "gtk_widget_get_has_tooltip",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_height = Interop.downcallHandle(
            "gtk_widget_get_height",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_hexpand = Interop.downcallHandle(
            "gtk_widget_get_hexpand",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_hexpand_set = Interop.downcallHandle(
            "gtk_widget_get_hexpand_set",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_last_child = Interop.downcallHandle(
            "gtk_widget_get_last_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_layout_manager = Interop.downcallHandle(
            "gtk_widget_get_layout_manager",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_mapped = Interop.downcallHandle(
            "gtk_widget_get_mapped",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_margin_bottom = Interop.downcallHandle(
            "gtk_widget_get_margin_bottom",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_margin_end = Interop.downcallHandle(
            "gtk_widget_get_margin_end",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_margin_start = Interop.downcallHandle(
            "gtk_widget_get_margin_start",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_margin_top = Interop.downcallHandle(
            "gtk_widget_get_margin_top",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_name = Interop.downcallHandle(
            "gtk_widget_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_native = Interop.downcallHandle(
            "gtk_widget_get_native",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_next_sibling = Interop.downcallHandle(
            "gtk_widget_get_next_sibling",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_opacity = Interop.downcallHandle(
            "gtk_widget_get_opacity",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_overflow = Interop.downcallHandle(
            "gtk_widget_get_overflow",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_pango_context = Interop.downcallHandle(
            "gtk_widget_get_pango_context",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_parent = Interop.downcallHandle(
            "gtk_widget_get_parent",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_preferred_size = Interop.downcallHandle(
            "gtk_widget_get_preferred_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_prev_sibling = Interop.downcallHandle(
            "gtk_widget_get_prev_sibling",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_primary_clipboard = Interop.downcallHandle(
            "gtk_widget_get_primary_clipboard",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_realized = Interop.downcallHandle(
            "gtk_widget_get_realized",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_receives_default = Interop.downcallHandle(
            "gtk_widget_get_receives_default",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_request_mode = Interop.downcallHandle(
            "gtk_widget_get_request_mode",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_root = Interop.downcallHandle(
            "gtk_widget_get_root",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_scale_factor = Interop.downcallHandle(
            "gtk_widget_get_scale_factor",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_sensitive = Interop.downcallHandle(
            "gtk_widget_get_sensitive",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_settings = Interop.downcallHandle(
            "gtk_widget_get_settings",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_size = Interop.downcallHandle(
            "gtk_widget_get_size",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_get_size_request = Interop.downcallHandle(
            "gtk_widget_get_size_request",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_state_flags = Interop.downcallHandle(
            "gtk_widget_get_state_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_style_context = Interop.downcallHandle(
            "gtk_widget_get_style_context",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_template_child = Interop.downcallHandle(
            "gtk_widget_get_template_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_tooltip_markup = Interop.downcallHandle(
            "gtk_widget_get_tooltip_markup",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_tooltip_text = Interop.downcallHandle(
            "gtk_widget_get_tooltip_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_valign = Interop.downcallHandle(
            "gtk_widget_get_valign",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_vexpand = Interop.downcallHandle(
            "gtk_widget_get_vexpand",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_vexpand_set = Interop.downcallHandle(
            "gtk_widget_get_vexpand_set",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_visible = Interop.downcallHandle(
            "gtk_widget_get_visible",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_get_width = Interop.downcallHandle(
            "gtk_widget_get_width",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_grab_focus = Interop.downcallHandle(
            "gtk_widget_grab_focus",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_has_css_class = Interop.downcallHandle(
            "gtk_widget_has_css_class",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_has_default = Interop.downcallHandle(
            "gtk_widget_has_default",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_has_focus = Interop.downcallHandle(
            "gtk_widget_has_focus",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_has_visible_focus = Interop.downcallHandle(
            "gtk_widget_has_visible_focus",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_hide = Interop.downcallHandle(
            "gtk_widget_hide",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_in_destruction = Interop.downcallHandle(
            "gtk_widget_in_destruction",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_init_template = Interop.downcallHandle(
            "gtk_widget_init_template",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_insert_action_group = Interop.downcallHandle(
            "gtk_widget_insert_action_group",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_insert_after = Interop.downcallHandle(
            "gtk_widget_insert_after",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_insert_before = Interop.downcallHandle(
            "gtk_widget_insert_before",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_is_ancestor = Interop.downcallHandle(
            "gtk_widget_is_ancestor",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_is_drawable = Interop.downcallHandle(
            "gtk_widget_is_drawable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_is_focus = Interop.downcallHandle(
            "gtk_widget_is_focus",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_is_sensitive = Interop.downcallHandle(
            "gtk_widget_is_sensitive",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_is_visible = Interop.downcallHandle(
            "gtk_widget_is_visible",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_keynav_failed = Interop.downcallHandle(
            "gtk_widget_keynav_failed",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_list_mnemonic_labels = Interop.downcallHandle(
            "gtk_widget_list_mnemonic_labels",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_map = Interop.downcallHandle(
            "gtk_widget_map",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_measure = Interop.downcallHandle(
            "gtk_widget_measure",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_mnemonic_activate = Interop.downcallHandle(
            "gtk_widget_mnemonic_activate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_observe_children = Interop.downcallHandle(
            "gtk_widget_observe_children",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_observe_controllers = Interop.downcallHandle(
            "gtk_widget_observe_controllers",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_pick = Interop.downcallHandle(
            "gtk_widget_pick",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_queue_allocate = Interop.downcallHandle(
            "gtk_widget_queue_allocate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_queue_draw = Interop.downcallHandle(
            "gtk_widget_queue_draw",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_queue_resize = Interop.downcallHandle(
            "gtk_widget_queue_resize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_realize = Interop.downcallHandle(
            "gtk_widget_realize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_remove_controller = Interop.downcallHandle(
            "gtk_widget_remove_controller",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_remove_css_class = Interop.downcallHandle(
            "gtk_widget_remove_css_class",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_remove_mnemonic_label = Interop.downcallHandle(
            "gtk_widget_remove_mnemonic_label",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_remove_tick_callback = Interop.downcallHandle(
            "gtk_widget_remove_tick_callback",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_can_focus = Interop.downcallHandle(
            "gtk_widget_set_can_focus",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_can_target = Interop.downcallHandle(
            "gtk_widget_set_can_target",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_child_visible = Interop.downcallHandle(
            "gtk_widget_set_child_visible",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_css_classes = Interop.downcallHandle(
            "gtk_widget_set_css_classes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_set_cursor = Interop.downcallHandle(
            "gtk_widget_set_cursor",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_set_cursor_from_name = Interop.downcallHandle(
            "gtk_widget_set_cursor_from_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_set_direction = Interop.downcallHandle(
            "gtk_widget_set_direction",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_focus_child = Interop.downcallHandle(
            "gtk_widget_set_focus_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_set_focus_on_click = Interop.downcallHandle(
            "gtk_widget_set_focus_on_click",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_focusable = Interop.downcallHandle(
            "gtk_widget_set_focusable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_font_map = Interop.downcallHandle(
            "gtk_widget_set_font_map",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_set_font_options = Interop.downcallHandle(
            "gtk_widget_set_font_options",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_set_halign = Interop.downcallHandle(
            "gtk_widget_set_halign",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_has_tooltip = Interop.downcallHandle(
            "gtk_widget_set_has_tooltip",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_hexpand = Interop.downcallHandle(
            "gtk_widget_set_hexpand",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_hexpand_set = Interop.downcallHandle(
            "gtk_widget_set_hexpand_set",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_layout_manager = Interop.downcallHandle(
            "gtk_widget_set_layout_manager",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_set_margin_bottom = Interop.downcallHandle(
            "gtk_widget_set_margin_bottom",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_margin_end = Interop.downcallHandle(
            "gtk_widget_set_margin_end",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_margin_start = Interop.downcallHandle(
            "gtk_widget_set_margin_start",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_margin_top = Interop.downcallHandle(
            "gtk_widget_set_margin_top",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_name = Interop.downcallHandle(
            "gtk_widget_set_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_set_opacity = Interop.downcallHandle(
            "gtk_widget_set_opacity",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_widget_set_overflow = Interop.downcallHandle(
            "gtk_widget_set_overflow",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_parent = Interop.downcallHandle(
            "gtk_widget_set_parent",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_set_receives_default = Interop.downcallHandle(
            "gtk_widget_set_receives_default",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_sensitive = Interop.downcallHandle(
            "gtk_widget_set_sensitive",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_size_request = Interop.downcallHandle(
            "gtk_widget_set_size_request",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_state_flags = Interop.downcallHandle(
            "gtk_widget_set_state_flags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_tooltip_markup = Interop.downcallHandle(
            "gtk_widget_set_tooltip_markup",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_set_tooltip_text = Interop.downcallHandle(
            "gtk_widget_set_tooltip_text",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_set_valign = Interop.downcallHandle(
            "gtk_widget_set_valign",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_vexpand = Interop.downcallHandle(
            "gtk_widget_set_vexpand",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_vexpand_set = Interop.downcallHandle(
            "gtk_widget_set_vexpand_set",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_visible = Interop.downcallHandle(
            "gtk_widget_set_visible",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_should_layout = Interop.downcallHandle(
            "gtk_widget_should_layout",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_show = Interop.downcallHandle(
            "gtk_widget_show",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_size_allocate = Interop.downcallHandle(
            "gtk_widget_size_allocate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_snapshot_child = Interop.downcallHandle(
            "gtk_widget_snapshot_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_translate_coordinates = Interop.downcallHandle(
            "gtk_widget_translate_coordinates",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_trigger_tooltip_query = Interop.downcallHandle(
            "gtk_widget_trigger_tooltip_query",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_unmap = Interop.downcallHandle(
            "gtk_widget_unmap",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_unparent = Interop.downcallHandle(
            "gtk_widget_unparent",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_unrealize = Interop.downcallHandle(
            "gtk_widget_unrealize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_unset_state_flags = Interop.downcallHandle(
            "gtk_widget_unset_state_flags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_get_type = Interop.downcallHandle(
            "gtk_widget_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gtk_widget_get_default_direction = Interop.downcallHandle(
            "gtk_widget_get_default_direction",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_set_default_direction = Interop.downcallHandle(
            "gtk_widget_set_default_direction",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT),
            false
        );
    }
}
