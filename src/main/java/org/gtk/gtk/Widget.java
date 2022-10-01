package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The base class for all widgets.
 * <p>
 * {@code GtkWidget} is the base class all widgets in GTK derive from. It manages the
 * widget lifecycle, layout, states and style.
 * <p>
 * <h3>Height-for-width Geometry Management</h3>
 * <p>
 * GTK uses a height-for-width (and width-for-height) geometry management
 * system. Height-for-width means that a widget can change how much
 * vertical space it needs, depending on the amount of horizontal space
 * that it is given (and similar for width-for-height). The most common
 * example is a label that reflows to fill up the available width, wraps
 * to fewer lines, and therefore needs less height.
 * <p>
 * Height-for-width geometry management is implemented in GTK by way
 * of two virtual methods:
 * <p>
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
 * <p>
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
 * <h3>GtkWidget as GtkBuildable</h3>
 * <p>
 * The {@code GtkWidget} implementation of the {@code GtkBuildable} interface
 * supports various custom elements to specify additional aspects of widgets
 * that are not directly expressed as properties.
 * <p>
 * If the widget uses a {@link LayoutManager}, {@code GtkWidget} supports
 * a custom {@code <layout>} element, used to define layout properties:
 * <p>
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
 * <p>
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
 * <p>
 * <pre>{@code xml
 * <object class="GtkButton" id="button1">
 *   <accessibility>
 *     <property name="label">Download</property>
 *     <relation name="labelled-by">label1</relation>
 *   </accessibility>
 * </object>
 * }</pre>
 * <p>
 * <h3>Building composite widgets from template XML</h3>
 * <p>
 * {@code GtkWidget }exposes some facilities to automate the procedure
 * of creating composite widgets using "templates".
 * <p>
 * To create composite widgets with {@code GtkBuilder} XML, one must associate
 * the interface description with the widget class at class initialization
 * time using {@link WidgetClass#setTemplate}.
 * <p>
 * The interface description semantics expected in composite template descriptions
 * is slightly different from regular {@link Builder} XML.
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
 * <p>
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
 * <p>
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
 * <p>
 * <pre>{@code c
 * static void
 * foo_widget_init (FooWidget *self)
 * {
 *   // ...
 *   gtk_widget_init_template (GTK_WIDGET (self));
 * }
 * }</pre>
 * <p>
 * You can access widgets defined in the template using the
 * {@link Widget#getTemplateChild} function, but you will typically declare
 * a pointer in the instance private data structure of your type using the same
 * name as the widget in the template definition, and call
 * {@link WidgetClass#bindTemplateChildFull} (or one of its wrapper macros
 * {@code Gtk.widget_class_bind_template_child_private})
 * with that name, e.g.
 * <p>
 * <pre>{@code c
 * typedef struct {
 *   GtkWidget *hello_button;
 *   GtkWidget *goodbye_button;
 * } FooWidgetPrivate;
 * 
 * G_DEFINE_TYPE_WITH_PRIVATE (FooWidget, foo_widget, GTK_TYPE_BOX)
 * 
 * static void
 * foo_widget_class_init (FooWidgetClass *klass)
 * {
 *   // ...
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
 * 
 * }
 * }</pre>
 * <p>
 * You can also use {@link WidgetClass#bindTemplateCallbackFull} (or
 * is wrapper macro {@link Gtk#widgetClassBindTemplateCallback}) to connect
 * a signal callback defined in the template with a function visible in the
 * scope of the class, e.g.
 * <p>
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
public class Widget extends org.gtk.gobject.InitiallyUnowned implements Accessible, Buildable, ConstraintTarget {

    public Widget(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Widget */
    public static Widget castFrom(org.gtk.gobject.Object gobject) {
        return new Widget(gobject.refcounted());
    }
    
    /**
     * Enable or disable an action installed with
     * gtk_widget_class_install_action().
     */
    public void actionSetEnabled(java.lang.String actionName, boolean enabled) {
        gtk_h.gtk_widget_action_set_enabled(handle(), Interop.allocateNativeString(actionName).handle(), enabled ? 1 : 0);
    }
    
    /**
     * For widgets that can be “activated” (buttons, menu items, etc.),
     * this function activates them.
     * <p>
     * The activation will emit the signal set using
     * {@link WidgetClass#setActivateSignal} during class initialization.
     * <p>
     * Activation is what happens when you press &lt;kbd>Enter</kbd&gt;
     * on a widget during key navigation.
     * <p>
     * If you wish to handle the activation keybinding yourself, it is
     * recommended to use {@link WidgetClass#addShortcut} with an action
     * created with {@link SignalAction#SignalAction}.
     * <p>
     * If {@code widget} isn't activatable, the function returns {@code false}.
     */
    public boolean activate() {
        var RESULT = gtk_h.gtk_widget_activate(handle());
        return RESULT != 0;
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
     */
    public boolean activateActionVariant(java.lang.String name, org.gtk.glib.Variant args) {
        var RESULT = gtk_h.gtk_widget_activate_action_variant(handle(), Interop.allocateNativeString(name).handle(), args.handle());
        return RESULT != 0;
    }
    
    /**
     * Activates the {@code default.activate} action from {@code widget}.
     */
    public void activateDefault() {
        gtk_h.gtk_widget_activate_default(handle());
    }
    
    /**
     * Adds {@code controller} to {@code widget} so that it will receive events.
     * <p>
     * You will usually want to call this function right after
     * creating any kind of {@link EventController}.
     */
    public void addController(EventController controller) {
        gtk_h.gtk_widget_add_controller(handle(), controller.refcounted().unowned().handle());
    }
    
    /**
     * Adds a style class to {@code widget}.
     * <p>
     * After calling this function, the widgets style will match
     * for {@code css_class}, according to CSS matching rules.
     * <p>
     * Use {@link Widget#removeCssClass} to remove the
     * style again.
     */
    public void addCssClass(java.lang.String cssClass) {
        gtk_h.gtk_widget_add_css_class(handle(), Interop.allocateNativeString(cssClass).handle());
    }
    
    /**
     * Adds a widget to the list of mnemonic labels for this widget.
     * <p>
     * See {@link Widget#listMnemonicLabels}. Note the
     * list of mnemonic labels for the widget is cleared when the
     * widget is destroyed, so the caller must make sure to update
     * its internal state at this point as well.
     */
    public void addMnemonicLabel(Widget label) {
        gtk_h.gtk_widget_add_mnemonic_label(handle(), label.handle());
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
     * {@code Gtk.Widget.queue_draw}
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
     */
    public int addTickCallback(TickCallback callback) {
        try {
            var RESULT = gtk_h.gtk_widget_add_tick_callback(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTickCallback",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
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
     */
    public void allocate(int width, int height, int baseline, org.gtk.gsk.Transform transform) {
        gtk_h.gtk_widget_allocate(handle(), width, height, baseline, transform.refcounted().unowned().handle());
    }
    
    /**
     * Called by widgets as the user moves around the window using
     * keyboard shortcuts.
     * <p>
     * The {@code direction} argument indicates what kind of motion is taking place (up,
     * down, left, right, tab forward, tab backward).
     * <p>
     * This function calls the {@link Widget#focus} virtual function; widgets
     * can override the virtual function in order to implement appropriate focus
     * behavior.
     * <p>
     * The default {@code focus()} virtual function for a widget should return {@code TRUE} if
     * moving in {@code direction} left the focus on a focusable location inside that
     * widget, and {@code FALSE} if moving in {@code direction} moved the focus outside the
     * widget. When returning {@code TRUE}, widgets normallycall {@link Widget#grabFocus}
     * to place the focus accordingly; when returning {@code FALSE}, they don’t modify
     * the current focus location.
     * <p>
     * This function is used by custom widget implementations; if you're
     * writing an app, you’d use {@link Widget#grabFocus} to move
     * the focus to a particular widget.
     */
    public boolean childFocus(DirectionType direction) {
        var RESULT = gtk_h.gtk_widget_child_focus(handle(), direction.getValue());
        return RESULT != 0;
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
     */
    public boolean computeBounds(Widget target, org.gtk.graphene.Rect outBounds) {
        var RESULT = gtk_h.gtk_widget_compute_bounds(handle(), target.handle(), outBounds.handle());
        return RESULT != 0;
    }
    
    /**
     * Computes whether a container should give this widget
     * extra space when possible.
     * <p>
     * Containers should check this, rather than looking at
     * {@code Gtk.Widget.get_vexpand}.
     * <p>
     * This function already checks whether the widget is visible, so
     * visibility does not need to be checked separately. Non-visible
     * widgets are not expanded.
     * <p>
     * The computed expand value uses either the expand setting explicitly
     * set on the widget itself, or, if none has been explicitly set,
     * the widget may expand if some of its children do.
     */
    public boolean computeExpand(Orientation orientation) {
        var RESULT = gtk_h.gtk_widget_compute_expand(handle(), orientation.getValue());
        return RESULT != 0;
    }
    
    /**
     * Translates the given {@code point} in {@code widget}'s coordinates to coordinates
     * relative to {@code target}’s coordinate system.
     * <p>
     * In order to perform this operation, both widgets must share a
     * common ancestor.
     */
    public boolean computePoint(Widget target, org.gtk.graphene.Point point, org.gtk.graphene.Point outPoint) {
        var RESULT = gtk_h.gtk_widget_compute_point(handle(), target.handle(), point.handle(), outPoint.handle());
        return RESULT != 0;
    }
    
    /**
     * Computes a matrix suitable to describe a transformation from
     * {@code widget}'s coordinate system into {@code target}'s coordinate system.
     * <p>
     * The transform can not be computed in certain cases, for example
     * when {@code widget} and {@code target} do not share a common ancestor. In that
     * case {@code out_transform} gets set to the identity matrix.
     */
    public boolean computeTransform(Widget target, org.gtk.graphene.Matrix outTransform) {
        var RESULT = gtk_h.gtk_widget_compute_transform(handle(), target.handle(), outTransform.handle());
        return RESULT != 0;
    }
    
    /**
     * Tests if the point at (@x, @y) is contained in {@code widget}.
     * <p>
     * The coordinates for (@x, @y) must be in widget coordinates, so
     * (0, 0) is assumed to be the top left of {@code widget}'s content area.
     */
    public boolean contains(double x, double y) {
        var RESULT = gtk_h.gtk_widget_contains(handle(), x, y);
        return RESULT != 0;
    }
    
    /**
     * Creates a new {@code PangoContext} with the appropriate font map,
     * font options, font description, and base direction for drawing
     * text for this widget.
     * <p>
     * See also {@link Widget#getPangoContext}.
     */
    public org.pango.Context createPangoContext() {
        var RESULT = gtk_h.gtk_widget_create_pango_context(handle());
        return new org.pango.Context(Refcounted.get(RESULT, true));
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
     */
    public org.pango.Layout createPangoLayout(java.lang.String text) {
        var RESULT = gtk_h.gtk_widget_create_pango_layout(handle(), Interop.allocateNativeString(text).handle());
        return new org.pango.Layout(Refcounted.get(RESULT, true));
    }
    
    /**
     * Checks to see if a drag movement has passed the GTK drag threshold.
     */
    public boolean dragCheckThreshold(int startX, int startY, int currentX, int currentY) {
        var RESULT = gtk_h.gtk_drag_check_threshold(handle(), startX, startY, currentX, currentY);
        return RESULT != 0;
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
        gtk_h.gtk_widget_error_bell(handle());
    }
    
    /**
     * Returns the baseline that has currently been allocated to {@code widget}.
     * <p>
     * This function is intended to be used when implementing handlers
     * for the {@code GtkWidget}Class.snapshot() function, and when allocating
     * child widgets in {@code GtkWidget}Class.size_allocate().
     */
    public int getAllocatedBaseline() {
        var RESULT = gtk_h.gtk_widget_get_allocated_baseline(handle());
        return RESULT;
    }
    
    /**
     * Returns the height that has currently been allocated to {@code widget}.
     */
    public int getAllocatedHeight() {
        var RESULT = gtk_h.gtk_widget_get_allocated_height(handle());
        return RESULT;
    }
    
    /**
     * Returns the width that has currently been allocated to {@code widget}.
     */
    public int getAllocatedWidth() {
        var RESULT = gtk_h.gtk_widget_get_allocated_width(handle());
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
     */
    public void getAllocation(Allocation allocation) {
        gtk_h.gtk_widget_get_allocation(handle(), allocation.handle());
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
     */
    public Widget getAncestor(org.gtk.gobject.Type widgetType) {
        var RESULT = gtk_h.gtk_widget_get_ancestor(handle(), widgetType.getValue());
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Determines whether the input focus can enter {@code widget} or any
     * of its children.
     * <p>
     * See {@link Widget#setFocusable}.
     */
    public boolean getCanFocus() {
        var RESULT = gtk_h.gtk_widget_get_can_focus(handle());
        return RESULT != 0;
    }
    
    /**
     * Queries whether {@code widget} can be the target of pointer events.
     */
    public boolean getCanTarget() {
        var RESULT = gtk_h.gtk_widget_get_can_target(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the value set with gtk_widget_set_child_visible().
     * <p>
     * If you feel a need to use this function, your code probably
     * needs reorganization.
     * <p>
     * This function is only useful for container implementations
     * and should never be called by an application.
     */
    public boolean getChildVisible() {
        var RESULT = gtk_h.gtk_widget_get_child_visible(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the clipboard object for {@code widget}.
     * <p>
     * This is a utility function to get the clipboard object for the
     * {@code GdkDisplay} that {@code widget} is using.
     * <p>
     * Note that this function always works, even when {@code widget} is not
     * realized yet.
     */
    public org.gtk.gdk.Clipboard getClipboard() {
        var RESULT = gtk_h.gtk_widget_get_clipboard(handle());
        return new org.gtk.gdk.Clipboard(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the list of style classes applied to {@code widget}.
     */
    public PointerIterator<java.lang.String> getCssClasses() {
        var RESULT = gtk_h.gtk_widget_get_css_classes(handle());
        return new PointerString(RESULT).iterator();
    }
    
    /**
     * Returns the CSS name that is used for {@code self}.
     */
    public java.lang.String getCssName() {
        var RESULT = gtk_h.gtk_widget_get_css_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Queries the cursor set on {@code widget}.
     * <p>
     * See {@link Widget#setCursor} for details.
     */
    public org.gtk.gdk.Cursor getCursor() {
        var RESULT = gtk_h.gtk_widget_get_cursor(handle());
        return new org.gtk.gdk.Cursor(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the reading direction for a particular widget.
     * <p>
     * See {@link Widget#setDirection}.
     */
    public TextDirection getDirection() {
        var RESULT = gtk_h.gtk_widget_get_direction(handle());
        return new TextDirection(RESULT);
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
     */
    public org.gtk.gdk.Display getDisplay() {
        var RESULT = gtk_h.gtk_widget_get_display(handle());
        return new org.gtk.gdk.Display(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the widgets first child.
     * <p>
     * This API is primarily meant for widget implementations.
     */
    public Widget getFirstChild() {
        var RESULT = gtk_h.gtk_widget_get_first_child(handle());
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the current focus child of {@code widget}.
     */
    public Widget getFocusChild() {
        var RESULT = gtk_h.gtk_widget_get_focus_child(handle());
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns whether the widget should grab focus when it is clicked
     * with the mouse.
     * <p>
     * See {@link Widget#setFocusOnClick}.
     */
    public boolean getFocusOnClick() {
        var RESULT = gtk_h.gtk_widget_get_focus_on_click(handle());
        return RESULT != 0;
    }
    
    /**
     * Determines whether {@code widget} can own the input focus.
     * <p>
     * See {@link Widget#setFocusable}.
     */
    public boolean getFocusable() {
        var RESULT = gtk_h.gtk_widget_get_focusable(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the font map of {@code widget}.
     * <p>
     * See {@link Widget#setFontMap}.
     */
    public org.pango.FontMap getFontMap() {
        var RESULT = gtk_h.gtk_widget_get_font_map(handle());
        return new org.pango.FontMap(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the {@code cairo_font_options_t} of widget.
     * <p>
     * Seee {@link Widget#setFontOptions}.
     */
    public org.cairographics.FontOptions getFontOptions() {
        var RESULT = gtk_h.gtk_widget_get_font_options(handle());
        return new org.cairographics.FontOptions(Refcounted.get(RESULT, false));
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
     */
    public org.gtk.gdk.FrameClock getFrameClock() {
        var RESULT = gtk_h.gtk_widget_get_frame_clock(handle());
        return new org.gtk.gdk.FrameClock(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the horizontal alignment of {@code widget}.
     * <p>
     * For backwards compatibility reasons this method will never return
     * {@link Align#BASELINE}, but instead it will convert it to
     * {@link Align#FILL}. Baselines are not supported for horizontal
     * alignment.
     */
    public Align getHalign() {
        var RESULT = gtk_h.gtk_widget_get_halign(handle());
        return new Align(RESULT);
    }
    
    /**
     * Returns the current value of the {@code has-tooltip} property.
     */
    public boolean getHasTooltip() {
        var RESULT = gtk_h.gtk_widget_get_has_tooltip(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the content height of the widget.
     * <p>
     * This function returns the height passed to its
     * size-allocate implementation, which is the height you
     * should be using in {@link Widget#snapshot}.
     * <p>
     * For pointer events, see {@link Widget#contains}.
     */
    public int getHeight() {
        var RESULT = gtk_h.gtk_widget_get_height(handle());
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
     */
    public boolean getHexpand() {
        var RESULT = gtk_h.gtk_widget_get_hexpand(handle());
        return RESULT != 0;
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
     */
    public boolean getHexpandSet() {
        var RESULT = gtk_h.gtk_widget_get_hexpand_set(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the widgets last child.
     * <p>
     * This API is primarily meant for widget implementations.
     */
    public Widget getLastChild() {
        var RESULT = gtk_h.gtk_widget_get_last_child(handle());
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the layout manager used by {@code widget}.
     * <p>
     * See {@link Widget#setLayoutManager}.
     */
    public LayoutManager getLayoutManager() {
        var RESULT = gtk_h.gtk_widget_get_layout_manager(handle());
        return new LayoutManager(Refcounted.get(RESULT, false));
    }
    
    /**
     * Whether the widget is mapped.
     */
    public boolean getMapped() {
        var RESULT = gtk_h.gtk_widget_get_mapped(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the bottom margin of {@code widget}.
     */
    public int getMarginBottom() {
        var RESULT = gtk_h.gtk_widget_get_margin_bottom(handle());
        return RESULT;
    }
    
    /**
     * Gets the end margin of {@code widget}.
     */
    public int getMarginEnd() {
        var RESULT = gtk_h.gtk_widget_get_margin_end(handle());
        return RESULT;
    }
    
    /**
     * Gets the start margin of {@code widget}.
     */
    public int getMarginStart() {
        var RESULT = gtk_h.gtk_widget_get_margin_start(handle());
        return RESULT;
    }
    
    /**
     * Gets the top margin of {@code widget}.
     */
    public int getMarginTop() {
        var RESULT = gtk_h.gtk_widget_get_margin_top(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the name of a widget.
     * <p>
     * See {@link Widget#setName} for the significance of widget names.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.gtk_widget_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the nearest {@code GtkNative} ancestor of {@code widget}.
     * <p>
     * This function will return {@code null} if the widget is not
     * contained inside a widget tree with a native ancestor.
     * <p>
     * {@code GtkNative} widgets will return themselves here.
     */
    public Native getNative() {
        var RESULT = gtk_h.gtk_widget_get_native(handle());
        return new Native.NativeImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the widgets next sibling.
     * <p>
     * This API is primarily meant for widget implementations.
     */
    public Widget getNextSibling() {
        var RESULT = gtk_h.gtk_widget_get_next_sibling(handle());
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * {@code Fetches} the requested opacity for this widget.
     * <p>
     * See {@link Widget#setOpacity}.
     */
    public double getOpacity() {
        var RESULT = gtk_h.gtk_widget_get_opacity(handle());
        return RESULT;
    }
    
    /**
     * Returns the widgets overflow value.
     */
    public Overflow getOverflow() {
        var RESULT = gtk_h.gtk_widget_get_overflow(handle());
        return new Overflow(RESULT);
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
     */
    public org.pango.Context getPangoContext() {
        var RESULT = gtk_h.gtk_widget_get_pango_context(handle());
        return new org.pango.Context(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the parent widget of {@code widget}.
     */
    public Widget getParent() {
        var RESULT = gtk_h.gtk_widget_get_parent(handle());
        return new Widget(Refcounted.get(RESULT, false));
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
     */
    public void getPreferredSize(Requisition minimumSize, Requisition naturalSize) {
        gtk_h.gtk_widget_get_preferred_size(handle(), minimumSize.handle(), naturalSize.handle());
    }
    
    /**
     * Returns the widgets previous sibling.
     * <p>
     * This API is primarily meant for widget implementations.
     */
    public Widget getPrevSibling() {
        var RESULT = gtk_h.gtk_widget_get_prev_sibling(handle());
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the primary clipboard of {@code widget}.
     * <p>
     * This is a utility function to get the primary clipboard object
     * for the {@code GdkDisplay} that {@code widget} is using.
     * <p>
     * Note that this function always works, even when {@code widget} is not
     * realized yet.
     */
    public org.gtk.gdk.Clipboard getPrimaryClipboard() {
        var RESULT = gtk_h.gtk_widget_get_primary_clipboard(handle());
        return new org.gtk.gdk.Clipboard(Refcounted.get(RESULT, false));
    }
    
    /**
     * Determines whether {@code widget} is realized.
     */
    public boolean getRealized() {
        var RESULT = gtk_h.gtk_widget_get_realized(handle());
        return RESULT != 0;
    }
    
    /**
     * Determines whether {@code widget} is always treated as the default widget
     * within its toplevel when it has the focus, even if another widget
     * is the default.
     * <p>
     * See {@link Widget#setReceivesDefault}.
     */
    public boolean getReceivesDefault() {
        var RESULT = gtk_h.gtk_widget_get_receives_default(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether the widget prefers a height-for-width layout
     * or a width-for-height layout.
     * <p>
     * Single-child widgets generally propagate the preference of
     * their child, more complex widgets need to request something
     * either in context of their children or in context of their
     * allocation capabilities.
     */
    public SizeRequestMode getRequestMode() {
        var RESULT = gtk_h.gtk_widget_get_request_mode(handle());
        return new SizeRequestMode(RESULT);
    }
    
    /**
     * Returns the {@code GtkRoot} widget of {@code widget}.
     * <p>
     * This function will return {@code null} if the widget is not contained
     * inside a widget tree with a root widget.
     * <p>
     * {@code GtkRoot} widgets will return themselves here.
     */
    public Root getRoot() {
        var RESULT = gtk_h.gtk_widget_get_root(handle());
        return new Root.RootImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the internal scale factor that maps from window
     * coordinates to the actual device pixels.
     * <p>
     * On traditional systems this is 1, on high density outputs,
     * it can be a higher value (typically 2).
     * <p>
     * See {@link org.gtk.gdk.Surface#getScaleFactor}.
     */
    public int getScaleFactor() {
        var RESULT = gtk_h.gtk_widget_get_scale_factor(handle());
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
     */
    public boolean getSensitive() {
        var RESULT = gtk_h.gtk_widget_get_sensitive(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the settings object holding the settings used for this widget.
     * <p>
     * Note that this function can only be called when the {@code GtkWidget}
     * is attached to a toplevel, since the settings object is specific
     * to a particular {@code GdkDisplay}. If you want to monitor the widget for
     * changes in its settings, connect to the {@code notify::display} signal.
     */
    public Settings getSettings() {
        var RESULT = gtk_h.gtk_widget_get_settings(handle());
        return new Settings(Refcounted.get(RESULT, false));
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
     */
    public int getSize(Orientation orientation) {
        var RESULT = gtk_h.gtk_widget_get_size(handle(), orientation.getValue());
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
     */
    public void getSizeRequest(PointerInteger width, PointerInteger height) {
        gtk_h.gtk_widget_get_size_request(handle(), width.handle(), height.handle());
    }
    
    /**
     * Returns the widget state as a flag set.
     * <p>
     * It is worth mentioning that the effective {@link StateFlags#INSENSITIVE}
     * state will be returned, that is, also based on parent insensitivity,
     * even if {@code widget} itself is sensitive.
     * <p>
     * Also note that if you are looking for a way to obtain the
     * {@code Gtk.StyleContext}
     * method, you should look at {@link StyleContext#getState}.
     */
    public StateFlags getStateFlags() {
        var RESULT = gtk_h.gtk_widget_get_state_flags(handle());
        return new StateFlags(RESULT);
    }
    
    /**
     * Returns the style context associated to {@code widget}.
     * <p>
     * The returned object is guaranteed to be the same
     * for the lifetime of {@code widget}.
     */
    public StyleContext getStyleContext() {
        var RESULT = gtk_h.gtk_widget_get_style_context(handle());
        return new StyleContext(Refcounted.get(RESULT, false));
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
     */
    public org.gtk.gobject.Object getTemplateChild(org.gtk.gobject.Type widgetType, java.lang.String name) {
        var RESULT = gtk_h.gtk_widget_get_template_child(handle(), widgetType.getValue(), Interop.allocateNativeString(name).handle());
        return new org.gtk.gobject.Object(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the contents of the tooltip for {@code widget}.
     * <p>
     * If the tooltip has not been set using
     * {@link Widget#setTooltipMarkup}, this
     * function returns {@code null}.
     */
    public java.lang.String getTooltipMarkup() {
        var RESULT = gtk_h.gtk_widget_get_tooltip_markup(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the contents of the tooltip for {@code widget}.
     * <p>
     * If the {@code widget}'s tooltip was set using
     * {@link Widget#setTooltipMarkup},
     * this function will return the escaped text.
     */
    public java.lang.String getTooltipText() {
        var RESULT = gtk_h.gtk_widget_get_tooltip_text(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the vertical alignment of {@code widget}.
     */
    public Align getValign() {
        var RESULT = gtk_h.gtk_widget_get_valign(handle());
        return new Align(RESULT);
    }
    
    /**
     * Gets whether the widget would like any available extra vertical
     * space.
     * <p>
     * See {@link Widget#getHexpand} for more detail.
     */
    public boolean getVexpand() {
        var RESULT = gtk_h.gtk_widget_get_vexpand(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether gtk_widget_set_vexpand() has been used to
     * explicitly set the expand flag on this widget.
     * <p>
     * See {@link Widget#getHexpandSet} for more detail.
     */
    public boolean getVexpandSet() {
        var RESULT = gtk_h.gtk_widget_get_vexpand_set(handle());
        return RESULT != 0;
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
     */
    public boolean getVisible() {
        var RESULT = gtk_h.gtk_widget_get_visible(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the content width of the widget.
     * <p>
     * This function returns the width passed to its
     * size-allocate implementation, which is the width you
     * should be using in {@link Widget#snapshot}.
     * <p>
     * For pointer events, see {@link Widget#contains}.
     */
    public int getWidth() {
        var RESULT = gtk_h.gtk_widget_get_width(handle());
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
     */
    public boolean grabFocus() {
        var RESULT = gtk_h.gtk_widget_grab_focus(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether {@code css_class} is currently applied to {@code widget}.
     */
    public boolean hasCssClass(java.lang.String cssClass) {
        var RESULT = gtk_h.gtk_widget_has_css_class(handle(), Interop.allocateNativeString(cssClass).handle());
        return RESULT != 0;
    }
    
    /**
     * Determines whether {@code widget} is the current default widget
     * within its toplevel.
     */
    public boolean hasDefault() {
        var RESULT = gtk_h.gtk_widget_has_default(handle());
        return RESULT != 0;
    }
    
    /**
     * Determines if the widget has the global input focus.
     * <p>
     * See {@link Widget#isFocus} for the difference between
     * having the global input focus, and only having the focus
     * within a toplevel.
     */
    public boolean hasFocus() {
        var RESULT = gtk_h.gtk_widget_has_focus(handle());
        return RESULT != 0;
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
     */
    public boolean hasVisibleFocus() {
        var RESULT = gtk_h.gtk_widget_has_visible_focus(handle());
        return RESULT != 0;
    }
    
    /**
     * Reverses the effects of gtk_widget_show().
     * <p>
     * This is causing the widget to be hidden (invisible to the user).
     */
    public void hide() {
        gtk_h.gtk_widget_hide(handle());
    }
    
    /**
     * Returns whether the widget is currently being destroyed.
     * <p>
     * This information can sometimes be used to avoid doing
     * unnecessary work.
     */
    public boolean inDestruction() {
        var RESULT = gtk_h.gtk_widget_in_destruction(handle());
        return RESULT != 0;
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
     * <p>
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
        gtk_h.gtk_widget_init_template(handle());
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
     */
    public void insertActionGroup(java.lang.String name, org.gtk.gio.ActionGroup group) {
        gtk_h.gtk_widget_insert_action_group(handle(), Interop.allocateNativeString(name).handle(), group.handle());
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
     * just using a widget, you <strong>must</strong> use its own API for adding children.
     */
    public void insertAfter(Widget parent, Widget previousSibling) {
        gtk_h.gtk_widget_insert_after(handle(), parent.handle(), previousSibling.handle());
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
     * just using a widget, you <strong>must</strong> use its own API for adding children.
     */
    public void insertBefore(Widget parent, Widget nextSibling) {
        gtk_h.gtk_widget_insert_before(handle(), parent.handle(), nextSibling.handle());
    }
    
    /**
     * Determines whether {@code widget} is somewhere inside {@code ancestor},
     * possibly with intermediate containers.
     */
    public boolean isAncestor(Widget ancestor) {
        var RESULT = gtk_h.gtk_widget_is_ancestor(handle(), ancestor.handle());
        return RESULT != 0;
    }
    
    /**
     * Determines whether {@code widget} can be drawn to.
     * <p>
     * A widget can be drawn if it is mapped and visible.
     */
    public boolean isDrawable() {
        var RESULT = gtk_h.gtk_widget_is_drawable(handle());
        return RESULT != 0;
    }
    
    /**
     * Determines if the widget is the focus widget within its
     * toplevel.
     * <p>
     * This does not mean that the {@code Gtk.Widget:has-focus}
     * property is necessarily set; {@code Gtk.Widget:has-focus}
     * will only be set if the toplevel widget additionally has the
     * global input focus.
     */
    public boolean isFocus() {
        var RESULT = gtk_h.gtk_widget_is_focus(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the widget’s effective sensitivity.
     * <p>
     * This means it is sensitive itself and also its
     * parent widget is sensitive.
     */
    public boolean isSensitive() {
        var RESULT = gtk_h.gtk_widget_is_sensitive(handle());
        return RESULT != 0;
    }
    
    /**
     * Determines whether the widget and all its parents are marked as
     * visible.
     * <p>
     * This function does not check if the widget is obscured in any way.
     * <p>
     * See also {@link Widget#getVisible} and
     * {@link Widget#setVisible}.
     */
    public boolean isVisible() {
        var RESULT = gtk_h.gtk_widget_is_visible(handle());
        return RESULT != 0;
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
     */
    public boolean keynavFailed(DirectionType direction) {
        var RESULT = gtk_h.gtk_widget_keynav_failed(handle(), direction.getValue());
        return RESULT != 0;
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
     */
    public org.gtk.glib.List listMnemonicLabels() {
        var RESULT = gtk_h.gtk_widget_list_mnemonic_labels(handle());
        return new org.gtk.glib.List(Refcounted.get(RESULT, false));
    }
    
    /**
     * Causes a widget to be mapped if it isn’t already.
     * <p>
     * This function is only for use in widget implementations.
     */
    public void map() {
        gtk_h.gtk_widget_map(handle());
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
     */
    public void measure(Orientation orientation, int forSize, PointerInteger minimum, PointerInteger natural, PointerInteger minimumBaseline, PointerInteger naturalBaseline) {
        gtk_h.gtk_widget_measure(handle(), orientation.getValue(), forSize, minimum.handle(), natural.handle(), minimumBaseline.handle(), naturalBaseline.handle());
    }
    
    /**
     * Emits the ::mnemonic-activate signal.
     * <p>
     * See {@code Gtk.Widget::mnemonic-activate}.
     */
    public boolean mnemonicActivate(boolean groupCycling) {
        var RESULT = gtk_h.gtk_widget_mnemonic_activate(handle(), groupCycling ? 1 : 0);
        return RESULT != 0;
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
     */
    public org.gtk.gio.ListModel observeChildren() {
        var RESULT = gtk_h.gtk_widget_observe_children(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, true));
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
     */
    public org.gtk.gio.ListModel observeControllers() {
        var RESULT = gtk_h.gtk_widget_observe_controllers(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Finds the descendant of {@code widget} closest to the point (@x, @y).
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
     */
    public Widget pick(double x, double y, PickFlags flags) {
        var RESULT = gtk_h.gtk_widget_pick(handle(), x, y, flags.getValue());
        return new Widget(Refcounted.get(RESULT, false));
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
        gtk_h.gtk_widget_queue_allocate(handle());
    }
    
    /**
     * Schedules this widget to be redrawn in the paint phase
     * of the current or the next frame.
     * <p>
     * This means {@code widget}'s {@link Widget#snapshot}
     * implementation will be called.
     */
    public void queueDraw() {
        gtk_h.gtk_widget_queue_draw(handle());
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
        gtk_h.gtk_widget_queue_resize(handle());
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
        gtk_h.gtk_widget_realize(handle());
    }
    
    /**
     * Removes {@code controller} from {@code widget}, so that it doesn't process
     * events anymore.
     * <p>
     * It should not be used again.
     * <p>
     * Widgets will remove all event controllers automatically when they
     * are destroyed, there is normally no need to call this function.
     */
    public void removeController(EventController controller) {
        gtk_h.gtk_widget_remove_controller(handle(), controller.handle());
    }
    
    /**
     * Removes a style from {@code widget}.
     * <p>
     * After this, the style of {@code widget} will stop matching for {@code css_class}.
     */
    public void removeCssClass(java.lang.String cssClass) {
        gtk_h.gtk_widget_remove_css_class(handle(), Interop.allocateNativeString(cssClass).handle());
    }
    
    /**
     * Removes a widget from the list of mnemonic labels for this widget.
     * <p>
     * See {@link Widget#listMnemonicLabels}. The widget must
     * have previously been added to the list with
     * {@link Widget#addMnemonicLabel}.
     */
    public void removeMnemonicLabel(Widget label) {
        gtk_h.gtk_widget_remove_mnemonic_label(handle(), label.handle());
    }
    
    /**
     * Removes a tick callback previously registered with
     * gtk_widget_add_tick_callback().
     */
    public void removeTickCallback(int id) {
        gtk_h.gtk_widget_remove_tick_callback(handle(), id);
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
     */
    public void setCanFocus(boolean canFocus) {
        gtk_h.gtk_widget_set_can_focus(handle(), canFocus ? 1 : 0);
    }
    
    /**
     * Sets whether {@code widget} can be the target of pointer events.
     */
    public void setCanTarget(boolean canTarget) {
        gtk_h.gtk_widget_set_can_target(handle(), canTarget ? 1 : 0);
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
     */
    public void setChildVisible(boolean childVisible) {
        gtk_h.gtk_widget_set_child_visible(handle(), childVisible ? 1 : 0);
    }
    
    /**
     * Clear all style classes applied to {@code widget}
     * and replace them with {@code classes}.
     */
    public void setCssClasses(java.lang.String[] classes) {
        gtk_h.gtk_widget_set_css_classes(handle(), Interop.allocateNativeArray(classes).handle());
    }
    
    /**
     * Sets the cursor to be shown when pointer devices point
     * towards {@code widget}.
     * <p>
     * If the {@code cursor} is NULL, {@code widget} will use the cursor
     * inherited from the parent widget.
     */
    public void setCursor(org.gtk.gdk.Cursor cursor) {
        gtk_h.gtk_widget_set_cursor(handle(), cursor.handle());
    }
    
    /**
     * Sets a named cursor to be shown when pointer devices point
     * towards {@code widget}.
     * <p>
     * This is a utility function that creates a cursor via
     * {@code widget
     * with [method@Gtk.Widget.set_cursor}. See those functions for
     * details.
     * <p>
     * On top of that, this function allows {@code name} to be {@code null}, which
     * will do the same as calling {@link Widget#setCursor}
     * with a {@code null} cursor.
     */
    public void setCursorFromName(java.lang.String name) {
        gtk_h.gtk_widget_set_cursor_from_name(handle(), Interop.allocateNativeString(name).handle());
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
     * set by {@link Gtk#Widget} will be used.
     */
    public void setDirection(TextDirection dir) {
        gtk_h.gtk_widget_set_direction(handle(), dir.getValue());
    }
    
    /**
     * Set {@code child} as the current focus child of {@code widget}.
     * <p>
     * This function is only suitable for widget implementations.
     * If you want a certain widget to get the input focus, call
     * {@link Widget#grabFocus} on it.
     */
    public void setFocusChild(Widget child) {
        gtk_h.gtk_widget_set_focus_child(handle(), child.handle());
    }
    
    /**
     * Sets whether the widget should grab focus when it is clicked
     * with the mouse.
     * <p>
     * Making mouse clicks not grab focus is useful in places like
     * toolbars where you don’t want the keyboard focus removed from
     * the main area of the application.
     */
    public void setFocusOnClick(boolean focusOnClick) {
        gtk_h.gtk_widget_set_focus_on_click(handle(), focusOnClick ? 1 : 0);
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
     */
    public void setFocusable(boolean focusable) {
        gtk_h.gtk_widget_set_focusable(handle(), focusable ? 1 : 0);
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
     */
    public void setFontMap(org.pango.FontMap fontMap) {
        gtk_h.gtk_widget_set_font_map(handle(), fontMap.handle());
    }
    
    /**
     * Sets the {@code cairo_font_options_t} used for Pango rendering
     * in this widget.
     * <p>
     * When not set, the default font options for the {@code GdkDisplay}
     * will be used.
     */
    public void setFontOptions(org.cairographics.FontOptions options) {
        gtk_h.gtk_widget_set_font_options(handle(), options.handle());
    }
    
    /**
     * Sets the horizontal alignment of {@code widget}.
     */
    public void setHalign(Align align) {
        gtk_h.gtk_widget_set_halign(handle(), align.getValue());
    }
    
    /**
     * Sets the {@code has-tooltip} property on {@code widget} to {@code has_tooltip}.
     */
    public void setHasTooltip(boolean hasTooltip) {
        gtk_h.gtk_widget_set_has_tooltip(handle(), hasTooltip ? 1 : 0);
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
     */
    public void setHexpand(boolean expand) {
        gtk_h.gtk_widget_set_hexpand(handle(), expand ? 1 : 0);
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
     */
    public void setHexpandSet(boolean set) {
        gtk_h.gtk_widget_set_hexpand_set(handle(), set ? 1 : 0);
    }
    
    /**
     * Sets the layout manager delegate instance that provides an
     * implementation for measuring and allocating the children of {@code widget}.
     */
    public void setLayoutManager(LayoutManager layoutManager) {
        gtk_h.gtk_widget_set_layout_manager(handle(), layoutManager.refcounted().unowned().handle());
    }
    
    /**
     * Sets the bottom margin of {@code widget}.
     */
    public void setMarginBottom(int margin) {
        gtk_h.gtk_widget_set_margin_bottom(handle(), margin);
    }
    
    /**
     * Sets the end margin of {@code widget}.
     */
    public void setMarginEnd(int margin) {
        gtk_h.gtk_widget_set_margin_end(handle(), margin);
    }
    
    /**
     * Sets the start margin of {@code widget}.
     */
    public void setMarginStart(int margin) {
        gtk_h.gtk_widget_set_margin_start(handle(), margin);
    }
    
    /**
     * Sets the top margin of {@code widget}.
     */
    public void setMarginTop(int margin) {
        gtk_h.gtk_widget_set_margin_top(handle(), margin);
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
     * and represent elements in a selector (period, #, >, *...), so using
     * these will make your widget impossible to match by name. Any combination
     * of alphanumeric symbols, dashes and underscores will suffice.
     */
    public void setName(java.lang.String name) {
        gtk_h.gtk_widget_set_name(handle(), Interop.allocateNativeString(name).handle());
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
     */
    public void setOpacity(double opacity) {
        gtk_h.gtk_widget_set_opacity(handle(), opacity);
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
     */
    public void setOverflow(Overflow overflow) {
        gtk_h.gtk_widget_set_overflow(handle(), overflow.getValue());
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
     */
    public void setParent(Widget parent) {
        gtk_h.gtk_widget_set_parent(handle(), parent.handle());
    }
    
    /**
     * Specifies whether {@code widget} will be treated as the default
     * widget within its toplevel when it has the focus, even if
     * another widget is the default.
     */
    public void setReceivesDefault(boolean receivesDefault) {
        gtk_h.gtk_widget_set_receives_default(handle(), receivesDefault ? 1 : 0);
    }
    
    /**
     * Sets the sensitivity of a widget.
     * <p>
     * A widget is sensitive if the user can interact with it.
     * Insensitive widgets are “grayed out” and the user can’t
     * interact with them. Insensitive widgets are known as
     * “inactive”, “disabled”, or “ghosted” in some other toolkits.
     */
    public void setSensitive(boolean sensitive) {
        gtk_h.gtk_widget_set_sensitive(handle(), sensitive ? 1 : 0);
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
     */
    public void setSizeRequest(int width, int height) {
        gtk_h.gtk_widget_set_size_request(handle(), width, height);
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
     */
    public void setStateFlags(StateFlags flags, boolean clear) {
        gtk_h.gtk_widget_set_state_flags(handle(), flags.getValue(), clear ? 1 : 0);
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
     */
    public void setTooltipMarkup(java.lang.String markup) {
        gtk_h.gtk_widget_set_tooltip_markup(handle(), Interop.allocateNativeString(markup).handle());
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
     */
    public void setTooltipText(java.lang.String text) {
        gtk_h.gtk_widget_set_tooltip_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Sets the vertical alignment of {@code widget}.
     */
    public void setValign(Align align) {
        gtk_h.gtk_widget_set_valign(handle(), align.getValue());
    }
    
    /**
     * Sets whether the widget would like any available extra vertical
     * space.
     * <p>
     * See {@link Widget#setHexpand} for more detail.
     */
    public void setVexpand(boolean expand) {
        gtk_h.gtk_widget_set_vexpand(handle(), expand ? 1 : 0);
    }
    
    /**
     * Sets whether the vexpand flag will be used.
     * <p>
     * See {@link Widget#setHexpandSet} for more detail.
     */
    public void setVexpandSet(boolean set) {
        gtk_h.gtk_widget_set_vexpand_set(handle(), set ? 1 : 0);
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
     */
    public void setVisible(boolean visible) {
        gtk_h.gtk_widget_set_visible(handle(), visible ? 1 : 0);
    }
    
    /**
     * Returns whether {@code widget} should contribute to
     * the measuring and allocation of its parent.
     * <p>
     * This is {@code false} for invisible children, but also
     * for children that have their own surface.
     */
    public boolean shouldLayout() {
        var RESULT = gtk_h.gtk_widget_should_layout(handle());
        return RESULT != 0;
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
        gtk_h.gtk_widget_show(handle());
    }
    
    /**
     * Allocates widget with a transformation that translates
     * the origin to the position in {@code allocation}.
     * <p>
     * This is a simple form of {@link Widget#allocate}.
     */
    public void sizeAllocate(Allocation allocation, int baseline) {
        gtk_h.gtk_widget_size_allocate(handle(), allocation.handle(), baseline);
    }
    
    /**
     * Snapshot the a child of {@code widget}.
     * <p>
     * When a widget receives a call to the snapshot function,
     * it must send synthetic {@link Widget#snapshot} calls
     * to all children. This function provides a convenient way
     * of doing this. A widget, when it receives a call to its
     * {@link Widget#snapshot} function, calls
     * gtk_widget_snapshot_child() once for each child, passing in
     * the {@code snapshot} the widget received.
     * <p>
     * gtk_widget_snapshot_child() takes care of translating the origin of
     * {@code snapshot}, and deciding whether the child needs to be snapshot.
     * <p>
     * This function does nothing for children that implement {@code GtkNative}.
     */
    public void snapshotChild(Widget child, Snapshot snapshot) {
        gtk_h.gtk_widget_snapshot_child(handle(), child.handle(), snapshot.handle());
    }
    
    /**
     * Translate coordinates relative to {@code src_widget}’s allocation
     * to coordinates relative to {@code dest_widget}’s allocations.
     * <p>
     * In order to perform this operation, both widget must share
     * a common ancestor.
     */
    public boolean translateCoordinates(Widget destWidget, double srcX, double srcY, PointerDouble destX, PointerDouble destY) {
        var RESULT = gtk_h.gtk_widget_translate_coordinates(handle(), destWidget.handle(), srcX, srcY, destX.handle(), destY.handle());
        return RESULT != 0;
    }
    
    /**
     * Triggers a tooltip query on the display where the toplevel
     * of {@code widget} is located.
     */
    public void triggerTooltipQuery() {
        gtk_h.gtk_widget_trigger_tooltip_query(handle());
    }
    
    /**
     * Causes a widget to be unmapped if it’s currently mapped.
     * <p>
     * This function is only for use in widget implementations.
     */
    public void unmap() {
        gtk_h.gtk_widget_unmap(handle());
    }
    
    /**
     * Dissociate {@code widget} from its parent.
     * <p>
     * This function is only for use in widget implementations,
     * typically in dispose.
     */
    public void unparent() {
        gtk_h.gtk_widget_unparent(handle());
    }
    
    /**
     * Causes a widget to be unrealized (frees all GDK resources
     * associated with the widget).
     * <p>
     * This function is only useful in widget implementations.
     */
    public void unrealize() {
        gtk_h.gtk_widget_unrealize(handle());
    }
    
    /**
     * Turns off flag values for the current widget state.
     * <p>
     * See {@link Widget#setStateFlags}.
     * <p>
     * This function is for use in widget implementations.
     */
    public void unsetStateFlags(StateFlags flags) {
        gtk_h.gtk_widget_unset_state_flags(handle(), flags.getValue());
    }
    
    /**
     * Obtains the current default reading direction.
     * <p>
     * See {@link Gtk#Widget}.
     */
    public static TextDirection getDefaultDirection() {
        var RESULT = gtk_h.gtk_widget_get_default_direction();
        return new TextDirection(RESULT);
    }
    
    /**
     * Sets the default reading direction for widgets.
     * <p>
     * See {@link Widget#setDirection}.
     */
    public static void setDefaultDirection(TextDirection dir) {
        gtk_h.gtk_widget_set_default_direction(dir.getValue());
    }
    
    @FunctionalInterface
    public interface DestroyHandler {
        void signalReceived(Widget source);
    }
    
    /**
     * Signals that all holders of a reference to the widget should release
     * the reference that they hold.
     * <p>
     * May result in finalization of the widget if all references are released.
     * <p>
     * This signal is not suitable for saving widget state.
     */
    public SignalHandle onDestroy(DestroyHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("destroy").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Widget.Callbacks.class, "signalWidgetDestroy",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DirectionChangedHandler {
        void signalReceived(Widget source, TextDirection previousDirection);
    }
    
    /**
     * Emitted when the text direction of a widget changes.
     */
    public SignalHandle onDirectionChanged(DirectionChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("direction-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Widget.Callbacks.class, "signalWidgetDirectionChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface HideHandler {
        void signalReceived(Widget source);
    }
    
    /**
     * Emitted when {@code widget} is hidden.
     */
    public SignalHandle onHide(HideHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("hide").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Widget.Callbacks.class, "signalWidgetHide",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface KeynavFailedHandler {
        boolean signalReceived(Widget source, DirectionType direction);
    }
    
    /**
     * Emitted if keyboard navigation fails.
     * <p>
     * See {@link Widget#keynavFailed} for details.
     */
    public SignalHandle onKeynavFailed(KeynavFailedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("keynav-failed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Widget.Callbacks.class, "signalWidgetKeynavFailed",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MapHandler {
        void signalReceived(Widget source);
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
     */
    public SignalHandle onMap(MapHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("map").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Widget.Callbacks.class, "signalWidgetMap",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MnemonicActivateHandler {
        boolean signalReceived(Widget source, boolean groupCycling);
    }
    
    /**
     * Emitted when a widget is activated via a mnemonic.
     * <p>
     * The default handler for this signal activates {@code widget} if {@code group_cycling}
     * is {@code false}, or just makes {@code widget} grab focus if {@code group_cycling} is {@code true}.
     */
    public SignalHandle onMnemonicActivate(MnemonicActivateHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("mnemonic-activate").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Widget.Callbacks.class, "signalWidgetMnemonicActivate",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MoveFocusHandler {
        void signalReceived(Widget source, DirectionType direction);
    }
    
    /**
     * Emitted when the focus is moved.
     */
    public SignalHandle onMoveFocus(MoveFocusHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("move-focus").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Widget.Callbacks.class, "signalWidgetMoveFocus",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface QueryTooltipHandler {
        boolean signalReceived(Widget source, int x, int y, boolean keyboardMode, Tooltip tooltip);
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
     * {@code keyboard_mode} is {@code true}, the values of @x and @y are undefined and
     * should not be used.
     * <p>
     * The signal handler is free to manipulate {@code tooltip} with the therefore
     * destined function calls.
     */
    public SignalHandle onQueryTooltip(QueryTooltipHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("query-tooltip").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Widget.Callbacks.class, "signalWidgetQueryTooltip",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RealizeHandler {
        void signalReceived(Widget source);
    }
    
    /**
     * Emitted when {@code widget} is associated with a {@code GdkSurface}.
     * <p>
     * This means that {@link Widget#realize} has been called
     * or the widget has been mapped (that is, it is going to be drawn).
     */
    public SignalHandle onRealize(RealizeHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("realize").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Widget.Callbacks.class, "signalWidgetRealize",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ShowHandler {
        void signalReceived(Widget source);
    }
    
    /**
     * Emitted when {@code widget} is shown.
     */
    public SignalHandle onShow(ShowHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("show").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Widget.Callbacks.class, "signalWidgetShow",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface StateFlagsChangedHandler {
        void signalReceived(Widget source, StateFlags flags);
    }
    
    /**
     * Emitted when the widget state changes.
     * <p>
     * See {@link Widget#getStateFlags}.
     */
    public SignalHandle onStateFlagsChanged(StateFlagsChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("state-flags-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Widget.Callbacks.class, "signalWidgetStateFlagsChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UnmapHandler {
        void signalReceived(Widget source);
    }
    
    /**
     * Emitted when {@code widget} is going to be unmapped.
     * <p>
     * A widget is unmapped when either it or any of its parents up to the
     * toplevel widget have been set as hidden.
     * <p>
     * As ::unmap indicates that a widget will not be shown any longer,
     * it can be used to, for example, stop an animation on the widget.
     */
    public SignalHandle onUnmap(UnmapHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("unmap").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Widget.Callbacks.class, "signalWidgetUnmap",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UnrealizeHandler {
        void signalReceived(Widget source);
    }
    
    /**
     * Emitted when the {@code GdkSurface} associated with {@code widget} is destroyed.
     * <p>
     * This means that {@link Widget#unrealize} has been called
     * or the widget has been unmapped (that is, it is going to be hidden).
     */
    public SignalHandle onUnrealize(UnrealizeHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("unrealize").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Widget.Callbacks.class, "signalWidgetUnrealize",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalWidgetDestroy(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Widget.DestroyHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Widget(Refcounted.get(source)));
        }
        
        public static void signalWidgetDirectionChanged(MemoryAddress source, int previousDirection, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Widget.DirectionChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Widget(Refcounted.get(source)), new TextDirection(previousDirection));
        }
        
        public static void signalWidgetHide(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Widget.HideHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Widget(Refcounted.get(source)));
        }
        
        public static boolean signalWidgetKeynavFailed(MemoryAddress source, int direction, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Widget.KeynavFailedHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new Widget(Refcounted.get(source)), new DirectionType(direction));
        }
        
        public static void signalWidgetMap(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Widget.MapHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Widget(Refcounted.get(source)));
        }
        
        public static boolean signalWidgetMnemonicActivate(MemoryAddress source, int groupCycling, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Widget.MnemonicActivateHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new Widget(Refcounted.get(source)), groupCycling != 0);
        }
        
        public static void signalWidgetMoveFocus(MemoryAddress source, int direction, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Widget.MoveFocusHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Widget(Refcounted.get(source)), new DirectionType(direction));
        }
        
        public static boolean signalWidgetQueryTooltip(MemoryAddress source, int x, int y, int keyboardMode, MemoryAddress tooltip, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Widget.QueryTooltipHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new Widget(Refcounted.get(source)), x, y, keyboardMode != 0, new Tooltip(Refcounted.get(tooltip, false)));
        }
        
        public static void signalWidgetRealize(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Widget.RealizeHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Widget(Refcounted.get(source)));
        }
        
        public static void signalWidgetShow(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Widget.ShowHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Widget(Refcounted.get(source)));
        }
        
        public static void signalWidgetStateFlagsChanged(MemoryAddress source, int flags, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Widget.StateFlagsChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Widget(Refcounted.get(source)), new StateFlags(flags));
        }
        
        public static void signalWidgetUnmap(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Widget.UnmapHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Widget(Refcounted.get(source)));
        }
        
        public static void signalWidgetUnrealize(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Widget.UnrealizeHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Widget(Refcounted.get(source)));
        }
        
    }
}
