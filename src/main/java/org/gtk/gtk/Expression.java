package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>GtkExpression in GObject properties</strong><br/>
 * In order to use a {@code GtkExpression} as a {@code GObject} property, you must use the
 * {@link Gtk#paramSpecExpression} when creating a {@code GParamSpec} to install in the
 * {@code GObject} class being defined; for instance:
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
 * <strong>GtkExpression in .ui files</strong><br/>
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
 * <pre>{@code xml
 *   <lookup name='search'>string_filter</lookup>
 * }</pre>
 * <p>
 * To create a constant expression, use the {@code <constant>} element. If the type attribute
 * is specified, the element content is interpreted as a value of that type. Otherwise,
 * it is assumed to be an object. For instance:
 * <pre>{@code xml
 *   <constant>string_filter</constant>
 *   <constant type='gchararray'>Hello, world</constant>
 * }</pre>
 * <p>
 * To create a closure expression, use the {@code <closure>} element. The {@code type} and {@code function}
 * attributes specify what function to use for the closure, the content of the element
 * contains the expressions for the parameters. For instance:
 * <pre>{@code xml
 *   <closure type='gchararray' function='combine_args_somehow'>
 *     <constant type='gchararray'>File size:</constant>
 *     <lookup type='GFile' name='size'>myfile</lookup>
 *   </closure>
 * }</pre>
 */
public class Expression extends io.github.jwharm.javagi.ObjectBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkExpression";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Expression proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Expression(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Expression> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Expression(input, ownership);
    
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
     * @param target the target object to bind to
     * @param property name of the property on {@code target} to bind to
     * @param this_ the this argument for
     *   the evaluation of {@code self}
     * @return a {@code GtkExpressionWatch}
     */
    public org.gtk.gtk.ExpressionWatch bind(org.gtk.gobject.GObject target, java.lang.String property, @Nullable org.gtk.gobject.GObject this_) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_expression_bind.invokeExact(
                    handle(),
                    target.handle(),
                    Marshal.stringToAddress.marshal(property, null),
                    (Addressable) (this_ == null ? MemoryAddress.NULL : this_.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        return org.gtk.gtk.ExpressionWatch.fromAddress.marshal(RESULT, Ownership.NONE);
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
     * @param this_ the this argument for the evaluation
     * @param value an empty {@code GValue}
     * @return {@code TRUE} if the expression could be evaluated
     */
    public boolean evaluate(@Nullable org.gtk.gobject.GObject this_, org.gtk.gobject.Value value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_expression_evaluate.invokeExact(
                    handle(),
                    (Addressable) (this_ == null ? MemoryAddress.NULL : this_.handle()),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the {@code GType} that this expression evaluates to.
     * <p>
     * This type is constant and will not change over the lifetime
     * of this expression.
     * @return The type returned from {@link Expression#evaluate}
     */
    public org.gtk.glib.Type getValueType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_expression_get_value_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Checks if the expression is static.
     * <p>
     * A static expression will never change its result when
     * {@link Expression#evaluate} is called on it with the same arguments.
     * <p>
     * That means a call to {@link Expression#watch} is not necessary because
     * it will never trigger a notify.
     * @return {@code TRUE} if the expression is static
     */
    public boolean isStatic() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_expression_is_static.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Acquires a reference on the given {@code GtkExpression}.
     * @return the {@code GtkExpression} with an additional reference
     */
    public org.gtk.gtk.Expression ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_expression_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Expression) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Expression.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Releases a reference on the given {@code GtkExpression}.
     * <p>
     * If the reference was the last, the resources associated to the {@code self} are
     * freed.
     */
    public void unref() {
        try {
            DowncallHandles.gtk_expression_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
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
     * @param this_ the {@code this} argument to
     *   watch
     * @param notify callback to invoke when the expression changes
     * @param userDestroy destroy notify for {@code user_data}
     * @return The newly installed watch. Note that the only
     *   reference held to the watch will be released when the watch is unwatched
     *   which can happen automatically, and not just via
     *   {@link ExpressionWatch#unwatch}. You should call {@link ExpressionWatch#ref}
     *   if you want to keep the watch around.
     */
    public org.gtk.gtk.ExpressionWatch watch(@Nullable org.gtk.gobject.GObject this_, org.gtk.gtk.ExpressionNotify notify, org.gtk.glib.DestroyNotify userDestroy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_expression_watch.invokeExact(
                    handle(),
                    (Addressable) (this_ == null ? MemoryAddress.NULL : this_.handle()),
                    (Addressable) notify.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) userDestroy.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.ExpressionWatch.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_expression_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_expression_bind = Interop.downcallHandle(
            "gtk_expression_bind",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expression_evaluate = Interop.downcallHandle(
            "gtk_expression_evaluate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expression_get_value_type = Interop.downcallHandle(
            "gtk_expression_get_value_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expression_is_static = Interop.downcallHandle(
            "gtk_expression_is_static",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expression_ref = Interop.downcallHandle(
            "gtk_expression_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expression_unref = Interop.downcallHandle(
            "gtk_expression_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expression_watch = Interop.downcallHandle(
            "gtk_expression_watch",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expression_get_type = Interop.downcallHandle(
            "gtk_expression_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
