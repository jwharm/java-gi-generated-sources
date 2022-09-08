package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A layout manager using constraints to describe relations between widgets.
 * 
 * `GtkConstraintLayout` is a layout manager that uses relations between
 * widget attributes, expressed via [class@Gtk.Constraint] instances, to
 * measure and allocate widgets.
 * 
 * ### How do constraints work
 * 
 * Constraints are objects defining the relationship between attributes
 * of a widget; you can read the description of the [class@Gtk.Constraint]
 * class to have a more in depth definition.
 * 
 * By taking multiple constraints and applying them to the children of
 * a widget using `GtkConstraintLayout`, it's possible to describe
 * complex layout policies; each constraint applied to a child or to the parent
 * widgets contributes to the full description of the layout, in terms of
 * parameters for resolving the value of each attribute.
 * 
 * It is important to note that a layout is defined by the totality of
 * constraints; removing a child, or a constraint, from an existing layout
 * without changing the remaining constraints may result in an unstable
 * or unsolvable layout.
 * 
 * Constraints have an implicit "reading order"; you should start describing
 * each edge of each child, as well as their relationship with the parent
 * container, from the top left (or top right, in RTL languages), horizontally
 * first, and then vertically.
 * 
 * A constraint-based layout with too few constraints can become "unstable",
 * that is: have more than one solution. The behavior of an unstable layout
 * is undefined.
 * 
 * A constraint-based layout with conflicting constraints may be unsolvable,
 * and lead to an unstable layout. You can use the [property@Gtk.Constraint:strength]
 * property of [class@Gtk.Constraint] to "nudge" the layout towards a solution.
 * 
 * ### GtkConstraintLayout as GtkBuildable
 * 
 * `GtkConstraintLayout` implements the [iface@Gtk.Buildable] interface and
 * has a custom "constraints" element which allows describing constraints in
 * a [class@Gtk.Builder] UI file.
 * 
 * An example of a UI definition fragment specifying a constraint:
 * 
 * ```xml
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
 * ```
 * 
 * The definition above will add two constraints to the GtkConstraintLayout:
 * 
 *  - a required constraint between the leading edge of "button" and
 *    the leading edge of the widget using the constraint layout, plus
 *    12 pixels
 *  - a strong, constant constraint making the width of "button" greater
 *    than, or equal to 250 pixels
 * 
 * The "target" and "target-attribute" attributes are required.
 * 
 * The "source" and "source-attribute" attributes of the "constraint"
 * element are optional; if they are not specified, the constraint is
 * assumed to be a constant.
 * 
 * The "relation" attribute is optional; if not specified, the constraint
 * is assumed to be an equality.
 * 
 * The "strength" attribute is optional; if not specified, the constraint
 * is assumed to be required.
 * 
 * The "source" and "target" attributes can be set to "super" to indicate
 * that the constraint target is the widget using the GtkConstraintLayout.
 * 
 * There can be "constant" and "multiplier" attributes.
 * 
 * Additionally, the "constraints" element can also contain a description
 * of the `GtkConstraintGuides` used by the layout:
 * 
 * ```xml
 *   <constraints>
 *     <guide min-width="100" max-width="500" name="hspace"/>
 *     <guide min-height="64" nat-height="128" name="vspace" strength="strong"/>
 *   </constraints>
 * ```
 * 
 * The "guide" element has the following optional attributes:
 * 
 *   - "min-width", "nat-width", and "max-width", describe the minimum,
 *     natural, and maximum width of the guide, respectively
 *   - "min-height", "nat-height", and "max-height", describe the minimum,
 *     natural, and maximum height of the guide, respectively
 *   - "strength" describes the strength of the constraint on the natural
 *     size of the guide; if not specified, the constraint is assumed to
 *     have a medium strength
 *   - "name" describes a name for the guide, useful when debugging
 * 
 * ### Using the Visual Format Language
 * 
 * Complex constraints can be described using a compact syntax called VFL,
 * or *Visual Format Language*.
 * 
 * The Visual Format Language describes all the constraints on a row or
 * column, typically starting from the leading edge towards the trailing
 * one. Each element of the layout is composed by "views", which identify
 * a [iface@Gtk.ConstraintTarget].
 * 
 * For instance:
 * 
 * ```
 *   [button]-[textField]
 * ```
 * 
 * Describes a constraint that binds the trailing edge of "button" to the
 * leading edge of "textField", leaving a default space between the two.
 * 
 * Using VFL is also possible to specify predicates that describe constraints
 * on attributes like width and height:
 * 
 * ```
 *   // Width must be greater than, or equal to 50
 *   [button(>=50)]
 * 
 *   // Width of button1 must be equal to width of button2
 *   [button1(==button2)]
 * ```
 * 
 * The default orientation for a VFL description is horizontal, unless
 * otherwise specified:
 * 
 * ```
 *   // horizontal orientation, default attribute: width
 *   H:[button(>=150)]
 * 
 *   // vertical orientation, default attribute: height
 *   V:[button1(==button2)]
 * ```
 * 
 * It's also possible to specify multiple predicates, as well as their
 * strength:
 * 
 * ```
 *   // minimum width of button must be 150
 *   // natural width of button can be 250
 *   [button(>=150@required, ==250@medium)]
 * ```
 * 
 * Finally, it's also possible to use simple arithmetic operators:
 * 
 * ```
 *   // width of button1 must be equal to width of button2
 *   // divided by 2 plus 12
 *   [button1(button2 / 2 + 12)]
 * ```
 */
public class ConstraintLayout extends LayoutManager implements Buildable {

    public ConstraintLayout(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ConstraintLayout */
    public static ConstraintLayout castFrom(org.gtk.gobject.Object gobject) {
        return new ConstraintLayout(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkConstraintLayout` layout manager.
     */
    public ConstraintLayout() {
        super(References.get(gtk_h.gtk_constraint_layout_new(), true));
    }
    
    /**
     * Adds a constraint to the layout manager.
     * 
     * The [property@Gtk.Constraint:source] and [property@Gtk.Constraint:target]
     * properties of `constraint` can be:
     * 
     *  - set to `NULL` to indicate that the constraint refers to the
     *    widget using `layout`
     *  - set to the [class@Gtk.Widget] using `layout`
     *  - set to a child of the [class@Gtk.Widget] using `layout`
     *  - set to a [class@Gtk.ConstraintGuide] that is part of `layout`
     * 
     * The @layout acquires the ownership of @constraint after calling
     * this function.
     */
    public void addConstraint(Constraint constraint) {
        gtk_h.gtk_constraint_layout_add_constraint(handle(), constraint.getReference().unowned().handle());
    }
    
    /**
     * Creates a list of constraints from a VFL description.
     * 
     * The Visual Format Language, VFL, is based on Apple's AutoLayout [VFL](https://developer.apple.com/library/content/documentation/UserExperience/Conceptual/AutolayoutPG/VisualFormatLanguage.html).
     * 
     * The `views` dictionary is used to match [iface@Gtk.ConstraintTarget]
     * instances to the symbolic view name inside the VFL.
     * 
     * The VFL grammar is:
     * 
     * ```
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
     * ```
     * 
     * **Note**: The VFL grammar used by GTK is slightly different than the one
     * defined by Apple, as it can use symbolic values for the constraint's
     * strength instead of numeric values; additionally, GTK allows adding
     * simple arithmetic operations inside predicates.
     * 
     * Examples of VFL descriptions are:
     * 
     * ```
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
     * ```
     */
    public org.gtk.glib.List addConstraintsFromDescriptionv(java.lang.String[] lines, long nLines, int hspacing, int vspacing, org.gtk.glib.HashTable views) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.gtk_constraint_layout_add_constraints_from_descriptionv(handle(), Interop.allocateNativeArray(lines), nLines, hspacing, vspacing, views.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Adds a guide to `layout`.
     * 
     * A guide can be used as the source or target of constraints,
     * like a widget, but it is not visible.
     * 
     * The `layout` acquires the ownership of `guide` after calling
     * this function.
     */
    public void addGuide(ConstraintGuide guide) {
        gtk_h.gtk_constraint_layout_add_guide(handle(), guide.getReference().unowned().handle());
    }
    
    /**
     * Returns a `GListModel` to track the constraints that are
     * part of the layout.
     * 
     * Calling this function will enable extra internal bookkeeping
     * to track constraints and emit signals on the returned listmodel.
     * It may slow down operations a lot.
     * 
     * Applications should try hard to avoid calling this function
     * because of the slowdowns.
     */
    public org.gtk.gio.ListModel observeConstraints() {
        var RESULT = gtk_h.gtk_constraint_layout_observe_constraints(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, true));
    }
    
    /**
     * Returns a `GListModel` to track the guides that are
     * part of the layout.
     * 
     * Calling this function will enable extra internal bookkeeping
     * to track guides and emit signals on the returned listmodel.
     * It may slow down operations a lot.
     * 
     * Applications should try hard to avoid calling this function
     * because of the slowdowns.
     */
    public org.gtk.gio.ListModel observeGuides() {
        var RESULT = gtk_h.gtk_constraint_layout_observe_guides(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, true));
    }
    
    /**
     * Removes all constraints from the layout manager.
     */
    public void removeAllConstraints() {
        gtk_h.gtk_constraint_layout_remove_all_constraints(handle());
    }
    
    /**
     * Removes `constraint` from the layout manager,
     * so that it no longer influences the layout.
     */
    public void removeConstraint(Constraint constraint) {
        gtk_h.gtk_constraint_layout_remove_constraint(handle(), constraint.handle());
    }
    
    /**
     * Removes `guide` from the layout manager,
     * so that it no longer influences the layout.
     */
    public void removeGuide(ConstraintGuide guide) {
        gtk_h.gtk_constraint_layout_remove_guide(handle(), guide.handle());
    }
    
}
