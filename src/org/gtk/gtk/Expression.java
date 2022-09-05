package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkExpression` provides a way to describe references to values.
 * 
 * An important aspect of expressions is that the value can be obtained
 * from a source that is several steps away. For example, an expression
 * may describe ‘the value of property A of `object1`, which is itself the
 * value of a property of `object2`’. And `object1` may not even exist yet
 * at the time that the expression is created. This is contrast to `GObject`
 * property bindings, which can only create direct connections between
 * the properties of two objects that must both exist for the duration
 * of the binding.
 * 
 * An expression needs to be "evaluated" to obtain the value that it currently
 * refers to. An evaluation always happens in the context of a current object
 * called `this` (it mirrors the behavior of object-oriented languages),
 * which may or may not influence the result of the evaluation. Use
 * [method@Gtk.Expression.evaluate] for evaluating an expression.
 * 
 * Various methods for defining expressions exist, from simple constants via
 * [ctor@Gtk.ConstantExpression.new] to looking up properties in a `GObject`
 * (even recursively) via [ctor@Gtk.PropertyExpression.new] or providing
 * custom functions to transform and combine expressions via
 * [ctor@Gtk.ClosureExpression.new].
 * 
 * Here is an example of a complex expression:
 * 
 * ```c
 *   color_expr = gtk_property_expression_new (GTK_TYPE_LIST_ITEM,
 *                                             NULL, "item");
 *   expression = gtk_property_expression_new (GTK_TYPE_COLOR,
 *                                             color_expr, "name");
 * ```
 * 
 * when evaluated with `this` being a `GtkListItem`, it will obtain the
 * "item" property from the `GtkListItem`, and then obtain the "name" property
 * from the resulting object (which is assumed to be of type `GTK_TYPE_COLOR`).
 * 
 * A more concise way to describe this would be
 * 
 * ```
 *   this->item->name
 * ```
 * 
 * The most likely place where you will encounter expressions is in the context
 * of list models and list widgets using them. For example, `GtkDropDown` is
 * evaluating a `GtkExpression` to obtain strings from the items in its model
 * that it can then use to match against the contents of its search entry.
 * `GtkStringFilter` is using a `GtkExpression` for similar reasons.
 * 
 * By default, expressions are not paying attention to changes and evaluation is
 * just a snapshot of the current state at a given time. To get informed about
 * changes, an expression needs to be "watched" via a [struct@Gtk.ExpressionWatch],
 * which will cause a callback to be called whenever the value of the expression may
 * have changed; [method@Gtk.Expression.watch] starts watching an expression, and
 * [method@Gtk.ExpressionWatch.unwatch] stops.
 * 
 * Watches can be created for automatically updating the property of an object,
 * similar to GObject's `GBinding` mechanism, by using [method@Gtk.Expression.bind].
 * 
 * ## GtkExpression in GObject properties
 * 
 * In order to use a `GtkExpression` as a `GObject` property, you must use the
 * [id@gtk_param_spec_expression] when creating a `GParamSpec` to install in the
 * `GObject` class being defined; for instance:
 * 
 * ```c
 * obj_props[PROP_EXPRESSION] =
 *   gtk_param_spec_expression ("expression",
 *                              "Expression",
 *                              "The expression used by the widget",
 *                              G_PARAM_READWRITE |
 *                              G_PARAM_STATIC_STRINGS |
 *                              G_PARAM_EXPLICIT_NOTIFY);
 * ```
 * 
 * When implementing the `GObjectClass.set_property` and `GObjectClass.get_property`
 * virtual functions, you must use [id@gtk_value_get_expression], to retrieve the
 * stored `GtkExpression` from the `GValue` container, and [id@gtk_value_set_expression],
 * to store the `GtkExpression` into the `GValue`; for instance:
 * 
 * ```c
 *   // in set_property()...
 *   case PROP_EXPRESSION:
 *     foo_widget_set_expression (foo, gtk_value_get_expression (value));
 *     break;
 * 
 *   // in get_property()...
 *   case PROP_EXPRESSION:
 *     gtk_value_set_expression (value, foo->expression);
 *     break;
 * ```
 * 
 * ## GtkExpression in .ui files
 * 
 * `GtkBuilder` has support for creating expressions. The syntax here can be used where
 * a `GtkExpression` object is needed like in a `<property>` tag for an expression
 * property, or in a `<binding name="property">` tag to bind a property to an expression.
 * 
 * To create a property expression, use the `<lookup>` element. It can have a `type`
 * attribute to specify the object type, and a `name` attribute to specify the property
 * to look up. The content of `<lookup>` can either be an element specfiying the expression
 * to use the object, or a string that specifies the name of the object to use.
 * 
 * Example:
 * 
 * ```xml
 *   <lookup name='search'>string_filter</lookup>
 * ```
 * 
 * To create a constant expression, use the `<constant>` element. If the type attribute
 * is specified, the element content is interpreted as a value of that type. Otherwise,
 * it is assumed to be an object. For instance:
 * 
 * ```xml
 *   <constant>string_filter</constant>
 *   <constant type='gchararray'>Hello, world</constant>
 * ```
 * 
 * To create a closure expression, use the `<closure>` element. The `type` and `function`
 * attributes specify what function to use for the closure, the content of the element
 * contains the expressions for the parameters. For instance:
 * 
 * ```xml
 *   <closure type='gchararray' function='combine_args_somehow'>
 *     <constant type='gchararray'>File size:</constant>
 *     <lookup type='GFile' name='size'>myfile</lookup>
 *   </closure>
 * ```
 */
public class Expression extends org.gtk.gobject.Object {

    public Expression(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Expression */
    public static Expression castFrom(org.gtk.gobject.Object gobject) {
        return new Expression(gobject.getProxy());
    }
    
    /**
     * Bind `target`'s property named `property` to `self`.
     * 
     * The value that `self` evaluates to is set via `g_object_set()` on
     * `target`. This is repeated whenever `self` changes to ensure that
     * the object's property stays synchronized with `self`.
     * 
     * If `self`'s evaluation fails, `target`'s `property` is not updated.
     * You can ensure that this doesn't happen by using a fallback
     * expression.
     * 
     * Note that this function takes ownership of `self`. If you want
     * to keep it around, you should [method@Gtk.Expression.ref] it beforehand.
     */
    public ExpressionWatch bind(org.gtk.gobject.Object target, java.lang.String property, org.gtk.gobject.Object this_) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_expression_bind(HANDLE(), target.HANDLE(), Interop.getAllocator().allocateUtf8String(property), this_.HANDLE());
        return new ExpressionWatch(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Evaluates the given expression and on success stores the result
     * in @value.
     * 
     * The `GType` of `value` will be the type given by
     * [method@Gtk.Expression.get_value_type].
     * 
     * It is possible that expressions cannot be evaluated - for example
     * when the expression references objects that have been destroyed or
     * set to `NULL`. In that case `value` will remain empty and `FALSE`
     * will be returned.
     */
    public boolean evaluate(org.gtk.gobject.Object this_, org.gtk.gobject.Value value) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_expression_evaluate(HANDLE(), this_.HANDLE(), value.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the `GType` that this expression evaluates to.
     * 
     * This type is constant and will not change over the lifetime
     * of this expression.
     */
    public org.gtk.gobject.Type getValueType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_expression_get_value_type(HANDLE());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Checks if the expression is static.
     * 
     * A static expression will never change its result when
     * [method@Gtk.Expression.evaluate] is called on it with the same arguments.
     * 
     * That means a call to [method@Gtk.Expression.watch] is not necessary because
     * it will never trigger a notify.
     */
    public boolean isStatic() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_expression_is_static(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Acquires a reference on the given `GtkExpression`.
     */
    public Expression ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_expression_ref(HANDLE());
        return new Expression(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Releases a reference on the given `GtkExpression`.
     * 
     * If the reference was the last, the resources associated to the `self` are
     * freed.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_expression_unref(HANDLE());
    }
    
}
