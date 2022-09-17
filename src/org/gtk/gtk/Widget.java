package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The base class for all widgets.
 * <p><code>GtkWidget</code> is the base class all widgets in GTK derive from. It manages the
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
 * <li>{@link org.gtk.gtk.Widget#getRequestMode}
 * <li>{@link org.gtk.gtk.Widget#measure}
 * <p>
 * There are some important things to keep in mind when implementing
 * height-for-width and when using it in widget implementations.
 * <p>
 * If you implement a direct <code>GtkWidget</code> subclass that supports
 * height-for-width or width-for-height geometry management for itself
 * or its child widgets, the {@link org.gtk.gtk.Widget#getRequestMode} virtual
 * function must be implemented as well and return the widget&#39;s preferred
 * request mode. The default implementation of this virtual function
 * returns <code>GTK_SIZE_REQUEST_CONSTANT_SIZE,</code> which means that the widget will
 * only ever get -1 passed as the for_size value to its
 * {@link org.gtk.gtk.Widget#measure} implementation.
 * <p>
 * The geometry management system will query a widget hierarchy in
 * only one orientation at a time. When widgets are initially queried
 * for their minimum sizes it is generally done in two initial passes
 * in the {@link [enum@Gtk.SizeRequestMode] (ref=enum)} chosen by the toplevel.
 * <p>
 * For example, when queried in the normal {@link org.gtk.gtk.SizeRequestMode#HEIGHT_FOR_WIDTH} mode:
 * <p>
 * First, the default minimum and natural width for each widget
 * in the interface will be computed using {@link org.gtk.gtk.Widget#measure} with an
 * orientation of {@link org.gtk.gtk.Orientation#HORIZONTAL} and a for_size of -1.
 * Because the preferred widths for each widget depend on the preferred
 * widths of their children, this information propagates up the hierarchy,
 * and finally a minimum and natural width is determined for the entire
 * toplevel. Next, the toplevel will use the minimum width to query for the
 * minimum height contextual to that width using {@link org.gtk.gtk.Widget#measure} with an
 * orientation of {@link org.gtk.gtk.Orientation#VERTICAL} and a for_size of the just computed
 * width. This will also be a highly recursive operation. The minimum height
 * for the minimum width is normally used to set the minimum size constraint
 * on the toplevel.
 * <p>
 * After the toplevel window has initially requested its size in both
 * dimensions it can go on to allocate itself a reasonable size (or a size
 * previously specified with {@link org.gtk.gtk.Window#setDefaultSize}). During the
 * recursive allocation process it&#8217;s important to note that request cycles
 * will be recursively executed while widgets allocate their children.
 * Each widget, once allocated a size, will go on to first share the
 * space in one orientation among its children and then request each child&#39;s
 * height for its target allocated width or its width for allocated height,
 * depending. In this way a <code>GtkWidget</code> will typically be requested its size
 * a number of times before actually being allocated a size. The size a
 * widget is finally allocated can of course differ from the size it has
 * requested. For this reason, <code>GtkWidget</code> caches a  small number of results
 * to avoid re-querying for the same sizes in one allocation cycle.
 * <p>
 * If a widget does move content around to intelligently use up the
 * allocated size then it must support the request in both<code>GtkSizeRequestMode</code>s even if the widget in question only
 * trades sizes in a single orientation.
 * <p>
 * For instance, a {@link org.gtk.gtk.Label} that does height-for-width word wrapping
 * will not expect to have {@link org.gtk.gtk.Widget#measure} with an orientation of
 * {@link org.gtk.gtk.Orientation#VERTICAL} called because that call is specific to a
 * width-for-height request. In this case the label must return the height
 * required for its own minimum possible width. By following this rule any
 * widget that handles height-for-width or width-for-height requests will
 * always be allocated at least enough space to fit its own content.
 * <p>
 * Here are some examples of how a {@link org.gtk.gtk.SizeRequestMode#HEIGHT_FOR_WIDTH} widget
 * generally deals with width-for-height requests:
 * <p><pre>c
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
 * <p>
 *           // First, get the minimum width of our widget
 *           GTK_WIDGET_GET_CLASS (widget)-&#62;measure (widget, GTK_ORIENTATION_HORIZONTAL, -1,
 *                                                   &#38;min_width, &#38;dummy, &#38;dummy, &#38;dummy);
 * <p>
 *           // Now use the minimum width to retrieve the minimum and natural height to display
 *           // that width.
 *           GTK_WIDGET_GET_CLASS (widget)-&#62;measure (widget, GTK_ORIENTATION_VERTICAL, min_width,
 *                                                   minimum_size, natural_size, &#38;dummy, &#38;dummy);
 *         }
 *       else
 *         {
 *           // ... some widgets do both.
 *         }
 *     }
 * }
 * </pre>
 * <p>
 * Often a widget needs to get its own request during size request or
 * allocation. For example, when computing height it may need to also
 * compute width. Or when deciding how to use an allocation, the widget
 * may need to know its natural size. In these cases, the widget should
 * be careful to call its virtual methods directly, like in the code
 * example above.
 * <p>
 * It will not work to use the wrapper function {@link org.gtk.gtk.Widget#measure}
 * inside your own {@link org.gtk.gtk.Widget#sizeAllocate} implementation.
 * These return a request adjusted by {@link org.gtk.gtk.SizeGroup}, the widget&#39;s
 * align and expand flags, as well as its CSS style.
 * <p>
 * If a widget used the wrappers inside its virtual method implementations,
 * then the adjustments (such as widget margins) would be applied
 * twice. GTK therefore does not allow this and will warn if you try
 * to do it.
 * <p>
 * Of course if you are getting the size request for another widget, such
 * as a child widget, you must use {@link org.gtk.gtk.Widget#measure}; otherwise, you
 * would not properly consider widget margins, {@link org.gtk.gtk.SizeGroup}, and
 * so forth.
 * <p>
 * GTK also supports baseline vertical alignment of widgets. This
 * means that widgets are positioned such that the typographical baseline of
 * widgets in the same row are aligned. This happens if a widget supports
 * baselines, has a vertical alignment of <code>GTK_ALIGN_BASELINE,</code> and is inside
 * a widget that supports baselines and has a natural &#8220;row&#8221; that it aligns to
 * the baseline, or a baseline assigned to it by the grandparent.
 * <p>
 * Baseline alignment support for a widget is also done by the
 * {@link org.gtk.gtk.Widget#measure} virtual function. It allows you to report
 * both a minimum and natural size.
 * <p>
 * If a widget ends up baseline aligned it will be allocated all the space in
 * the parent as if it was <code>GTK_ALIGN_FILL,</code> but the selected baseline can be
 * found via {@link org.gtk.gtk.Widget#getAllocatedBaseline}. If the baseline has a
 * value other than -1 you need to align the widget such that the baseline
 * appears at the position.
 * <p>
 * <h3>GtkWidget as GtkBuildable</h3>
 * <p>
 * The <code>GtkWidget</code> implementation of the <code>GtkBuildable</code> interface
 * supports various custom elements to specify additional aspects of widgets
 * that are not directly expressed as properties.
 * <p>
 * If the widget uses a {@link org.gtk.gtk.LayoutManager}, <code>GtkWidget</code> supports
 * a custom <code>&#60;layout&#62;</code> element, used to define layout properties:
 * <p><pre>xml
 * &#60;object class=&#34;GtkGrid&#34; id=&#34;my_grid&#34;&#62;
 *   &#60;child&#62;
 *     &#60;object class=&#34;GtkLabel&#34; id=&#34;label1&#34;&#62;
 *       &#60;property name=&#34;label&#34;&#62;Description&#60;/property&#62;
 *       &#60;layout&#62;
 *         &#60;property name=&#34;column&#34;&#62;0&#60;/property&#62;
 *         &#60;property name=&#34;row&#34;&#62;0&#60;/property&#62;
 *         &#60;property name=&#34;row-span&#34;&#62;1&#60;/property&#62;
 *         &#60;property name=&#34;column-span&#34;&#62;1&#60;/property&#62;
 *       &#60;/layout&#62;
 *     &#60;/object&#62;
 *   &#60;/child&#62;
 *   &#60;child&#62;
 *     &#60;object class=&#34;GtkEntry&#34; id=&#34;description_entry&#34;&#62;
 *       &#60;layout&#62;
 *         &#60;property name=&#34;column&#34;&#62;1&#60;/property&#62;
 *         &#60;property name=&#34;row&#34;&#62;0&#60;/property&#62;
 *         &#60;property name=&#34;row-span&#34;&#62;1&#60;/property&#62;
 *         &#60;property name=&#34;column-span&#34;&#62;1&#60;/property&#62;
 *       &#60;/layout&#62;
 *     &#60;/object&#62;
 *   &#60;/child&#62;
 * &#60;/object&#62;
 * </pre>
 * <p><code>GtkWidget</code> allows style information such as style classes to
 * be associated with widgets, using the custom <code>&#60;style&#62;</code> element:
 * <p><pre>xml
 * &#60;object class=&#34;GtkButton&#34; id=&#34;button1&#34;&#62;
 *   &#60;style&#62;
 *     &#60;class name=&#34;my-special-button-class&#34;/&#62;
 *     &#60;class name=&#34;dark-button&#34;/&#62;
 *   &#60;/style&#62;
 * &#60;/object&#62;
 * </pre>
 * <p><code>GtkWidget</code> allows defining accessibility information, such as properties,
 * relations, and states, using the custom <code>&#60;accessibility&#62;</code> element:
 * <p><pre>xml
 * &#60;object class=&#34;GtkButton&#34; id=&#34;button1&#34;&#62;
 *   &#60;accessibility&#62;
 *     &#60;property name=&#34;label&#34;&#62;Download&#60;/property&#62;
 *     &#60;relation name=&#34;labelled-by&#34;&#62;label1&#60;/relation&#62;
 *   &#60;/accessibility&#62;
 * &#60;/object&#62;
 * </pre>
 * <p>
 * <h3>Building composite widgets from template XML</h3>
 * <p><code>GtkWidget </code>exposes some facilities to automate the procedure
 * of creating composite widgets using &#34;templates&#34;.
 * <p>
 * To create composite widgets with <code>GtkBuilder</code> XML, one must associate
 * the interface description with the widget class at class initialization
 * time using {@link org.gtk.gtk.WidgetClass#setTemplate}.
 * <p>
 * The interface description semantics expected in composite template descriptions
 * is slightly different from regular {@link org.gtk.gtk.Builder} XML.
 * <p>
 * Unlike regular interface descriptions, {@link org.gtk.gtk.WidgetClass#setTemplate} will
 * expect a <code>&#60;template&#62;</code> tag as a direct child of the toplevel <code>&#60;interface&#62;</code>
 * tag. The <code>&#60;template&#62;</code> tag must specify the &#8220;class&#8221; attribute which must be
 * the type name of the widget. Optionally, the &#8220;parent&#8221; attribute may be
 * specified to specify the direct parent type of the widget type, this is
 * ignored by <code>GtkBuilder</code> but required for UI design tools like
 * {@link [Glade]}(https://glade.gnome.org/) to introspect what kind of properties and
 * internal children exist for a given type when the actual type does not exist.
 * <p>
 * The XML which is contained inside the <code>&#60;template&#62;</code> tag behaves as if it were
 * added to the <code>&#60;object&#62;</code> tag defining the widget itself. You may set properties
 * on a widget by inserting <code>&#60;property&#62;</code> tags into the <code>&#60;template&#62;</code> tag, and also
 * add <code>&#60;child&#62;</code> tags to add children and extend a widget in the normal way you
 * would with <code>&#60;object&#62;</code> tags.
 * <p>
 * Additionally, <code>&#60;object&#62;</code> tags can also be added before and after the initial<code>&#60;template&#62;</code> tag in the normal way, allowing one to define auxiliary objects
 * which might be referenced by other widgets declared as children of the<code>&#60;template&#62;</code> tag.
 * <p>
 * An example of a template definition:
 * <p><pre>xml
 * &#60;interface&#62;
 *   &#60;template class=&#34;FooWidget&#34; parent=&#34;GtkBox&#34;&#62;
 *     &#60;property name=&#34;orientation&#34;&#62;horizontal&#60;/property&#62;
 *     &#60;property name=&#34;spacing&#34;&#62;4&#60;/property&#62;
 *     &#60;child&#62;
 *       &#60;object class=&#34;GtkButton&#34; id=&#34;hello_button&#34;&#62;
 *         &#60;property name=&#34;label&#34;&#62;Hello World&#60;/property&#62;
 *         &#60;signal name=&#34;clicked&#34; handler=&#34;hello_button_clicked&#34; object=&#34;FooWidget&#34; swapped=&#34;yes&#34;/&#62;
 *       &#60;/object&#62;
 *     &#60;/child&#62;
 *     &#60;child&#62;
 *       &#60;object class=&#34;GtkButton&#34; id=&#34;goodbye_button&#34;&#62;
 *         &#60;property name=&#34;label&#34;&#62;Goodbye World&#60;/property&#62;
 *       &#60;/object&#62;
 *     &#60;/child&#62;
 *   &#60;/template&#62;
 * &#60;/interface&#62;
 * </pre>
 * <p>
 * Typically, you&#39;ll place the template fragment into a file that is
 * bundled with your project, using <code>GResource</code>. In order to load the
 * template, you need to call {@link org.gtk.gtk.WidgetClass#setTemplateFromResource}
 * from the class initialization of your <code>GtkWidget</code> type:
 * <p><pre>c
 * static void
 * foo_widget_class_init (FooWidgetClass *klass)
 * {
 *   // ...
 * 
 *   gtk_widget_class_set_template_from_resource (GTK_WIDGET_CLASS (klass),
 *                                                &#34;/com/example/ui/foowidget.ui&#34;);
 * }
 * </pre>
 * <p>
 * You will also need to call {@link org.gtk.gtk.Widget#initTemplate} from the
 * instance initialization function:
 * <p><pre>c
 * static void
 * foo_widget_init (FooWidget *self)
 * {
 *   // ...
 *   gtk_widget_init_template (GTK_WIDGET (self));
 * }
 * </pre>
 * <p>
 * You can access widgets defined in the template using the
 * {@link org.gtk.gtk.Widget#getTemplateChild} function, but you will typically declare
 * a pointer in the instance private data structure of your type using the same
 * name as the widget in the template definition, and call
 * {@link org.gtk.gtk.WidgetClass#bindTemplateChildFull} (or one of its wrapper macros
 * {@link Gtk#widgetClassBindTemplateChild} and {@link Gtk#widgetClassBindTemplateChildPrivate})
 * with that name, e.g.
 * <p><pre>c
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
 *                                                &#34;/com/example/ui/foowidget.ui&#34;);
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
 * </pre>
 * <p>
 * You can also use {@link org.gtk.gtk.WidgetClass#bindTemplateCallbackFull} (or
 * is wrapper macro {@link Gtk#widgetClassBindTemplateCallback}) to connect
 * a signal callback defined in the template with a function visible in the
 * scope of the class, e.g.
 * <p><pre>c
 * // the signal handler has the instance and user data swapped
 * // because of the swapped=&#34;yes&#34; attribute in the template XML
 * static void
 * hello_button_clicked (FooWidget *self,
 *                       GtkButton *button)
 * {
 *   g_print (&#34;Hello, world!\\n&#34;);
 * }
 * 
 * static void
 * foo_widget_class_init (FooWidgetClass *klass)
 * {
 *   // ...
 *   gtk_widget_class_set_template_from_resource (GTK_WIDGET_CLASS (klass),
 *                                                &#34;/com/example/ui/foowidget.ui&#34;);
 *   gtk_widget_class_bind_template_callback (GTK_WIDGET_CLASS (klass), hello_button_clicked);
 * }
 * </pre>
 */
public class Widget extends org.gtk.gobject.InitiallyUnowned implements Accessible, Buildable, ConstraintTarget {

    public Widget(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Widget */
    public static Widget castFrom(org.gtk.gobject.Object gobject) {
        return new Widget(gobject.getReference());
    }
    
    /**
     * Enable or disable an action installed with
     * gtk_widget_class_install_action().
     */
    public void actionSetEnabled(java.lang.String actionName, boolean enabled) {
        gtk_h.gtk_widget_action_set_enabled(handle(), Interop.allocateNativeString(actionName).handle(), enabled ? 1 : 0);
    }
    
    /**
     * For widgets that can be &#8220;activated&#8221; (buttons, menu items, etc.),
     * this function activates them.
     * 
     * The activation will emit the signal set using
     * {@link org.gtk.gtk.WidgetClass#setActivateSignal} during class initialization.
     * 
     * Activation is what happens when you press &#60;kbd&#62;Enter&#60;/kbd&#62;
     * on a widget during key navigation.
     * 
     * If you wish to handle the activation keybinding yourself, it is
     * recommended to use {@link org.gtk.gtk.WidgetClass#addShortcut} with an action
     * created with {@link [ctor@Gtk.SignalAction.new] (ref=ctor)}.
     * 
     * If @widget isn&#39;t activatable, the function returns 
     *             
     *           
     *         
     *       
     *       
     *         For widgets that can be &#8220;activated&#8221; (buttons, menu items, etc.),
     * this function activates them.
     * 
     * The activation will emit the signal set using
     * {@link org.gtk.gtk.WidgetClass#setActivateSignal} during class initialization.
     * 
     * Activation is what happens when you press &#60;kbd&#62;Enter&#60;/kbd&#62;
     * on a widget during key navigation.
     * 
     * If you wish to handle the activation keybinding yourself, it is
     * recommended to use {@link org.gtk.gtk.WidgetClass#addShortcut} with an action
     * created with {@link [ctor@Gtk.SignalAction.new] (ref=ctor)}.
     * 
     * If @widget isn&#39;t activatable, the function returns %FALSE.
     */
    public boolean activate() {
        var RESULT = gtk_h.gtk_widget_activate(handle());
        return (RESULT != 0);
    }
    
    /**
     * Looks up the action in the action groups associated with
     * @widget and its ancestors, and activates it.
     * <p>
     * If the action is in an action group added with
     * {@link org.gtk.gtk.Widget#insertActionGroup}, the @name is expected
     * to be prefixed with the prefix that was used when the group was
     * inserted.
     * <p>
     * The arguments must match the actions expected parameter type,
     * as returned by <code>g_action_get_parameter_type()</code>.
     */
    public boolean activateActionVariant(java.lang.String name, org.gtk.glib.Variant args) {
        var RESULT = gtk_h.gtk_widget_activate_action_variant(handle(), Interop.allocateNativeString(name).handle(), args.handle());
        return (RESULT != 0);
    }
    
    /**
     * Activates the <code>default.activate</code> action from @widget.
     */
    public void activateDefault() {
        gtk_h.gtk_widget_activate_default(handle());
    }
    
    /**
     * Adds @controller to @widget so that it will receive events.
     * 
     * You will usually want to call this function right after
     * creating any kind of {@link org.gtk.gtk.EventController}.
     */
    public void addController(EventController controller) {
        gtk_h.gtk_widget_add_controller(handle(), controller.getReference().unowned().handle());
    }
    
    /**
     * Adds a style class to @widget.
     * 
     * After calling this function, the widgets style will match
     * for @css_class, according to CSS matching rules.
     * 
     * Use {@link org.gtk.gtk.Widget#removeCssClass} to remove the
     * style again.
     */
    public void addCssClass(java.lang.String cssClass) {
        gtk_h.gtk_widget_add_css_class(handle(), Interop.allocateNativeString(cssClass).handle());
    }
    
    /**
     * Adds a widget to the list of mnemonic labels for this widget.
     * 
     * See {@link org.gtk.gtk.Widget#listMnemonicLabels}. Note the
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
     * aren&#8217;t changing widget properties that would trigger that (for example,
     * changing the text of a <code>GtkLabel</code>), then you will have to call
     * {@link org.gtk.gtk.Widget#queueResize} or {@link org.gtk.gtk.Widget#queueDraw}
     * yourself.
     * <p>
     * {@link org.gtk.gdk.FrameClock#getFrameTime} should generally be used
     * for timing continuous animations and
     * {@link org.gtk.gdk.FrameTimings#getPredictedPresentationTime} if you are
     * trying to display isolated frames at particular times.
     * <p>
     * This is a more convenient alternative to connecting directly to the
     * {@link [signal@Gdk.FrameClock::update] (ref=signal)} signal of <code>GdkFrameClock</code>, since you
     * don&#39;t have to worry about when a <code>GdkFrameClock</code> is assigned to a widget.
     */
    public int addTickCallback(TickCallback callback) {
        try {
            var RESULT = gtk_h.gtk_widget_add_tick_callback(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTickCallback",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * This function is only used by <code>GtkWidget</code> subclasses, to
     * assign a size, position and (optionally) baseline to their
     * child widgets.
     * 
     * In this function, the allocation and baseline may be adjusted.
     * The given allocation will be forced to be bigger than the
     * widget&#39;s minimum size, as well as at least 0&#215;0 in size.
     * 
     * For a version that does not take a transform, see
     * {@link org.gtk.gtk.Widget#sizeAllocate}.
     */
    public void allocate(int width, int height, int baseline, org.gtk.gsk.Transform transform) {
        gtk_h.gtk_widget_allocate(handle(), width, height, baseline, transform.handle());
    }
    
    /**
     * Called by widgets as the user moves around the window using
     * keyboard shortcuts.
     * <p>
     * The @direction argument indicates what kind of motion is taking place (up,
     * down, left, right, tab forward, tab backward).
     * <p>
     * This function calls the {@link org.gtk.gtk.Widget#focus} virtual function; widgets
     * can override the virtual function in order to implement appropriate focus
     * behavior.
     * <p>
     * The default <code>focus()</code> virtual function for a widget should return <code>TRUE</code> if
     * moving in @direction left the focus on a focusable location inside that
     * widget, and <code>FALSE</code> if moving in @direction moved the focus outside the
     * widget. When returning <code>TRUE</code>, widgets normallycall {@link org.gtk.gtk.Widget#grabFocus}
     * to place the focus accordingly; when returning <code>FALSE</code>, they don&#8217;t modify
     * the current focus location.
     * 
     * This function is used by custom widget implementations; if you&#39;re
     * writing an app, you&#8217;d use {@link org.gtk.gtk.Widget#grabFocus} to move
     * the focus to a particular widget.
     */
    public boolean childFocus(DirectionType direction) {
        var RESULT = gtk_h.gtk_widget_child_focus(handle(), direction.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Computes the bounds for @widget in the coordinate space of @target.
     * 
     * FIXME: Explain what &#34;bounds&#34; are.
     * 
     * If the operation is successful, <code>true</code> is returned. If @widget has no
     * bounds or the bounds cannot be expressed in @target&#39;s coordinate space
     * (for example if both widgets are in different windows), <code>false</code> is
     * returned and @bounds is set to the zero rectangle.
     * 
     * It is valid for @widget and @target to be the same widget.
     */
    public boolean computeBounds(Widget target, org.gtk.graphene.Rect outBounds) {
        var RESULT = gtk_h.gtk_widget_compute_bounds(handle(), target.handle(), outBounds.handle());
        return (RESULT != 0);
    }
    
    /**
     * Computes whether a container should give this widget
     * extra space when possible.
     * 
     * Containers should check this, rather than looking at
     * {@link org.gtk.gtk.Widget#getHexpand} or {@link org.gtk.gtk.Widget#getVexpand}.
     * 
     * This function already checks whether the widget is visible, so
     * visibility does not need to be checked separately. Non-visible
     * widgets are not expanded.
     * 
     * The computed expand value uses either the expand setting explicitly
     * set on the widget itself, or, if none has been explicitly set,
     * the widget may expand if some of its children do.
     */
    public boolean computeExpand(Orientation orientation) {
        var RESULT = gtk_h.gtk_widget_compute_expand(handle(), orientation.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Translates the given @point in @widget&#39;s coordinates to coordinates
     * relative to @target&#8217;s coordinate system.
     * 
     * In order to perform this operation, both widgets must share a
     * common ancestor.
     */
    public boolean computePoint(Widget target, org.gtk.graphene.Point point, org.gtk.graphene.Point outPoint) {
        var RESULT = gtk_h.gtk_widget_compute_point(handle(), target.handle(), point.handle(), outPoint.handle());
        return (RESULT != 0);
    }
    
    /**
     * Computes a matrix suitable to describe a transformation from
     * @widget&#39;s coordinate system into @target&#39;s coordinate system.
     * 
     * The transform can not be computed in certain cases, for example
     * when @widget and @target do not share a common ancestor. In that
     * case @out_transform gets set to the identity matrix.
     */
    public boolean computeTransform(Widget target, org.gtk.graphene.Matrix outTransform) {
        var RESULT = gtk_h.gtk_widget_compute_transform(handle(), target.handle(), outTransform.handle());
        return (RESULT != 0);
    }
    
    /**
     * Tests if the point at (@x, @y) is contained in @widget.
     * 
     * The coordinates for (@x, @y) must be in widget coordinates, so
     * (0, 0) is assumed to be the top left of @widget&#39;s content area.
     */
    public boolean contains(double x, double y) {
        var RESULT = gtk_h.gtk_widget_contains(handle(), x, y);
        return (RESULT != 0);
    }
    
    /**
     * Creates a new <code>PangoContext</code> with the appropriate font map,
     * font options, font description, and base direction for drawing
     * text for this widget.
     * 
     * See also {@link org.gtk.gtk.Widget#getPangoContext}.
     */
    public org.pango.Context createPangoContext() {
        var RESULT = gtk_h.gtk_widget_create_pango_context(handle());
        return new org.pango.Context(References.get(RESULT, true));
    }
    
    /**
     * Creates a new <code>PangoLayout</code> with the appropriate font map,
     * font description, and base direction for drawing text for
     * this widget.
     * <p>
     * If you keep a <code>PangoLayout</code> created in this way around,
     * you need to re-create it when the widget <code>PangoContext</code>
     * is replaced. This can be tracked by listening to changes
     * of the {@link [property@Gtk.Widget:root] (ref=property)} property on the widget.
     */
    public org.pango.Layout createPangoLayout(java.lang.String text) {
        var RESULT = gtk_h.gtk_widget_create_pango_layout(handle(), Interop.allocateNativeString(text).handle());
        return new org.pango.Layout(References.get(RESULT, true));
    }
    
    /**
     * Checks to see if a drag movement has passed the GTK drag threshold.
     */
    public boolean dragCheckThreshold(int startX, int startY, int currentX, int currentY) {
        var RESULT = gtk_h.gtk_drag_check_threshold(handle(), startX, startY, currentX, currentY);
        return (RESULT != 0);
    }
    
    /**
     * Notifies the user about an input-related error on this widget.
     * 
     * If the {@link [property@Gtk.Settings:gtk-error-bell] (ref=property)} setting is <code>TRUE,
     * it</code> calls {@link org.gtk.gdk.Surface#beep}, otherwise it does nothing.
     * 
     * Note that the effect of {@link org.gtk.gdk.Surface#beep} can be configured
     * in many ways, depending on the windowing backend and the desktop
     * environment or window manager that is used.
     */
    public void errorBell() {
        gtk_h.gtk_widget_error_bell(handle());
    }
    
    /**
     * Returns the baseline that has currently been allocated to @widget.
     * <p>
     * This function is intended to be used when implementing handlers
     * for the <code>GtkWidget</code>Class.snapshot() function, and when allocating
     * child widgets in <code>GtkWidget</code>Class.size_allocate().
     */
    public int getAllocatedBaseline() {
        var RESULT = gtk_h.gtk_widget_get_allocated_baseline(handle());
        return RESULT;
    }
    
    /**
     * Returns the height that has currently been allocated to @widget.
     */
    public int getAllocatedHeight() {
        var RESULT = gtk_h.gtk_widget_get_allocated_height(handle());
        return RESULT;
    }
    
    /**
     * Returns the width that has currently been allocated to @widget.
     */
    public int getAllocatedWidth() {
        var RESULT = gtk_h.gtk_widget_get_allocated_width(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the widget&#8217;s allocation.
     * 
     * Note, when implementing a layout container: a widget&#8217;s allocation
     * will be its &#8220;adjusted&#8221; allocation, that is, the widget&#8217;s parent
     * typically calls {@link org.gtk.gtk.Widget#sizeAllocate} with an allocation,
     * and that allocation is then adjusted (to handle margin
     * and alignment for example) before assignment to the widget.
     * {@link org.gtk.gtk.Widget#getAllocation} returns the adjusted allocation that
     * was actually assigned to the widget. The adjusted allocation is
     * guaranteed to be completely contained within the
     * {@link org.gtk.gtk.Widget#sizeAllocate} allocation, however.
     * 
     * So a layout container is guaranteed that its children stay inside
     * the assigned bounds, but not that they have exactly the bounds the
     * container assigned.
     */
    public void getAllocation(Allocation allocation) {
        gtk_h.gtk_widget_get_allocation(handle(), allocation.handle());
    }
    
    /**
     * Gets the first ancestor of @widget with type @widget_type.
     * <p>
     * For example, <code>gtk_widget_get_ancestor (widget, GTK_TYPE_BOX)</code>
     * gets the first <code>GtkBox</code> that&#8217;s an ancestor of @widget. No
     * reference will be added to the returned widget; it should
     * not be unreferenced.
     * 
     * Note that unlike {@link org.gtk.gtk.Widget#isAncestor}, this function
     * considers @widget to be an ancestor of itself.
     */
    public Widget getAncestor(Type widgetType) {
        var RESULT = gtk_h.gtk_widget_get_ancestor(handle(), widgetType.getValue());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Determines whether the input focus can enter @widget or any
     * of its children.
     * 
     * See {@link org.gtk.gtk.Widget#setFocusable}.
     */
    public boolean getCanFocus() {
        var RESULT = gtk_h.gtk_widget_get_can_focus(handle());
        return (RESULT != 0);
    }
    
    /**
     * Queries whether @widget can be the target of pointer events.
     */
    public boolean getCanTarget() {
        var RESULT = gtk_h.gtk_widget_get_can_target(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value set with gtk_widget_set_child_visible().
     * 
     * If you feel a need to use this function, your code probably
     * needs reorganization.
     * 
     * This function is only useful for container implementations
     * and should never be called by an application.
     */
    public boolean getChildVisible() {
        var RESULT = gtk_h.gtk_widget_get_child_visible(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the clipboard object for @widget.
     * <p>
     * This is a utility function to get the clipboard object for the<code>GdkDisplay</code> that @widget is using.
     * 
     * Note that this function always works, even when @widget is not
     * realized yet.
     */
    public org.gtk.gdk.Clipboard getClipboard() {
        var RESULT = gtk_h.gtk_widget_get_clipboard(handle());
        return new org.gtk.gdk.Clipboard(References.get(RESULT, false));
    }
    
    /**
     * Returns the CSS name that is used for @self.
     */
    public java.lang.String getCssName() {
        var RESULT = gtk_h.gtk_widget_get_css_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Queries the cursor set on @widget.
     * 
     * See {@link org.gtk.gtk.Widget#setCursor} for details.
     */
    public org.gtk.gdk.Cursor getCursor() {
        var RESULT = gtk_h.gtk_widget_get_cursor(handle());
        return new org.gtk.gdk.Cursor(References.get(RESULT, false));
    }
    
    /**
     * Gets the reading direction for a particular widget.
     * 
     * See {@link org.gtk.gtk.Widget#setDirection}.
     */
    public TextDirection getDirection() {
        var RESULT = gtk_h.gtk_widget_get_direction(handle());
        return TextDirection.fromValue(RESULT);
    }
    
    /**
     * Get the <code>GdkDisplay</code> for the toplevel window associated with
     * this widget.
     * <p>
     * This function can only be called after the widget has been
     * added to a widget hierarchy with a <code>GtkWindow</code> at the top.
     * 
     * In general, you should only create display specific
     * resources when a widget has been realized, and you should
     * free those resources when the widget is unrealized.
     */
    public org.gtk.gdk.Display getDisplay() {
        var RESULT = gtk_h.gtk_widget_get_display(handle());
        return new org.gtk.gdk.Display(References.get(RESULT, false));
    }
    
    /**
     * Returns the widgets first child.
     * 
     * This API is primarily meant for widget implementations.
     */
    public Widget getFirstChild() {
        var RESULT = gtk_h.gtk_widget_get_first_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns the current focus child of @widget.
     */
    public Widget getFocusChild() {
        var RESULT = gtk_h.gtk_widget_get_focus_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the widget should grab focus when it is clicked
     * with the mouse.
     * 
     * See {@link org.gtk.gtk.Widget#setFocusOnClick}.
     */
    public boolean getFocusOnClick() {
        var RESULT = gtk_h.gtk_widget_get_focus_on_click(handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether @widget can own the input focus.
     * 
     * See {@link org.gtk.gtk.Widget#setFocusable}.
     */
    public boolean getFocusable() {
        var RESULT = gtk_h.gtk_widget_get_focusable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the font map of @widget.
     * 
     * See {@link org.gtk.gtk.Widget#setFontMap}.
     */
    public org.pango.FontMap getFontMap() {
        var RESULT = gtk_h.gtk_widget_get_font_map(handle());
        return new org.pango.FontMap(References.get(RESULT, false));
    }
    
    /**
     * Returns the <code>cairo_font_options_t</code> of widget.
     * 
     * Seee {@link org.gtk.gtk.Widget#setFontOptions}.
     */
    public org.cairographics.FontOptions getFontOptions() {
        var RESULT = gtk_h.gtk_widget_get_font_options(handle());
        return new org.cairographics.FontOptions(References.get(RESULT, false));
    }
    
    /**
     * Obtains the frame clock for a widget.
     * 
     * The frame clock is a global &#8220;ticker&#8221; that can be used to drive
     * animations and repaints. The most common reason to get the frame
     * clock is to call {@link org.gtk.gdk.FrameClock#getFrameTime}, in order
     * to get a time to use for animating. For example you might record
     * the start of the animation with an initial value from
     * {@link org.gtk.gdk.FrameClock#getFrameTime}, and then update the animation
     * by calling {@link org.gtk.gdk.FrameClock#getFrameTime} again during each repaint.
     * 
     * {@link org.gtk.gdk.FrameClock#requestPhase} will result in a new frame on the
     * clock, but won&#8217;t necessarily repaint any widgets. To repaint a
     * widget, you have to use {@link org.gtk.gtk.Widget#queueDraw} which invalidates
     * the widget (thus scheduling it to receive a draw on the next
     * frame). gtk_widget_queue_draw() will also end up requesting a frame
     * on the appropriate frame clock.
     * 
     * A widget&#8217;s frame clock will not change while the widget is
     * mapped. Reparenting a widget (which implies a temporary unmap) can
     * change the widget&#8217;s frame clock.
     * 
     * Unrealized widgets do not have a frame clock.
     */
    public org.gtk.gdk.FrameClock getFrameClock() {
        var RESULT = gtk_h.gtk_widget_get_frame_clock(handle());
        return new org.gtk.gdk.FrameClock(References.get(RESULT, false));
    }
    
    /**
     * Gets the horizontal alignment of @widget.
     * 
     * For backwards compatibility reasons this method will never return
     * <code>GTK_ALIGN_BASELINE,</code> but instead it will convert it to
     * <code>GTK_ALIGN_FILL.</code> Baselines are not supported for horizontal
     * alignment.
     */
    public Align getHalign() {
        var RESULT = gtk_h.gtk_widget_get_halign(handle());
        return Align.fromValue(RESULT);
    }
    
    /**
     * Returns the current value of the <code>has-tooltip</code> property.
     */
    public boolean getHasTooltip() {
        var RESULT = gtk_h.gtk_widget_get_has_tooltip(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the content height of the widget.
     * 
     * This function returns the height passed to its
     * size-allocate implementation, which is the height you
     * should be using in {@link org.gtk.gtk.Widget#snapshot}.
     * 
     * For pointer events, see {@link org.gtk.gtk.Widget#contains}.
     */
    public int getHeight() {
        var RESULT = gtk_h.gtk_widget_get_height(handle());
        return RESULT;
    }
    
    /**
     * Gets whether the widget would like any available extra horizontal
     * space.
     * <p>
     * When a user resizes a <code>GtkWindow</code>, widgets with expand=TRUE
     * generally receive the extra space. For example, a list or
     * scrollable area or document in your window would often be set to
     * expand.
     * 
     * Containers should use {@link org.gtk.gtk.Widget#computeExpand} rather
     * than this function, to see whether a widget, or any of its children,
     * has the expand flag set. If any child of a widget wants to
     * expand, the parent may ask to expand also.
     * 
     * This function only looks at the widget&#8217;s own hexpand flag, rather
     * than computing whether the entire widget tree rooted at this widget
     * wants to expand.
     */
    public boolean getHexpand() {
        var RESULT = gtk_h.gtk_widget_get_hexpand(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether gtk_widget_set_hexpand() has been used
     * to explicitly set the expand flag on this widget.
     * <p>
     * If {@link [property@Gtk.Widget:hexpand] (ref=property)} property is set, then it
     * overrides any computed expand value based on child widgets.
     * If <code>hexpand</code> is not set, then the expand value depends on
     * whether any children of the widget would like to expand.
     * 
     * There are few reasons to use this function, but it&#8217;s here
     * for completeness and consistency.
     */
    public boolean getHexpandSet() {
        var RESULT = gtk_h.gtk_widget_get_hexpand_set(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the widgets last child.
     * 
     * This API is primarily meant for widget implementations.
     */
    public Widget getLastChild() {
        var RESULT = gtk_h.gtk_widget_get_last_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the layout manager used by @widget.
     * 
     * See {@link org.gtk.gtk.Widget#setLayoutManager}.
     */
    public LayoutManager getLayoutManager() {
        var RESULT = gtk_h.gtk_widget_get_layout_manager(handle());
        return new LayoutManager(References.get(RESULT, false));
    }
    
    /**
     * Whether the widget is mapped.
     */
    public boolean getMapped() {
        var RESULT = gtk_h.gtk_widget_get_mapped(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the bottom margin of @widget.
     */
    public int getMarginBottom() {
        var RESULT = gtk_h.gtk_widget_get_margin_bottom(handle());
        return RESULT;
    }
    
    /**
     * Gets the end margin of @widget.
     */
    public int getMarginEnd() {
        var RESULT = gtk_h.gtk_widget_get_margin_end(handle());
        return RESULT;
    }
    
    /**
     * Gets the start margin of @widget.
     */
    public int getMarginStart() {
        var RESULT = gtk_h.gtk_widget_get_margin_start(handle());
        return RESULT;
    }
    
    /**
     * Gets the top margin of @widget.
     */
    public int getMarginTop() {
        var RESULT = gtk_h.gtk_widget_get_margin_top(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the name of a widget.
     * 
     * See {@link org.gtk.gtk.Widget#setName} for the significance of widget names.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.gtk_widget_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the nearest <code>GtkNative</code> ancestor of @widget.
     * <p>
     * This function will return <code>null</code> if the widget is not
     * contained inside a widget tree with a native ancestor.
     * <p><code>GtkNative</code> widgets will return themselves here.
     */
    public Native getNative() {
        var RESULT = gtk_h.gtk_widget_get_native(handle());
        return new Native.NativeImpl(References.get(RESULT, false));
    }
    
    /**
     * Returns the widgets next sibling.
     * 
     * This API is primarily meant for widget implementations.
     */
    public Widget getNextSibling() {
        var RESULT = gtk_h.gtk_widget_get_next_sibling(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * #Fetches the requested opacity for this widget.
     * 
     * See {@link org.gtk.gtk.Widget#setOpacity}.
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
        return Overflow.fromValue(RESULT);
    }
    
    /**
     * Gets a <code>PangoContext</code> with the appropriate font map, font description,
     * and base direction for this widget.
     * 
     * Unlike the context returned by {@link org.gtk.gtk.Widget#createPangoContext},
     * this context is owned by the widget (it can be used until the screen
     * for the widget changes or the widget is removed from its toplevel),
     * and will be updated to match any changes to the widget&#8217;s attributes.
     * This can be tracked by listening to changes of the
     * {@link [property@Gtk.Widget:root] (ref=property)} property on the widget.
     */
    public org.pango.Context getPangoContext() {
        var RESULT = gtk_h.gtk_widget_get_pango_context(handle());
        return new org.pango.Context(References.get(RESULT, false));
    }
    
    /**
     * Returns the parent widget of @widget.
     */
    public Widget getParent() {
        var RESULT = gtk_h.gtk_widget_get_parent(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the minimum and natural size of a widget, taking
     * into account the widget&#8217;s preference for height-for-width management.
     * <p>
     * This is used to retrieve a suitable size by container widgets which do
     * not impose any restrictions on the child placement. It can be used
     * to deduce toplevel window and menu sizes as well as child widgets in
     * free-form containers such as <code>GtkFixed</code>.
     * 
     * Handle with care. Note that the natural height of a height-for-width
     * widget will generally be a smaller size than the minimum height, since
     * the required height for the natural width is generally smaller than the
     * required height for the minimum width.
     * 
     * Use {@link org.gtk.gtk.Widget#measure} if you want to support baseline alignment.
     */
    public void getPreferredSize(Requisition minimumSize, Requisition naturalSize) {
        gtk_h.gtk_widget_get_preferred_size(handle(), minimumSize.handle(), naturalSize.handle());
    }
    
    /**
     * Returns the widgets previous sibling.
     * 
     * This API is primarily meant for widget implementations.
     */
    public Widget getPrevSibling() {
        var RESULT = gtk_h.gtk_widget_get_prev_sibling(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the primary clipboard of @widget.
     * <p>
     * This is a utility function to get the primary clipboard object
     * for the <code>GdkDisplay</code> that @widget is using.
     * 
     * Note that this function always works, even when @widget is not
     * realized yet.
     */
    public org.gtk.gdk.Clipboard getPrimaryClipboard() {
        var RESULT = gtk_h.gtk_widget_get_primary_clipboard(handle());
        return new org.gtk.gdk.Clipboard(References.get(RESULT, false));
    }
    
    /**
     * Determines whether @widget is realized.
     */
    public boolean getRealized() {
        var RESULT = gtk_h.gtk_widget_get_realized(handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether @widget is always treated as the default widget
     * within its toplevel when it has the focus, even if another widget
     * is the default.
     * 
     * See {@link org.gtk.gtk.Widget#setReceivesDefault}.
     */
    public boolean getReceivesDefault() {
        var RESULT = gtk_h.gtk_widget_get_receives_default(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether the widget prefers a height-for-width layout
     * or a width-for-height layout.
     * 
     * Single-child widgets generally propagate the preference of
     * their child, more complex widgets need to request something
     * either in context of their children or in context of their
     * allocation capabilities.
     */
    public SizeRequestMode getRequestMode() {
        var RESULT = gtk_h.gtk_widget_get_request_mode(handle());
        return SizeRequestMode.fromValue(RESULT);
    }
    
    /**
     * Returns the <code>GtkRoot</code> widget of @widget.
     * <p>
     * This function will return <code>null</code> if the widget is not contained
     * inside a widget tree with a root widget.
     * <p><code>GtkRoot</code> widgets will return themselves here.
     */
    public Root getRoot() {
        var RESULT = gtk_h.gtk_widget_get_root(handle());
        return new Root.RootImpl(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the internal scale factor that maps from window
     * coordinates to the actual device pixels.
     * 
     * On traditional systems this is 1, on high density outputs,
     * it can be a higher value (typically 2).
     * 
     * See {@link org.gtk.gdk.Surface#getScaleFactor}.
     */
    public int getScaleFactor() {
        var RESULT = gtk_h.gtk_widget_get_scale_factor(handle());
        return RESULT;
    }
    
    /**
     * Returns the widget&#8217;s sensitivity.
     * 
     * This function returns the value that has been set using
     * {@link org.gtk.gtk.Widget#setSensitive}).
     * 
     * The effective sensitivity of a widget is however determined
     * by both its own and its parent widget&#8217;s sensitivity.
     * See {@link org.gtk.gtk.Widget#isSensitive}.
     */
    public boolean getSensitive() {
        var RESULT = gtk_h.gtk_widget_get_sensitive(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the settings object holding the settings used for this widget.
     * <p>
     * Note that this function can only be called when the <code>GtkWidget</code>
     * is attached to a toplevel, since the settings object is specific
     * to a particular <code>GdkDisplay</code>. If you want to monitor the widget for
     * changes in its settings, connect to the <code>notify::display</code> signal.
     */
    public Settings getSettings() {
        var RESULT = gtk_h.gtk_widget_get_settings(handle());
        return new Settings(References.get(RESULT, false));
    }
    
    /**
     * Returns the content width or height of the widget.
     * 
     * Which dimension is returned depends on @orientation.
     * 
     * This is equivalent to calling {@link org.gtk.gtk.Widget#getWidth}
     * for {@link org.gtk.gtk.Orientation#HORIZONTAL} or {@link org.gtk.gtk.Widget#getHeight}
     * for <code>GTK_ORIENTATION_VERTICAL,</code> but can be used when
     * writing orientation-independent code, such as when
     * implementing {@link [iface@Gtk.Orientable] (ref=iface)} widgets.
     */
    public int getSize(Orientation orientation) {
        var RESULT = gtk_h.gtk_widget_get_size(handle(), orientation.getValue());
        return RESULT;
    }
    
    /**
     * Returns the widget state as a flag set.
     * 
     * It is worth mentioning that the effective <code>GTK_STATE_FLAG_INSENSITIVE
     * state</code> will be returned, that is, also based on parent insensitivity,
     * even if @widget itself is sensitive.
     * 
     * Also note that if you are looking for a way to obtain the
     * {@link [flags@Gtk.StateFlags] (ref=flags)} to pass to a {@link org.gtk.gtk.StyleContext}
     * method, you should look at {@link org.gtk.gtk.StyleContext#getState}.
     */
    public int getStateFlags() {
        var RESULT = gtk_h.gtk_widget_get_state_flags(handle());
        return RESULT;
    }
    
    /**
     * Returns the style context associated to @widget.
     * 
     * The returned object is guaranteed to be the same
     * for the lifetime of @widget.
     */
    public StyleContext getStyleContext() {
        var RESULT = gtk_h.gtk_widget_get_style_context(handle());
        return new StyleContext(References.get(RESULT, false));
    }
    
    /**
     * Fetch an object build from the template XML for @widget_type in
     * this @widget instance.
     * 
     * This will only report children which were previously declared
     * with {@link org.gtk.gtk.WidgetClass#bindTemplateChildFull} or one of its
     * variants.
     * 
     * This function is only meant to be called for code which is private
     * to the @widget_type which declared the child and is meant for language
     * bindings which cannot easily make use of the GObject structure offsets.
     */
    public org.gtk.gobject.Object getTemplateChild(Type widgetType, java.lang.String name) {
        var RESULT = gtk_h.gtk_widget_get_template_child(handle(), widgetType.getValue(), Interop.allocateNativeString(name).handle());
        return new org.gtk.gobject.Object(References.get(RESULT, false));
    }
    
    /**
     * Gets the contents of the tooltip for @widget.
     * 
     * If the tooltip has not been set using
     * {@link org.gtk.gtk.Widget#setTooltipMarkup}, this
     * function returns 
     *             
     *           
     *         
     *       
     *       
     *         
     *         Gets the contents of the tooltip for @widget.
     * 
     * If the tooltip has not been set using
     * {@link org.gtk.gtk.Widget#setTooltipMarkup}, this
     * function returns %NULL.
     */
    public java.lang.String getTooltipMarkup() {
        var RESULT = gtk_h.gtk_widget_get_tooltip_markup(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the contents of the tooltip for @widget.
     * 
     * If the @widget&#39;s tooltip was set using
     * {@link org.gtk.gtk.Widget#setTooltipMarkup},
     * this function will return the escaped text.
     */
    public java.lang.String getTooltipText() {
        var RESULT = gtk_h.gtk_widget_get_tooltip_text(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the vertical alignment of @widget.
     */
    public Align getValign() {
        var RESULT = gtk_h.gtk_widget_get_valign(handle());
        return Align.fromValue(RESULT);
    }
    
    /**
     * Gets whether the widget would like any available extra vertical
     * space.
     * 
     * See {@link org.gtk.gtk.Widget#getHexpand} for more detail.
     */
    public boolean getVexpand() {
        var RESULT = gtk_h.gtk_widget_get_vexpand(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether gtk_widget_set_vexpand() has been used to
     * explicitly set the expand flag on this widget.
     * 
     * See {@link org.gtk.gtk.Widget#getHexpandSet} for more detail.
     */
    public boolean getVexpandSet() {
        var RESULT = gtk_h.gtk_widget_get_vexpand_set(handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether the widget is visible.
     * 
     * If you want to take into account whether the widget&#8217;s
     * parent is also marked as visible, use
     * {@link org.gtk.gtk.Widget#isVisible} instead.
     * 
     * This function does not check if the widget is
     * obscured in any way.
     * 
     * See {@link org.gtk.gtk.Widget#setVisible}.
     */
    public boolean getVisible() {
        var RESULT = gtk_h.gtk_widget_get_visible(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the content width of the widget.
     * 
     * This function returns the width passed to its
     * size-allocate implementation, which is the width you
     * should be using in {@link org.gtk.gtk.Widget#snapshot}.
     * 
     * For pointer events, see {@link org.gtk.gtk.Widget#contains}.
     */
    public int getWidth() {
        var RESULT = gtk_h.gtk_widget_get_width(handle());
        return RESULT;
    }
    
    /**
     * Causes @widget to have the keyboard focus for the <code>GtkWindow</code> it&#39;s inside.
     * 
     * If @widget is not focusable, or its {@link org.gtk.gtk.Widget#grabFocus}
     * implementation cannot transfer the focus to a descendant of @widget
     * that is focusable, it will not take focus and <code>false</code> will be returned.
     * 
     * Calling {@link org.gtk.gtk.Widget#grabFocus} on an already focused widget
     * is allowed, should not have an effect, and return will be returned.
     * 
     * Calling {@link org.gtk.gtk.Widget#grabFocus} on an already focused widget
     * is allowed, should not have an effect, and return %TRUE.
     */
    public boolean grabFocus() {
        var RESULT = gtk_h.gtk_widget_grab_focus(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether @css_class is currently applied to @widget.
     */
    public boolean hasCssClass(java.lang.String cssClass) {
        var RESULT = gtk_h.gtk_widget_has_css_class(handle(), Interop.allocateNativeString(cssClass).handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether @widget is the current default widget
     * within its toplevel.
     */
    public boolean hasDefault() {
        var RESULT = gtk_h.gtk_widget_has_default(handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines if the widget has the global input focus.
     * 
     * See {@link org.gtk.gtk.Widget#isFocus} for the difference between
     * having the global input focus, and only having the focus
     * within a toplevel.
     */
    public boolean hasFocus() {
        var RESULT = gtk_h.gtk_widget_has_focus(handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines if the widget should show a visible indication that
     * it has the global input focus.
     * 
     * This is a convenience function that takes into account whether
     * focus indication should currently be shown in the toplevel window
     * of @widget. See {@link org.gtk.gtk.Window#getFocusVisible} for more
     * information about focus indication.
     * 
     * To find out if the widget has the global input focus, use
     * {@link org.gtk.gtk.Widget#hasFocus}.
     */
    public boolean hasVisibleFocus() {
        var RESULT = gtk_h.gtk_widget_has_visible_focus(handle());
        return (RESULT != 0);
    }
    
    /**
     * Reverses the effects of gtk_widget_show().
     * 
     * This is causing the widget to be hidden (invisible to the user).
     */
    public void hide() {
        gtk_h.gtk_widget_hide(handle());
    }
    
    /**
     * Returns whether the widget is currently being destroyed.
     * 
     * This information can sometimes be used to avoid doing
     * unnecessary work.
     */
    public boolean inDestruction() {
        var RESULT = gtk_h.gtk_widget_in_destruction(handle());
        return (RESULT != 0);
    }
    
    /**
     * Creates and initializes child widgets defined in templates.
     * <p>
     * This function must be called in the instance initializer
     * for any class which assigned itself a template using
     * {@link org.gtk.gtk.WidgetClass#setTemplate}.
     * <p>
     * It is important to call this function in the instance initializer
     * of a <code>GtkWidget</code> subclass and not in <code>GObject.constructed()</code> or<code>GObject.constructor()</code> for two reasons:
     * <p>
     *  - derived widgets will assume that the composite widgets
     *    defined by its parent classes have been created in their
     *    relative instance initializers
     *  - when calling <code>g_object_new()</code> on a widget with composite templates,
     *    it&#8217;s important to build the composite widgets before the construct
     *    properties are set. Properties passed to <code>g_object_new()</code> should
     *    take precedence over properties set in the private template XML
     * 
     * A good rule of thumb is to call this function as the first thing in
     * an instance initialization function.
     */
    public void initTemplate() {
        gtk_h.gtk_widget_init_template(handle());
    }
    
    /**
     * Inserts @group into @widget.
     * <p>
     * Children of @widget that implement {@link [iface@Gtk.Actionable] (ref=iface)} can
     * then be associated with actions in @group by setting their
     * &#8220;action-name&#8221; to @prefix.<code>action-name</code>.
     * 
     * Note that inheritance is defined for individual actions. I.e.
     * even if you insert a group with prefix @prefix, actions with
     * the same prefix will still be inherited from the parent, unless
     * the group contains an action with the same name.
     * 
     * If @group is <code>NULL,</code> a previously inserted group for @name is
     * removed from @widget.
     */
    public void insertActionGroup(java.lang.String name, org.gtk.gio.ActionGroup group) {
        gtk_h.gtk_widget_insert_action_group(handle(), Interop.allocateNativeString(name).handle(), group.handle());
    }
    
    /**
     * Inserts @widget into the child widget list of @parent.
     * <p>
     * It will be placed after @previous_sibling, or at the beginning if
     * @previous_sibling is <code>NULL.
     * <p>
     * After</code> calling this function, <code>gtk_widget_get_prev_sibling(widget)</code>
     * will return @previous_sibling.
     * 
     * If @parent is already set as the parent widget of @widget, this
     * function can also be used to reorder @widget in the child widget
     * list of @parent.
     * 
     * This API is primarily meant for widget implementations; if you are
     * just using a widget, you *must* use its own API for adding children.
     */
    public void insertAfter(Widget parent, Widget previousSibling) {
        gtk_h.gtk_widget_insert_after(handle(), parent.handle(), previousSibling.handle());
    }
    
    /**
     * Inserts @widget into the child widget list of @parent.
     * <p>
     * It will be placed before @next_sibling, or at the end if
     * @next_sibling is <code>NULL.
     * <p>
     * After</code> calling this function, <code>gtk_widget_get_next_sibling(widget)</code>
     * will return @next_sibling.
     * 
     * If @parent is already set as the parent widget of @widget, this function
     * can also be used to reorder @widget in the child widget list of @parent.
     * 
     * This API is primarily meant for widget implementations; if you are
     * just using a widget, you *must* use its own API for adding children.
     */
    public void insertBefore(Widget parent, Widget nextSibling) {
        gtk_h.gtk_widget_insert_before(handle(), parent.handle(), nextSibling.handle());
    }
    
    /**
     * Determines whether @widget is somewhere inside @ancestor,
     * possibly with intermediate containers.
     */
    public boolean isAncestor(Widget ancestor) {
        var RESULT = gtk_h.gtk_widget_is_ancestor(handle(), ancestor.handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether @widget can be drawn to.
     * 
     * A widget can be drawn if it is mapped and visible.
     */
    public boolean isDrawable() {
        var RESULT = gtk_h.gtk_widget_is_drawable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines if the widget is the focus widget within its
     * toplevel.
     * 
     * This does not mean that the {@link [property@Gtk.Widget:has-focus] (ref=property)}
     * property is necessarily set; {@link [property@Gtk.Widget:has-focus] (ref=property)}
     * will only be set if the toplevel widget additionally has the
     * global input focus.
     */
    public boolean isFocus() {
        var RESULT = gtk_h.gtk_widget_is_focus(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the widget&#8217;s effective sensitivity.
     * 
     * This means it is sensitive itself and also its
     * parent widget is sensitive.
     */
    public boolean isSensitive() {
        var RESULT = gtk_h.gtk_widget_is_sensitive(handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether the widget and all its parents are marked as
     * visible.
     * 
     * This function does not check if the widget is obscured in any way.
     * 
     * See also {@link org.gtk.gtk.Widget#getVisible} and
     * {@link org.gtk.gtk.Widget#setVisible}.
     */
    public boolean isVisible() {
        var RESULT = gtk_h.gtk_widget_is_visible(handle());
        return (RESULT != 0);
    }
    
    /**
     * Emits the <code>::keynav-failed</code> signal on the widget.
     * <p>
     * This function should be called whenever keyboard navigation
     * within a single widget hits a boundary.
     * <p>
     * The return value of this function should be interpreted
     * in a way similar to the return value of
     * {@link org.gtk.gtk.Widget#childFocus}. When <code>true</code> is returned,
     * stay in the widget, the failed keyboard  navigation is OK
     * and/or there is nowhere we can/should move the focus to.
     * When <code>false</code> is returned, the caller should continue with
     * keyboard navigation outside the widget, e.g. by calling
     * {@link org.gtk.gtk.Widget#childFocus} on the widget&#8217;s toplevel.
     * <p>
     * The default {@link [signal@Gtk.Widget::keynav-failed] (ref=signal)} handler returns
     * <code>false</code> for {@link org.gtk.gtk.DirectionType#TAB_FORWARD} and <code>GTK_DIR_TAB_BACKWARD.
     * For</code> the other values of <code>GtkDirectionType</code> it returns <code>TRUE.
     * 
     * Whenever</code> the default handler returns <code>TRUE,</code> it also calls
     * {@link org.gtk.gtk.Widget#errorBell} to notify the user of the
     * failed keyboard navigation.
     * 
     * A use case for providing an own implementation of ::keynav-failed
     * (either by connecting to it or by overriding it) would be a row of
     * {@link org.gtk.gtk.Entry} widgets where the user should be able to navigate
     * the entire row with the cursor keys, as e.g. known from user
     * interfaces that require entering license keys.
     */
    public boolean keynavFailed(DirectionType direction) {
        var RESULT = gtk_h.gtk_widget_keynav_failed(handle(), direction.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Returns the widgets for which this widget is the target of a
     * mnemonic.
     * <p>
     * Typically, these widgets will be labels. See, for example,
     * {@link org.gtk.gtk.Label#setMnemonicWidget}.
     * <p>
     * The widgets in the list are not individually referenced.
     * If you want to iterate through the list and perform actions
     * involving callbacks that might destroy the widgets, you
     * must call <code>g_list_foreach (result, (GFunc)g_object_ref, NULL)</code>
     * first, and then unref all the widgets afterwards.
     */
    public org.gtk.glib.List listMnemonicLabels() {
        var RESULT = gtk_h.gtk_widget_list_mnemonic_labels(handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Causes a widget to be mapped if it isn&#8217;t already.
     * 
     * This function is only for use in widget implementations.
     */
    public void map() {
        gtk_h.gtk_widget_map(handle());
    }
    
    /**
     * Emits the ::mnemonic-activate signal.
     * 
     * See {@link [signal@Gtk.Widget::mnemonic-activate] (ref=signal)}.
     */
    public boolean mnemonicActivate(boolean groupCycling) {
        var RESULT = gtk_h.gtk_widget_mnemonic_activate(handle(), groupCycling ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Returns a <code>GListModel</code> to track the children of @widget.
     * 
     * Calling this function will enable extra internal bookkeeping
     * to track children and emit signals on the returned listmodel.
     * It may slow down operations a lot.
     * 
     * Applications should try hard to avoid calling this function
     * because of the slowdowns.
     */
    public org.gtk.gio.ListModel observeChildren() {
        var RESULT = gtk_h.gtk_widget_observe_children(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, true));
    }
    
    /**
     * Returns a <code>GListModel</code> to track the {@link org.gtk.gtk.EventController}s
     * of @widget.
     * 
     * Calling this function will enable extra internal bookkeeping
     * to track controllers and emit signals on the returned listmodel.
     * It may slow down operations a lot.
     * 
     * Applications should try hard to avoid calling this function
     * because of the slowdowns.
     */
    public org.gtk.gio.ListModel observeControllers() {
        var RESULT = gtk_h.gtk_widget_observe_controllers(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, true));
    }
    
    /**
     * Finds the descendant of @widget closest to the point (@x, @y).
     * 
     * The point must be given in widget coordinates, so (0, 0) is assumed
     * to be the top left of @widget&#39;s content area.
     * 
     * Usually widgets will return <code>null</code> if the given coordinate is not
     * contained in @widget checked via {@link org.gtk.gtk.Widget#contains}.
     * Otherwise they will recursively try to find a child that does
     * not return <code>NULL.</code> Widgets are however free to customize their
     * picking algorithm.
     * 
     * This function is used on the toplevel to determine the widget
     * below the mouse cursor for purposes of hover highlighting and
     * delivering events.
     */
    public Widget pick(double x, double y, int flags) {
        var RESULT = gtk_h.gtk_widget_pick(handle(), x, y, flags);
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Flags the widget for a rerun of the {@link org.gtk.gtk.Widget#sizeAllocate}
     * function.
     * 
     * Use this function instead of {@link org.gtk.gtk.Widget#queueResize}
     * when the @widget&#39;s size request didn&#39;t change but it wants to
     * reposition its contents.
     * 
     * An example user of this function is {@link org.gtk.gtk.Widget#setHalign}.
     * 
     * This function is only for use in widget implementations.
     */
    public void queueAllocate() {
        gtk_h.gtk_widget_queue_allocate(handle());
    }
    
    /**
     * Schedules this widget to be redrawn in the paint phase
     * of the current or the next frame.
     * 
     * This means @widget&#39;s {@link org.gtk.gtk.Widget#snapshot}
     * implementation will be called.
     */
    public void queueDraw() {
        gtk_h.gtk_widget_queue_draw(handle());
    }
    
    /**
     * Flags a widget to have its size renegotiated.
     * 
     * This should be called when a widget for some reason has a new
     * size request. For example, when you change the text in a
     * {@link org.gtk.gtk.Label}, the label queues a resize to ensure there&#8217;s
     * enough space for the new text.
     * 
     * Note that you cannot call gtk_widget_queue_resize() on a widget
     * from inside its implementation of the {@link org.gtk.gtk.Widget#sizeAllocate}
     * virtual method. Calls to gtk_widget_queue_resize() from inside
     * {@link org.gtk.gtk.Widget#sizeAllocate} will be silently ignored.
     * 
     * This function is only for use in widget implementations.
     */
    public void queueResize() {
        gtk_h.gtk_widget_queue_resize(handle());
    }
    
    /**
     * Creates the GDK resources associated with a widget.
     * 
     * Normally realization happens implicitly; if you show a widget
     * and all its parent containers, then the widget will be realized
     * and mapped automatically.
     * 
     * Realizing a widget requires all the widget&#8217;s parent widgets to be
     * realized; calling this function realizes the widget&#8217;s parents
     * in addition to @widget itself. If a widget is not yet inside a
     * toplevel window when you realize it, bad things will happen.
     * 
     * This function is primarily used in widget implementations, and
     * isn&#8217;t very useful otherwise. Many times when you think you might
     * need it, a better approach is to connect to a signal that will be
     * called after the widget is realized automatically, such as
     * {@link [signal@Gtk.Widget::realize] (ref=signal)}.
     */
    public void realize() {
        gtk_h.gtk_widget_realize(handle());
    }
    
    /**
     * Removes @controller from @widget, so that it doesn&#39;t process
     * events anymore.
     * 
     * It should not be used again.
     * 
     * Widgets will remove all event controllers automatically when they
     * are destroyed, there is normally no need to call this function.
     */
    public void removeController(EventController controller) {
        gtk_h.gtk_widget_remove_controller(handle(), controller.handle());
    }
    
    /**
     * Removes a style from @widget.
     * 
     * After this, the style of @widget will stop matching for @css_class.
     */
    public void removeCssClass(java.lang.String cssClass) {
        gtk_h.gtk_widget_remove_css_class(handle(), Interop.allocateNativeString(cssClass).handle());
    }
    
    /**
     * Removes a widget from the list of mnemonic labels for this widget.
     * 
     * See {@link org.gtk.gtk.Widget#listMnemonicLabels}. The widget must
     * have previously been added to the list with
     * {@link org.gtk.gtk.Widget#addMnemonicLabel}.
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
     * 
     * Applications should set @can_focus to <code>false</code> to mark a
     * widget as for pointer/touch use only.
     * 
     * Note that having @can_focus be <code>true</code> is only one of the
     * necessary conditions for being focusable. A widget must
     * also be sensitive and focusable and not have an ancestor
     * that is marked as not can-focus in order to receive input
     * focus.
     * 
     * See {@link org.gtk.gtk.Widget#grabFocus} for actually setting
     * the input focus on a widget.
     */
    public void setCanFocus(boolean canFocus) {
        gtk_h.gtk_widget_set_can_focus(handle(), canFocus ? 1 : 0);
    }
    
    /**
     * Sets whether @widget can be the target of pointer events.
     */
    public void setCanTarget(boolean canTarget) {
        gtk_h.gtk_widget_set_can_target(handle(), canTarget ? 1 : 0);
    }
    
    /**
     * Sets whether @widget should be mapped along with its parent.
     * 
     * The child visibility can be set for widget before it is added
     * to a container with {@link org.gtk.gtk.Widget#setParent}, to avoid
     * mapping children unnecessary before immediately unmapping them.
     * However it will be reset to its default state of <code>true</code> when the
     * widget is removed from a container.
     * 
     * Note that changing the child visibility of a widget does not
     * queue a resize on the widget. Most of the time, the size of
     * a widget is computed from all visible children, whether or
     * not they are mapped. If this is not the case, the container
     * can queue a resize itself.
     * 
     * This function is only useful for container implementations
     * and should never be called by an application.
     */
    public void setChildVisible(boolean childVisible) {
        gtk_h.gtk_widget_set_child_visible(handle(), childVisible ? 1 : 0);
    }
    
    /**
     * Clear all style classes applied to @widget
     * and replace them with @classes.
     */
    public void setCssClasses(java.lang.String[] classes) {
        gtk_h.gtk_widget_set_css_classes(handle(), Interop.allocateNativeArray(classes).handle());
    }
    
    /**
     * Sets the cursor to be shown when pointer devices point
     * towards @widget.
     * 
     * If the @cursor is NULL, @widget will use the cursor
     * inherited from the parent widget.
     */
    public void setCursor(org.gtk.gdk.Cursor cursor) {
        gtk_h.gtk_widget_set_cursor(handle(), cursor.handle());
    }
    
    /**
     * Sets a named cursor to be shown when pointer devices point
     * towards @widget.
     * 
     * This is a utility function that creates a cursor via
     * {@link [ctor@Gdk.Cursor.new_from_name] (ref=ctor)} and then sets it on @widget
     * with {@link org.gtk.gtk.Widget#setCursor}. See those functions for
     * details.
     * 
     * On top of that, this function allows @name to be <code>NULL,</code> which
     * will do the same as calling {@link org.gtk.gtk.Widget#setCursor}
     * with a <code>null</code> cursor.
     */
    public void setCursorFromName(java.lang.String name) {
        gtk_h.gtk_widget_set_cursor_from_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Sets the reading direction on a particular widget.
     * 
     * This direction controls the primary direction for widgets
     * containing text, and also the direction in which the children
     * of a container are packed. The ability to set the direction is
     * present in order so that correct localization into languages with
     * right-to-left reading directions can be done. Generally, applications
     * will let the default reading direction present, except for containers
     * where the containers are arranged in an order that is explicitly
     * visual rather than logical (such as buttons for text justification).
     * 
     * If the direction is set to <code>GTK_TEXT_DIR_NONE,</code> then the value
     * set by {@link Gtk#Widget} will be used.
     */
    public void setDirection(TextDirection dir) {
        gtk_h.gtk_widget_set_direction(handle(), dir.getValue());
    }
    
    /**
     * Set @child as the current focus child of @widget.
     * 
     * This function is only suitable for widget implementations.
     * If you want a certain widget to get the input focus, call
     * {@link org.gtk.gtk.Widget#grabFocus} on it.
     */
    public void setFocusChild(Widget child) {
        gtk_h.gtk_widget_set_focus_child(handle(), child.handle());
    }
    
    /**
     * Sets whether the widget should grab focus when it is clicked
     * with the mouse.
     * 
     * Making mouse clicks not grab focus is useful in places like
     * toolbars where you don&#8217;t want the keyboard focus removed from
     * the main area of the application.
     */
    public void setFocusOnClick(boolean focusOnClick) {
        gtk_h.gtk_widget_set_focus_on_click(handle(), focusOnClick ? 1 : 0);
    }
    
    /**
     * Specifies whether @widget can own the input focus.
     * 
     * Widget implementations should set @focusable to <code>true</code> in
     * their init() function if they want to receive keyboard input.
     * 
     * Note that having @focusable be <code>true</code> is only one of the
     * necessary conditions for being focusable. A widget must
     * also be sensitive and can-focus and not have an ancestor
     * that is marked as not can-focus in order to receive input
     * focus.
     * 
     * See {@link org.gtk.gtk.Widget#grabFocus} for actually setting
     * the input focus on a widget.
     */
    public void setFocusable(boolean focusable) {
        gtk_h.gtk_widget_set_focusable(handle(), focusable ? 1 : 0);
    }
    
    /**
     * Sets the font map to use for Pango rendering.
     * 
     * The font map is the object that is used to look up fonts.
     * Setting a custom font map can be useful in special situations,
     * e.g. when you need to add application-specific fonts to the set
     * of available fonts.
     * 
     * When not set, the widget will inherit the font map from its parent.
     */
    public void setFontMap(org.pango.FontMap fontMap) {
        gtk_h.gtk_widget_set_font_map(handle(), fontMap.handle());
    }
    
    /**
     * Sets the <code>cairo_font_options_t</code> used for Pango rendering
     * in this widget.
     * <p>
     * When not set, the default font options for the <code>GdkDisplay</code>
     * will be used.
     */
    public void setFontOptions(org.cairographics.FontOptions options) {
        gtk_h.gtk_widget_set_font_options(handle(), options.handle());
    }
    
    /**
     * Sets the horizontal alignment of @widget.
     */
    public void setHalign(Align align) {
        gtk_h.gtk_widget_set_halign(handle(), align.getValue());
    }
    
    /**
     * Sets the <code>has-tooltip</code> property on @widget to @has_tooltip.
     */
    public void setHasTooltip(boolean hasTooltip) {
        gtk_h.gtk_widget_set_has_tooltip(handle(), hasTooltip ? 1 : 0);
    }
    
    /**
     * Sets whether the widget would like any available extra horizontal
     * space.
     * <p>
     * When a user resizes a <code>GtkWindow</code>, widgets with expand=TRUE
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
     * its current children and state, call {@link org.gtk.gtk.Widget#computeExpand}.
     * A container can decide how the expandability of children affects the
     * expansion of the container by overriding the compute_expand virtual
     * method on <code>GtkWidget</code>.).
     * 
     * Setting hexpand explicitly with this function will override the
     * automatic expand behavior.
     * 
     * This function forces the widget to expand or not to expand,
     * regardless of children.  The override occurs because
     * {@link org.gtk.gtk.Widget#setHexpand} sets the hexpand-set property (see
     * {@link org.gtk.gtk.Widget#setHexpandSet}) which causes the widget&#8217;s hexpand
     * value to be used, rather than looking at children and widget state.
     */
    public void setHexpand(boolean expand) {
        gtk_h.gtk_widget_set_hexpand(handle(), expand ? 1 : 0);
    }
    
    /**
     * Sets whether the hexpand flag will be used.
     * 
     * The {@link [property@Gtk.Widget:hexpand-set] (ref=property)} property will be set
     * automatically when you call {@link org.gtk.gtk.Widget#setHexpand}
     * to set hexpand, so the most likely reason to use this function
     * would be to unset an explicit expand flag.
     * 
     * If hexpand is set, then it overrides any computed
     * expand value based on child widgets. If hexpand is not
     * set, then the expand value depends on whether any
     * children of the widget would like to expand.
     * 
     * There are few reasons to use this function, but it&#8217;s here
     * for completeness and consistency.
     */
    public void setHexpandSet(boolean set) {
        gtk_h.gtk_widget_set_hexpand_set(handle(), set ? 1 : 0);
    }
    
    /**
     * Sets the layout manager delegate instance that provides an
     * implementation for measuring and allocating the children of @widget.
     */
    public void setLayoutManager(LayoutManager layoutManager) {
        gtk_h.gtk_widget_set_layout_manager(handle(), layoutManager.getReference().unowned().handle());
    }
    
    /**
     * Sets the bottom margin of @widget.
     */
    public void setMarginBottom(int margin) {
        gtk_h.gtk_widget_set_margin_bottom(handle(), margin);
    }
    
    /**
     * Sets the end margin of @widget.
     */
    public void setMarginEnd(int margin) {
        gtk_h.gtk_widget_set_margin_end(handle(), margin);
    }
    
    /**
     * Sets the start margin of @widget.
     */
    public void setMarginStart(int margin) {
        gtk_h.gtk_widget_set_margin_start(handle(), margin);
    }
    
    /**
     * Sets the top margin of @widget.
     */
    public void setMarginTop(int margin) {
        gtk_h.gtk_widget_set_margin_top(handle(), margin);
    }
    
    /**
     * Sets a widgets name.
     * 
     * Setting a name allows you to refer to the widget from a
     * CSS file. You can apply a style to widgets with a particular name
     * in the CSS file. See the documentation for the CSS syntax (on the
     * same page as the docs for {@link org.gtk.gtk.StyleContext}.
     * 
     * Note that the CSS syntax has certain special characters to delimit
     * and represent elements in a selector (period, #, &#62;, *...), so using
     * these will make your widget impossible to match by name. Any combination
     * of alphanumeric symbols, dashes and underscores will suffice.
     */
    public void setName(java.lang.String name) {
        gtk_h.gtk_widget_set_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Request the @widget to be rendered partially transparent.
     * 
     * An opacity of 0 is fully transparent and an opacity of 1
     * is fully opaque.
     * 
     * Opacity works on both toplevel widgets and child widgets, although
     * there are some limitations: For toplevel widgets, applying opacity
     * depends on the capabilities of the windowing system. On X11, this
     * has any effect only on X displays with a compositing manager,
     * see gdk_display_is_composited(). On Windows and Wayland it should
     * always work, although setting a window&#8217;s opacity after the window
     * has been shown may cause some flicker.
     * 
     * Note that the opacity is inherited through inclusion &#8212; if you set
     * a toplevel to be partially translucent, all of its content will
     * appear translucent, since it is ultimatively rendered on that
     * toplevel. The opacity value itself is not inherited by child
     * widgets (since that would make widgets deeper in the hierarchy
     * progressively more translucent). As a consequence, {@link org.gtk.gtk.Popover}s
     * and other {@link [iface@Gtk.Native] (ref=iface)} widgets with their own surface will use their
     * own opacity value, and thus by default appear non-translucent,
     * even if they are attached to a toplevel that is translucent.
     */
    public void setOpacity(double opacity) {
        gtk_h.gtk_widget_set_opacity(handle(), opacity);
    }
    
    /**
     * Sets how @widget treats content that is drawn outside the
     * widget&#39;s content area.
     * 
     * See the definition of {@link [enum@Gtk.Overflow] (ref=enum)} for details.
     * 
     * This setting is provided for widget implementations and
     * should not be used by application code.
     * 
     * The default value is 
     *             
     *           
     *         
     *       
     *       
     *         
     *         Sets how @widget treats content that is drawn outside the
     * widget&#39;s content area.
     * 
     * See the definition of {@link [enum@Gtk.Overflow] (ref=enum)} for details.
     * 
     * This setting is provided for widget implementations and
     * should not be used by application code.
     * 
     * The default value is %GTK_OVERFLOW_VISIBLE.
     */
    public void setOverflow(Overflow overflow) {
        gtk_h.gtk_widget_set_overflow(handle(), overflow.getValue());
    }
    
    /**
     * Sets @parent as the parent widget of @widget.
     * <p>
     * This takes care of details such as updating the state and style
     * of the child to reflect its new location and resizing the parent.
     * The opposite function is {@link org.gtk.gtk.Widget#unparent}.
     * <p>
     * This function is useful only when implementing subclasses of<code>GtkWidget</code>.
     */
    public void setParent(Widget parent) {
        gtk_h.gtk_widget_set_parent(handle(), parent.handle());
    }
    
    /**
     * Specifies whether @widget will be treated as the default
     * widget within its toplevel when it has the focus, even if
     * another widget is the default.
     */
    public void setReceivesDefault(boolean receivesDefault) {
        gtk_h.gtk_widget_set_receives_default(handle(), receivesDefault ? 1 : 0);
    }
    
    /**
     * Sets the sensitivity of a widget.
     * 
     * A widget is sensitive if the user can interact with it.
     * Insensitive widgets are &#8220;grayed out&#8221; and the user can&#8217;t
     * interact with them. Insensitive widgets are known as
     * &#8220;inactive&#8221;, &#8220;disabled&#8221;, or &#8220;ghosted&#8221; in some other toolkits.
     */
    public void setSensitive(boolean sensitive) {
        gtk_h.gtk_widget_set_sensitive(handle(), sensitive ? 1 : 0);
    }
    
    /**
     * Sets the minimum size of a widget.
     * <p>
     * That is, the widget&#8217;s size request will be at least @width
     * by @height. You can use this function to force a widget to
     * be larger than it normally would be.
     * <p>
     * In most cases, {@link org.gtk.gtk.Window#setDefaultSize} is a better
     * choice for toplevel windows than this function; setting the default
     * size will still allow users to shrink the window. Setting the size
     * request will force them to leave the window at least as large as
     * the size request.
     * <p>
     * Note the inherent danger of setting any fixed size - themes,
     * translations into other languages, different fonts, and user action
     * can all change the appropriate size for a given widget. So, it&#39;s
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
     * the &#8220;natural&#8221; size request of the widget will be used instead.
     * <p>
     * The size request set here does not include any margin from the
     * properties
     * {@link [property@Gtk.Widget:margin-start] (ref=property)},
     * {@link [property@Gtk.Widget:margin-end] (ref=property)},
     * {@link [property@Gtk.Widget:margin-top] (ref=property)}, and
     * {@link [property@Gtk.Widget:margin-bottom] (ref=property)}, but it does include pretty
     * much all other padding or border properties set by any subclass
     * of <code>GtkWidget</code>.
     */
    public void setSizeRequest(int width, int height) {
        gtk_h.gtk_widget_set_size_request(handle(), width, height);
    }
    
    /**
     * Turns on flag values in the current widget state.
     * 
     * Typical widget states are insensitive, prelighted, etc.
     * 
     * This function accepts the values {@link org.gtk.gtk.StateFlags#DIR_LTR} and
     * {@link org.gtk.gtk.StateFlags#DIR_RTL} but ignores them. If you want to set
     * the widget&#39;s direction, use {@link org.gtk.gtk.Widget#setDirection}.
     * 
     * This function is for use in widget implementations.
     */
    public void setStateFlags(int flags, boolean clear) {
        gtk_h.gtk_widget_set_state_flags(handle(), flags, clear ? 1 : 0);
    }
    
    /**
     * Sets @markup as the contents of the tooltip, which is marked
     * up with Pango markup.
     * 
     * This function will take care of setting the
     * {@link [property@Gtk.Widget:has-tooltip] (ref=property)} as a side effect, and of the
     * default handler for the {@link [signal@Gtk.Widget::query-tooltip] (ref=signal)} signal.
     * 
     * See also {@link org.gtk.gtk.Tooltip#setMarkup}.
     */
    public void setTooltipMarkup(java.lang.String markup) {
        gtk_h.gtk_widget_set_tooltip_markup(handle(), Interop.allocateNativeString(markup).handle());
    }
    
    /**
     * Sets @text as the contents of the tooltip.
     * 
     * If @text contains any markup, it will be escaped.
     * 
     * This function will take care of setting
     * {@link [property@Gtk.Widget:has-tooltip] (ref=property)} as a side effect,
     * and of the default handler for the
     * {@link [signal@Gtk.Widget::query-tooltip] (ref=signal)} signal.
     * 
     * See also {@link org.gtk.gtk.Tooltip#setText}.
     */
    public void setTooltipText(java.lang.String text) {
        gtk_h.gtk_widget_set_tooltip_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Sets the vertical alignment of @widget.
     */
    public void setValign(Align align) {
        gtk_h.gtk_widget_set_valign(handle(), align.getValue());
    }
    
    /**
     * Sets whether the widget would like any available extra vertical
     * space.
     * 
     * See {@link org.gtk.gtk.Widget#setHexpand} for more detail.
     */
    public void setVexpand(boolean expand) {
        gtk_h.gtk_widget_set_vexpand(handle(), expand ? 1 : 0);
    }
    
    /**
     * Sets whether the vexpand flag will be used.
     * 
     * See {@link org.gtk.gtk.Widget#setHexpandSet} for more detail.
     */
    public void setVexpandSet(boolean set) {
        gtk_h.gtk_widget_set_vexpand_set(handle(), set ? 1 : 0);
    }
    
    /**
     * Sets the visibility state of @widget.
     * 
     * Note that setting this to <code>true</code> doesn&#8217;t mean the widget is
     * actually viewable, see {@link org.gtk.gtk.Widget#getVisible}.
     * 
     * This function simply calls {@link org.gtk.gtk.Widget#show} or
     * {@link org.gtk.gtk.Widget#hide} but is nicer to use when the
     * visibility of the widget depends on some condition.
     */
    public void setVisible(boolean visible) {
        gtk_h.gtk_widget_set_visible(handle(), visible ? 1 : 0);
    }
    
    /**
     * Returns whether @widget should contribute to
     * the measuring and allocation of its parent.
     * 
     * This is <code>false</code> for invisible children, but also
     * for children that have their own surface.
     */
    public boolean shouldLayout() {
        var RESULT = gtk_h.gtk_widget_should_layout(handle());
        return (RESULT != 0);
    }
    
    /**
     * Flags a widget to be displayed.
     * 
     * Any widget that isn&#8217;t shown will not appear on the screen.
     * 
     * Remember that you have to show the containers containing a widget,
     * in addition to the widget itself, before it will appear onscreen.
     * 
     * When a toplevel container is shown, it is immediately realized and
     * mapped; other shown widgets are realized and mapped when their
     * toplevel container is realized and mapped.
     */
    public void show() {
        gtk_h.gtk_widget_show(handle());
    }
    
    /**
     * Allocates widget with a transformation that translates
     * the origin to the position in @allocation.
     * 
     * This is a simple form of {@link org.gtk.gtk.Widget#allocate}.
     */
    public void sizeAllocate(Allocation allocation, int baseline) {
        gtk_h.gtk_widget_size_allocate(handle(), allocation.handle(), baseline);
    }
    
    /**
     * Snapshot the a child of @widget.
     * <p>
     * When a widget receives a call to the snapshot function,
     * it must send synthetic {@link org.gtk.gtk.Widget#snapshot} calls
     * to all children. This function provides a convenient way
     * of doing this. A widget, when it receives a call to its
     * {@link org.gtk.gtk.Widget#snapshot} function, calls
     * gtk_widget_snapshot_child() once for each child, passing in
     * the @snapshot the widget received.
     * <p>
     * gtk_widget_snapshot_child() takes care of translating the origin of
     * @snapshot, and deciding whether the child needs to be snapshot.
     * <p>
     * This function does nothing for children that implement <code>GtkNative</code>.
     */
    public void snapshotChild(Widget child, Snapshot snapshot) {
        gtk_h.gtk_widget_snapshot_child(handle(), child.handle(), snapshot.handle());
    }
    
    /**
     * Triggers a tooltip query on the display where the toplevel
     * of @widget is located.
     */
    public void triggerTooltipQuery() {
        gtk_h.gtk_widget_trigger_tooltip_query(handle());
    }
    
    /**
     * Causes a widget to be unmapped if it&#8217;s currently mapped.
     * 
     * This function is only for use in widget implementations.
     */
    public void unmap() {
        gtk_h.gtk_widget_unmap(handle());
    }
    
    /**
     * Dissociate @widget from its parent.
     * 
     * This function is only for use in widget implementations,
     * typically in dispose.
     */
    public void unparent() {
        gtk_h.gtk_widget_unparent(handle());
    }
    
    /**
     * Causes a widget to be unrealized (frees all GDK resources
     * associated with the widget).
     * 
     * This function is only useful in widget implementations.
     */
    public void unrealize() {
        gtk_h.gtk_widget_unrealize(handle());
    }
    
    /**
     * Turns off flag values for the current widget state.
     * 
     * See {@link org.gtk.gtk.Widget#setStateFlags}.
     * 
     * This function is for use in widget implementations.
     */
    public void unsetStateFlags(int flags) {
        gtk_h.gtk_widget_unset_state_flags(handle(), flags);
    }
    
    /**
     * Obtains the current default reading direction.
     * 
     * See {@link Gtk#Widget}.
     */
    public static TextDirection getDefaultDirection() {
        var RESULT = gtk_h.gtk_widget_get_default_direction();
        return TextDirection.fromValue(RESULT);
    }
    
    /**
     * Sets the default reading direction for widgets.
     * 
     * See {@link org.gtk.gtk.Widget#setDirection}.
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
     * 
     * May result in finalization of the widget if all references are released.
     * 
     * This signal is not suitable for saving widget state.
     */
    public SignalHandle onDestroy(DestroyHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalWidgetDestroy", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("destroy").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalWidgetDirectionChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("direction-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface HideHandler {
        void signalReceived(Widget source);
    }
    
    /**
     * Emitted when @widget is hidden.
     */
    public SignalHandle onHide(HideHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalWidgetHide", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("hide").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface KeynavFailedHandler {
        boolean signalReceived(Widget source, DirectionType direction);
    }
    
    /**
     * Emitted if keyboard navigation fails.
     * 
     * See {@link org.gtk.gtk.Widget#keynavFailed} for details.
     */
    public SignalHandle onKeynavFailed(KeynavFailedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalWidgetKeynavFailed", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("keynav-failed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MapHandler {
        void signalReceived(Widget source);
    }
    
    /**
     * Emitted when @widget is going to be mapped.
     * 
     * A widget is mapped when the widget is visible (which is controlled with
     * {@link [property@Gtk.Widget:visible] (ref=property)}) and all its parents up to the toplevel widget
     * are also visible.
     * 
     * The ::map signal can be used to determine whether a widget will be drawn,
     * for instance it can resume an animation that was stopped during the
     * emission of {@link [signal@Gtk.Widget::unmap] (ref=signal)}.
     */
    public SignalHandle onMap(MapHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalWidgetMap", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("map").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MnemonicActivateHandler {
        boolean signalReceived(Widget source, boolean groupCycling);
    }
    
    /**
     * Emitted when a widget is activated via a mnemonic.
     * 
     * The default handler for this signal activates @widget if @group_cycling
     * is <code>FALSE,</code> or just makes @widget grab focus if @group_cycling is or just makes @widget grab focus if @group_cycling is %TRUE.
     */
    public SignalHandle onMnemonicActivate(MnemonicActivateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalWidgetMnemonicActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("mnemonic-activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalWidgetMoveFocus", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("move-focus").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface QueryTooltipHandler {
        boolean signalReceived(Widget source, int x, int y, boolean keyboardMode, Tooltip tooltip);
    }
    
    /**
     * Emitted when the widgets tooltip is about to be shown.
     * 
     * This happens when the {@link [property@Gtk.Widget:has-tooltip] (ref=property)} property
     * is <code>true</code> and the hover timeout has expired with the cursor hovering
     * &#34;above&#34; @widget; or emitted when @widget got focus in keyboard mode.
     * 
     * Using the given coordinates, the signal handler should determine
     * whether a tooltip should be shown for @widget. If this is the case
     * <code>true</code> should be returned, <code>false</code> otherwise.  Note that if
     * @keyboard_mode is <code>TRUE,</code> the values of @x and @y are undefined and
     * should not be used.
     * 
     * The signal handler is free to manipulate @tooltip with the therefore
     * destined function calls.
     */
    public SignalHandle onQueryTooltip(QueryTooltipHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalWidgetQueryTooltip", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("query-tooltip").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RealizeHandler {
        void signalReceived(Widget source);
    }
    
    /**
     * Emitted when @widget is associated with a <code>GdkSurface</code>.
     * 
     * This means that {@link org.gtk.gtk.Widget#realize} has been called
     * or the widget has been mapped (that is, it is going to be drawn).
     */
    public SignalHandle onRealize(RealizeHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalWidgetRealize", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("realize").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ShowHandler {
        void signalReceived(Widget source);
    }
    
    /**
     * Emitted when @widget is shown.
     */
    public SignalHandle onShow(ShowHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalWidgetShow", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("show").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface StateFlagsChangedHandler {
        void signalReceived(Widget source, int flags);
    }
    
    /**
     * Emitted when the widget state changes.
     * 
     * See {@link org.gtk.gtk.Widget#getStateFlags}.
     */
    public SignalHandle onStateFlagsChanged(StateFlagsChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalWidgetStateFlagsChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("state-flags-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UnmapHandler {
        void signalReceived(Widget source);
    }
    
    /**
     * Emitted when @widget is going to be unmapped.
     * 
     * A widget is unmapped when either it or any of its parents up to the
     * toplevel widget have been set as hidden.
     * 
     * As ::unmap indicates that a widget will not be shown any longer,
     * it can be used to, for example, stop an animation on the widget.
     */
    public SignalHandle onUnmap(UnmapHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalWidgetUnmap", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("unmap").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UnrealizeHandler {
        void signalReceived(Widget source);
    }
    
    /**
     * Emitted when the <code>GdkSurface</code> associated with @widget is destroyed.
     * 
     * This means that {@link org.gtk.gtk.Widget#unrealize} has been called
     * or the widget has been unmapped (that is, it is going to be hidden).
     */
    public SignalHandle onUnrealize(UnrealizeHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalWidgetUnrealize", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("unrealize").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
