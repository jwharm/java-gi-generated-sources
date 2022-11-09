package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A layout manager using constraints to describe relations between widgets.
 * <p>
 * {@code GtkConstraintLayout} is a layout manager that uses relations between
 * widget attributes, expressed via {@link Constraint} instances, to
 * measure and allocate widgets.
 * <p>
 * <strong>How do constraints work</strong><br/>
 * Constraints are objects defining the relationship between attributes
 * of a widget; you can read the description of the {@link Constraint}
 * class to have a more in depth definition.
 * <p>
 * By taking multiple constraints and applying them to the children of
 * a widget using {@code GtkConstraintLayout}, it's possible to describe
 * complex layout policies; each constraint applied to a child or to the parent
 * widgets contributes to the full description of the layout, in terms of
 * parameters for resolving the value of each attribute.
 * <p>
 * It is important to note that a layout is defined by the totality of
 * constraints; removing a child, or a constraint, from an existing layout
 * without changing the remaining constraints may result in an unstable
 * or unsolvable layout.
 * <p>
 * Constraints have an implicit "reading order"; you should start describing
 * each edge of each child, as well as their relationship with the parent
 * container, from the top left (or top right, in RTL languages), horizontally
 * first, and then vertically.
 * <p>
 * A constraint-based layout with too few constraints can become "unstable",
 * that is: have more than one solution. The behavior of an unstable layout
 * is undefined.
 * <p>
 * A constraint-based layout with conflicting constraints may be unsolvable,
 * and lead to an unstable layout. You can use the {@code Gtk.Constraint:strength}
 * property of {@link Constraint} to "nudge" the layout towards a solution.
 * <p>
 * <strong>GtkConstraintLayout as GtkBuildable</strong><br/>
 * {@code GtkConstraintLayout} implements the {@code Gtk.Buildable} interface and
 * has a custom "constraints" element which allows describing constraints in
 * a {@link Builder} UI file.
 * <p>
 * An example of a UI definition fragment specifying a constraint:
 * <pre>{@code xml
 *   <object class="GtkConstraintLayout">
 *     <constraints>
 *       <constraint target="button" target-attribute="start"
 *                   relation="eq"
 *                   source="super" source-attribute="start"
 *                   constant="12"
 *                   strength="required" />
 *       <constraint target="button" target-attribute="width"
 *                   relation="ge"
 *                   constant="250"
 *                   strength="strong" />
 *     </constraints>
 *   </object>
 * }</pre>
 * <p>
 * The definition above will add two constraints to the GtkConstraintLayout:
 * <ul>
 * <li>a required constraint between the leading edge of "button" and
 *    the leading edge of the widget using the constraint layout, plus
 *    12 pixels
 * <li>a strong, constant constraint making the width of "button" greater
 *    than, or equal to 250 pixels
 * </ul>
 * <p>
 * The "target" and "target-attribute" attributes are required.
 * <p>
 * The "source" and "source-attribute" attributes of the "constraint"
 * element are optional; if they are not specified, the constraint is
 * assumed to be a constant.
 * <p>
 * The "relation" attribute is optional; if not specified, the constraint
 * is assumed to be an equality.
 * <p>
 * The "strength" attribute is optional; if not specified, the constraint
 * is assumed to be required.
 * <p>
 * The "source" and "target" attributes can be set to "super" to indicate
 * that the constraint target is the widget using the GtkConstraintLayout.
 * <p>
 * There can be "constant" and "multiplier" attributes.
 * <p>
 * Additionally, the "constraints" element can also contain a description
 * of the {@code GtkConstraintGuides} used by the layout:
 * <pre>{@code xml
 *   <constraints>
 *     <guide min-width="100" max-width="500" name="hspace"/>
 *     <guide min-height="64" nat-height="128" name="vspace" strength="strong"/>
 *   </constraints>
 * }</pre>
 * <p>
 * The "guide" element has the following optional attributes:
 * <ul>
 * <li>"min-width", "nat-width", and "max-width", describe the minimum,
 *     natural, and maximum width of the guide, respectively
 * <li>"min-height", "nat-height", and "max-height", describe the minimum,
 *     natural, and maximum height of the guide, respectively
 * <li>"strength" describes the strength of the constraint on the natural
 *     size of the guide; if not specified, the constraint is assumed to
 *     have a medium strength
 * <li>"name" describes a name for the guide, useful when debugging
 * </ul>
 * <p>
 * <strong>Using the Visual Format Language</strong><br/>
 * Complex constraints can be described using a compact syntax called VFL,
 * or <em>Visual Format Language</em>.
 * <p>
 * The Visual Format Language describes all the constraints on a row or
 * column, typically starting from the leading edge towards the trailing
 * one. Each element of the layout is composed by "views", which identify
 * a {@code Gtk.ConstraintTarget}.
 * <p>
 * For instance:
 * <pre>{@code 
 *   [button]-[textField]
 * }</pre>
 * <p>
 * Describes a constraint that binds the trailing edge of "button" to the
 * leading edge of "textField", leaving a default space between the two.
 * <p>
 * Using VFL is also possible to specify predicates that describe constraints
 * on attributes like width and height:
 * <pre>{@code 
 *   // Width must be greater than, or equal to 50
 *   [button(>=50)]
 * 
 *   // Width of button1 must be equal to width of button2
 *   [button1(==button2)]
 * }</pre>
 * <p>
 * The default orientation for a VFL description is horizontal, unless
 * otherwise specified:
 * <pre>{@code 
 *   // horizontal orientation, default attribute: width
 *   H:[button(>=150)]
 * 
 *   // vertical orientation, default attribute: height
 *   V:[button1(==button2)]
 * }</pre>
 * <p>
 * It's also possible to specify multiple predicates, as well as their
 * strength:
 * <pre>{@code 
 *   // minimum width of button must be 150
 *   // natural width of button can be 250
 *   [button(>=150@required, ==250@medium)]
 * }</pre>
 * <p>
 * Finally, it's also possible to use simple arithmetic operators:
 * <pre>{@code 
 *   // width of button1 must be equal to width of button2
 *   // divided by 2 plus 12
 *   [button1(button2 / 2 + 12)]
 * }</pre>
 */
public class ConstraintLayout extends org.gtk.gtk.LayoutManager implements org.gtk.gtk.Buildable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkConstraintLayout";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ConstraintLayout proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ConstraintLayout(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ConstraintLayout if its GType is a (or inherits from) "GtkConstraintLayout".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ConstraintLayout" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkConstraintLayout", a ClassCastException will be thrown.
     */
    public static ConstraintLayout castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkConstraintLayout"))) {
            return new ConstraintLayout(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkConstraintLayout");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_constraint_layout_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkConstraintLayout} layout manager.
     */
    public ConstraintLayout() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Adds a constraint to the layout manager.
     * <p>
     * The {@code Gtk.Constraint:source} and {@code Gtk.Constraint:target}
     * properties of {@code constraint} can be:
     * <ul>
     * <li>set to {@code NULL} to indicate that the constraint refers to the
     *    widget using {@code layout}
     * <li>set to the {@link Widget} using {@code layout}
     * <li>set to a child of the {@link Widget} using {@code layout}
     * <li>set to a {@link ConstraintGuide} that is part of {@code layout}
     * </ul>
     * <p>
     * The {@code layout} acquires the ownership of {@code constraint} after calling
     * this function.
     * @param constraint a {@link Constraint}
     */
    public void addConstraint(@NotNull org.gtk.gtk.Constraint constraint) {
        java.util.Objects.requireNonNull(constraint, "Parameter 'constraint' must not be null");
        try {
            DowncallHandles.gtk_constraint_layout_add_constraint.invokeExact(
                    handle(),
                    constraint.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a list of constraints from a VFL description.
     * <p>
     * This function is a convenience wrapper around
     * {@link ConstraintLayout#addConstraintsFromDescriptionv}, using
     * variadic arguments to populate the view/target map.
     * @param lines an array of Visual Format Language lines
     *   defining a set of constraints
     * @param nLines the number of lines
     * @param hspacing default horizontal spacing value, or -1 for the fallback value
     * @param vspacing default vertical spacing value, or -1 for the fallback value
     * @param error return location for a {@code GError}
     * @param firstView the name of a view in the VFL description, followed by the
     *   {@code Gtk.ConstraintTarget} to which it maps
     * @param varargs a {@code NULL}-terminated list of view names and {@code Gtk.ConstraintTarget}s
     * @return the list of
     *   {@link Constraint}s that were added to the layout
     */
    public @NotNull org.gtk.glib.List addConstraintsFromDescription(@NotNull java.lang.String[] lines, long nLines, int hspacing, int vspacing, @NotNull PointerProxy<org.gtk.glib.Error> error, @NotNull java.lang.String firstView, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(lines, "Parameter 'lines' must not be null");
        java.util.Objects.requireNonNull(firstView, "Parameter 'firstView' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_constraint_layout_add_constraints_from_description.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(lines, false),
                    nLines,
                    hspacing,
                    vspacing,
                    error.handle(),
                    Interop.allocateNativeString(firstView),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.CONTAINER);
    }
    
    /**
     * Creates a list of constraints from a VFL description.
     * <p>
     * The Visual Format Language, VFL, is based on Apple's AutoLayout <a href="https://developer.apple.com/library/content/documentation/UserExperience/Conceptual/AutolayoutPG/VisualFormatLanguage.html">VFL</a>.
     * <p>
     * The {@code views} dictionary is used to match {@code Gtk.ConstraintTarget}
     * instances to the symbolic view name inside the VFL.
     * <p>
     * The VFL grammar is:
     * <pre>{@code 
     *        <visualFormatString> = (<orientation>)?
     *                               (<superview><connection>)?
     *                               <view>(<connection><view>)*
     *                               (<connection><superview>)?
     *               <orientation> = 'H' | 'V'
     *                 <superview> = '|'
     *                <connection> = '' | '-' <predicateList> '-' | '-'
     *             <predicateList> = <simplePredicate> | <predicateListWithParens>
     *           <simplePredicate> = <metricName> | <positiveNumber>
     *   <predicateListWithParens> = '(' <predicate> (',' <predicate>)* ')'
     *                 <predicate> = (<relation>)? <objectOfPredicate> (<operatorList>)? ('@' <priority>)?
     *                  <relation> = '==' | '<=' | '>='
     *         <objectOfPredicate> = <constant> | <viewName> | ('.' <attributeName>)?
     *                  <priority> = <positiveNumber> | 'required' | 'strong' | 'medium' | 'weak'
     *                  <constant> = <number>
     *              <operatorList> = (<multiplyOperator>)? (<addOperator>)?
     *          <multiplyOperator> = [ '*' | '/' ] <positiveNumber>
     *               <addOperator> = [ '+' | '-' ] <positiveNumber>
     *                  <viewName> = [A-Za-z_]([A-Za-z0-9_]*) // A C identifier
     *                <metricName> = [A-Za-z_]([A-Za-z0-9_]*) // A C identifier
     *             <attributeName> = 'top' | 'bottom' | 'left' | 'right' | 'width' | 'height' |
     *                               'start' | 'end' | 'centerX' | 'centerY' | 'baseline'
     *            <positiveNumber> // A positive real number parseable by g_ascii_strtod()
     *                    <number> // A real number parseable by g_ascii_strtod()
     * }</pre>
     * <p>
     * <strong>Note</strong>: The VFL grammar used by GTK is slightly different than the one
     * defined by Apple, as it can use symbolic values for the constraint's
     * strength instead of numeric values; additionally, GTK allows adding
     * simple arithmetic operations inside predicates.
     * <p>
     * Examples of VFL descriptions are:
     * <pre>{@code 
     *   // Default spacing
     *   [button]-[textField]
     * 
     *   // Width constraint
     *   [button(>=50)]
     * 
     *   // Connection to super view
     *   |-50-[purpleBox]-50-|
     * 
     *   // Vertical layout
     *   V:[topField]-10-[bottomField]
     * 
     *   // Flush views
     *   [maroonView][blueView]
     * 
     *   // Priority
     *   [button(100@strong)]
     * 
     *   // Equal widths
     *   [button1(==button2)]
     * 
     *   // Multiple predicates
     *   [flexibleButton(>=70,<=100)]
     * 
     *   // A complete line of layout
     *   |-[find]-[findNext]-[findField(>=20)]-|
     * 
     *   // Operators
     *   [button1(button2 / 3 + 50)]
     * 
     *   // Named attributes
     *   [button1(==button2.height)]
     * }</pre>
     * @param lines an array of Visual Format Language lines
     *   defining a set of constraints
     * @param nLines the number of lines
     * @param hspacing default horizontal spacing value, or -1 for the fallback value
     * @param vspacing default vertical spacing value, or -1 for the fallback value
     * @param views a dictionary of {@code [ name, target ]}
     *   pairs; the {@code name} keys map to the view names in the VFL lines, while
     *   the {@code target} values map to children of the widget using a {@code GtkConstraintLayout},
     *   or guides
     * @return the list of
     *   {@link Constraint} instances that were added to the layout
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.glib.List addConstraintsFromDescriptionv(@NotNull java.lang.String[] lines, long nLines, int hspacing, int vspacing, @NotNull org.gtk.glib.HashTable views) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(lines, "Parameter 'lines' must not be null");
        java.util.Objects.requireNonNull(views, "Parameter 'views' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_constraint_layout_add_constraints_from_descriptionv.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(lines, false),
                    nLines,
                    hspacing,
                    vspacing,
                    views.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.CONTAINER);
    }
    
    /**
     * Adds a guide to {@code layout}.
     * <p>
     * A guide can be used as the source or target of constraints,
     * like a widget, but it is not visible.
     * <p>
     * The {@code layout} acquires the ownership of {@code guide} after calling
     * this function.
     * @param guide a {@link ConstraintGuide} object
     */
    public void addGuide(@NotNull org.gtk.gtk.ConstraintGuide guide) {
        java.util.Objects.requireNonNull(guide, "Parameter 'guide' must not be null");
        try {
            DowncallHandles.gtk_constraint_layout_add_guide.invokeExact(
                    handle(),
                    guide.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns a {@code GListModel} to track the constraints that are
     * part of the layout.
     * <p>
     * Calling this function will enable extra internal bookkeeping
     * to track constraints and emit signals on the returned listmodel.
     * It may slow down operations a lot.
     * <p>
     * Applications should try hard to avoid calling this function
     * because of the slowdowns.
     * @return a
     *   {@code GListModel} tracking the layout's constraints
     */
    public @NotNull org.gtk.gio.ListModel observeConstraints() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_constraint_layout_observe_constraints.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns a {@code GListModel} to track the guides that are
     * part of the layout.
     * <p>
     * Calling this function will enable extra internal bookkeeping
     * to track guides and emit signals on the returned listmodel.
     * It may slow down operations a lot.
     * <p>
     * Applications should try hard to avoid calling this function
     * because of the slowdowns.
     * @return a
     *   {@code GListModel} tracking the layout's guides
     */
    public @NotNull org.gtk.gio.ListModel observeGuides() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_constraint_layout_observe_guides.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Removes all constraints from the layout manager.
     */
    public void removeAllConstraints() {
        try {
            DowncallHandles.gtk_constraint_layout_remove_all_constraints.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes {@code constraint} from the layout manager,
     * so that it no longer influences the layout.
     * @param constraint a {@link Constraint}
     */
    public void removeConstraint(@NotNull org.gtk.gtk.Constraint constraint) {
        java.util.Objects.requireNonNull(constraint, "Parameter 'constraint' must not be null");
        try {
            DowncallHandles.gtk_constraint_layout_remove_constraint.invokeExact(
                    handle(),
                    constraint.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes {@code guide} from the layout manager,
     * so that it no longer influences the layout.
     * @param guide a {@link ConstraintGuide} object
     */
    public void removeGuide(@NotNull org.gtk.gtk.ConstraintGuide guide) {
        java.util.Objects.requireNonNull(guide, "Parameter 'guide' must not be null");
        try {
            DowncallHandles.gtk_constraint_layout_remove_guide.invokeExact(
                    handle(),
                    guide.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_constraint_layout_new = Interop.downcallHandle(
            "gtk_constraint_layout_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_layout_add_constraint = Interop.downcallHandle(
            "gtk_constraint_layout_add_constraint",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_layout_add_constraints_from_description = Interop.downcallHandle(
            "gtk_constraint_layout_add_constraints_from_description",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_constraint_layout_add_constraints_from_descriptionv = Interop.downcallHandle(
            "gtk_constraint_layout_add_constraints_from_descriptionv",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_layout_add_guide = Interop.downcallHandle(
            "gtk_constraint_layout_add_guide",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_layout_observe_constraints = Interop.downcallHandle(
            "gtk_constraint_layout_observe_constraints",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_layout_observe_guides = Interop.downcallHandle(
            "gtk_constraint_layout_observe_guides",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_layout_remove_all_constraints = Interop.downcallHandle(
            "gtk_constraint_layout_remove_all_constraints",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_layout_remove_constraint = Interop.downcallHandle(
            "gtk_constraint_layout_remove_constraint",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_layout_remove_guide = Interop.downcallHandle(
            "gtk_constraint_layout_remove_guide",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
