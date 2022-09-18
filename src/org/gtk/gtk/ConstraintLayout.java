package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A layout manager using constraints to describe relations between widgets.
 * <p><code>GtkConstraintLayout</code> is a layout manager that uses relations between
 * widget attributes, expressed via {@link org.gtk.gtk.Constraint} instances, to
 * measure and allocate widgets.
 * <p>
 * <h3>How do constraints work</h3>
 * <p>
 * Constraints are objects defining the relationship between attributes
 * of a widget; you can read the description of the {@link org.gtk.gtk.Constraint}
 * class to have a more in depth definition.
 * <p>
 * By taking multiple constraints and applying them to the children of
 * a widget using <code>GtkConstraintLayout</code>, it&<code>#39</code> s possible to describe
 * complex layout policies; each constraint applied to a child or to the parent
 * widgets contributes to the full description of the layout, in terms of
 * parameters for resolving the value of each attribute.
 * <p>
 * It is important to note that a layout is defined by the totality of
 * constraints; removing a child, or a constraint, from an existing layout
 * without changing the remaining constraints may result in an unstable
 * or unsolvable layout.
 * <p>
 * Constraints have an implicit &<code>#34</code> reading order&<code>#34</code> ; you should start describing
 * each edge of each child, as well as their relationship with the parent
 * container, from the top left (or top right, in RTL languages), horizontally
 * first, and then vertically.
 * <p>
 * A constraint-based layout with too few constraints can become &<code>#34</code> unstable&<code>#34</code> ,
 * that is: have more than one solution. The behavior of an unstable layout
 * is undefined.
 * <p>
 * A constraint-based layout with conflicting constraints may be unsolvable,
 * and lead to an unstable layout. You can use the {@link [property@Gtk.Constraint:strength] (ref=property)}
 * property of {@link org.gtk.gtk.Constraint} to &<code>#34</code> nudge&<code>#34</code>  the layout towards a solution.
 * <p>
 * <h3>GtkConstraintLayout as GtkBuildable</h3>
 * <p><code>GtkConstraintLayout</code> implements the {@link [iface@Gtk.Buildable] (ref=iface)} interface and
 * has a custom &<code>#34</code> constraints&<code>#34</code>  element which allows describing constraints in
 * a {@link org.gtk.gtk.Builder} UI file.
 * <p>
 * An example of a UI definition fragment specifying a constraint:
 * <p><pre>xml
 *   &<code>#60</code> object class=&<code>#34</code> GtkConstraintLayout&<code>#34</code> &<code>#62</code> 
 *     &<code>#60</code> constraints&<code>#62</code> 
 *       &<code>#60</code> constraint target=&<code>#34</code> button&<code>#34</code>  target-attribute=&<code>#34</code> start&<code>#34</code> 
 *                   relation=&<code>#34</code> eq&<code>#34</code> 
 *                   source=&<code>#34</code> super&<code>#34</code>  source-attribute=&<code>#34</code> start&<code>#34</code> 
 *                   constant=&<code>#34</code> 12&<code>#34</code> 
 *                   strength=&<code>#34</code> required&<code>#34</code>  /&<code>#62</code> 
 *       &<code>#60</code> constraint target=&<code>#34</code> button&<code>#34</code>  target-attribute=&<code>#34</code> width&<code>#34</code> 
 *                   relation=&<code>#34</code> ge&<code>#34</code> 
 *                   constant=&<code>#34</code> 250&<code>#34</code> 
 *                   strength=&<code>#34</code> strong&<code>#34</code>  /&<code>#62</code> 
 *     &<code>#60</code> /constraints&<code>#62</code> 
 *   &<code>#60</code> /object&<code>#62</code> 
 * </pre>
 * <p>
 * The definition above will add two constraints to the GtkConstraintLayout:
 * <p>
 *  - a required constraint between the leading edge of &<code>#34</code> button&<code>#34</code>  and
 *    the leading edge of the widget using the constraint layout, plus
 *    12 pixels
 *  - a strong, constant constraint making the width of &<code>#34</code> button&<code>#34</code>  greater
 *    than, or equal to 250 pixels
 * <p>
 * The &<code>#34</code> target&<code>#34</code>  and &<code>#34</code> target-attribute&<code>#34</code>  attributes are required.
 * <p>
 * The &<code>#34</code> source&<code>#34</code>  and &<code>#34</code> source-attribute&<code>#34</code>  attributes of the &<code>#34</code> constraint&<code>#34</code> 
 * element are optional; if they are not specified, the constraint is
 * assumed to be a constant.
 * <p>
 * The &<code>#34</code> relation&<code>#34</code>  attribute is optional; if not specified, the constraint
 * is assumed to be an equality.
 * <p>
 * The &<code>#34</code> strength&<code>#34</code>  attribute is optional; if not specified, the constraint
 * is assumed to be required.
 * <p>
 * The &<code>#34</code> source&<code>#34</code>  and &<code>#34</code> target&<code>#34</code>  attributes can be set to &<code>#34</code> super&<code>#34</code>  to indicate
 * that the constraint target is the widget using the GtkConstraintLayout.
 * <p>
 * There can be &<code>#34</code> constant&<code>#34</code>  and &<code>#34</code> multiplier&<code>#34</code>  attributes.
 * <p>
 * Additionally, the &<code>#34</code> constraints&<code>#34</code>  element can also contain a description
 * of the <code>GtkConstraintGuides</code> used by the layout:
 * <p><pre>xml
 *   &<code>#60</code> constraints&<code>#62</code> 
 *     &<code>#60</code> guide min-width=&<code>#34</code> 100&<code>#34</code>  max-width=&<code>#34</code> 500&<code>#34</code>  name=&<code>#34</code> hspace&<code>#34</code> /&<code>#62</code> 
 *     &<code>#60</code> guide min-height=&<code>#34</code> 64&<code>#34</code>  nat-height=&<code>#34</code> 128&<code>#34</code>  name=&<code>#34</code> vspace&<code>#34</code>  strength=&<code>#34</code> strong&<code>#34</code> /&<code>#62</code> 
 *   &<code>#60</code> /constraints&<code>#62</code> 
 * </pre>
 * <p>
 * The &<code>#34</code> guide&<code>#34</code>  element has the following optional attributes:
 * <p>
 *   - &<code>#34</code> min-width&<code>#34</code> , &<code>#34</code> nat-width&<code>#34</code> , and &<code>#34</code> max-width&<code>#34</code> , describe the minimum,
 *     natural, and maximum width of the guide, respectively
 *   - &<code>#34</code> min-height&<code>#34</code> , &<code>#34</code> nat-height&<code>#34</code> , and &<code>#34</code> max-height&<code>#34</code> , describe the minimum,
 *     natural, and maximum height of the guide, respectively
 *   - &<code>#34</code> strength&<code>#34</code>  describes the strength of the constraint on the natural
 *     size of the guide; if not specified, the constraint is assumed to
 *     have a medium strength
 *   - &<code>#34</code> name&<code>#34</code>  describes a name for the guide, useful when debugging
 * <p>
 * <h3>Using the Visual Format Language</h3>
 * <p>
 * Complex constraints can be described using a compact syntax called VFL,
 * or *Visual Format Language*.
 * <p>
 * The Visual Format Language describes all the constraints on a row or
 * column, typically starting from the leading edge towards the trailing
 * one. Each element of the layout is composed by &<code>#34</code> views&<code>#34</code> , which identify
 * a {@link [iface@Gtk.ConstraintTarget] (ref=iface)}.
 * <p>
 * For instance:
 * <p><pre>
 *   {@link [button]}-{@link [textField]}
 * </pre>
 * <p>
 * Describes a constraint that binds the trailing edge of &<code>#34</code> button&<code>#34</code>  to the
 * leading edge of &<code>#34</code> textField&<code>#34</code> , leaving a default space between the two.
 * <p>
 * Using VFL is also possible to specify predicates that describe constraints
 * on attributes like width and height:
 * <p><pre>
 *   // Width must be greater than, or equal to 50
 *   {@link [button(&<code>#62</code> =50)]}
 * 
 *   // Width of button1 must be equal to width of button2
 *   {@link [button1(==button2)]}
 * </pre>
 * <p>
 * The default orientation for a VFL description is horizontal, unless
 * otherwise specified:
 * <p><pre>
 *   // horizontal orientation, default attribute: width
 *   H:{@link [button(&<code>#62</code> =150)]}
 * 
 *   // vertical orientation, default attribute: height
 *   V:{@link [button1(==button2)]}
 * </pre>
 * <p>
 * It&<code>#39</code> s also possible to specify multiple predicates, as well as their
 * strength:
 * <p><pre>
 *   // minimum width of button must be 150
 *   // natural width of button can be 250
 *   {@link [button(&<code>#62</code> =150@required, ==250@medium)] (ref=button(&<code>#62</code> =150)}
 * </pre>
 * <p>
 * Finally, it&<code>#39</code> s also possible to use simple arithmetic operators:
 * <p><pre>
 *   // width of button1 must be equal to width of button2
 *   // divided by 2 plus 12
 *   {@link [button1(button2 / 2 + 12)]}
 * </pre>
 */
public class ConstraintLayout extends LayoutManager implements Buildable {

    public ConstraintLayout(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ConstraintLayout */
    public static ConstraintLayout castFrom(org.gtk.gobject.Object gobject) {
        return new ConstraintLayout(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_constraint_layout_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkConstraintLayout</code> layout manager.
     */
    public ConstraintLayout() {
        super(constructNew());
    }
    
    /**
     * Adds a constraint to the layout manager.
     * <p>
     * The {@link [property@Gtk.Constraint:source] (ref=property)} and {@link [property@Gtk.Constraint:target] (ref=property)}
     * properties of <code>constraint</code> can be:
     * <p>
     *  - set to <code>NULL</code> to indicate that the constraint refers to the
     *    widget using <code>layout</code>
     *  - set to the {@link org.gtk.gtk.Widget} using <code>layout</code>
     *  - set to a child of the {@link org.gtk.gtk.Widget} using <code>layout</code>
     *  - set to a {@link org.gtk.gtk.ConstraintGuide} that is part of <code>layout</code>
     * 
     * The @layout acquires the ownership of @constraint after calling
     * this function.
     */
    public void addConstraint(Constraint constraint) {
        gtk_h.gtk_constraint_layout_add_constraint(handle(), constraint.getReference().unowned().handle());
    }
    
    /**
     * Creates a list of constraints from a VFL description.
     * <p>
     * The Visual Format Language, VFL, is based on Apple&<code>#39</code> s AutoLayout {@link [VFL]}(https://developer.apple.com/library/content/documentation/UserExperience/Conceptual/AutolayoutPG/VisualFormatLanguage.html).
     * <p>
     * The <code>views</code> dictionary is used to match {@link [iface@Gtk.ConstraintTarget] (ref=iface)}
     * instances to the symbolic view name inside the VFL.
     * <p>
     * The VFL grammar is:
     * <p><pre>
     *        &<code>#60</code> visualFormatString&<code>#62</code>  = (&<code>#60</code> orientation&<code>#62</code> )?
     *                               (&<code>#60</code> superview&<code>#62</code> &<code>#60</code> connection&<code>#62</code> )?
     *                               &<code>#60</code> view&<code>#62</code> (&<code>#60</code> connection&<code>#62</code> &<code>#60</code> view&<code>#62</code> )*
     *                               (&<code>#60</code> connection&<code>#62</code> &<code>#60</code> superview&<code>#62</code> )?
     *               &<code>#60</code> orientation&<code>#62</code>  = &<code>#39</code> H&<code>#39</code>  | &<code>#39</code> V&<code>#39</code> 
     *                 &<code>#60</code> superview&<code>#62</code>  = &<code>#39</code> |&<code>#39</code> 
     *                &<code>#60</code> connection&<code>#62</code>  = &<code>#39</code> &<code>#39</code>  | &<code>#39</code> -&<code>#39</code>  &<code>#60</code> predicateList&<code>#62</code>  &<code>#39</code> -&<code>#39</code>  | &<code>#39</code> -&<code>#39</code> 
     *             &<code>#60</code> predicateList&<code>#62</code>  = &<code>#60</code> simplePredicate&<code>#62</code>  | &<code>#60</code> predicateListWithParens&<code>#62</code> 
     *           &<code>#60</code> simplePredicate&<code>#62</code>  = &<code>#60</code> metricName&<code>#62</code>  | &<code>#60</code> positiveNumber&<code>#62</code> 
     *   &<code>#60</code> predicateListWithParens&<code>#62</code>  = &<code>#39</code> (&<code>#39</code>  &<code>#60</code> predicate&<code>#62</code>  (&<code>#39</code> ,&<code>#39</code>  &<code>#60</code> predicate&<code>#62</code> )* &<code>#39</code> )&<code>#39</code> 
     *                 &<code>#60</code> predicate&<code>#62</code>  = (&<code>#60</code> relation&<code>#62</code> )? &<code>#60</code> objectOfPredicate&<code>#62</code>  (&<code>#60</code> operatorList&<code>#62</code> )? (&<code>#39</code> @&<code>#39</code>  &<code>#60</code> priority&<code>#62</code> )?
     *                  &<code>#60</code> relation&<code>#62</code>  = &<code>#39</code> ==&<code>#39</code>  | &<code>#39</code> &<code>#60</code> =&<code>#39</code>  | &<code>#39</code> &<code>#62</code> =&<code>#39</code> 
     *         &<code>#60</code> objectOfPredicate&<code>#62</code>  = &<code>#60</code> constant&<code>#62</code>  | &<code>#60</code> viewName&<code>#62</code>  | (&<code>#39</code> .&<code>#39</code>  &<code>#60</code> attributeName&<code>#62</code> )?
     *                  &<code>#60</code> priority&<code>#62</code>  = &<code>#60</code> positiveNumber&<code>#62</code>  | &<code>#39</code> required&<code>#39</code>  | &<code>#39</code> strong&<code>#39</code>  | &<code>#39</code> medium&<code>#39</code>  | &<code>#39</code> weak&<code>#39</code> 
     *                  &<code>#60</code> constant&<code>#62</code>  = &<code>#60</code> number&<code>#62</code> 
     *              &<code>#60</code> operatorList&<code>#62</code>  = (&<code>#60</code> multiplyOperator&<code>#62</code> )? (&<code>#60</code> addOperator&<code>#62</code> )?
     *          &<code>#60</code> multiplyOperator&<code>#62</code>  = {@link [ &<code>#39</code> *&<code>#39</code>  | &<code>#39</code> /&<code>#39</code>  ]} &<code>#60</code> positiveNumber&<code>#62</code> 
     *               &<code>#60</code> addOperator&<code>#62</code>  = {@link [ &<code>#39</code> +&<code>#39</code>  | &<code>#39</code> -&<code>#39</code>  ]} &<code>#60</code> positiveNumber&<code>#62</code> 
     *                  &<code>#60</code> viewName&<code>#62</code>  = {@link [A-Za-z_]}({@link [A-Za-z0-9_]}*) // A C identifier
     *                &<code>#60</code> metricName&<code>#62</code>  = {@link [A-Za-z_]}({@link [A-Za-z0-9_]}*) // A C identifier
     *             &<code>#60</code> attributeName&<code>#62</code>  = &<code>#39</code> top&<code>#39</code>  | &<code>#39</code> bottom&<code>#39</code>  | &<code>#39</code> left&<code>#39</code>  | &<code>#39</code> right&<code>#39</code>  | &<code>#39</code> width&<code>#39</code>  | &<code>#39</code> height&<code>#39</code>  |
     *                               &<code>#39</code> start&<code>#39</code>  | &<code>#39</code> end&<code>#39</code>  | &<code>#39</code> centerX&<code>#39</code>  | &<code>#39</code> centerY&<code>#39</code>  | &<code>#39</code> baseline&<code>#39</code> 
     *            &<code>#60</code> positiveNumber&<code>#62</code>  // A positive real number parseable by g_ascii_strtod()
     *                    &<code>#60</code> number&<code>#62</code>  // A real number parseable by g_ascii_strtod()
     * </pre>
     * <p>
     * **Note**: The VFL grammar used by GTK is slightly different than the one
     * defined by Apple, as it can use symbolic values for the constraint&<code>#39</code> s
     * strength instead of numeric values; additionally, GTK allows adding
     * simple arithmetic operations inside predicates.
     * <p>
     * Examples of VFL descriptions are:
     * <p><pre>
     *   // Default spacing
     *   {@link [button]}-{@link [textField]}
     * 
     *   // Width constraint
     *   {@link [button(&<code>#62</code> =50)]}
     * 
     *   // Connection to super view
     *   |-50-{@link [purpleBox]}-50-|
     * 
     *   // Vertical layout
     *   V:{@link [topField]}-10-{@link [bottomField]}
     * 
     *   // Flush views
     *   {@link [maroonView]}{@link [blueView]}
     * 
     *   // Priority
     *   {@link [button(100@strong)] (ref=button(100)}
     * 
     *   // Equal widths
     *   {@link [button1(==button2)]}
     * 
     *   // Multiple predicates
     *   {@link [flexibleButton(&<code>#62</code> =70,&<code>#60</code> =100)]}
     * 
     *   // A complete line of layout
     *   |-{@link [find]}-{@link [findNext]}-{@link [findField(&<code>#62</code> =20)]}-|
     * 
     *   // Operators
     *   {@link [button1(button2 / 3 + 50)]}
     * 
     *   // Named attributes
     *   {@link [button1(==button2.height)]}
     * </pre>
     */
    public org.gtk.glib.List addConstraintsFromDescriptionv(java.lang.String[] lines, long nLines, int hspacing, int vspacing, org.gtk.glib.HashTable views) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_constraint_layout_add_constraints_from_descriptionv(handle(), Interop.allocateNativeArray(lines).handle(), nLines, hspacing, vspacing, views.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Adds a guide to <code>layout</code>.
     * <p>
     * A guide can be used as the source or target of constraints,
     * like a widget, but it is not visible.
     * <p>
     * The <code>layout</code> acquires the ownership of <code>guide</code> after calling
     * this function.
     */
    public void addGuide(ConstraintGuide guide) {
        gtk_h.gtk_constraint_layout_add_guide(handle(), guide.getReference().unowned().handle());
    }
    
    /**
     * Returns a <code>GListModel</code> to track the constraints that are
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
     * Returns a <code>GListModel</code> to track the guides that are
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
     * Removes <code>constraint</code> from the layout manager,
     * so that it no longer influences the layout.
     */
    public void removeConstraint(Constraint constraint) {
        gtk_h.gtk_constraint_layout_remove_constraint(handle(), constraint.handle());
    }
    
    /**
     * Removes <code>guide</code> from the layout manager,
     * so that it no longer influences the layout.
     */
    public void removeGuide(ConstraintGuide guide) {
        gtk_h.gtk_constraint_layout_remove_guide(handle(), guide.handle());
    }
    
}
