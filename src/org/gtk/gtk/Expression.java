package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkExpression</code> provides a way to describe references to values.
 * <p>
 * An important aspect of expressions is that the value can be obtained
 * from a source that is several steps away. For example, an expression
 * may describe &<code>#8216</code> the value of property A of <code>object1</code>, which is itself the
 * value of a property of <code>object2</code>&<code>#8217</code> . And <code>object1</code> may not even exist yet
 * at the time that the expression is created. This is contrast to <code>GObject</code>
 * property bindings, which can only create direct connections between
 * the properties of two objects that must both exist for the duration
 * of the binding.
 * <p>
 * An expression needs to be &<code>#34</code> evaluated&<code>#34</code>  to obtain the value that it currently
 * refers to. An evaluation always happens in the context of a current object
 * called <code>this</code> (it mirrors the behavior of object-oriented languages),
 * which may or may not influence the result of the evaluation. Use
 * {@link org.gtk.gtk.Expression<code>#evaluate</code>  for evaluating an expression.
 * <p>
 * Various methods for defining expressions exist, from simple constants via
 * {@link [ctor@Gtk.ConstantExpression.new] (ref=ctor)} to looking up properties in a <code>GObject</code>
 * (even recursively) via {@link [ctor@Gtk.PropertyExpression.new] (ref=ctor)} or providing
 * custom functions to transform and combine expressions via
 * {@link [ctor@Gtk.ClosureExpression.new] (ref=ctor)}.
 * <p>
 * Here is an example of a complex expression:
 * <p><pre>c
 *   color_expr = gtk_property_expression_new (GTK_TYPE_LIST_ITEM,
 *                                             NULL, &<code>#34</code> item&<code>#34</code> );
 *   expression = gtk_property_expression_new (GTK_TYPE_COLOR,
 *                                             color_expr, &<code>#34</code> name&<code>#34</code> );
 * </pre>
 * <p>
 * when evaluated with <code>this</code> being a <code>GtkListItem</code>, it will obtain the
 * &<code>#34</code> item&<code>#34</code>  property from the <code>GtkListItem</code>, and then obtain the &<code>#34</code> name&<code>#34</code>  property
 * from the resulting object (which is assumed to be of type <code>GTK_TYPE_COLOR</code>).
 * <p>
 * A more concise way to describe this would be
 * <p><pre>
 *   this-&<code>#62</code> item-&<code>#62</code> name
 * </pre>
 * <p>
 * The most likely place where you will encounter expressions is in the context
 * of list models and list widgets using them. For example, <code>GtkDropDown</code> is
 * evaluating a <code>GtkExpression</code> to obtain strings from the items in its model
 * that it can then use to match against the contents of its search entry.<code>GtkStringFilter</code> is using a <code>GtkExpression</code> for similar reasons.
 * <p>
 * By default, expressions are not paying attention to changes and evaluation is
 * just a snapshot of the current state at a given time. To get informed about
 * changes, an expression needs to be &<code>#34</code> watched&<code>#34</code>  via a {@link [struct@Gtk.ExpressionWatch] (ref=struct)},
 * which will cause a callback to be called whenever the value of the expression may
 * have changed; {@link org.gtk.gtk.Expression<code>#watch</code>  starts watching an expression, and
 * {@link org.gtk.gtk.ExpressionWatch<code>#unwatch</code>  stops.
 * <p>
 * Watches can be created for automatically updating the property of an object,
 * similar to GObject&<code>#39</code> s <code>GBinding</code> mechanism, by using {@link org.gtk.gtk.Expression<code>#bind</code> .
 * <p>
 * <h2>GtkExpression in GObject properties</h2>
 * <p>
 * In order to use a <code>GtkExpression</code> as a <code>GObject</code> property, you must use the
 * {@link Gtk<code>#paramSpecExpression</code>  when creating a <code>GParamSpec</code> to install in the<code>GObject</code> class being defined; for instance:
 * <p><pre>c
 * obj_props{@link [PROP_EXPRESSION]} =
 *   gtk_param_spec_expression (&<code>#34</code> expression&<code>#34</code> ,
 *                              &<code>#34</code> Expression&<code>#34</code> ,
 *                              &<code>#34</code> The expression used by the widget&<code>#34</code> ,
 *                              G_PARAM_READWRITE |
 *                              G_PARAM_STATIC_STRINGS |
 *                              G_PARAM_EXPLICIT_NOTIFY);
 * </pre>
 * <p>
 * When implementing the <code>GObjectClass.set_property</code> and <code>GObjectClass.get_property</code>
 * virtual functions, you must use {@link Gtk<code>#valueGetExpression</code> , to retrieve the
 * stored <code>GtkExpression</code> from the <code>GValue</code> container, and {@link Gtk<code>#valueSetExpression</code> ,
 * to store the <code>GtkExpression</code> into the <code>GValue</code>; for instance:
 * <p><pre>c
 *   // in set_property()...
 *   case PROP_EXPRESSION:
 *     foo_widget_set_expression (foo, gtk_value_get_expression (value));
 *     break;
 * <p>
 *   // in get_property()...
 *   case PROP_EXPRESSION:
 *     gtk_value_set_expression (value, foo-&<code>#62</code> expression);
 *     break;
 * </pre>
 * <p>
 * <h2>GtkExpression in .ui files</h2>
 * <p><code>GtkBuilder</code> has support for creating expressions. The syntax here can be used where
 * a <code>GtkExpression</code> object is needed like in a <code>&<code>#60</code> property&<code>#62</code> </code> tag for an expression
 * property, or in a <code>&<code>#60</code> binding name=&<code>#34</code> property&<code>#34</code> &<code>#62</code> </code> tag to bind a property to an expression.
 * <p>
 * To create a property expression, use the <code>&<code>#60</code> lookup&<code>#62</code> </code> element. It can have a <code>type</code>
 * attribute to specify the object type, and a <code>name</code> attribute to specify the property
 * to look up. The content of <code>&<code>#60</code> lookup&<code>#62</code> </code> can either be an element specfiying the expression
 * to use the object, or a string that specifies the name of the object to use.
 * <p>
 * Example:
 * <p><pre>xml
 *   &<code>#60</code> lookup name=&<code>#39</code> search&<code>#39</code> &<code>#62</code> string_filter&<code>#60</code> /lookup&<code>#62</code> 
 * </pre>
 * <p>
 * To create a constant expression, use the <code>&<code>#60</code> constant&<code>#62</code> </code> element. If the type attribute
 * is specified, the element content is interpreted as a value of that type. Otherwise,
 * it is assumed to be an object. For instance:
 * <p><pre>xml
 *   &<code>#60</code> constant&<code>#62</code> string_filter&<code>#60</code> /constant&<code>#62</code> 
 *   &<code>#60</code> constant type=&<code>#39</code> gchararray&<code>#39</code> &<code>#62</code> Hello, world&<code>#60</code> /constant&<code>#62</code> 
 * </pre>
 * <p>
 * To create a closure expression, use the <code>&<code>#60</code> closure&<code>#62</code> </code> element. The <code>type</code> and <code>function</code>
 * attributes specify what function to use for the closure, the content of the element
 * contains the expressions for the parameters. For instance:
 * <p><pre>xml
 *   &<code>#60</code> closure type=&<code>#39</code> gchararray&<code>#39</code>  function=&<code>#39</code> combine_args_somehow&<code>#39</code> &<code>#62</code> 
 *     &<code>#60</code> constant type=&<code>#39</code> gchararray&<code>#39</code> &<code>#62</code> File size:&<code>#60</code> /constant&<code>#62</code> 
 *     &<code>#60</code> lookup type=&<code>#39</code> GFile&<code>#39</code>  name=&<code>#39</code> size&<code>#39</code> &<code>#62</code> myfile&<code>#60</code> /lookup&<code>#62</code> 
 *   &<code>#60</code> /closure&<code>#62</code> 
 * </pre>
 */
public class Expression extends org.gtk.gobject.Object {

    public Expression(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Expression */
    public static Expression castFrom(org.gtk.gobject.Object gobject) {
        return new Expression(gobject.getReference());
    }
    
    /**
     * Bind <code>target</code>&<code>#39</code> s property named <code>property</code> to <code>self</code>.
     * <p>
     * The value that <code>self</code> evaluates to is set via <code>g_object_set()</code> on<code>target</code>. This is repeated whenever <code>self</code> changes to ensure that
     * the object&<code>#39</code> s property stays synchronized with <code>self</code>.
     * <p>
     * If <code>self</code>&<code>#39</code> s evaluation fails, <code>target</code>&<code>#39</code> s <code>property</code> is not updated.
     * You can ensure that this doesn&<code>#39</code> t happen by using a fallback
     * expression.
     * <p>
     * Note that this function takes ownership of <code>self</code>. If you want
     * to keep it around, you should {@link org.gtk.gtk.Expression<code>#ref</code>  it beforehand.
     */
    public ExpressionWatch bind(org.gtk.gobject.Object target, java.lang.String property, org.gtk.gobject.Object this_) {
        var RESULT = gtk_h.gtk_expression_bind(handle(), target.handle(), Interop.allocateNativeString(property).handle(), this_.handle());
        return new ExpressionWatch(References.get(RESULT, false));
    }
    
    /**
     * Evaluates the given expression and on success stores the result
     * in @value.
     * <p>
     * The <code>GType</code> of <code>value</code> will be the type given by
     * {@link org.gtk.gtk.Expression<code>#getValueType</code> .
     * <p>
     * It is possible that expressions cannot be evaluated - for example
     * when the expression references objects that have been destroyed or
     * set to <code>NULL</code>. In that case <code>value</code> will remain empty and <code>FALSE</code>
     * will be returned.
     */
    public boolean evaluate(org.gtk.gobject.Object this_, org.gtk.gobject.Value value) {
        var RESULT = gtk_h.gtk_expression_evaluate(handle(), this_.handle(), value.handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the <code>GType</code> that this expression evaluates to.
     * 
     * This type is constant and will not change over the lifetime
     * of this expression.
     */
    public org.gtk.gobject.Type getValueType() {
        var RESULT = gtk_h.gtk_expression_get_value_type(handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Checks if the expression is static.
     * 
     * A static expression will never change its result when
     * {@link org.gtk.gtk.Expression<code>#evaluate</code>  is called on it with the same arguments.
     * 
     * That means a call to {@link org.gtk.gtk.Expression<code>#watch</code>  is not necessary because
     * it will never trigger a notify.
     */
    public boolean isStatic() {
        var RESULT = gtk_h.gtk_expression_is_static(handle());
        return (RESULT != 0);
    }
    
    /**
     * Acquires a reference on the given <code>GtkExpression</code>.
     */
    public Expression ref() {
        var RESULT = gtk_h.gtk_expression_ref(handle());
        return new Expression(References.get(RESULT, true));
    }
    
    /**
     * Releases a reference on the given <code>GtkExpression</code>.
     * <p>
     * If the reference was the last, the resources associated to the <code>self</code> are
     * freed.
     */
    public void unref() {
        gtk_h.gtk_expression_unref(handle());
    }
    
    /**
     * Watch the given <code>expression</code> for changes.
     * <p>
     * The @notify function will be called whenever the evaluation of <code>self</code>
     * may have changed.
     * 
     * GTK cannot guarantee that the evaluation did indeed change when the @notify
     * gets invoked, but it guarantees the opposite: When it did in fact change,
     * the @notify will be invoked.
     */
    public ExpressionWatch watch(org.gtk.gobject.Object this_, ExpressionNotify notify) {
        try {
            var RESULT = gtk_h.gtk_expression_watch(handle(), this_.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbExpressionNotify",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(notify.hashCode(), notify)), 
                    Interop.cbDestroyNotifySymbol());
            return new ExpressionWatch(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
