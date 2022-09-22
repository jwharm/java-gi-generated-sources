package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkExpression} provides a way to describe references to values.
 * <p>
 * An important aspect of expressions is that the value can be obtained
 * from a source that is several steps away. For example, an expression
 * may describe ‘the value of property A of {@code object1}, which is itself the
 * value of a property of {@code object2}’. And {@code object1} may not even exist yet
 * at the time that the expression is created. This is contrast to {@code GObject}
 * property bindings, which can only create direct connections between
 * the properties of two objects that must both exist for the duration
 * of the binding.
 * <p>
 * An expression needs to be "evaluated" to obtain the value that it currently
 * refers to. An evaluation always happens in the context of a current object
 * called {@code this} (it mirrors the behavior of object-oriented languages),
 * which may or may not influence the result of the evaluation. Use
 * {@link Expression#evaluate} for evaluating an expression.
 * <p>
 * Various methods for defining expressions exist, from simple constants via
 * {@link ConstantExpression#ConstantExpression} to looking up properties in a {@code GObject}
 * (even recursively) via {@link PropertyExpression#PropertyExpression} or providing
 * custom functions to transform and combine expressions via
 * {@link ClosureExpression#ClosureExpression}.
 * <p>
 * Here is an example of a complex expression:
 * <p>
 * <pre>{@code c
 *   color_expr = gtk_property_expression_new (GTK_TYPE_LIST_ITEM,
 *                                             NULL, "item");
 *   expression = gtk_property_expression_new (GTK_TYPE_COLOR,
 *                                             color_expr, "name");
 * }</pre>
 * <p>
 * when evaluated with {@code this} being a {@code GtkListItem}, it will obtain the
 * "item" property from the {@code GtkListItem}, and then obtain the "name" property
 * from the resulting object (which is assumed to be of type {@code GTK_TYPE_COLOR}).
 * <p>
 * A more concise way to describe this would be
 * <p>
 * <pre>{@code 
 *   this->item->name
 * }</pre>
 * <p>
 * The most likely place where you will encounter expressions is in the context
 * of list models and list widgets using them. For example, {@code GtkDropDown} is
 * evaluating a {@code GtkExpression} to obtain strings from the items in its model
 * that it can then use to match against the contents of its search entry.
 * {@code GtkStringFilter} is using a {@code GtkExpression} for similar reasons.
 * <p>
 * By default, expressions are not paying attention to changes and evaluation is
 * just a snapshot of the current state at a given time. To get informed about
 * changes, an expression needs to be "watched" via a {@code Gtk.ExpressionWatch},
 * which will cause a callback to be called whenever the value of the expression may
 * have changed; {@link Expression#watch} starts watching an expression, and
 * {@link ExpressionWatch#unwatch} stops.
 * <p>
 * Watches can be created for automatically updating the property of an object,
 * similar to GObject's {@code GBinding} mechanism, by using {@link Expression#bind}.
 * <p>
 * <h2>GtkExpression in GObject properties</h2>
 * <p>
 * In order to use a {@code GtkExpression} as a {@code GObject} property, you must use the
 * {@link Gtk#paramSpecExpression} when creating a {@code GParamSpec} to install in the
 * {@code GObject} class being defined; for instance:
 * <p>
 * <pre>{@code c
 * obj_props[PROP_EXPRESSION] =
 *   gtk_param_spec_expression ("expression",
 *                              "Expression",
 *                              "The expression used by the widget",
 *                              G_PARAM_READWRITE |
 *                              G_PARAM_STATIC_STRINGS |
 *                              G_PARAM_EXPLICIT_NOTIFY);
 * }</pre>
 * <p>
 * When implementing the {@code GObjectClass.set_property} and {@code GObjectClass.get_property}
 * virtual functions, you must use {@link Gtk#valueGetExpression}, to retrieve the
 * stored {@code GtkExpression} from the {@code GValue} container, and {@link Gtk#valueSetExpression},
 * to store the {@code GtkExpression} into the {@code GValue}; for instance:
 * <p>
 * <pre>{@code c
 *   // in set_property()...
 *   case PROP_EXPRESSION:
 *     foo_widget_set_expression (foo, gtk_value_get_expression (value));
 *     break;
 * 
 *   // in get_property()...
 *   case PROP_EXPRESSION:
 *     gtk_value_set_expression (value, foo->expression);
 *     break;
 * }</pre>
 * <p>
 * <h2>GtkExpression in .ui files</h2>
 * <p>
 * {@code GtkBuilder} has support for creating expressions. The syntax here can be used where
 * a {@code GtkExpression} object is needed like in a {@code <property>} tag for an expression
 * property, or in a {@code <binding name="property">} tag to bind a property to an expression.
 * <p>
 * To create a property expression, use the {@code <lookup>} element. It can have a {@code type}
 * attribute to specify the object type, and a {@code name} attribute to specify the property
 * to look up. The content of {@code <lookup>} can either be an element specfiying the expression
 * to use the object, or a string that specifies the name of the object to use.
 * <p>
 * Example:
 * <p>
 * <pre>{@code xml
 *   <lookup name='search'>string_filter</lookup>
 * }</pre>
 * <p>
 * To create a constant expression, use the {@code <constant>} element. If the type attribute
 * is specified, the element content is interpreted as a value of that type. Otherwise,
 * it is assumed to be an object. For instance:
 * <p>
 * <pre>{@code xml
 *   <constant>string_filter</constant>
 *   <constant type='gchararray'>Hello, world</constant>
 * }</pre>
 * <p>
 * To create a closure expression, use the {@code <closure>} element. The {@code type} and {@code function}
 * attributes specify what function to use for the closure, the content of the element
 * contains the expressions for the parameters. For instance:
 * <p>
 * <pre>{@code xml
 *   <closure type='gchararray' function='combine_args_somehow'>
 *     <constant type='gchararray'>File size:</constant>
 *     <lookup type='GFile' name='size'>myfile</lookup>
 *   </closure>
 * }</pre>
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
     * Bind {@code target}'s property named {@code property} to {@code self}.
     * <p>
     * The value that {@code self} evaluates to is set via {@code g_object_set()} on
     * {@code target}. This is repeated whenever {@code self} changes to ensure that
     * the object's property stays synchronized with {@code self}.
     * <p>
     * If {@code self}'s evaluation fails, {@code target}'s {@code property} is not updated.
     * You can ensure that this doesn't happen by using a fallback
     * expression.
     * <p>
     * Note that this function takes ownership of {@code self}. If you want
     * to keep it around, you should {@link Expression#ref} it beforehand.
     */
    public ExpressionWatch bind(org.gtk.gobject.Object target, java.lang.String property, org.gtk.gobject.Object this_) {
        var RESULT = gtk_h.gtk_expression_bind(handle(), target.handle(), Interop.allocateNativeString(property).handle(), this_.handle());
        return new ExpressionWatch(References.get(RESULT, false));
    }
    
    /**
     * Evaluates the given expression and on success stores the result
     * in {@code value}.
     * <p>
     * The {@code GType} of {@code value} will be the type given by
     * {@link Expression#getValueType}.
     * <p>
     * It is possible that expressions cannot be evaluated - for example
     * when the expression references objects that have been destroyed or
     * set to {@code NULL}. In that case {@code value} will remain empty and {@code FALSE}
     * will be returned.
     */
    public boolean evaluate(org.gtk.gobject.Object this_, org.gtk.gobject.Value value) {
        var RESULT = gtk_h.gtk_expression_evaluate(handle(), this_.handle(), value.handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the {@code GType} that this expression evaluates to.
     * <p>
     * This type is constant and will not change over the lifetime
     * of this expression.
     */
    public org.gtk.gobject.Type getValueType() {
        var RESULT = gtk_h.gtk_expression_get_value_type(handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Checks if the expression is static.
     * <p>
     * A static expression will never change its result when
     * {@link Expression#evaluate} is called on it with the same arguments.
     * <p>
     * That means a call to {@link Expression#watch} is not necessary because
     * it will never trigger a notify.
     */
    public boolean isStatic() {
        var RESULT = gtk_h.gtk_expression_is_static(handle());
        return (RESULT != 0);
    }
    
    /**
     * Acquires a reference on the given {@code GtkExpression}.
     */
    public Expression ref() {
        var RESULT = gtk_h.gtk_expression_ref(handle());
        return new Expression(References.get(RESULT, true));
    }
    
    /**
     * Releases a reference on the given {@code GtkExpression}.
     * <p>
     * If the reference was the last, the resources associated to the {@code self} are
     * freed.
     */
    public void unref() {
        gtk_h.gtk_expression_unref(handle());
    }
    
    /**
     * Watch the given {@code expression} for changes.
     * <p>
     * The {@code notify} function will be called whenever the evaluation of {@code self}
     * may have changed.
     * <p>
     * GTK cannot guarantee that the evaluation did indeed change when the {@code notify}
     * gets invoked, but it guarantees the opposite: When it did in fact change,
     * the {@code notify} will be invoked.
     */
    public ExpressionWatch watch(org.gtk.gobject.Object this_, ExpressionNotify notify) {
        try {
            var RESULT = gtk_h.gtk_expression_watch(handle(), this_.handle(), 
                    Linker.nativeLinker().upcallStub(
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
